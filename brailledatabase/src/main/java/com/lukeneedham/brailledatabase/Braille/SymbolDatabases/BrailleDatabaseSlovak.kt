package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_INFO
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_LETTERS_REP
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.INDICATOR
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R

class BrailleDatabaseSlovak : BrailleDatabase()
{

    override val dictionaryCategories =
            listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
                    DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
                    DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION))

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
                +Cell12356
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
            textRepresented = "á"
            dictionaryType = LETTER
            cells {
                +Cell16
            }
        }
        symbol {
            textRepresented = "ä"
            dictionaryType = LETTER
            cells {
                +Cell4
            }
        }
        symbol {
            textRepresented = "č"
            dictionaryType = LETTER
            cells {
                +Cell146
            }
        }
        symbol {
            textRepresented = "ď"
            dictionaryType = LETTER
            cells {
                +Cell1456
            }
        }
        symbol {
            textRepresented = "é"
            dictionaryType = LETTER
            cells {
                +Cell345
            }
        }
        symbol {
            textRepresented = "í"
            dictionaryType = LETTER
            cells {
                +Cell34
            }
        }
        symbol {
            textRepresented = "ĺ"
            dictionaryType = LETTER
            cells {
                +Cell46
            }
        }
        symbol {
            textRepresented = "ľ"
            dictionaryType = LETTER
            cells {
                +Cell456
            }
        }
        symbol {
            textRepresented = "ň"
            dictionaryType = LETTER
            cells {
                +Cell1246
            }
        }
        symbol {
            textRepresented = "ó"
            dictionaryType = LETTER
            cells {
                +Cell246
            }
        }
        symbol {
            textRepresented = "ô"
            dictionaryType = LETTER
            cells {
                +Cell23456
            }
        }
        symbol {
            textRepresented = "ŕ"
            dictionaryType = LETTER
            cells {
                +Cell12356
            }
        }
        symbol {
            textRepresented = "š"
            dictionaryType = LETTER
            cells {
                +Cell156
            }
        }
        symbol {
            textRepresented = "ť"
            dictionaryType = LETTER
            cells {
                +Cell1256
            }
        }
        symbol {
            textRepresented = "ú"
            dictionaryType = LETTER
            cells {
                +Cell346
            }
        }
        symbol {
            textRepresented = "ý"
            dictionaryType = LETTER
            cells {
                +Cell12346
            }
        }
        symbol {
            textRepresented = "ž"
            dictionaryType = LETTER
            cells {
                +Cell2346
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
            textRepresented = "."
            dictionaryType = NUMBER
            cells {
                +Cell3
            }
            descriptiveNameRes = R.string.braille_decimal_point
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ","
            dictionaryType = NUMBER
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_thousands_separator
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = " "
            dictionaryType = INVISIBLE
            cells {
                +CellEmpty
            }
        }
        symbol {
            textRepresented = "."
            dictionaryType = PUNCTUATION
            cells {
                +Cell256
            }
            descriptiveNameRes = R.string.braille_fullstop
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
            textRepresented = ","
            dictionaryType = PUNCTUATION
            cells {
                +Cell2
            }
            descriptiveNameRes = R.string.braille_comma
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
            textRepresented = "'"
            dictionaryType = PUNCTUATION
            cells {
                +Cell4
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
            textRepresented = "“"
            dictionaryType = PUNCTUATION
            cells {
                +Cell2356
            }
            descriptiveNameRes = R.string.braille_openquote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "”"
            dictionaryType = PUNCTUATION
            cells {
                +Cell2356
            }
            descriptiveNameRes = R.string.braille_closequote
            onEntryClickType = SHOW_LETTERS_REP
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
            textRepresented = "*"
            dictionaryType = PUNCTUATION
            cells {
                +Cell35
            }
            descriptiveNameRes = R.string.braille_asterisk
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
            textRepresented = "%"
            dictionaryType = PUNCTUATION
            cells {
                +Cell3456
                +Cell1234
            }
            descriptiveNameRes = R.string.braille_percent
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "‰"
            dictionaryType = PUNCTUATION
            cells {
                +Cell3456
                +Cell1235
            }
            descriptiveNameRes = R.string.braille_permille
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "§"
            dictionaryType = PUNCTUATION
            cells {
                +Cell3456
                +Cell346
            }
            descriptiveNameRes = R.string.braille_dollar
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "&"
            dictionaryType = PUNCTUATION
            cells {
                +Cell3456
                +Cell12346
            }
            descriptiveNameRes = R.string.braille_pipe
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "/"
            dictionaryType = PUNCTUATION
            cells {
                +Cell12456
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "@"
            dictionaryType = PUNCTUATION
            cells {
                +Cell4
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
    }
}
