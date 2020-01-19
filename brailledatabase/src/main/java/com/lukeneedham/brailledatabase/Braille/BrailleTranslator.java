package com.lukeneedham.brailledatabase.Braille;

import android.util.Log;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleDatabase;
import com.lukeneedham.brailledatabase.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.CellEmpty;

public class BrailleTranslator
{
	private BrailleDatabase database;
	public static final String UNKNOWN_CHARACTER = "�";

	public BrailleTranslator(BrailleDatabase db)
	{
		database = db;
	}

	public BrailleCategoryUseList getAllCategoriesForced()
	{
		BrailleCategoryUseList use = new BrailleCategoryUseList();
		List<DictionaryCategory> allCats = database.getDictionaryCategories();
		for (DictionaryCategory cat : allCats)
		{
			use.add(new BrailleCategoryUseList.BrailleCategoryUse(cat, true));
		}
		return use;
	}

	public BrailleSymbolTranslation translatePerfect(String in)
	{
		return translatePerfect(in, getAllCategoriesForced());
	}

	public BrailleSymbolTranslation translatePerfect(String in, BrailleCategoryUseList categoriesOn)
	{
		return translate(in, categoriesOn).get(0);
	}

	/**
	 * Every combination of every possible individual word translation for every word in the input string
	 *
	 * @param input        sentence to translate
	 * @param categoriesOn
	 * @return list of every possible translation of the input string into braille symbols
	 */
	public ArrayList<BrailleSymbolTranslation> translate(String input, BrailleCategoryUseList categoriesOn)
	{
		ArrayList<BrailleSymbolTranslation> translations = new ArrayList<>();
		BrailleSymbolTranslation base = new BrailleSymbolTranslation();
		translations.add(base);

		List<String> wordsAndSpaces = splitByWordSeparators(input);

		for (String word : wordsAndSpaces)
		{
			ArrayList<BrailleSymbolTranslation> translationsOfWord = translateWordToBraille(word, 0, categoriesOn);
			translationsOfWord = filterTranslationsByUnknownCount(translationsOfWord);

			ArrayList<BrailleSymbolTranslation> newTotalTranslations = new ArrayList<>();

			// add every currentword translation to every previous translation
			for (BrailleSymbolTranslation currentWordTranslation : translationsOfWord)
			{
				for (BrailleSymbolTranslation prevTrans : translations)
				{
					BrailleSymbolTranslation newTranslation = new BrailleSymbolTranslation();
					newTranslation.concatenate(prevTrans);
					//if (prevTrans.length() != 0) newTranslation.add(spaceDataEntry);
					newTranslation.concatenate(currentWordTranslation);

					newTotalTranslations.add(newTranslation);
				}
			}
			translations = newTotalTranslations;
		}

		return translations;
	}

	public List<String> splitByAndRemoveWordSeparators(String input) {
		List<String> splitByWordSeparators = splitBy(input, database.getWordSeparators());
		List<String> result = new ArrayList<>();
		for(String word : splitByWordSeparators) {
			if(!database.isWordSeparator(word)) {
				result.add(word);
			}
		}
		return result;
	}

	public List<String> splitByWordSeparators(String input) {
		return splitBy(input, database.getWordSeparators());
	}

	private List<String> splitBy(String input, List<String> wordSeparators) {
		List<String> words = new ArrayList<>();

		StringBuilder currentWordBuilder = new StringBuilder();
		char[] letters = input.toCharArray();
		for(char letterChar : letters) {
			String letter = letterChar + "";
			if(wordSeparators.contains(letter)) {
				String finishedWord = currentWordBuilder.toString();
				if(!finishedWord.equals("")) {
					words.add(finishedWord);
				}

				currentWordBuilder.setLength(0);

				String separatorWord = letter + "";
				words.add(separatorWord);
			} else {
				currentWordBuilder.append(letter);
			}
		}
		String finalWord = currentWordBuilder.toString();
		if(!finalWord.equals("")) {
			words.add(finalWord);
		}

		return words;
	}

