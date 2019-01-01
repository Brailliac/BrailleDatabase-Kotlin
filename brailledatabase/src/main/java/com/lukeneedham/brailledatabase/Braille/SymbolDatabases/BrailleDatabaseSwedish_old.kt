/*
package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.*
import com.lukeneedham.brailledatabase.R

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.NOTHING
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_INFO
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_LETTERS_REP
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_USAGE_RULE
import com.lukeneedham.brailledatabase.Braille.DictionaryType.FOREIGN
import com.lukeneedham.brailledatabase.Braille.DictionaryType.INVISIBLE
import com.lukeneedham.brailledatabase.Braille.DictionaryType.LETTER
import com.lukeneedham.brailledatabase.Braille.DictionaryType.MATHS
import com.lukeneedham.brailledatabase.Braille.DictionaryType.NUMBER
import com.lukeneedham.brailledatabase.Braille.DictionaryType.PUNCTUATION
import com.lukeneedham.brailledatabase.Braille.DictionaryType.SHORT_1
import com.lukeneedham.brailledatabase.Braille.DictionaryType.SHORT_2A
import com.lukeneedham.brailledatabase.Braille.DictionaryType.SHORT_2B
import com.lukeneedham.brailledatabase.Braille.DictionaryType.SHORT_2C
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.STANDALONE
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.SURROUNDED_1_OR_2_SIDES_BY_PLAIN
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.SURROUNDED_START_BY_PLAIN

object BrailleDatabaseSwedish_old : BrailleDatabase()
{

    override val dictionaryCategories =
            listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
                DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
                DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION),
                DictionaryCategory(R.string.symbol_short1, 8, "…1", SHORT_1).setTranslateToggle(true),
                DictionaryCategory(R.string.category_short2, 12, "…2", SHORT_2A, SHORT_2B, SHORT_2C).setTranslateToggle(true),
                DictionaryCategory(R.string.symbol_foreign, 15, "É", FOREIGN))

    override val closeQuote by lazy { findSymbolDataByDescription(R.string.braille_quote)[0] }

    override val openQuote by lazy { findSymbolDataByDescription(R.string.braille_quote)[0] }

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
            BrailleSymbolDatabaseEntry.LegacyConstructor("å", LETTER, NOTHING, Cell16), // [16]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ä", LETTER, NOTHING, Cell345), // [345]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ö", LETTER, NOTHING, Cell246), // [246]

            BrailleSymbolDatabaseEntry.LegacyConstructor("é", LETTER, NOTHING, Cell123456), // [123456] Used in few Swedish words to prolong the e. Important but not part of the official Swedish alphabet.

            BrailleSymbolDatabaseEntry.LegacyConstructor(" ", INVISIBLE, NOTHING, CellEmpty),

            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_number_sign, dictionaryType = NUMBER, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell3456), extraInfoRes = R.string.numbersExplanation, fillEntryWidth = true),
            BrailleSymbolDatabaseEntry.LegacyConstructor("1", NUMBER, NOTHING, BrailleCellDatabase.Cell1),
            BrailleSymbolDatabaseEntry.LegacyConstructor("2", NUMBER, NOTHING, Cell12),
            BrailleSymbolDatabaseEntry.LegacyConstructor("3", NUMBER, NOTHING, Cell14),
            BrailleSymbolDatabaseEntry.LegacyConstructor("4", NUMBER, NOTHING, Cell145),
            BrailleSymbolDatabaseEntry.LegacyConstructor("5", NUMBER, NOTHING, Cell15),
            BrailleSymbolDatabaseEntry.LegacyConstructor("6", NUMBER, NOTHING, Cell124),
            BrailleSymbolDatabaseEntry.LegacyConstructor("7", NUMBER, NOTHING, Cell1245),
            BrailleSymbolDatabaseEntry.LegacyConstructor("8", NUMBER, NOTHING, Cell125),
            BrailleSymbolDatabaseEntry.LegacyConstructor("9", NUMBER, NOTHING, Cell24),
            BrailleSymbolDatabaseEntry.LegacyConstructor("0", NUMBER, NOTHING, Cell245),
            BrailleSymbolDatabaseEntry.LegacyConstructor(",", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, Cell2), // [2] comma 3,1415 (Decimal point used in Swedish texts)
            BrailleSymbolDatabaseEntry.LegacyConstructor(".", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, Cell3), // [3] Period (Used as decimal point in English texts, not in Swedish text) 3.1415

            BrailleSymbolDatabaseEntry.LegacyConstructor("%", R.string.braille_percent, PUNCTUATION, SHOW_LETTERS_REP, Cell1456), // [1456] Percent
            BrailleSymbolDatabaseEntry.LegacyConstructor("‰", R.string.braille_permille, PUNCTUATION, SHOW_LETTERS_REP, Cell1456, Cell1456), // [1456] [1456] per mille
            BrailleSymbolDatabaseEntry.LegacyConstructor("¢", R.string.braille_cent, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell14), // [45] [14] Cent
            BrailleSymbolDatabaseEntry.LegacyConstructor("$", R.string.braille_dollar, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell234), // [45] [234] Dollar
            BrailleSymbolDatabaseEntry.LegacyConstructor("€", R.string.braille_euro, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell15), // [45] [15] Euro
            BrailleSymbolDatabaseEntry.LegacyConstructor("£", R.string.braille_poundsterling, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell123), // [45] [123] Brittish pound
            BrailleSymbolDatabaseEntry.LegacyConstructor("¥", R.string.braille_yen, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell13456), // [45] [13456] Japan yen
            BrailleSymbolDatabaseEntry.LegacyConstructor("○", R.string.braille_degree, PUNCTUATION, SHOW_LETTERS_REP, Cell12456, Cell1245), // [12456] [1245] Degree sign
            BrailleSymbolDatabaseEntry.LegacyConstructor("&", R.string.braille_ampersand, PUNCTUATION, SHOW_LETTERS_REP, Cell12346), // [12346] And sign

            BrailleSymbolDatabaseEntry.LegacyConstructor("©", R.string.braille_copyright, PUNCTUATION, SHOW_LETTERS_REP, Cell236, Cell14, Cell356), // [236] [14] [356] Copyright sign
            BrailleSymbolDatabaseEntry.LegacyConstructor("®", R.string.braille_rights_reserved, PUNCTUATION, SHOW_LETTERS_REP, Cell236, Cell1235, Cell356), // [236] [1235] [356] Rights reserved sign
            BrailleSymbolDatabaseEntry.LegacyConstructor("™", R.string.braille_tm, PUNCTUATION, SHOW_LETTERS_REP, Cell236, Cell2345, Cell1235, Cell356), // [236] [2345] [134] [356] Trade mark sign

            BrailleSymbolDatabaseEntry.LegacyConstructor("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, Cell26), // [26]
            BrailleSymbolDatabaseEntry.LegacyConstructor("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, Cell235), // [235]
            BrailleSymbolDatabaseEntry.LegacyConstructor(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, Cell25), // [25]
            BrailleSymbolDatabaseEntry.LegacyConstructor(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, Cell23), // [23]
            BrailleSymbolDatabaseEntry.LegacyConstructor("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell34), // [34] (also for division)
            //BrailleSymbolDatabaseEntry.Companion.LegacyConstructor("\"", R.string.braille_quote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
            BrailleSymbolDatabaseEntry.LegacyConstructor("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
            BrailleSymbolDatabaseEntry.LegacyConstructor("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
            BrailleSymbolDatabaseEntry.LegacyConstructor("’", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell5), // [5], singe quote or minute or fot

            BrailleSymbolDatabaseEntry.LegacyConstructor("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, Cell36), // [36] (also for subtract)
            BrailleSymbolDatabaseEntry.LegacyConstructor("–", R.string.braille_dash, PUNCTUATION, SHOW_LETTERS_REP, Cell36, Cell36), // [36] [36] Speech string

            BrailleSymbolDatabaseEntry.LegacyConstructor("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell236), // [236]
            BrailleSymbolDatabaseEntry.LegacyConstructor(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell356), // [356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("[", R.string.braille_opensquarebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell12356), // [12356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("]", R.string.braille_closesquarebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell23456), // [23456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("{", R.string.braille_opencurlybrace, PUNCTUATION, SHOW_LETTERS_REP, Cell6, Cell12356), // [6] [12356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("}", R.string.braille_closecurlybrace, PUNCTUATION, SHOW_LETTERS_REP, Cell6, Cell23456), // [6] [23456]

            BrailleSymbolDatabaseEntry.LegacyConstructor("§", R.string.braille_paragraph, PUNCTUATION, SHOW_LETTERS_REP, Cell346), // [346] paragraph. Must have a space after or else this enables super script mode
            BrailleSymbolDatabaseEntry.LegacyConstructor("&", R.string.braille_ampersand, PUNCTUATION, SHOW_LETTERS_REP, Cell1256), // [12346]
            BrailleSymbolDatabaseEntry.LegacyConstructor("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell35), // [35]
            BrailleSymbolDatabaseEntry.LegacyConstructor("†", R.string.braille_dagger, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell236), // [45] [236] Cross
            BrailleSymbolDatabaseEntry.LegacyConstructor("#", R.string.braille_hash, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell3456), // [45] [3456] Number sign, square
            BrailleSymbolDatabaseEntry.LegacyConstructor("@", R.string.braille_at, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell12356), // [45] [12356] At sign
            BrailleSymbolDatabaseEntry.LegacyConstructor("\\", R.string.braille_backslash, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell34), // [45] [34] Backslash
            BrailleSymbolDatabaseEntry.LegacyConstructor("_", R.string.braille_underscore, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell36), // [45] [36] Underscore
            BrailleSymbolDatabaseEntry.LegacyConstructor("|", R.string.braille_pipe, PUNCTUATION, SHOW_LETTERS_REP, Cell456), // [456]
            BrailleSymbolDatabaseEntry.LegacyConstructor("~", R.string.braille_tilde, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell25), // [45] [25]

            BrailleSymbolDatabaseEntry.LegacyConstructor("•", R.string.braille_bullet, PUNCTUATION, SHOW_LETTERS_REP, Cell123456), // [123456] List character - bullet
            BrailleSymbolDatabaseEntry.LegacyConstructor("◦", R.string.braille_bullet_white, PUNCTUATION, SHOW_LETTERS_REP, Cell4, Cell123456), // [4] [123456] List character - ring
            BrailleSymbolDatabaseEntry.LegacyConstructor("▪", R.string.braille_bullet_square, PUNCTUATION, SHOW_LETTERS_REP, Cell45, Cell123456), // [45] [123456] List character - square

            // pre signs
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE,  Cell45),
            // Pre [45] for various characters, currency, some diacritical signs, one list char, help parentheses
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE,  Cell4),
            // Pre [4] for Diacritical signs used over letters. Used for writing in other languages than Swedish.
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE,  Cell46),
            // Pre [46] for style
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE,  Cell56),
            // Pre [56] for fonetic, greek lc letter
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE,  Cell12456),
            // Pre [12456] for ·, ×, ○
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = NOTHING, cells = listOf(Cell346)), // [346] super script mode. (ends with space)
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = NOTHING, cells = listOf(Cell126)), // [126] sub script mode (ends with space)
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = NOTHING, cells = listOf(Cell156)), // [156] Stop sign. End a mode. For modes that do not end at next space.

            // Three signs for capital mode
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capital, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell6), extraInfoRes = R.string.capitalsignExplanation), // [6] Next character is a capital letter
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), descriptiveNameRes = R.string.braille_capitalword, dictionaryType = PUNCTUATION, symbolModifierType = BrailleSymbolModifierType.INDICATOR, onEntryClickType = SHOW_INFO, cells = listOf(Cell6, Cell6), extraInfoRes = R.string.capitalwordExplanation), // [6] [6] Capital mode as log as you have letters and -
            // BrailleSymbolDatabaseEntry.Companion.LegacyConstructor(NO_STRING, INVISIBLE, Cell6, Cell6, Cell6), // [6] [6] [6] Capital mode until stop sign

            // Numbers. Same as in english where a-i = 1-9, j=0.
            // The number sign activate the number mode. Then mode end on any other character but digits.
            BrailleSymbolDatabaseEntry.LegacyConstructor("<", R.string.braille_less_than, MATHS, NOTHING, Cell3456, Cell246), // [3456] [246] (Number sign and ö) less than
            BrailleSymbolDatabaseEntry.LegacyConstructor(">", R.string.braille_greater_than, MATHS, NOTHING, Cell3456, Cell135), // [3456] [135] (Number sign and o) greater than

            // Mathematics
            BrailleSymbolDatabaseEntry.LegacyConstructor("+", R.string.braille_add, MATHS, NOTHING, Cell256), // [256] add
            BrailleSymbolDatabaseEntry.LegacyConstructor("=", R.string.braille_equal, MATHS, NOTHING, Cell2356), // [2356] equals
            BrailleSymbolDatabaseEntry.LegacyConstructor("·", R.string.braille_multiply_dot, MATHS, NOTHING, Cell12456, Cell3), // [12456] [3] Multiplication sign with a dot (common) Example: 2,5 ⋅ 2,5 = 6,25
            BrailleSymbolDatabaseEntry.LegacyConstructor("×", R.string.braille_multiply_cross, MATHS, NOTHING, Cell12456, Cell1346), // [12456] [1346] Multiplication sign with an x. Example: Magnification is 625x
            BrailleSymbolDatabaseEntry.LegacyConstructor("──", R.string.braille_divide_line, MATHS, NOTHING, Cell1256), // [1256] division (horizontal line)
            BrailleSymbolDatabaseEntry.LegacyConstructor("√", R.string.braille_root, MATHS, NOTHING, Cell146), // [146] root sign

            // Short write - level 1 & 2. Short write text ends with a colon : [25].

            // Short write - Level 1. System is called K-75
            // One type: Shorten a whole word. Words can be really long in Swedish.

            BrailleSymbolDatabaseEntry.LegacyConstructor("att", STANDALONE, SHORT_1, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1), // [1] a. to (do something)
            BrailleSymbolDatabaseEntry.LegacyConstructor("bli", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell12), // [12] b. become
            BrailleSymbolDatabaseEntry.LegacyConstructor("och", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell14), // [14] c. and
            BrailleSymbolDatabaseEntry.LegacyConstructor("där", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell145), // [145] d. there
            BrailleSymbolDatabaseEntry.LegacyConstructor("eller", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell15), // [15] e. or
            BrailleSymbolDatabaseEntry.LegacyConstructor("från", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell124), // [124] f. from
            BrailleSymbolDatabaseEntry.LegacyConstructor("genom", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1245), // [1245] g. trough
            BrailleSymbolDatabaseEntry.LegacyConstructor("han", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell125), // [125] h. he
            BrailleSymbolDatabaseEntry.LegacyConstructor("jag", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell245), // [134] j. I
            BrailleSymbolDatabaseEntry.LegacyConstructor("kan", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell13), // [13] k. can
            BrailleSymbolDatabaseEntry.LegacyConstructor("lika", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell123), // [123] l. like/same
            BrailleSymbolDatabaseEntry.LegacyConstructor("man", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell134), // [134] m. you/man/one
            BrailleSymbolDatabaseEntry.LegacyConstructor("när", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1345), // [1345] n. when
            BrailleSymbolDatabaseEntry.LegacyConstructor("på", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1234), // [1234] p. on
            BrailleSymbolDatabaseEntry.LegacyConstructor("under", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell12345), // [12345] q. under
            BrailleSymbolDatabaseEntry.LegacyConstructor("har", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1235), // [1235] r. have
            BrailleSymbolDatabaseEntry.LegacyConstructor("som", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell234), // [234] s. as
            BrailleSymbolDatabaseEntry.LegacyConstructor("till", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell2345), // [2345] t. to (a destination)
            BrailleSymbolDatabaseEntry.LegacyConstructor("utan", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell136), // [136] u. without
            BrailleSymbolDatabaseEntry.LegacyConstructor("vid", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1236), // [1236] v. by
            BrailleSymbolDatabaseEntry.LegacyConstructor("vad", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell2456), // [2456] w. what
            BrailleSymbolDatabaseEntry.LegacyConstructor("över", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1346), // [1346] x. over
            BrailleSymbolDatabaseEntry.LegacyConstructor("mycket", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell13456), // [13456] y. much
            BrailleSymbolDatabaseEntry.LegacyConstructor("efter", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1356), // [1356] z. after
            BrailleSymbolDatabaseEntry.LegacyConstructor("är", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell345), // [345] ä. is

            BrailleSymbolDatabaseEntry.LegacyConstructor("en", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell126), // [126] a/one (a chair, en stol)
            BrailleSymbolDatabaseEntry.LegacyConstructor("med", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell146), // [146] with
            BrailleSymbolDatabaseEntry.LegacyConstructor("er", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell156), // [156] your
            BrailleSymbolDatabaseEntry.LegacyConstructor("ett", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell346), // [346] a/one (a house, ett hus)
            BrailleSymbolDatabaseEntry.LegacyConstructor("för", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1246), // [1246] for
            BrailleSymbolDatabaseEntry.LegacyConstructor("inte", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1256), // [1256] not
            BrailleSymbolDatabaseEntry.LegacyConstructor("de", SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1456), // [1456] them
            BrailleSymbolDatabaseEntry.LegacyConstructor("det", SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell2346), // [2346] that (det huset)
            BrailleSymbolDatabaseEntry.LegacyConstructor("den", SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell1256), // [12346] that (den stolen)
            BrailleSymbolDatabaseEntry.LegacyConstructor("var", STANDALONE, SHORT_1, SHOW_USAGE_RULE, Cell12356), // [12356] where

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // A. Whole words

            BrailleSymbolDatabaseEntry.LegacyConstructor("alla", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, BrailleCellDatabase.Cell1), // [1][1] aa. all/everyone
            BrailleSymbolDatabaseEntry.LegacyConstructor("allas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, BrailleCellDatabase.Cell1, Cell234), // [1][1][234] aas. everyones
            BrailleSymbolDatabaseEntry.LegacyConstructor("alltid", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell145), // [1][145] ad. always
            BrailleSymbolDatabaseEntry.LegacyConstructor("aldrig", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell1245), // [1] ag. never
            BrailleSymbolDatabaseEntry.LegacyConstructor("allt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2345), // [1] at. everything
            BrailleSymbolDatabaseEntry.LegacyConstructor("alltför", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2345, Cell1246), // [1][2345][1246] at[1246]. too
            BrailleSymbolDatabaseEntry.LegacyConstructor("allting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2345, Cell236), // [1][2345][236] at[236]. everything
            BrailleSymbolDatabaseEntry.LegacyConstructor("alltings", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2345, Cell236, Cell234), // [1][2345][236][234] at[236]s. everything (including heaven and hell and outer space)
            BrailleSymbolDatabaseEntry.LegacyConstructor("andra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2456), // [1][2456] other
            BrailleSymbolDatabaseEntry.LegacyConstructor("andras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell2456, Cell234), // [1][2456][234] other peoples ...
            BrailleSymbolDatabaseEntry.LegacyConstructor("alltså", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, BrailleCellDatabase.Cell1, Cell16), // [1][16] aå. that is / so

            BrailleSymbolDatabaseEntry.LegacyConstructor("börja", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245), // [12][245] bj. start
            BrailleSymbolDatabaseEntry.LegacyConstructor("början", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245, Cell1345), // [12][245][1345] bjn. the start
            BrailleSymbolDatabaseEntry.LegacyConstructor("börjans", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245, Cell1345, Cell234), // [12][245][1345][234] bjns. about the start
            BrailleSymbolDatabaseEntry.LegacyConstructor("börjar", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245, Cell1235), // [12][245][1235] bjr. starting
            BrailleSymbolDatabaseEntry.LegacyConstructor("börjat", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245, Cell2345), // [12][245][2345] bjt. have started
            BrailleSymbolDatabaseEntry.LegacyConstructor("började", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell245, Cell1456), // [12][245][1456] bj[1456]. did start / it started
            BrailleSymbolDatabaseEntry.LegacyConstructor("bland", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell123), // [12][123] bl. among
            BrailleSymbolDatabaseEntry.LegacyConstructor("blir", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell1235), // [12][1235] br. become
            BrailleSymbolDatabaseEntry.LegacyConstructor("blev", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12, Cell1236), // [12][1236] became

            BrailleSymbolDatabaseEntry.LegacyConstructor("också", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell14, Cell234), // [12][234] also

            BrailleSymbolDatabaseEntry.LegacyConstructor("dess", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell145, Cell234), // [145][234] its
            BrailleSymbolDatabaseEntry.LegacyConstructor("dessa", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell145, Cell234, BrailleCellDatabase.Cell1), // [145][234][1] dsa. those
            BrailleSymbolDatabaseEntry.LegacyConstructor("dessas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell145, Cell234, BrailleCellDatabase.Cell1, Cell234), // [145][234][1][234] dsas. thoses (that belong to them, it is thoses :-)

            BrailleSymbolDatabaseEntry.LegacyConstructor("endast", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, BrailleCellDatabase.Cell1), // [15][1] only
            BrailleSymbolDatabaseEntry.LegacyConstructor("henne", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, Cell15), // [15][15] ee. her
            BrailleSymbolDatabaseEntry.LegacyConstructor("hennes", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, Cell15, Cell234), // [15][15][234] ees. hers
            BrailleSymbolDatabaseEntry.LegacyConstructor("emedan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, Cell134, Cell145), // [15][134][145] emd. while
            BrailleSymbolDatabaseEntry.LegacyConstructor("emellan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, Cell134, Cell123), // [15][134][123] between
            BrailleSymbolDatabaseEntry.LegacyConstructor("emellertid", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell15, Cell134, Cell2345), // [15][134][2345] emt. however

            BrailleSymbolDatabaseEntry.LegacyConstructor("fortfarande", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell124, Cell135, Cell124), // [124][135][124] emt. still

            BrailleSymbolDatabaseEntry.LegacyConstructor("gång", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245), // [1245][1245] gg. gangway
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångs", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell234), // [1245][1245][234] ggs. gangways
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångar", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, BrailleCellDatabase.Cell1, Cell1235), // [1245][1245][1][1235] ggar. tunnels (in general)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångars", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, BrailleCellDatabase.Cell1, Cell1235, Cell234), // [1245][1245][1][1235][234] ggar. tunnels (property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångarna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, BrailleCellDatabase.Cell1, Cell1235, Cell1345, BrailleCellDatabase.Cell1), // [1245][1245][1][1235][1345][1] ggarna. the tunnels (in general)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångarnas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, BrailleCellDatabase.Cell1, Cell1235, Cell1345, BrailleCellDatabase.Cell1, Cell234), // [1245][1245][1][1235][1345][1][234] ggarnas. the tunnels (property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gången", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156), // [1245][1245][156] gg[156]. the tunnel
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156, Cell234), // [1245][1245][156][234] gg[156]s. the tunnels (property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gånger", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156), // [1245][1245][156] gg[156]. times (I have done it 5 times)
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångers", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156, Cell234), // [1245][1245][156][234] gg[156]s. times (I will have 5 times suspension
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångerna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156, Cell1345, BrailleCellDatabase.Cell1), // [1245][1245][156][1345][1] gg[156]na. the times
            BrailleSymbolDatabaseEntry.LegacyConstructor("gångernas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1245, Cell1245, Cell156, Cell1345, BrailleCellDatabase.Cell1, Cell234), // [1245][1245][156][1345][1][234] gg[156]nas. the times

            BrailleSymbolDatabaseEntry.LegacyConstructor("hans", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell125, Cell234), // [125][234] hs. his
            BrailleSymbolDatabaseEntry.LegacyConstructor("hon", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell125, Cell1345), // [125][1345] hn. she
            BrailleSymbolDatabaseEntry.LegacyConstructor("hade", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell125, Cell1456), // [125][1456] h[1456]. had

            BrailleSymbolDatabaseEntry.LegacyConstructor("inga", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, BrailleCellDatabase.Cell1), // [24][1] ia. none
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, BrailleCellDatabase.Cell1, Cell234), // [24][1][234] ias. none (plural)
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingen", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell126), // [24][126] i[126]. noone
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell126, Cell234), // [24][126][234] i[126]s. noone (plural)
            BrailleSymbolDatabaseEntry.LegacyConstructor("inget", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell346), // [24][346] i[346]. nothing (abstract)
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingets", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell346, Cell234), // [24][346][234] i[346]s. (abstract abstract)
            BrailleSymbolDatabaseEntry.LegacyConstructor("ibland", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell12, Cell123), // [24][12][123] ibl. sometimes.
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingenting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell126, Cell2345, Cell236), // [24][126][2345][236] i[126]t[236]. nothing (no thing)
            BrailleSymbolDatabaseEntry.LegacyConstructor("igenom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell24, Cell1245), // [13][1245] ig. trough

            BrailleSymbolDatabaseEntry.LegacyConstructor("kanske", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, BrailleCellDatabase.Cell1), // [13][1] ka. perhaps
            BrailleSymbolDatabaseEntry.LegacyConstructor("komma", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell134, BrailleCellDatabase.Cell1), // [13][134][1] kma. come
            BrailleSymbolDatabaseEntry.LegacyConstructor("kommer", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell134, Cell156), // [13][134][156] km[156]. coming
            BrailleSymbolDatabaseEntry.LegacyConstructor("kommit", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell134, Cell2345), // [13][134][2345] kmt. have came
            BrailleSymbolDatabaseEntry.LegacyConstructor("kunna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell1345), // [13][1345] kn. can (I want to be able to come)
            BrailleSymbolDatabaseEntry.LegacyConstructor("kunnat", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell1345, Cell2345), // [13][1345][2345] knt. been able (I have known how to do that)
            BrailleSymbolDatabaseEntry.LegacyConstructor("kunde", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell13, Cell1456), // [13][1456] k[1456]. could (the I could)

            BrailleSymbolDatabaseEntry.LegacyConstructor("liksom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell123, Cell234), // [123][234] ls. as well as

            BrailleSymbolDatabaseEntry.LegacyConstructor("medan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell145), // [134][145] md. while
            BrailleSymbolDatabaseEntry.LegacyConstructor("många", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell1245), // [134][1245] mg. many
            BrailleSymbolDatabaseEntry.LegacyConstructor("mångas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell1245, Cell234), // [134][1245][234] mgs. many (property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("mellan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell123), // [134][123] ml. between
            BrailleSymbolDatabaseEntry.LegacyConstructor("men", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell126), // [134][126] m[126]. but
            BrailleSymbolDatabaseEntry.LegacyConstructor("måste", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell134, Cell1256), // [134][1256] m[1256]. have to

            BrailleSymbolDatabaseEntry.LegacyConstructor("någon", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell1345), // [1345][1345] nn. somenone
            BrailleSymbolDatabaseEntry.LegacyConstructor("någons", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell1345, Cell234), // [1345][1345][234] nns. someones
            BrailleSymbolDatabaseEntry.LegacyConstructor("någonting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell1345, Cell2345, Cell236), // [1345][1345][2345][236] nnt[236]. something
            BrailleSymbolDatabaseEntry.LegacyConstructor("något", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell2345), // [1345][2345] nt. something
            BrailleSymbolDatabaseEntry.LegacyConstructor("naturligtvis", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell2345, Cell1236), // [1345][2345][1236] ntv. of course
            BrailleSymbolDatabaseEntry.LegacyConstructor("några", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell2456), // [1345][2456] nw. some
            BrailleSymbolDatabaseEntry.LegacyConstructor("någras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1345, Cell2456, Cell234), // [1345][2456][234] nws. some (plural)

            BrailleSymbolDatabaseEntry.LegacyConstructor("olika", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell135, Cell123), // [135] ol. different
            BrailleSymbolDatabaseEntry.LegacyConstructor("honom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell135, Cell135), // [135][135] oo. him
            BrailleSymbolDatabaseEntry.LegacyConstructor("omkring", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell135, Cell236), // [245] o[236]. around

            BrailleSymbolDatabaseEntry.LegacyConstructor("redan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1235, Cell145), // [1235][145] rd. already

            BrailleSymbolDatabaseEntry.LegacyConstructor("sedan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell145), // [234][145] sd. since
            BrailleSymbolDatabaseEntry.LegacyConstructor("själv", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell245), // [234][245] sj. self (do)
            BrailleSymbolDatabaseEntry.LegacyConstructor("själva", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell245, BrailleCellDatabase.Cell1), // [234][245][1] sja. self (thing)
            BrailleSymbolDatabaseEntry.LegacyConstructor("självt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell245, Cell2345), // [234][245][2345] sjt. self (by itself)
            BrailleSymbolDatabaseEntry.LegacyConstructor("skall", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell13), // [234][13] sk. dog bark, or will do
            BrailleSymbolDatabaseEntry.LegacyConstructor("skulle", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell123), // [234][123] sl. would do
            BrailleSymbolDatabaseEntry.LegacyConstructor("sådan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell1345), // [234][1345] sn. such
            BrailleSymbolDatabaseEntry.LegacyConstructor("sådana", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell1345, BrailleCellDatabase.Cell1), // [234][1345][1] sna. such (specific plural)
            BrailleSymbolDatabaseEntry.LegacyConstructor("sådant", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell1345, Cell2345), // [234][1345][2345] snt. such (specific singular)
            BrailleSymbolDatabaseEntry.LegacyConstructor("särskilt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell234, Cell345), // [234][345] sä. specially

            BrailleSymbolDatabaseEntry.LegacyConstructor("tills", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell2345, Cell234), // [2345][234] ts. until
            BrailleSymbolDatabaseEntry.LegacyConstructor("tillbaka", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell2345, Cell12), // [2345][12] tb. back

            BrailleSymbolDatabaseEntry.LegacyConstructor("vilka", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, BrailleCellDatabase.Cell1), // [1236][13][1] vka. who or what (plural)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vilkas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, BrailleCellDatabase.Cell1, Cell234), // [1236][13][1][234] vkas. who or what (plural property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vilken", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, Cell126), // [1236][13][126] vk[126]. what (when selecting one)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vilkens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, Cell126, Cell234), // [1236][13][126][234] vk[126]s. what (when selecting one property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vilket", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, Cell346), // [1236][13][346] vk[346]. what (when you have selected one)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vilkets", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell13, Cell346, Cell234), // [1236][13][346][234] vk[346]s. what (when you have selected one property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vill", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell123), // [1236][123] vl. want
            BrailleSymbolDatabaseEntry.LegacyConstructor("ville", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1236, Cell123, Cell15), // [1236][123][15] vle. wanted
            BrailleSymbolDatabaseEntry.LegacyConstructor("vad", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell2456), // [2456] w. what (in general) or calf (muscle)

            BrailleSymbolDatabaseEntry.LegacyConstructor("överallt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1346, BrailleCellDatabase.Cell1, Cell2345), // [1346][1][2345] xat. all over the place

            BrailleSymbolDatabaseEntry.LegacyConstructor("eftersom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1356, Cell234), // [1356][234] zs. because or (we solve it over time)

            BrailleSymbolDatabaseEntry.LegacyConstructor("ännu", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell345, Cell136), // [345][136] äu. still

            BrailleSymbolDatabaseEntry.LegacyConstructor("före", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1246, Cell15), // [1246][15] [1246]e. before
            BrailleSymbolDatabaseEntry.LegacyConstructor("förr", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1246, Cell1235), // [1246][1235] [1246]r. previous (in time)
            BrailleSymbolDatabaseEntry.LegacyConstructor("förra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1246, Cell1235, BrailleCellDatabase.Cell1), // [1246][1235][1] [1246]ra. last (as in previous)
            BrailleSymbolDatabaseEntry.LegacyConstructor("först", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1246, Cell234, Cell2345), // [1246][234][2345] [1246]st. first
            BrailleSymbolDatabaseEntry.LegacyConstructor("första", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1246, Cell234, Cell2345, BrailleCellDatabase.Cell1), // [1246][234][2345][1] [1246]sta. the first
            BrailleSymbolDatabaseEntry.LegacyConstructor("detta", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell2346, Cell2345, BrailleCellDatabase.Cell1), // [2346][2345][1] [2346]ta. this
            BrailleSymbolDatabaseEntry.LegacyConstructor("dettas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell2346, Cell2345, BrailleCellDatabase.Cell1, Cell234), // [2346][2345][1][234] [2346]tas. this (property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("denna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1256, Cell1345, BrailleCellDatabase.Cell1), // [12346][1345][1] [12346]na. this (thing specific)
            BrailleSymbolDatabaseEntry.LegacyConstructor("dennas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell1256, Cell1345, BrailleCellDatabase.Cell1, Cell234), // [12346][1345][1][234] [12346]nas. this (thing specific property)
            BrailleSymbolDatabaseEntry.LegacyConstructor("vara", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12356, BrailleCellDatabase.Cell1), // [12356][1] [12356]a. be
            BrailleSymbolDatabaseEntry.LegacyConstructor("varit", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12356, Cell24, Cell2345), // [12356][24][2345] [12356]it. have been
            BrailleSymbolDatabaseEntry.LegacyConstructor("varandra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12356, BrailleCellDatabase.Cell1, Cell2456), // [12356][1][2456] [12356]aw. each other (people)
            BrailleSymbolDatabaseEntry.LegacyConstructor("varandras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, Cell12356, BrailleCellDatabase.Cell1, Cell2456, Cell234), // [12356][1][2456][234] [12356]aws. each other (people property). Hold each others hands.

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // B. sound grooups - Rule is: Used as part of a word but must have normal letter(s) at -

            BrailleSymbolDatabaseEntry.LegacyConstructor("ing", SURROUNDED_1_OR_2_SIDES_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, Cell236), // [236] [236].
            BrailleSymbolDatabaseEntry.LegacyConstructor("ingen", SURROUNDED_START_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, Cell236, Cell126), // [236][126] [236][126].
            BrailleSymbolDatabaseEntry.LegacyConstructor("inger", SURROUNDED_START_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, Cell236, Cell156), // [236][156] [236][156].
            BrailleSymbolDatabaseEntry.LegacyConstructor("inget", SURROUNDED_START_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, Cell236, Cell346), // [236][346] [236][346].

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // C. shortened sound groups - Rule is: use stand alone.

            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("bland annat", "bl-a"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell12, Cell123, Cell36, BrailleCellDatabase.Cell1), // [15][123][36][1] bl-a. bland annat (among other)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("det vill säga", "dvs"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell145, Cell1236, Cell234), // [145][1236][234] dvs. det vill säga (viz)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("eller dylikt", "e-d"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell15, Cell36, Cell145), // [15][36][145] e-d. eller dylikt (etc)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("före detta", "f-d"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell124, Cell36, Cell145), // [124][36][145] f-d. före detta (former)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("för närvarande", "f-n"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell124, Cell36, Cell1345), // [145][36][1345] f-n. för närvarande (present)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("för övrigt", "f-ö"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell124, Cell36, Cell246), // [124][36][246] f-ö. för övrigt (moreover)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("med flera", "m-fl"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell134, Cell36, Cell124, Cell123), // [134][36][124][123] m-fl. med flera (and others)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("med mera", "m-m"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell134, Cell36, Cell134), // [134][36][134] m-m. med mera (etc)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("och dylikt", "o-d"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell135, Cell36, Cell145), // [135][36][135] o-d. och dylikt (and the like)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("och så vidare", "osv"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell135, Cell234, Cell1236), // [135][234][1236] osv. och så vidare (and so on)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("så kallat", "s-k"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell234, Cell36, Cell13), // [234][36][13] s-k. så kallat (so called)
            BrailleSymbolDatabaseEntry.LegacyConstructor(arrayOf("till exempel", "t-ex"), STANDALONE, SHORT_2C, SHOW_USAGE_RULE, Cell2345, Cell36, Cell15, Cell1346), // [2345][36][15][1346] t-ex. till exempel (for example)

            // Below is foreign signs. Used only for rare names and when writing in another language.

            // You could (not a requirement) use an indicator before and after foreign language text
            BrailleSymbolDatabaseEntry.LegacyConstructor(BrailleDatabase.NO_STRING, INVISIBLE, NOTHING, Cell5, Cell2), // [5] [2]

            // Foreign letters used in names and foreign addresses
            BrailleSymbolDatabaseEntry.LegacyConstructor("à", FOREIGN, NOTHING, Cell12356), // [12356]
            BrailleSymbolDatabaseEntry.LegacyConstructor("è", FOREIGN, NOTHING, Cell2346), // [2346]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ü", FOREIGN, NOTHING, Cell1256), //  [1256] German y

            // More foreign letters used in names and foreign addresses
            BrailleSymbolDatabaseEntry.LegacyConstructor("æ", FOREIGN, NOTHING, Cell4, Cell345), // [1] [15] or [4] [345] Danish ä
            BrailleSymbolDatabaseEntry.LegacyConstructor("ø", FOREIGN, NOTHING, Cell4, Cell135), // [246] or [4] [135] Danish ö
            BrailleSymbolDatabaseEntry.LegacyConstructor("œ", FOREIGN, NOTHING, Cell4, Cell246), // [135] [15] or [4] [246] oe, can also be written with o and e.
            BrailleSymbolDatabaseEntry.LegacyConstructor("ß", FOREIGN, NOTHING, Cell4, Cell234), // [234] [234] or [4] [234] German double s. Can also be written with s and s.
            BrailleSymbolDatabaseEntry.LegacyConstructor("ð", FOREIGN, NOTHING, Cell4, Cell145), // [4] [145] Icelandic d with a sting (edh)
            BrailleSymbolDatabaseEntry.LegacyConstructor("þ", FOREIGN, NOTHING, Cell4, Cell2345), // [4] [2345] Icelandic t (called thorn)

            // Characters used for writing in other languages
            BrailleSymbolDatabaseEntry.LegacyConstructor("á", FOREIGN, NOTHING, Cell4, BrailleCellDatabase.Cell1), // [4] [1]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ç", FOREIGN, NOTHING, Cell4, Cell14), // [4] [14]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ë", FOREIGN, NOTHING, Cell4, Cell15), // [4] [15] Yes same as ė
            BrailleSymbolDatabaseEntry.LegacyConstructor("ė", FOREIGN, NOTHING, Cell4, Cell15), // [4] [15] Yes same as ë
            BrailleSymbolDatabaseEntry.LegacyConstructor("ô", FOREIGN, NOTHING, Cell4, Cell135), // [4] [135]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ř", FOREIGN, NOTHING, Cell4, Cell1235), // [4] [1235]
            BrailleSymbolDatabaseEntry.LegacyConstructor("ū", FOREIGN, NOTHING, Cell4, Cell136), // [4] [136]

            // Exact diacritical signs to be used before any letter. Like: á ç ë ė ô ř ū
            // Used for writing in other languages. Eleven symbols.
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell35)), // [346] [35] apostrophe forward above letter  ́
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell26)), // [346] [26] apostrophe backward above letter `
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell126, Cell2)), // [126] [2] cedilj under letter
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell235)), // [346] [235] circumflex over letter ^
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell2356)), // [346] [2356] reveresed circumflex over letter ˇ
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell25)), // [346] [25] tilde over letter ~
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell23)), // [346] [23] trema over letter ̈
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell36)), // [346] [36] line over letter ̄
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell126, Cell36)), // [126] [36] line under letter
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell346, Cell3)), // [346] [3] dot over letter
            BrailleSymbolDatabaseEntry(listOf(BrailleDatabase.NO_STRING), dictionaryType = INVISIBLE, symbolModifierType = BrailleSymbolModifierType.DIACRITIC, cells = listOf(Cell126, Cell3)), // [126] [3] dot under letter

            // Above diacritical signs again but now stand alone (Skipping this for now)

            // North Saami letters.
            BrailleSymbolDatabaseEntry.LegacyConstructor("á", FOREIGN, NOTHING, Cell12356), // [12356] a with forward apostrophe
            BrailleSymbolDatabaseEntry.LegacyConstructor("č", FOREIGN, NOTHING, Cell146), // [146] c with reversed circumflex
            BrailleSymbolDatabaseEntry.LegacyConstructor("đ", FOREIGN, NOTHING, Cell1456), // [1456] stung d
            BrailleSymbolDatabaseEntry.LegacyConstructor("ŋ", FOREIGN, NOTHING, Cell1246), // [1246] eng
            BrailleSymbolDatabaseEntry.LegacyConstructor("š", FOREIGN, NOTHING, Cell156), // [156] s with reversed circumflex
            BrailleSymbolDatabaseEntry.LegacyConstructor("ŧ", FOREIGN, NOTHING, Cell1256), // [1256] stung t
            BrailleSymbolDatabaseEntry.LegacyConstructor("ž", FOREIGN, NOTHING, Cell2346), // [2346] z with reversed circumflex

            // South Saami letters
            BrailleSymbolDatabaseEntry.LegacyConstructor("ï", FOREIGN, NOTHING, Cell34)) // [34] i with trema
    // Skipping below areas
    // Signs for italic, bold, underline, fine, large etc. I skip those for now.
    // German signs (Already covered)
    // French signs (Skipping for now)
    // Spanish signs (Skipping for now)
    // Esperanto (Skipping for now)
    // Phonetic signs (Skipping for now)
    // Signs for poetry
    // Signs for verse
    // Signs for music
    // Signs for blank characters (Like in forms where you are supposed to write something there)
    // Signs for breaking a word and sentence. Example: It's all abo...

}*/
