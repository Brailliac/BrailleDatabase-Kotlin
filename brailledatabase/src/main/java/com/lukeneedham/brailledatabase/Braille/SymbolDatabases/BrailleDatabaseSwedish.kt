package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.DIACRITIC
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.INDICATOR
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.*
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R

class BrailleDatabaseSwedish : BrailleDatabase()
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

    override val wordSeparators = listOf(" ")

    /**
     * make the array of all the entries in the database
     * for each entry, make a new BrailleSymbolDatabaseEntry object, and pass the relevant paramaters
     * the available BrailleSymbolDatabaseEntry constructors and neccessary paramaters can be seen in BrailleSymbolDatabaseEntry.java
     * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
     * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
     */

    override val symbols = entries {
        symbol {
            textRepresented = "a"
            dictionaryType = LETTER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "b"
            dictionaryType = LETTER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "c"
            dictionaryType = LETTER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "d"
            dictionaryType = LETTER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "e"
            dictionaryType = LETTER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "f"
            dictionaryType = LETTER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "g"
            dictionaryType = LETTER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "h"
            dictionaryType = LETTER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "i"
            dictionaryType = LETTER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "j"
            dictionaryType = LETTER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = "k"
            dictionaryType = LETTER
            cells {
                +Cell13
            }
        }
        symbol {
            textRepresented = "l"
            dictionaryType = LETTER
            cells {
                +Cell123
            }
        }
        symbol {
            textRepresented = "m"
            dictionaryType = LETTER
            cells {
                +Cell134
            }
        }
        symbol {
            textRepresented = "n"
            dictionaryType = LETTER
            cells {
                +Cell1345
            }
        }
        symbol {
            textRepresented = "o"
            dictionaryType = LETTER
            cells {
                +Cell135
            }
        }
        symbol {
            textRepresented = "p"
            dictionaryType = LETTER
            cells {
                +Cell1234
            }
        }
        symbol {
            textRepresented = "q"
            dictionaryType = LETTER
            cells {
                +Cell12345
            }
        }
        symbol {
            textRepresented = "r"
            dictionaryType = LETTER
            cells {
                +Cell1235
            }
        }
        symbol {
            textRepresented = "s"
            dictionaryType = LETTER
            cells {
                +Cell234
            }
        }
        symbol {
            textRepresented = "t"
            dictionaryType = LETTER
            cells {
                +Cell2345
            }
        }
        symbol {
            textRepresented = "u"
            dictionaryType = LETTER
            cells {
                +Cell136
            }
        }
        symbol {
            textRepresented = "v"
            dictionaryType = LETTER
            cells {
                +Cell1236
            }
        }
        symbol {
            textRepresented = "w"
            dictionaryType = LETTER
            cells {
                +Cell2456
            }
        }
        symbol {
            textRepresented = "x"
            dictionaryType = LETTER
            cells {
                +Cell1346
            }
        }
        symbol {
            textRepresented = "y"
            dictionaryType = LETTER
            cells {
                +Cell13456
            }
        }
        symbol {
            textRepresented = "z"
            dictionaryType = LETTER
            cells {
                +Cell1356
            }
        }
        symbol {
            textRepresented = "å"
            dictionaryType = LETTER
            cells {
                +Cell16
            }
        }
        symbol {
            textRepresented = "ä"
            dictionaryType = LETTER
            cells {
                +Cell345
            }
        }
        symbol {
            textRepresented = "ö"
            dictionaryType = LETTER
            cells {
                +Cell246
            }
        }
        symbol {
            textRepresented = "é"
            dictionaryType = LETTER
            cells {
                +Cell123456
            }
        }
        symbol {
            textRepresented = " "
            dictionaryType = INVISIBLE
            cells {
                +CellEmpty
            }
        }
        symbol {
            textRepresented = ""
            dictionaryType = NUMBER
            cells {
                +Cell3456
            }
            descriptiveNameRes = R.string.braille_number_sign
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.numbersExplanation
            fillEntryWidth = true
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "1"
            dictionaryType = NUMBER
            cells {
                +Cell1
            }
        }
        symbol {
            textRepresented = "2"
            dictionaryType = NUMBER
            cells {
                +Cell12
            }
        }
        symbol {
            textRepresented = "3"
            dictionaryType = NUMBER
            cells {
                +Cell14
            }
        }
        symbol {
            textRepresented = "4"
            dictionaryType = NUMBER
            cells {
                +Cell145
            }
        }
        symbol {
            textRepresented = "5"
            dictionaryType = NUMBER
            cells {
                +Cell15
            }
        }
        symbol {
            textRepresented = "6"
            dictionaryType = NUMBER
            cells {
                +Cell124
            }
        }
        symbol {
            textRepresented = "7"
            dictionaryType = NUMBER
            cells {
                +Cell1245
            }
        }
        symbol {
            textRepresented = "8"
            dictionaryType = NUMBER
            cells {
                +Cell125
            }
        }
        symbol {
            textRepresented = "9"
            dictionaryType = NUMBER
            cells {
                +Cell24
            }
        }
        symbol {
            textRepresented = "0"
            dictionaryType = NUMBER
            cells {
                +Cell245
            }
        }
        symbol {
            textRepresented = ","
            dictionaryType = NUMBER
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_decimal_point
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "."
            dictionaryType = NUMBER
            cells {
                +Cell3
            }
            descriptiveNameRes = R.string.braille_thousands_separator
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "%"
            dictionaryType = PUNCTUATION
            cells {
                +Cell1456
            }
            descriptiveNameRes = R.string.braille_percent
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "‰"
            dictionaryType = PUNCTUATION
            cells {
                +Cell1456
                +Cell1456
            }
            descriptiveNameRes = R.string.braille_permille
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "¢"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell14
            }
            descriptiveNameRes = R.string.braille_cent
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "$"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell234
            }
            descriptiveNameRes = R.string.braille_dollar
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "€"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell15
            }
            descriptiveNameRes = R.string.braille_euro
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "£"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell123
            }
            descriptiveNameRes = R.string.braille_poundsterling
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "¥"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell13456
            }
            descriptiveNameRes = R.string.braille_yen
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "○"
            dictionaryType = PUNCTUATION
            cells {
                +Cell12456
                +Cell1245
            }
            descriptiveNameRes = R.string.braille_degree
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "&"
            dictionaryType = PUNCTUATION
            cells {
                +Cell12346
            }
            descriptiveNameRes = R.string.braille_ampersand
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "©"
            dictionaryType = PUNCTUATION
            cells {
                +Cell236
                +Cell14
                +Cell356
            }
            descriptiveNameRes = R.string.braille_copyright
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "®"
            dictionaryType = PUNCTUATION
            cells {
                +Cell236
                +Cell1235
                +Cell356
            }
            descriptiveNameRes = R.string.braille_rights_reserved
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "™"
            dictionaryType = PUNCTUATION
            cells {
                +Cell236
                +Cell2345
                +Cell1235
                +Cell356
            }
            descriptiveNameRes = R.string.braille_tm
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "?"
            dictionaryType = PUNCTUATION
            cells {
                +Cell26
            }
            descriptiveNameRes = R.string.braille_questionmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "!"
            dictionaryType = PUNCTUATION
            cells {
                +Cell235
            }
            descriptiveNameRes = R.string.braille_exclamationmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ":"
            dictionaryType = PUNCTUATION
            cells {
                +Cell25
            }
            descriptiveNameRes = R.string.braille_colon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ";"
            dictionaryType = PUNCTUATION
            cells {
                +Cell23
            }
            descriptiveNameRes = R.string.braille_semicolon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "/"
            dictionaryType = PUNCTUATION
            cells {
                +Cell34
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "“"
            dictionaryType = PUNCTUATION
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_openquote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "”"
            dictionaryType = PUNCTUATION
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_closequote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "’"
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
            }
            descriptiveNameRes = R.string.braille_apostrophe
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "-"
            dictionaryType = PUNCTUATION
            cells {
                +Cell36
            }
            descriptiveNameRes = R.string.braille_hyphen
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "–"
            dictionaryType = PUNCTUATION
            cells {
                +Cell36
                +Cell36
            }
            descriptiveNameRes = R.string.braille_dash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "("
            dictionaryType = PUNCTUATION
            cells {
                +Cell236
            }
            descriptiveNameRes = R.string.braille_openbracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ")"
            dictionaryType = PUNCTUATION
            cells {
                +Cell356
            }
            descriptiveNameRes = R.string.braille_closebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "["
            dictionaryType = PUNCTUATION
            cells {
                +Cell12356
            }
            descriptiveNameRes = R.string.braille_opensquarebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "]"
            dictionaryType = PUNCTUATION
            cells {
                +Cell23456
            }
            descriptiveNameRes = R.string.braille_closesquarebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "{"
            dictionaryType = PUNCTUATION
            cells {
                +Cell6
                +Cell12356
            }
            descriptiveNameRes = R.string.braille_opencurlybrace
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "}"
            dictionaryType = PUNCTUATION
            cells {
                +Cell6
                +Cell23456
            }
            descriptiveNameRes = R.string.braille_closecurlybrace
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "§"
            dictionaryType = PUNCTUATION
            cells {
                +Cell346
            }
            descriptiveNameRes = R.string.braille_paragraph
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "&"
            dictionaryType = PUNCTUATION
            cells {
                +Cell1256
            }
            descriptiveNameRes = R.string.braille_ampersand
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "*"
            dictionaryType = PUNCTUATION
            cells {
                +Cell35
            }
            descriptiveNameRes = R.string.braille_asterisk
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "†"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell236
            }
            descriptiveNameRes = R.string.braille_dagger
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "#"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell3456
            }
            descriptiveNameRes = R.string.braille_hash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "@"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell12356
            }
            descriptiveNameRes = R.string.braille_at
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "\\"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell34
            }
            descriptiveNameRes = R.string.braille_backslash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "_"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell36
            }
            descriptiveNameRes = R.string.braille_underscore
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "|"
            dictionaryType = PUNCTUATION
            cells {
                +Cell456
            }
            descriptiveNameRes = R.string.braille_pipe
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "~"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell25
            }
            descriptiveNameRes = R.string.braille_tilde
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "•"
            dictionaryType = PUNCTUATION
            cells {
                +Cell123456
            }
            descriptiveNameRes = R.string.braille_bullet
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "◦"
            dictionaryType = PUNCTUATION
            cells {
                +Cell4
                +Cell123456
            }
            descriptiveNameRes = R.string.braille_bullet_white
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "▪"
            dictionaryType = PUNCTUATION
            cells {
                +Cell45
                +Cell123456
            }
            descriptiveNameRes = R.string.braille_bullet_square
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
            }
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell126
            }
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell156
            }
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell6
            }
            descriptiveNameRes = R.string.braille_capital
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.capitalsignExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell6
                +Cell6
            }
            descriptiveNameRes = R.string.braille_capitalword
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.capitalwordExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "<"
            dictionaryType = MATHS
            cells {
                +Cell3456
                +Cell246
            }
            descriptiveNameRes = R.string.braille_less_than
        }
        symbol {
            textRepresented = ">"
            dictionaryType = MATHS
            cells {
                +Cell3456
                +Cell135
            }
            descriptiveNameRes = R.string.braille_greater_than
        }
        symbol {
            textRepresented = "+"
            dictionaryType = MATHS
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_add
        }
        symbol {
            textRepresented = "="
            dictionaryType = MATHS
            cells {
                +Cell2356
            }
            descriptiveNameRes = R.string.braille_equal
        }
        symbol {
            textRepresented = "·"
            dictionaryType = MATHS
            cells {
                +Cell12456
                +Cell3
            }
            descriptiveNameRes = R.string.braille_multiply_dot
        }
        symbol {
            textRepresented = "×"
            dictionaryType = MATHS
            cells {
                +Cell12456
                +Cell1346
            }
            descriptiveNameRes = R.string.braille_multiply_cross
        }
        symbol {
            textRepresented = "──"
            dictionaryType = MATHS
            cells {
                +Cell1256
            }
            descriptiveNameRes = R.string.braille_divide_line
        }
        symbol {
            textRepresented = "√"
            dictionaryType = MATHS
            cells {
                +Cell146
            }
            descriptiveNameRes = R.string.braille_root
        }
        symbol {
            textRepresented = "att"
            dictionaryType = SHORT_1
            cells {
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "bli"
            dictionaryType = SHORT_1
            cells {
                +Cell12
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "och"
            dictionaryType = SHORT_1
            cells {
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "där"
            dictionaryType = SHORT_1
            cells {
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "eller"
            dictionaryType = SHORT_1
            cells {
                +Cell15
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "från"
            dictionaryType = SHORT_1
            cells {
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "genom"
            dictionaryType = SHORT_1
            cells {
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "han"
            dictionaryType = SHORT_1
            cells {
                +Cell125
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "jag"
            dictionaryType = SHORT_1
            cells {
                +Cell245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kan"
            dictionaryType = SHORT_1
            cells {
                +Cell13
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "lika"
            dictionaryType = SHORT_1
            cells {
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "man"
            dictionaryType = SHORT_1
            cells {
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "när"
            dictionaryType = SHORT_1
            cells {
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "på"
            dictionaryType = SHORT_1
            cells {
                +Cell1234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "under"
            dictionaryType = SHORT_1
            cells {
                +Cell12345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "har"
            dictionaryType = SHORT_1
            cells {
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "som"
            dictionaryType = SHORT_1
            cells {
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "till"
            dictionaryType = SHORT_1
            cells {
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "utan"
            dictionaryType = SHORT_1
            cells {
                +Cell136
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vid"
            dictionaryType = SHORT_1
            cells {
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vad"
            dictionaryType = SHORT_1
            cells {
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "över"
            dictionaryType = SHORT_1
            cells {
                +Cell1346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "mycket"
            dictionaryType = SHORT_1
            cells {
                +Cell13456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "efter"
            dictionaryType = SHORT_1
            cells {
                +Cell1356
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "är"
            dictionaryType = SHORT_1
            cells {
                +Cell345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "en"
            dictionaryType = SHORT_1
            cells {
                +Cell126
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "med"
            dictionaryType = SHORT_1
            cells {
                +Cell146
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "er"
            dictionaryType = SHORT_1
            cells {
                +Cell156
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ett"
            dictionaryType = SHORT_1
            cells {
                +Cell346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "för"
            dictionaryType = SHORT_1
            cells {
                +Cell1246
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "inte"
            dictionaryType = SHORT_1
            cells {
                +Cell1256
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "de"
            dictionaryType = SHORT_1
            cells {
                +Cell1456
            }
            ruleForUsage = SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "det"
            dictionaryType = SHORT_1
            cells {
                +Cell2346
            }
            ruleForUsage = SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "den"
            dictionaryType = SHORT_1
            cells {
                +Cell1256
            }
            ruleForUsage = SURROUNDED_1_OR_2_SIDES_BY_PLAIN_OR_STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "var"
            dictionaryType = SHORT_1
            cells {
                +Cell12356
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "alla"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "allas"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "alltid"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "aldrig"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "allt"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "alltför"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2345
                +Cell1246
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "allting"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2345
                +Cell236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "alltings"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2345
                +Cell236
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "andra"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "andras"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell2456
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "alltså"
            dictionaryType = SHORT_2A
            cells {
                +Cell1
                +Cell16
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "börja"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "början"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "börjans"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
                +Cell1345
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "börjar"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "börjat"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "började"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell245
                +Cell1456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "bland"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "blir"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "blev"
            dictionaryType = SHORT_2A
            cells {
                +Cell12
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "också"
            dictionaryType = SHORT_2A
            cells {
                +Cell14
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dess"
            dictionaryType = SHORT_2A
            cells {
                +Cell145
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dessa"
            dictionaryType = SHORT_2A
            cells {
                +Cell145
                +Cell234
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dessas"
            dictionaryType = SHORT_2A
            cells {
                +Cell145
                +Cell234
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "endast"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "henne"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell15
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "hennes"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell15
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "emedan"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell134
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "emellan"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell134
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "emellertid"
            dictionaryType = SHORT_2A
            cells {
                +Cell15
                +Cell134
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "fortfarande"
            dictionaryType = SHORT_2A
            cells {
                +Cell124
                +Cell135
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gång"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångs"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångar"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell1
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångars"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell1
                +Cell1235
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångarna"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell1
                +Cell1235
                +Cell1345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångarnas"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell1
                +Cell1235
                +Cell1345
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gången"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångens"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gånger"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångers"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångerna"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
                +Cell1345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gångernas"
            dictionaryType = SHORT_2A
            cells {
                +Cell1245
                +Cell1245
                +Cell156
                +Cell1345
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "hans"
            dictionaryType = SHORT_2A
            cells {
                +Cell125
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "hon"
            dictionaryType = SHORT_2A
            cells {
                +Cell125
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "hade"
            dictionaryType = SHORT_2A
            cells {
                +Cell125
                +Cell1456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "inga"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingas"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingen"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell126
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingens"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell126
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "inget"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingets"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell346
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ibland"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell12
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingenting"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell126
                +Cell2345
                +Cell236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "igenom"
            dictionaryType = SHORT_2A
            cells {
                +Cell24
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kanske"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "komma"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell134
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kommer"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell134
                +Cell156
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kommit"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell134
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kunna"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kunnat"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell1345
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "kunde"
            dictionaryType = SHORT_2A
            cells {
                +Cell13
                +Cell1456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "liksom"
            dictionaryType = SHORT_2A
            cells {
                +Cell123
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "medan"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "många"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "mångas"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell1245
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "mellan"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "men"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell126
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "måste"
            dictionaryType = SHORT_2A
            cells {
                +Cell134
                +Cell1256
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "någon"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "någons"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell1345
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "någonting"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell1345
                +Cell2345
                +Cell236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "något"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "naturligtvis"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell2345
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "några"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "någras"
            dictionaryType = SHORT_2A
            cells {
                +Cell1345
                +Cell2456
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "olika"
            dictionaryType = SHORT_2A
            cells {
                +Cell135
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "honom"
            dictionaryType = SHORT_2A
            cells {
                +Cell135
                +Cell135
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "omkring"
            dictionaryType = SHORT_2A
            cells {
                +Cell135
                +Cell236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "redan"
            dictionaryType = SHORT_2A
            cells {
                +Cell1235
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sedan"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "själv"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "själva"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell245
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "självt"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell245
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "skall"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell13
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "skulle"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sådan"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sådana"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell1345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sådant"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell1345
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "särskilt"
            dictionaryType = SHORT_2A
            cells {
                +Cell234
                +Cell345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "tills"
            dictionaryType = SHORT_2A
            cells {
                +Cell2345
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "tillbaka"
            dictionaryType = SHORT_2A
            cells {
                +Cell2345
                +Cell12
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilka"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilkas"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilken"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell126
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilkens"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell126
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilket"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vilkets"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell13
                +Cell346
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vill"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ville"
            dictionaryType = SHORT_2A
            cells {
                +Cell1236
                +Cell123
                +Cell15
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vad"
            dictionaryType = SHORT_2A
            cells {
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "överallt"
            dictionaryType = SHORT_2A
            cells {
                +Cell1346
                +Cell1
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "eftersom"
            dictionaryType = SHORT_2A
            cells {
                +Cell1356
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ännu"
            dictionaryType = SHORT_2A
            cells {
                +Cell345
                +Cell136
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "före"
            dictionaryType = SHORT_2A
            cells {
                +Cell1246
                +Cell15
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "förr"
            dictionaryType = SHORT_2A
            cells {
                +Cell1246
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "förra"
            dictionaryType = SHORT_2A
            cells {
                +Cell1246
                +Cell1235
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "först"
            dictionaryType = SHORT_2A
            cells {
                +Cell1246
                +Cell234
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "första"
            dictionaryType = SHORT_2A
            cells {
                +Cell1246
                +Cell234
                +Cell2345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "detta"
            dictionaryType = SHORT_2A
            cells {
                +Cell2346
                +Cell2345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dettas"
            dictionaryType = SHORT_2A
            cells {
                +Cell2346
                +Cell2345
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "denna"
            dictionaryType = SHORT_2A
            cells {
                +Cell1256
                +Cell1345
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dennas"
            dictionaryType = SHORT_2A
            cells {
                +Cell1256
                +Cell1345
                +Cell1
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "vara"
            dictionaryType = SHORT_2A
            cells {
                +Cell12356
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "varit"
            dictionaryType = SHORT_2A
            cells {
                +Cell12356
                +Cell24
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "varandra"
            dictionaryType = SHORT_2A
            cells {
                +Cell12356
                +Cell1
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "varandras"
            dictionaryType = SHORT_2A
            cells {
                +Cell12356
                +Cell1
                +Cell2456
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ing"
            dictionaryType = SHORT_2B
            cells {
                +Cell236
            }
            ruleForUsage = SURROUNDED_1_OR_2_SIDES_BY_PLAIN
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ingen"
            dictionaryType = SHORT_2B
            cells {
                +Cell236
                +Cell126
            }
            ruleForUsage = SURROUNDED_START_BY_PLAIN
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "inger"
            dictionaryType = SHORT_2B
            cells {
                +Cell236
                +Cell156
            }
            ruleForUsage = SURROUNDED_START_BY_PLAIN
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "inget"
            dictionaryType = SHORT_2B
            cells {
                +Cell236
                +Cell346
            }
            ruleForUsage = SURROUNDED_START_BY_PLAIN
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "bland annat"
            alternativeTextRepresented = listOf("bl-a")
            dictionaryType = SHORT_2C
            cells {
                +Cell12
                +Cell123
                +Cell36
                +Cell1
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "det vill säga"
            alternativeTextRepresented = listOf("dvs")
            dictionaryType = SHORT_2C
            cells {
                +Cell145
                +Cell1236
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "eller dylikt"
            alternativeTextRepresented = listOf("e-d")
            dictionaryType = SHORT_2C
            cells {
                +Cell15
                +Cell36
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "före detta"
            alternativeTextRepresented = listOf("f-d")
            dictionaryType = SHORT_2C
            cells {
                +Cell124
                +Cell36
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "för närvarande"
            alternativeTextRepresented = listOf("f-n")
            dictionaryType = SHORT_2C
            cells {
                +Cell124
                +Cell36
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "för övrigt"
            alternativeTextRepresented = listOf("f-ö")
            dictionaryType = SHORT_2C
            cells {
                +Cell124
                +Cell36
                +Cell246
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "med flera"
            alternativeTextRepresented = listOf("m-fl")
            dictionaryType = SHORT_2C
            cells {
                +Cell134
                +Cell36
                +Cell124
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "med mera"
            alternativeTextRepresented = listOf("m-m")
            dictionaryType = SHORT_2C
            cells {
                +Cell134
                +Cell36
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "och dylikt"
            alternativeTextRepresented = listOf("o-d")
            dictionaryType = SHORT_2C
            cells {
                +Cell135
                +Cell36
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "och så vidare"
            alternativeTextRepresented = listOf("osv")
            dictionaryType = SHORT_2C
            cells {
                +Cell135
                +Cell234
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "så kallat"
            alternativeTextRepresented = listOf("s-k")
            dictionaryType = SHORT_2C
            cells {
                +Cell234
                +Cell36
                +Cell13
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "till exempel"
            alternativeTextRepresented = listOf("t-ex")
            dictionaryType = SHORT_2C
            cells {
                +Cell2345
                +Cell36
                +Cell15
                +Cell1346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell5
                +Cell2
            }
        }
        symbol {
            textRepresented = "à"
            dictionaryType = FOREIGN
            cells {
                +Cell12356
            }
        }
        symbol {
            textRepresented = "è"
            dictionaryType = FOREIGN
            cells {
                +Cell2346
            }
        }
        symbol {
            textRepresented = "ü"
            dictionaryType = FOREIGN
            cells {
                +Cell1256
            }
        }
        symbol {
            textRepresented = "æ"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell345
            }
        }
        symbol {
            textRepresented = "ø"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell135
            }
        }
        symbol {
            textRepresented = "œ"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell246
            }
        }
        symbol {
            textRepresented = "ß"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell234
            }
        }
        symbol {
            textRepresented = "ð"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell145
            }
        }
        symbol {
            textRepresented = "þ"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell2345
            }
        }
        symbol {
            textRepresented = "á"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell1
            }
        }
        symbol {
            textRepresented = "ç"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell14
            }
        }
        symbol {
            textRepresented = "ë"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell15
            }
        }
        symbol {
            textRepresented = "ė"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell15
            }
        }
        symbol {
            textRepresented = "ô"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell135
            }
        }
        symbol {
            textRepresented = "ř"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell1235
            }
        }
        symbol {
            textRepresented = "ū"
            dictionaryType = FOREIGN
            cells {
                +Cell4
                +Cell136
            }
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell35
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell26
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell126
                +Cell2
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell235
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell2356
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell25
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell23
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell36
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell126
                +Cell36
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell346
                +Cell3
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = ""
            dictionaryType = INVISIBLE
            cells {
                +Cell126
                +Cell3
            }
            modifierType = DIACRITIC
        }
        symbol {
            textRepresented = "á"
            dictionaryType = FOREIGN
            cells {
                +Cell12356
            }
        }
        symbol {
            textRepresented = "č"
            dictionaryType = FOREIGN
            cells {
                +Cell146
            }
        }
        symbol {
            textRepresented = "đ"
            dictionaryType = FOREIGN
            cells {
                +Cell1456
            }
        }
        symbol {
            textRepresented = "ŋ"
            dictionaryType = FOREIGN
            cells {
                +Cell1246
            }
        }
        symbol {
            textRepresented = "š"
            dictionaryType = FOREIGN
            cells {
                +Cell156
            }
        }
        symbol {
            textRepresented = "ŧ"
            dictionaryType = FOREIGN
            cells {
                +Cell1256
            }
        }
        symbol {
            textRepresented = "ž"
            dictionaryType = FOREIGN
            cells {
                +Cell2346
            }
        }
        symbol {
            textRepresented = "ï"
            dictionaryType = FOREIGN
            cells {
                +Cell34
            }
        }
    }
}