	private ArrayList<BrailleSymbolTranslation> translateWordToBraille(String input, int start, BrailleCategoryUseList categoriesOn)
	{
		ArrayList<BrailleSymbolTranslation> translations = new ArrayList<>();
		BrailleSymbolTranslation currentTranslationSoFar = new BrailleSymbolTranslation();

		if (start < input.length())
		{
			//check caps
			if (isAllCaps(input))
			{
				input = input.toLowerCase();
				currentTranslationSoFar.add(database.getCapitalWordSymbol());
			}
			else if (Character.isUpperCase(input.charAt(start)) && !Character.isLowerCase(input.charAt(start))) //both checks for punctuation
			{
				input = input.substring(0, start) + input.substring(start, start + 1).toLowerCase() + input.substring(start + 1, input.length());
				currentTranslationSoFar.add(database.getCapitalSymbol());
			}

			// take segments of decreasing length from maxLength to 1 until a valid segment (matching a symbol) is found
			int maxLength = Math.min(database.getLongestBrailleWord(), input.length() - start);
			boolean someMatchFound = false;
			boolean stop = false;
			for (int length = maxLength; length > 0 && !stop; length--)
			{
				String segment = input.substring(start, start + length);

				List<BrailleSymbolDatabaseEntry> datas = database.findSymbolDataByLettersRepresented(segment);

				for (BrailleSymbolDatabaseEntry data : datas)
				{
					DictionaryCategory category = data.getCategory(database);
					if(category == null) {
						// special symbol - always allowed
						if (data.getRuleForUsage().isLegal(start, start + length, input))
						{
							translations.addAll(addNewTranslationsToCurrentTranslation(data, currentTranslationSoFar, start, input, categoriesOn));
							someMatchFound = true;
						}
					} else {
						BrailleCategoryUseList.BrailleCategoryUse categoryUse = categoriesOn.getCategory(category);
						if (categoryUse != null)
						{
							if (data.getRuleForUsage().isLegal(start, start + length, input))
							{
								translations.addAll(addNewTranslationsToCurrentTranslation(data, currentTranslationSoFar, start, input, categoriesOn));
								someMatchFound = true;
								stop = categoryUse.isForce();
							}
						}
					}
				}
			}
			if (!someMatchFound) // the letter in the input at position start is not in the database
			{
				String noMatchFor = input.substring(start, start + 1);
				Log.v("noMatchFor", noMatchFor);
				BrailleSymbolDatabaseEntry unknownEntry = BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(noMatchFor, R.string.braille_unknown, DictionaryType.UNKNOWN, BrailleSymbolDatabaseEntry.OnEntryClickType.NOTHING, new BrailleCellDatabaseEntry[]{null});

				translations.addAll(addNewTranslationsToCurrentTranslation(unknownEntry, currentTranslationSoFar, start, input, categoriesOn));
			}
		}
		else
		{
			translations.add(new BrailleSymbolTranslation());
		}

		return translations;
	}

	private ArrayList<BrailleSymbolTranslation> filterTranslationsByUnknownCount(List<BrailleSymbolTranslation> translations)
	{
		Map<BrailleSymbolTranslation, Integer> unknownCounts = new HashMap<>();
		int minCount = Integer.MAX_VALUE;
		for (BrailleSymbolTranslation bt : translations)
		{
			List<BrailleSymbolDatabaseEntry> symbols = bt.getSymbols();

			int unknownCount = 0;
			for (BrailleSymbolDatabaseEntry symbol : symbols)
			{
				if (symbol.getDictionaryType() == DictionaryType.UNKNOWN)
				{
					unknownCount++;
				}
			}
			unknownCounts.put(bt, unknownCount);
			if (unknownCount < minCount)
			{
				minCount = unknownCount;
				// Log.v("new minCount", minCount + "");
			}
		}

		ArrayList<BrailleSymbolTranslation> transToUse = new ArrayList<>();
		for (BrailleSymbolTranslation key : unknownCounts.keySet())
		{
			int count = unknownCounts.get(key);
			if (count <= minCount)
			{
				transToUse.add(key);
			}
		}

		return transToUse;
	}

	private ArrayList<BrailleSymbolTranslation> addNewTranslationsToCurrentTranslation(BrailleSymbolDatabaseEntry entry, BrailleSymbolTranslation currentTranslationSoFar, int start, String input, BrailleCategoryUseList categoriesOn)
	{
		ArrayList<BrailleSymbolTranslation> translations = new ArrayList<>();

		BrailleSymbolTranslation newTrans = new BrailleSymbolTranslation(currentTranslationSoFar);
		newTrans.add(entry);
		int translationSoFarLength = newTrans.getSimpleLettersRepresented().length() + start;

		ArrayList<BrailleSymbolTranslation> trans = translateWordToBraille(input, translationSoFarLength, categoriesOn);
		// Log.v("trans", trans.toString());

		// check for unknown characters in each translation found -
		// if some translations have unknown characters but others don't, the ones with unknown characters should be discarded
		// in this way, unknown characters are a last resort

		for (BrailleSymbolTranslation bt : trans)
		{
			BrailleSymbolTranslation newBt = new BrailleSymbolTranslation(newTrans);
			newBt.concatenate(bt);
			translations.add(newBt);
		}

		return translations;
	}


	/** Translation from cells **/

	public ArrayList<String> translateCellsToLatin(List<BrailleCellDatabaseEntry> cells)
	{
		List<BrailleSymbolTranslation> combinedTranslations = translateCellsToDataEntries(cells);

		ArrayList<String> res = new ArrayList<>();
		for (BrailleSymbolTranslation combinedTranslation : combinedTranslations)
		{
			res.add(combinedTranslation.toString());
		}
		return res;
	}

