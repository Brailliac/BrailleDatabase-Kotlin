/*
package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.R

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.NOTHING

import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_INFO
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_LETTERS_REP
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType
import com.lukeneedham.brailledatabase.Braille.DictionaryType
import com.lukeneedham.brailledatabase.Braille.DictionaryType.INVISIBLE
import com.lukeneedham.brailledatabase.Braille.DictionaryType.LETTER
import com.lukeneedham.brailledatabase.Braille.DictionaryType.NUMBER
import com.lukeneedham.brailledatabase.Braille.DictionaryType.PUNCTUATION

object BrailleDatabaseSpanish_old : BrailleDatabase()
{

    override val dictionaryCategories = listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
                DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
                DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION))


    override val challengeSymbolTypes = listOf(LETTER)

    override val canDoTranslation = true

    */
/**
     * make the array of all the entries in the database
     * for each entry, make a new BrailleSymbolDatabaseEntry object, and pass the relevant paramaters
     * the available BrailleSymbolDatabaseEntry constructors and neccessary paramaters can be seen in BrailleSymbolDatabaseEntry.java
     * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
     * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
     *//*


    override val symbols = listOf(

            BrailleSymbolDatabaseEntry.LegacyConstructor("a", LETTER, NOTHING, Cell1),
            BrailleSymbolDatabaseEntry.LegacyConstructor("b", LETTER, NOTHING, Cell12),
            BrailleSymbolDatabaseEntry.LegacyConstructor("c", LETTER, NOTHING, Cell14),
            BrailleSymbolDatabaseEntry.LegacyConstructor("d", LETTER, NOTHING, Cell145),
            BrailleSymbolDatabaseEntry.LegacyConstructor("e", LETTER, NOTHING, Cell15),
            BrailleSymbolDatabaseEntry.LegacyConstructor("f", LETTER, NOTHING, Cell124),
            BrailleSymbolDatabaseEntry.LegacyConstructor("g", LETTER, NOTHING, Cell1245),
            BrailleSymbolDatabaseEntry.LegacyConstructor("h", LETTER, NOTHING, Cell125),
            BrailleSymbolDatabaseEntry.LegacyConstructor("i", LETTER, NOTHING, Cell24),
            BrailleSymbolDatabaseEntry.LegacyConstructor("j", LETTER, NOTHING, Cell245),
            BrailleSymbolDatabaseEntry.LegacyConstructor("k", LETTER, NOTHING, Cell13),
            BrailleSymbolDatabaseEntry.LegacyConstructor("l", LETTER, NOTHING, Cell123),
            BrailleSymbolDatabaseEntry.LegacyConstructor("m", LETTER, NOTHING, Cell134),
            BrailleSymbolDatabaseEntry.LegacyConstructor("n", LETTER, NOTHING, Cell1345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("ñ", LETTER, NOTHING, Cell12456), //Special letter used for certain words
            BrailleSymbolDatabaseEntry.LegacyConstructor("o", LETTER, NOTHING, Cell135),
            BrailleSymbolDatabaseEntry.LegacyConstructor("p", LETTER, NOTHING, Cell1234),
            BrailleSymbolDatabaseEntry.LegacyConstructor("q", LETTER, NOTHING, Cell12345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("r", LETTER, NOTHING, Cell1235),
            BrailleSymbolDatabaseEntry.LegacyConstructor("s", LETTER, NOTHING, Cell234),
            BrailleSymbolDatabaseEntry.LegacyConstructor("t", LETTER, NOTHING, Cell2345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("u", LETTER, NOTHING, Cell136),
            BrailleSymbolDatabaseEntry.LegacyConstructor("v", LETTER, NOTHING, Cell1236),
            BrailleSymbolDatabaseEntry.LegacyConstructor("w", LETTER, NOTHING, Cell2456),
            BrailleSymbolDatabaseEntry.LegacyConstructor("x", LETTER, NOTHING, Cell1346),
            BrailleSymbolDatabaseEntry.LegacyConstructor("y", LETTER, NOTHING, Cell13456),
            BrailleSymbolDatabaseEntry.LegacyConstructor("z", LETTER, NOTHING, Cell1356),

            //Accent and diactricit letters
            BrailleSymbolDatabaseEntry.LegacyConstructor("á", LETTER, NOTHING, Cell12356),
            BrailleSymbolDatabaseEntry.LegacyConstructor("é", LETTER, NOTHING, Cell2346),
            BrailleSymbolDatabaseEntry.LegacyConstructor("í", LETTER, NOTHING, Cell34),
            BrailleSymbolDatabaseEntry.LegacyConstructor("ó", LETTER, NOTHING, Cell346),
            BrailleSymbolDatabaseEntry.LegacyConstructor("ú", LETTER, NOTHING, Cell23456),
            BrailleSymbolDatabaseEntry.LegacyConstructor("ü", LETTER, NOTHING, Cell1256),

            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_number_sign, dictionaryType = NUMBER, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell3456), extraInfoRes = R.string.numbersExplanation, fillEntryWidth = true),
            BrailleSymbolDatabaseEntry.LegacyConstructor("1", NUMBER, NOTHING, Cell1),
            BrailleSymbolDatabaseEntry.LegacyConstructor("2", NUMBER, NOTHING, Cell12),
            BrailleSymbolDatabaseEntry.LegacyConstructor("3", NUMBER, NOTHING, Cell14),
            BrailleSymbolDatabaseEntry.LegacyConstructor("4", NUMBER, NOTHING, Cell145),
            BrailleSymbolDatabaseEntry.LegacyConstructor("5", NUMBER, NOTHING, Cell15),
            BrailleSymbolDatabaseEntry.LegacyConstructor("6", NUMBER, NOTHING, Cell124),
            BrailleSymbolDatabaseEntry.LegacyConstructor("7", NUMBER, NOTHING, Cell1245),
            BrailleSymbolDatabaseEntry.LegacyConstructor("8", NUMBER, NOTHING, Cell125),
            BrailleSymbolDatabaseEntry.LegacyConstructor("9", NUMBER, NOTHING, Cell24),
            BrailleSymbolDatabaseEntry.LegacyConstructor("0", NUMBER, NOTHING, Cell245),
            BrailleSymbolDatabaseEntry.LegacyConstructor(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, Cell256),
            BrailleSymbolDatabaseEntry.LegacyConstructor(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, Cell2),

            BrailleSymbolDatabaseEntry.LegacyConstructor(" ", INVISIBLE, NOTHING, CellEmpty),

            BrailleSymbolDatabaseEntry.LegacyConstructor(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, Cell256),
            BrailleSymbolDatabaseEntry.LegacyConstructor("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell26), //Different in Spanish
            BrailleSymbolDatabaseEntry.LegacyConstructor("¿", R.string.braille_questionmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, Cell26), //Different in Spanish
            BrailleSymbolDatabaseEntry.LegacyConstructor("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell236),
            BrailleSymbolDatabaseEntry.LegacyConstructor("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235), //Same as English
            BrailleSymbolDatabaseEntry.LegacyConstructor("¡", R.string.braille_exclamationmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, Cell235), //Same as English
            BrailleSymbolDatabaseEntry.LegacyConstructor(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, Cell2),
            BrailleSymbolDatabaseEntry.LegacyConstructor(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25),
            BrailleSymbolDatabaseEntry.LegacyConstructor(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23),
            BrailleSymbolDatabaseEntry.LegacyConstructor("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell3),
            BrailleSymbolDatabaseEntry.LegacyConstructor("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36),
            BrailleSymbolDatabaseEntry.LegacyConstructor("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell356),

            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_lettersign, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell56), extraInfoRes = R.string.lettersignExplanation),
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capital, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell6), extraInfoRes = R.string.capitalsignExplanation),
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capitalword, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell6, Cell6), extraInfoRes = R.string.capitalwordExplanation),

            BrailleSymbolDatabaseEntry.LegacyConstructor("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell35),
            BrailleSymbolDatabaseEntry.LegacyConstructor("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell126),
            BrailleSymbolDatabaseEntry.LegacyConstructor(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, Cell345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell456, Cell34),

            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, R.string.braille_dots5, INVISIBLE, NOTHING, Cell5),
            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, R.string.braille_dots45, INVISIBLE, NOTHING, Cell45),
            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, R.string.braille_dots456, INVISIBLE, NOTHING, Cell456),

            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, R.string.braille_dots46, INVISIBLE, NOTHING, Cell46),
            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, R.string.braille_dots56, INVISIBLE, NOTHING, Cell56))
}
*/
