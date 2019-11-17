package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolUsageRule.*
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.*

class BrailleDatabaseUEB : BrailleDatabase()
{
    override val dictionaryCategories =
            listOf(DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
                    DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
                    DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION),
                    DictionaryCategory(R.string.category_contractions, 8, "~", GROUPSIGN, WORDSIGN).setTranslateToggle(true),
                    DictionaryCategory(R.string.category_advancedcontractions, 12, "~+", INITIALLETTERCONTRACTION, FINALLETTERCONTRACTION).setTranslateToggle(true),
                    DictionaryCategory(R.string.symbol_shortform, 15, "…", SHORTFORM).setTranslateToggle(true))

    override val challengeSymbolTypes = listOf(LETTER)

    override val canDoTranslation = true

    override val wordSeparators = listOf(" ")

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
                +Cell256
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
                +Cell236
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
                +Cell3
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
                +Cell236
            }
            descriptiveNameRes = R.string.braille_openquote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "”"
            dictionaryType = PUNCTUATION
            cells {
                +Cell356
            }
            descriptiveNameRes = R.string.braille_closequote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                +Cell56
            }
            descriptiveNameRes = R.string.braille_lettersign
            onEntryClickType = SHOW_INFO
            extraInfoRes = R.string.lettersignExplanation
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
            textRepresented = "*"
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
                +Cell35
            }
            descriptiveNameRes = R.string.braille_asterisk
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "("
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
                +Cell126
            }
            descriptiveNameRes = R.string.braille_openbracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ")"
            dictionaryType = PUNCTUATION
            cells {
                +Cell5
                +Cell345
            }
            descriptiveNameRes = R.string.braille_closebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "/"
            dictionaryType = PUNCTUATION
            cells {
                +Cell456
                +Cell34
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "but"
            dictionaryType = WORDSIGN
            cells {
                +Cell12
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "can"
            dictionaryType = WORDSIGN
            cells {
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "do"
            dictionaryType = WORDSIGN
            cells {
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "every"
            dictionaryType = WORDSIGN
            cells {
                +Cell15
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "from"
            dictionaryType = WORDSIGN
            cells {
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "go"
            dictionaryType = WORDSIGN
            cells {
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "have"
            dictionaryType = WORDSIGN
            cells {
                +Cell125
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "just"
            dictionaryType = WORDSIGN
            cells {
                +Cell245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "knowledge"
            dictionaryType = WORDSIGN
            cells {
                +Cell13
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "like"
            dictionaryType = WORDSIGN
            cells {
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "more"
            dictionaryType = WORDSIGN
            cells {
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "not"
            dictionaryType = WORDSIGN
            cells {
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "people"
            dictionaryType = WORDSIGN
            cells {
                +Cell1234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "quite"
            dictionaryType = WORDSIGN
            cells {
                +Cell12345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "rather"
            dictionaryType = WORDSIGN
            cells {
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "so"
            dictionaryType = WORDSIGN
            cells {
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "that"
            dictionaryType = WORDSIGN
            cells {
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "us"
            dictionaryType = WORDSIGN
            cells {
                +Cell136
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "very"
            dictionaryType = WORDSIGN
            cells {
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "will"
            dictionaryType = WORDSIGN
            cells {
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "it"
            dictionaryType = WORDSIGN
            cells {
                +Cell1346
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "you"
            dictionaryType = WORDSIGN
            cells {
                +Cell13456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "as"
            dictionaryType = WORDSIGN
            cells {
                +Cell1356
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gg"
            dictionaryType = GROUPSIGN
            cells {
                +Cell2356
            }
            ruleForUsage = SURROUNDED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "were"
            dictionaryType = WORDSIGN
            cells {
                +Cell2356
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "st"
            dictionaryType = GROUPSIGN
            cells {
                +Cell34
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "still"
            dictionaryType = WORDSIGN
            cells {
                +Cell34
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ch"
            dictionaryType = GROUPSIGN
            cells {
                +Cell16
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "child"
            dictionaryType = WORDSIGN
            cells {
                +Cell16
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "gh"
            dictionaryType = GROUPSIGN
            cells {
                +Cell126
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sh"
            dictionaryType = GROUPSIGN
            cells {
                +Cell146
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "shall"
            dictionaryType = WORDSIGN
            cells {
                +Cell146
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "th"
            dictionaryType = GROUPSIGN
            cells {
                +Cell1456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "this"
            dictionaryType = WORDSIGN
            cells {
                +Cell1456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "wh"
            dictionaryType = GROUPSIGN
            cells {
                +Cell156
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "which"
            dictionaryType = WORDSIGN
            cells {
                +Cell156
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ed"
            dictionaryType = GROUPSIGN
            cells {
                +Cell1246
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "er"
            dictionaryType = GROUPSIGN
            cells {
                +Cell12456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ou"
            dictionaryType = GROUPSIGN
            cells {
                +Cell1256
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "out"
            dictionaryType = WORDSIGN
            cells {
                +Cell1256
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ow"
            dictionaryType = GROUPSIGN
            cells {
                +Cell246
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "en"
            dictionaryType = GROUPSIGN
            cells {
                +Cell26
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "enough"
            dictionaryType = WORDSIGN
            cells {
                +Cell26
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ing"
            dictionaryType = GROUPSIGN
            cells {
                +Cell346
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ar"
            dictionaryType = GROUPSIGN
            cells {
                +Cell345
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "in"
            dictionaryType = GROUPSIGN
            cells {
                +Cell35
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "and"
            dictionaryType = GROUPSIGN
            cells {
                +Cell12346
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "for"
            dictionaryType = GROUPSIGN
            cells {
                +Cell123456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "of"
            dictionaryType = GROUPSIGN
            cells {
                +Cell12356
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "the"
            dictionaryType = GROUPSIGN
            cells {
                +Cell2346
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "with"
            dictionaryType = GROUPSIGN
            cells {
                +Cell23456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "dis"
            dictionaryType = GROUPSIGN
            cells {
                +Cell256
            }
            ruleForUsage = FIRST_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "his"
            dictionaryType = WORDSIGN
            cells {
                +Cell236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ff"
            dictionaryType = GROUPSIGN
            cells {
                +Cell235
            }
            ruleForUsage = SURROUNDED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ea"
            dictionaryType = GROUPSIGN
            cells {
                +Cell2
            }
            ruleForUsage = SURROUNDED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "con"
            dictionaryType = GROUPSIGN
            cells {
                +Cell25
            }
            ruleForUsage = FIRST_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "cc"
            dictionaryType = GROUPSIGN
            cells {
                +Cell25
            }
            ruleForUsage = SURROUNDED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "bb"
            dictionaryType = GROUPSIGN
            cells {
                +Cell23
            }
            ruleForUsage = SURROUNDED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "be"
            dictionaryType = GROUPSIGN
            cells {
                +Cell23
            }
            ruleForUsage = FIRST_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "was"
            dictionaryType = WORDSIGN
            cells {
                +Cell356
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "upon"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell45
                +Cell136
            }
            ruleForUsage = ORIGINAL_MEANING_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "these"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell45
                +Cell2346
            }
            ruleForUsage = ORIGINAL_MEANING_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "those"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell45
                +Cell1456
            }
            ruleForUsage = ORIGINAL_MEANING_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "whose"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell45
                +Cell156
            }
            ruleForUsage = ORIGINAL_MEANING_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "word"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell45
                +Cell2456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "cannot"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell14
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "had"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell125
            }
            ruleForUsage = SHORT_A
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "many"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell134
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "spirit"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell234
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "their"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell2346
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "world"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell456
                +Cell2456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "day"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell145
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ever"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell15
            }
            ruleForUsage = STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "father"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell124
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "here"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell125
            }
            ruleForUsage = ONE_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "know"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell13
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "lord"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell123
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "mother"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell134
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "name"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell1345
            }
            ruleForUsage = ONE_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "one"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell135
            }
            ruleForUsage = ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "part"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell1234
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "question"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell12345
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "right"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell1235
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "some"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell234
            }
            ruleForUsage = ONE_SYLLABLE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "time"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell2345
            }
            ruleForUsage = ORIGINAL_PRONOUNCIATION_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "under"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell136
            }
            ruleForUsage = NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "young"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell13456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "there"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell2346
            }
            ruleForUsage = ORIGINAL_MEANING_RETAINED
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "character"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell16
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "through"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell1456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "where"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell156
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ought"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell1256
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "work"
            dictionaryType = INITIALLETTERCONTRACTION
            cells {
                +Cell5
                +Cell2456
            }
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ound"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell46
                +Cell145
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ance"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell46
                +Cell15
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "sion"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell46
                +Cell1345
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "less"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell46
                +Cell234
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ount"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell46
                +Cell2345
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ence"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell15
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ong"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell1245
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ful"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell123
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "tion"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell1345
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ness"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell234
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ment"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell2345
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ity"
            dictionaryType = FINALLETTERCONTRACTION
            cells {
                +Cell56
                +Cell13456
            }
            ruleForUsage = NOT_AT_START
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "about"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell12
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "above"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell12
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "according"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "across"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell14
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "after"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "afternoon"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell124
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "afterward"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell124
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "again"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "against"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell1245
                +Cell34
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "also"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "almost"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "already"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "altogether"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "although"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
                +Cell1456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "always"
            dictionaryType = SHORTFORM
            cells {
                +Cell1
                +Cell123
                +Cell2456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "blind"
            dictionaryType = SHORTFORM
            cells {
                +Cell12
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "braille"
            dictionaryType = SHORTFORM
            cells {
                +Cell12
                +Cell1235
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "could"
            dictionaryType = SHORTFORM
            cells {
                +Cell14
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "declare"
            dictionaryType = SHORTFORM
            cells {
                +Cell145
                +Cell14
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "declaring"
            dictionaryType = SHORTFORM
            cells {
                +Cell145
                +Cell14
                +Cell123
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "deceive"
            dictionaryType = SHORTFORM
            cells {
                +Cell145
                +Cell14
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "deceiving"
            dictionaryType = SHORTFORM
            cells {
                +Cell145
                +Cell14
                +Cell1236
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "either"
            dictionaryType = SHORTFORM
            cells {
                +Cell15
                +Cell24
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "friend"
            dictionaryType = SHORTFORM
            cells {
                +Cell124
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "first"
            dictionaryType = SHORTFORM
            cells {
                +Cell124
                +Cell34
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "good"
            dictionaryType = SHORTFORM
            cells {
                +Cell1245
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "great"
            dictionaryType = SHORTFORM
            cells {
                +Cell1245
                +Cell1235
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "him"
            dictionaryType = SHORTFORM
            cells {
                +Cell125
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "himself"
            dictionaryType = SHORTFORM
            cells {
                +Cell125
                +Cell134
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "herself"
            dictionaryType = SHORTFORM
            cells {
                +Cell125
                +Cell12456
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "immediate"
            dictionaryType = SHORTFORM
            cells {
                +Cell24
                +Cell134
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "little"
            dictionaryType = SHORTFORM
            cells {
                +Cell123
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "letter"
            dictionaryType = SHORTFORM
            cells {
                +Cell123
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "myself"
            dictionaryType = SHORTFORM
            cells {
                +Cell134
                +Cell13456
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "much"
            dictionaryType = SHORTFORM
            cells {
                +Cell134
                +Cell16
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "must"
            dictionaryType = SHORTFORM
            cells {
                +Cell134
                +Cell34
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "necessary"
            dictionaryType = SHORTFORM
            cells {
                +Cell1345
                +Cell15
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "neither"
            dictionaryType = SHORTFORM
            cells {
                +Cell1345
                +Cell15
                +Cell24
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "paid"
            dictionaryType = SHORTFORM
            cells {
                +Cell1234
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "perceive"
            dictionaryType = SHORTFORM
            cells {
                +Cell1234
                +Cell12456
                +Cell14
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "perceiving"
            dictionaryType = SHORTFORM
            cells {
                +Cell1234
                +Cell12456
                +Cell14
                +Cell1236
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "perhaps"
            dictionaryType = SHORTFORM
            cells {
                +Cell1234
                +Cell12456
                +Cell125
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "quick"
            dictionaryType = SHORTFORM
            cells {
                +Cell12345
                +Cell13
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "receive"
            dictionaryType = SHORTFORM
            cells {
                +Cell1235
                +Cell14
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "receiving"
            dictionaryType = SHORTFORM
            cells {
                +Cell1235
                +Cell14
                +Cell1236
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "rejoice"
            dictionaryType = SHORTFORM
            cells {
                +Cell1235
                +Cell245
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "rejoicing"
            dictionaryType = SHORTFORM
            cells {
                +Cell1235
                +Cell245
                +Cell14
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "said"
            dictionaryType = SHORTFORM
            cells {
                +Cell234
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "such"
            dictionaryType = SHORTFORM
            cells {
                +Cell234
                +Cell16
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "today"
            dictionaryType = SHORTFORM
            cells {
                +Cell2345
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "together"
            dictionaryType = SHORTFORM
            cells {
                +Cell2345
                +Cell1245
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "tomorrow"
            dictionaryType = SHORTFORM
            cells {
                +Cell2345
                +Cell134
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "tonight"
            dictionaryType = SHORTFORM
            cells {
                +Cell2345
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "itself"
            dictionaryType = SHORTFORM
            cells {
                +Cell1346
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "its"
            dictionaryType = SHORTFORM
            cells {
                +Cell1346
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "your"
            dictionaryType = SHORTFORM
            cells {
                +Cell13456
                +Cell1235
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "yourself"
            dictionaryType = SHORTFORM
            cells {
                +Cell13456
                +Cell1235
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "yourselves"
            dictionaryType = SHORTFORM
            cells {
                +Cell13456
                +Cell1235
                +Cell1236
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "themselves"
            dictionaryType = SHORTFORM
            cells {
                +Cell2346
                +Cell134
                +Cell1236
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "children"
            dictionaryType = SHORTFORM
            cells {
                +Cell16
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "should"
            dictionaryType = SHORTFORM
            cells {
                +Cell146
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "thyself"
            dictionaryType = SHORTFORM
            cells {
                +Cell1456
                +Cell13456
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "ourselves"
            dictionaryType = SHORTFORM
            cells {
                +Cell1256
                +Cell1235
                +Cell1236
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "would"
            dictionaryType = SHORTFORM
            cells {
                +Cell2456
                +Cell145
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "because"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell14
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "before"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "behind"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell125
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "below"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell123
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "beneath"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell1345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "beside"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell234
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "between"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell2345
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "beyond"
            dictionaryType = SHORTFORM
            cells {
                +Cell23
                +Cell13456
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "conceive"
            dictionaryType = SHORTFORM
            cells {
                +Cell25
                +Cell14
                +Cell1236
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "conceiving"
            dictionaryType = SHORTFORM
            cells {
                +Cell25
                +Cell14
                +Cell1236
                +Cell1245
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
        symbol {
            textRepresented = "oneself"
            dictionaryType = SHORTFORM
            cells {
                +Cell5
                +Cell135
                +Cell124
            }
            ruleForUsage = STANDALONE
            onEntryClickType = SHOW_USAGE_RULE
        }
    }
}