	public List<BrailleSymbolTranslation> translateCellsToDataEntries(List<BrailleCellDatabaseEntry> cells)
	{
		cells = new ArrayList<>(cells);
		cells.add(CellEmpty);
		List<List<BrailleCellDatabaseEntry>> cellWords = new ArrayList<>();

		// Log.v("cells", ":" + cells.toString());

		int lastChopPos = 0;
		for (int i = 0; i < cells.size(); i++)
		{
			BrailleCellDatabaseEntry cell = cells.get(i);
			if (cell == CellEmpty)
			{
				List<BrailleCellDatabaseEntry> word = cells.subList(lastChopPos, i);
				cellWords.add(word);
				lastChopPos = i + 1;
			}
		}

		// Log.v("cellWords", cellWords.toString());

		List<BrailleSymbolTranslation> combinedTranslations = new ArrayList<>();
		combinedTranslations.add(new BrailleSymbolTranslation());

		for (List<BrailleCellDatabaseEntry> word : cellWords)
		{
			List<BrailleSymbolTranslation> wordTranslations = translateWordCellsToDataEntries(word);
			ArrayList<BrailleSymbolTranslation> newCombinedTranslations = new ArrayList<>();
			for (BrailleSymbolTranslation prevTranslation : combinedTranslations)
			{
				for (BrailleSymbolTranslation newTranslation : wordTranslations)
				{
					BrailleSymbolTranslation newCombinedTranslation = new BrailleSymbolTranslation(prevTranslation);
					newCombinedTranslation.addAll(newTranslation.getSymbols());
					newCombinedTranslations.add(newCombinedTranslation);
				}
			}

			combinedTranslations = newCombinedTranslations;
		}

		return combinedTranslations;
	}

	private List<BrailleSymbolTranslation> translateWordCellsToDataEntries(List<BrailleCellDatabaseEntry> cells)
	{
		List<BrailleSymbolTranslation> currentTranslations = new ArrayList<>();
		currentTranslations.add(new BrailleSymbolTranslation());

		List<BrailleSymbolTranslation> res = translateWordCellsToDataEntries(cells, currentTranslations, 0);
		// Log.v("res", res.toString());
		return res;
	}

	private List<BrailleSymbolTranslation> translateWordCellsToDataEntries(List<BrailleCellDatabaseEntry> cells, List<BrailleSymbolTranslation> previousTranslations, int startPos)
	{
		// Log.v("previousTranslations", previousTranslations.toString());

		int maxCellsLength = database.getLongestBrailleSymbolCells();
		int cellsLeftLength = cells.size() - startPos;
		if (cellsLeftLength == 0)
		{
			return previousTranslations;
		}
		else
		{
			int maxLength = Math.min(maxCellsLength, cellsLeftLength);
			List<BrailleSymbolTranslation> result = new ArrayList<>();

			for (int currentLength = 1; currentLength <= maxLength; currentLength++)
			{
				List<BrailleSymbolTranslation> currentTranslations = new ArrayList<>();

				int endPos = startPos + currentLength;
				List<BrailleCellDatabaseEntry> currentCells = cells.subList(startPos, endPos);
				BrailleSymbol symbol = new BrailleSymbol(currentCells);

				List<BrailleSymbolDatabaseEntry> entries = database.findSymbolDataBySymbol(symbol);
				for (BrailleSymbolDatabaseEntry entry : entries)
				{
						for (BrailleSymbolTranslation prevString : previousTranslations)
						{
							BrailleSymbolTranslation toAddTo = new BrailleSymbolTranslation(prevString);
							toAddTo.add(entry);
							currentTranslations.add(toAddTo);
						}
				}
				// Log.v("currentTranslations", currentTranslations.toString());

				result.addAll(translateWordCellsToDataEntries(cells, currentTranslations, endPos));
			}

			// Log.v("result", result.toString());

			return result;
		}
	}


	public String convertIntToBraille(String num)
	{
		switch (num)
		{
			case "1":
				return "a";
			case "2":
				return "b";
			case "3":
				return "c";
			case "4":
				return "d";
			case "5":
				return "e";
			case "6":
				return "f";
			case "7":
				return "g";
			case "8":
				return "h";
			case "9":
				return "i";
			case "0":
				return "j";
		}
		return null;
	}

	public int convertBrailleToInt(String num)
	{
		switch (num)
		{
			case "a":
				return 1;
			case "b":
				return 2;
			case "c":
				return 3;
			case "d":
				return 4;
			case "e":
				return 5;
			case "f":
				return 6;
			case "g":
				return 7;
			case "h":
				return 8;
			case "i":
				return 9;
			case "j":
				return 0;
		}
		return -1;
	}

	public boolean isAllCaps(String s)
	{
		if (s.length() > 1)
		{
			boolean exception = false;
			boolean atLeastOneUpperCase = false;
			for (int i = 0; i < s.length() && !exception; i++)
			{
				char current = s.charAt(i);
				if (current == '1' || current == '2' || current == '3' || current == '4' || current == '5' || current == '6' || current == '7' || current == '8' || current == '9' || current == '0')
				{
					exception = true;
				}
				else if (Character.isLowerCase(current))
				{
					exception = true;
				}
				if (Character.isUpperCase(current))
				{
					atLeastOneUpperCase = true;
				}
			}
			return atLeastOneUpperCase && !exception;
		}
		else
			return false;
	}
}
