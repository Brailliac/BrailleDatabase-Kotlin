package com.lukeneedham.brailledatabase.Braille;

import android.util.Log;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleDatabase;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Luke on 13/08/2016.
 */
public class BrailleSymbolTranslation
{
	private List<BrailleSymbolDatabaseEntry> translation;

	public BrailleSymbolTranslation()
	{
		translation = new ArrayList<>();
	}

	public BrailleSymbolTranslation(BrailleSymbolTranslation trans)
	{
		translation = new ArrayList<>(trans.getSymbols());
	}

	public BrailleSymbolTranslation(List<BrailleSymbolDatabaseEntry> entries)
	{
		translation = new ArrayList<>(entries);
	}

	public void add(BrailleSymbolDatabaseEntry entry)
	{
		translation.add(entry);
	}

	public void prepend(BrailleSymbolDatabaseEntry entry)
	{
		translation.add(0, entry);
	}

	public void addAll(List<BrailleSymbolDatabaseEntry> entry)
	{
		translation.addAll(entry);
	}

	public BrailleSymbolDatabaseEntry pop()
	{
		int lastPos = translation.size() - 1;
		BrailleSymbolDatabaseEntry last = translation.get(lastPos);
		translation.remove(lastPos);
		return last;
	}

	public void clear()
	{
		translation.clear();
	}

	/*
		@return Pair< position of symbol, position of cell within that symbol >
	 */
	@Nullable
	public kotlin.Pair<Integer, Integer> findAtCellPosition(int cellPosToFind)
	{
		int count = 0;
		for (int brailleSymbolDateEntryPos = 0; brailleSymbolDateEntryPos < translation.size(); brailleSymbolDateEntryPos++)
		{
			BrailleCell[] cellsInEntry = translation.get(brailleSymbolDateEntryPos).getCells();
			for (int brailleSymbolCellPos = 0; brailleSymbolCellPos < cellsInEntry.length; brailleSymbolCellPos++)
			{
				count++;
				if (count > cellPosToFind)
				{
					return new kotlin.Pair<>(brailleSymbolDateEntryPos, brailleSymbolCellPos);
				}
			}
		}
		return null;
	}

	public void concatenate(BrailleSymbolTranslation entry)
	{
		translation.addAll(entry.getSymbols());
	}

	// the string to match to the regex
	public String getStringForRegex()
	{
		String res = "";
		for (BrailleSymbolDatabaseEntry entry : getSymbols())
		{
			String lettersRep = entry.getTextRepresented();
			if (lettersRep.equals(BrailleDatabase.Companion.getNO_STRING()))
			{
				res += entry.getBrailleFont();
			}
			else
			{
				res += entry.getTextRepresented();
			}
		}
		return res;
	}

	// the regex pattern to match
	public String getRegexPattern()
	{
		String res = "^";
		for (BrailleSymbolDatabaseEntry entry : getSymbols())
		{
			if (entry.getDictionaryType().equals(DictionaryType.UNKNOWN))
			{
				for (char a : entry.getTextRepresented().toCharArray())
				{
					res += ".?"; // 0 or 1 char wildcard
				}
			}
			else
			{
				String lettersRep = entry.getTextRepresented();
				if (lettersRep.equals("“") || lettersRep.equals("”"))
				{
					res += String.format("(%s|%s)", Pattern.quote(lettersRep), Pattern.quote("\""));
				}
				else
				{
					if (lettersRep.equals(BrailleDatabase.Companion.getNO_STRING()))
					{
						res += Pattern.quote(entry.getBrailleFont());
					}
					else
					{
						res += Pattern.quote(entry.getTextRepresented());
					}
				}
			}
		}
		return res;
	}

	public List<BrailleSymbolDatabaseEntry> getSymbols()
	{
		return translation;
	}

	public int length()
	{
		return translation.size();
	}

	public String getBrailleFont()
	{
		StringBuilder tran = new StringBuilder();
		for (BrailleSymbolDatabaseEntry data : translation)
		{
			tran.append(data.getBrailleFont());
		}
		return tran.toString();
	}

	public String getUnicode()
	{
		StringBuilder tran = new StringBuilder();
		for (BrailleSymbolDatabaseEntry data : translation)
		{
			tran.append(data.getSymbol().getUnicodeCellSymbol());
		}
		return tran.toString();
	}

	public List<BrailleCell> getCells()
	{
		ArrayList<BrailleCell> cells = new ArrayList<>();

		for (BrailleSymbolDatabaseEntry data : translation)
		{
			BrailleCell[] currentCells = data.getCells();
			if (currentCells != null)
			{
				cells.addAll(Arrays.asList(currentCells));
			}
		}

		return cells;
	}

