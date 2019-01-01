package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R

/*
object BrailleDatabaseCzech_old : BrailleDatabase()
{
    override val dictionaryCategories = listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
            DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
            DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION))

    override val challengeSymbolTypes = listOf(LETTER)

    override val canDoTranslation = true

    /**
     * make the array of all the entries in the database
     * for each entry, make a new BrailleSymbolDatabaseEntry object, and pass the relevant paramaters
     * the available BrailleSymbolDatabaseEntry constructors and neccessary paramaters can be seen in BrailleSymbolDatabaseEntry.java
     * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
     * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
     */

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
            BrailleSymbolDatabaseEntry.LegacyConstructor("o", LETTER, NOTHING, Cell135),
            BrailleSymbolDatabaseEntry.LegacyConstructor("p", LETTER, NOTHING, Cell1234),
            BrailleSymbolDatabaseEntry.LegacyConstructor("q", LETTER, NOTHING, Cell12345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("r", LETTER, NOTHING, Cell1235),
            BrailleSymbolDatabaseEntry.LegacyConstructor("s", LETTER, NOTHING, Cell234),
            BrailleSymbolDatabaseEntry.LegacyConstructor("t", LETTER, NOTHING, Cell2345),
            BrailleSymbolDatabaseEntry.LegacyConstructor("u", LETTER, NOTHING, Cell136),
            BrailleSymbolDatabaseEntry.LegacyConstructor("v", LETTER, NOTHING, Cell1236),
            BrailleSymbolDatabaseEntry.LegacyConstructor("w", LETTER, NOTHING, Cell12356), // [12356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("x", LETTER, NOTHING, Cell1346),
            BrailleSymbolDatabaseEntry.LegacyConstructor("y", LETTER, NOTHING, Cell13456),
            BrailleSymbolDatabaseEntry.LegacyConstructor("z", LETTER, NOTHING, Cell1356),

            //Accent and diactricit letters
            BrailleSymbolDatabaseEntry.LegacyConstructor("á", LETTER, NOTHING, Cell16), // [16]
            BrailleSymbolDatabaseEntry.LegacyConstructor("č", LETTER, NOTHING, Cell146), // [146]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ď", LETTER, NOTHING, Cell1456), // [1456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("é", LETTER, NOTHING, Cell345), // [345]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ě", LETTER, NOTHING, Cell126), // [126]
            BrailleSymbolDatabaseEntry.LegacyConstructor("í", LETTER, NOTHING, Cell34), // [34]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ň", LETTER, NOTHING, Cell1246), // [1246]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ó", LETTER, NOTHING, Cell246), // [246]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ř", LETTER, NOTHING, Cell2456), // [2456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("š", LETTER, NOTHING, Cell156), // [156]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ť", LETTER, NOTHING, Cell1256), // [1256]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ú", LETTER, NOTHING, Cell346), // [346]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ů", LETTER, NOTHING, Cell23456), // [23456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ý", LETTER, NOTHING, Cell12346), // [12346]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ž", LETTER, NOTHING, Cell2346), // [2346]

            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_number_sign, dictionaryType = NUMBER, onEntryClickType = SHOW_INFO, symbolModifierType = BrailleSymbolModifierType.INDICATOR, cells = listOf(Cell3456), extraInfoRes = R.string.numbersExplanation, fillEntryWidth = true),
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
            BrailleSymbolDatabaseEntry.LegacyConstructor(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, Cell3), // [3]
            BrailleSymbolDatabaseEntry.LegacyConstructor(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, Cell2),

            BrailleSymbolDatabaseEntry.LegacyConstructor(" ", INVISIBLE, NOTHING, CellEmpty),

            BrailleSymbolDatabaseEntry.LegacyConstructor(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, Cell3),
            BrailleSymbolDatabaseEntry.LegacyConstructor("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell26), // [26]
            BrailleSymbolDatabaseEntry.LegacyConstructor("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235),
            BrailleSymbolDatabaseEntry.LegacyConstructor(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, Cell2),
            BrailleSymbolDatabaseEntry.LegacyConstructor(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25),
            BrailleSymbolDatabaseEntry.LegacyConstructor(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23),
            BrailleSymbolDatabaseEntry.LegacyConstructor("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell4), // [4]
            BrailleSymbolDatabaseEntry.LegacyConstructor("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36),
            BrailleSymbolDatabaseEntry.LegacyConstructor("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell2356), // [56] quote sign, also used for second and inch
            BrailleSymbolDatabaseEntry.LegacyConstructor("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell2356), // [56] quote sign, also used for second and inch
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capital, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell6), extraInfoRes = R.string.capitalsignExplanation),
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capitalword, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell56), extraInfoRes = R.string.capitalwordExplanation), // [56]
            BrailleSymbolDatabaseEntry.LegacyConstructor("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell35), // [35]
            BrailleSymbolDatabaseEntry.LegacyConstructor("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell236), // [236]
            BrailleSymbolDatabaseEntry.LegacyConstructor(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell356), // [356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("%", R.string.braille_percent, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell1234), // [3456][1234]
            BrailleSymbolDatabaseEntry.LegacyConstructor("‰", R.string.braille_permille, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell1235), // [3456][1235]
            BrailleSymbolDatabaseEntry.LegacyConstructor("§", R.string.braille_dollar, PUNCTUATION, SHOW_LETTERS_REP, Cell3456, Cell346), // [3456][346]
            BrailleSymbolDatabaseEntry.LegacyConstructor("|", R.string.braille_pipe, PUNCTUATION, SHOW_LETTERS_REP, Cell456), // [456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell12456))
}
        */