	public List<List<BrailleCell>> getNestedCells()
	{
		List<List<BrailleCell>> cells = new ArrayList<>();

		for (BrailleSymbolDatabaseEntry data : translation)
		{
			BrailleCell[] currentCells = data.getCells();
			if (currentCells != null)
			{
				cells.add(Arrays.asList(currentCells));
			}
		}

		return cells;
	}

	public String getSimpleLettersRepresented()
	{
		StringBuilder tran = new StringBuilder();
		for (BrailleSymbolDatabaseEntry data : translation)
		{
			tran.append(data.getTextRepresented());
		}
		return tran.toString();
	}

	public List<BrailleSymbolTranslation> getWordTranslations(BrailleDatabase database) {
		return splitTranslationByWordSeparators(database);
	}

	private List<BrailleSymbolTranslation> splitTranslationByWordSeparators(BrailleDatabase database) {
		List<BrailleSymbolTranslation> words = new ArrayList<>();

		List<BrailleSymbolDatabaseEntry> currentWordBuilder = new ArrayList<>();

		for (BrailleSymbolDatabaseEntry data : translation)
		{
			if(database.isWordSeparator(data)) {
				BrailleSymbolTranslation finishedWord = new BrailleSymbolTranslation(currentWordBuilder);
				if(finishedWord.length() > 0) {
					words.add(finishedWord);
				}

				currentWordBuilder.clear();

				List<BrailleSymbolDatabaseEntry> separatorTranslationList = new ArrayList<>();
				separatorTranslationList.add(data);
				BrailleSymbolTranslation separatorTranslation = new BrailleSymbolTranslation(separatorTranslationList);
				words.add(separatorTranslation);
			} else {
				currentWordBuilder.add(data);
			}
		}
		BrailleSymbolTranslation finalWordTranslation = new BrailleSymbolTranslation(currentWordBuilder);
		if(finalWordTranslation.length() > 0) {
			words.add(finalWordTranslation);
		}

		return words;
	}

	/**
	 * Like textRepresented, but takes into account indicators like NUMBER_SIGN, CAPITALS_INDICATOR, initial-letter contraction modifiers
	 * returns null when the translation is invalid (for example, contains NUMBER symbols illegally (not following NUMBER_SIGN)
	 */
	@Nullable
	public String getLatinTranslation(BrailleDatabase db)
	{
		StringBuilder tran = new StringBuilder();

		boolean capsOn = false;
		boolean allCapsOn = false;
		boolean numberModeOn = false;

		for (BrailleSymbolDatabaseEntry data : translation)
		{
			String symbolTranslation = data.getTextRepresented();


			// check translation is legal
			if ((data.getDictionaryType() == DictionaryType.NUMBER && !numberModeOn && data.getSymbolModifierType() != BrailleSymbolModifierType.INDICATOR)
					|| (capsOn && data == db.getCapitalSymbol())
					|| (capsOn && data == db.getCapitalWordSymbol())
					|| (allCapsOn && data == db.getCapitalSymbol())
					|| (allCapsOn && data == db.getCapitalWordSymbol()))
			{
				Log.v(data.getSymbol().getUnicodeCellSymbol(), capsOn + ", " + allCapsOn + ", " + numberModeOn);
				return null;
			}


			// adjust symbol based on modifiers
			if (allCapsOn)
			{
				symbolTranslation = symbolTranslation.toUpperCase();
			}
			if (capsOn)
			{
				if (symbolTranslation.length() > 0)
				{
					symbolTranslation = Character.toUpperCase(symbolTranslation.charAt(0)) + symbolTranslation.substring(1, symbolTranslation.length());
				}
				capsOn = false;
			}
			if (numberModeOn)
			{
				BrailleSymbolDatabaseEntry numberSymbol = db.getNumberDataEntryForSymbol(data.getSymbol()); // makes exception for indicators like LETTER_SIGN
				if(numberSymbol == null)
				{
					return null;
				}
				symbolTranslation = numberSymbol.getTextRepresented();
			}


			// apply modifiers
			if (BrailleSymbolUsageRule.isWordSplitter(symbolTranslation))
			{
				capsOn = false;
				allCapsOn = false;
				numberModeOn = false;
			}
			if (data.equals(db.getLetterSign()))
			{
				numberModeOn = false;
			}
			if (data.equals(db.getCapitalSymbol()))
			{
				capsOn = true;
			}
			if (data.equals(db.getCapitalWordSymbol()))
			{
				allCapsOn = true;
			}
			if (data.equals(db.getNumberSignSymbol()))
			{
				numberModeOn = true;
			}

			tran.append(symbolTranslation);
		}
		return tran.toString();
	}

	public String toString()
	{
		return "( " + getUnicode() + " = " + getSimpleLettersRepresented() + " )";
	}
}
