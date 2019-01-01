package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import com.lukeneedham.brailledatabase.Braille.BrailleCellDatabase.*
import com.lukeneedham.brailledatabase.Braille.DictionaryCategory
import com.lukeneedham.brailledatabase.Braille.DictionaryType.*
import com.lukeneedham.brailledatabase.R
import com.lukeneedham.brailledatabase.Braille.BrailleDatabaseDsl.entries
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolModifierType.*
import com.lukeneedham.brailledatabase.Braille.BrailleSymbolDatabaseEntry.OnEntryClickType.*

class BrailleDatabaseTamil : BrailleDatabase()
{

    override val dictionaryCategories =
            listOf(DictionaryCategory(R.string.symbol_uyir, 0, "அ", UYIR),
                    DictionaryCategory(R.string.symbol_uyirmei1, 1, "க", UYIRMEI1),
                    DictionaryCategory(R.string.symbol_mei, 4, "க்", MEI),
                    DictionaryCategory(R.string.symbol_uyirmei2, 7, "கா", UYIRMEI2).setTranslateToggle(true),
                    DictionaryCategory(R.string.symbol_grantha, 11, "ஷ", GRANTHA).setTranslateToggle(true),
                    DictionaryCategory(R.string.symbol_number, 13, "1", NUMBER),
                    DictionaryCategory(R.string.symbol_punctuation, 14, "?", PUNCTUATION))

    override val challengeSymbolTypes = listOf(UYIR, UYIRMEI1)

    override val canDoTranslation = true

    override val symbols = entries {
        symbol {
            textRepresented = "அ"
            dictionaryType = UYIR
            cells {
                + Cell1
            }
        }
        symbol {
            textRepresented = "ஆ"
            dictionaryType = UYIR
            cells {
                + Cell345
            }
        }
        symbol {
            textRepresented = "இ"
            dictionaryType = UYIR
            cells {
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஈ"
            dictionaryType = UYIR
            cells {
                + Cell35
            }
        }
        symbol {
            textRepresented = "உ"
            dictionaryType = UYIR
            cells {
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஊ"
            dictionaryType = UYIR
            cells {
                + Cell1256
            }
        }
        symbol {
            textRepresented = "எ"
            dictionaryType = UYIR
            cells {
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஏ"
            dictionaryType = UYIR
            cells {
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஐ"
            dictionaryType = UYIR
            cells {
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஒ"
            dictionaryType = UYIR
            cells {
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஓ"
            dictionaryType = UYIR
            cells {
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஔ"
            dictionaryType = UYIR
            cells {
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஃ"
            dictionaryType = UYIR
            cells {
                + Cell6
            }
        }
        symbol {
            textRepresented = "க"
            dictionaryType = UYIRMEI1
            cells {
                + Cell13
            }
        }
        symbol {
            textRepresented = "ங"
            dictionaryType = UYIRMEI1
            cells {
                + Cell346
            }
        }
        symbol {
            textRepresented = "ச"
            dictionaryType = UYIRMEI1
            cells {
                + Cell14
            }
        }
        symbol {
            textRepresented = "ஞ"
            dictionaryType = UYIRMEI1
            cells {
                + Cell25
            }
        }
        symbol {
            textRepresented = "ட"
            dictionaryType = UYIRMEI1
            cells {
                + Cell23456
            }
        }
        symbol {
            textRepresented = "ண"
            dictionaryType = UYIRMEI1
            cells {
                + Cell3456
            }
        }
        symbol {
            textRepresented = "த"
            dictionaryType = UYIRMEI1
            cells {
                + Cell2345
            }
        }
        symbol {
            textRepresented = "ந"
            dictionaryType = UYIRMEI1
            cells {
                + Cell1345
            }
        }
        symbol {
            textRepresented = "ப"
            dictionaryType = UYIRMEI1
            cells {
                + Cell1234
            }
        }
        symbol {
            textRepresented = "ம"
            dictionaryType = UYIRMEI1
            cells {
                + Cell134
            }
        }
        symbol {
            textRepresented = "ய"
            dictionaryType = UYIRMEI1
            cells {
                + Cell13456
            }
        }
        symbol {
            textRepresented = "ர"
            dictionaryType = UYIRMEI1
            cells {
                + Cell1235
            }
        }
        symbol {
            textRepresented = "ல"
            dictionaryType = UYIRMEI1
            cells {
                + Cell123
            }
        }
        symbol {
            textRepresented = "வ"
            dictionaryType = UYIRMEI1
            cells {
                + Cell1236
            }
        }
        symbol {
            textRepresented = "ழ"
            dictionaryType = UYIRMEI1
            cells {
                + Cell12356
            }
        }
        symbol {
            textRepresented = "ள"
            dictionaryType = UYIRMEI1
            cells {
                + Cell456
            }
        }
        symbol {
            textRepresented = "ற"
            dictionaryType = UYIRMEI1
            cells {
                + Cell12456
            }
        }
        symbol {
            textRepresented = "ன"
            dictionaryType = UYIRMEI1
            cells {
                + Cell56
            }
        }
        symbol {
            textRepresented = "க்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell13
            }
        }
        symbol {
            textRepresented = "ங்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell346
            }
        }
        symbol {
            textRepresented = "ச்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell14
            }
        }
        symbol {
            textRepresented = "ஞ்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell25
            }
        }
        symbol {
            textRepresented = "ட்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell23456
            }
        }
        symbol {
            textRepresented = "ண்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell3456
            }
        }
        symbol {
            textRepresented = "த்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell2345
            }
        }
        symbol {
            textRepresented = "ந்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell1345
            }
        }
        symbol {
            textRepresented = "ப்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell1234
            }
        }
        symbol {
            textRepresented = "ம்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell134
            }
        }
        symbol {
            textRepresented = "ய்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell13456
            }
        }
        symbol {
            textRepresented = "ர்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell1235
            }
        }
        symbol {
            textRepresented = "ல்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell123
            }
        }
        symbol {
            textRepresented = "வ்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell1236
            }
        }
        symbol {
            textRepresented = "ழ்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell12356
            }
        }
        symbol {
            textRepresented = "ள்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell456
            }
        }
        symbol {
            textRepresented = "ற்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell12456
            }
        }
        symbol {
            textRepresented = "ன்"
            dictionaryType = MEI
            cells {
                + Cell4
                + Cell56
            }
        }
        symbol {
            textRepresented = "கா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஙா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell345
            }
        }
        symbol {
            textRepresented = "சா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஞா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell345
            }
        }
        symbol {
            textRepresented = "டா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell345
            }
        }
        symbol {
            textRepresented = "ணா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell345
            }
        }
        symbol {
            textRepresented = "தா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell345
            }
        }
        symbol {
            textRepresented = "நா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell345
            }
        }
        symbol {
            textRepresented = "பா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell345
            }
        }
        symbol {
            textRepresented = "மா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell345
            }
        }
        symbol {
            textRepresented = "யா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell345
            }
        }
        symbol {
            textRepresented = "ரா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell345
            }
        }
        symbol {
            textRepresented = "லா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell345
            }
        }
        symbol {
            textRepresented = "வா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell345
            }
        }
        symbol {
            textRepresented = "ழா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell345
            }
        }
        symbol {
            textRepresented = "ளா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell345
            }
        }
        symbol {
            textRepresented = "றா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell345
            }
        }
        symbol {
            textRepresented = "னா"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell345
            }
        }
        symbol {
            textRepresented = "கி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஙி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell24
            }
        }
        symbol {
            textRepresented = "சி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஞி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell24
            }
        }
        symbol {
            textRepresented = "டி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell24
            }
        }
        symbol {
            textRepresented = "ணி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell24
            }
        }
        symbol {
            textRepresented = "தி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell24
            }
        }
        symbol {
            textRepresented = "நி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell24
            }
        }
        symbol {
            textRepresented = "பி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell24
            }
        }
        symbol {
            textRepresented = "மி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell24
            }
        }
        symbol {
            textRepresented = "யி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell24
            }
        }
        symbol {
            textRepresented = "ரி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell24
            }
        }
        symbol {
            textRepresented = "லி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell24
            }
        }
        symbol {
            textRepresented = "வி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell24
            }
        }
        symbol {
            textRepresented = "ழி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell24
            }
        }
        symbol {
            textRepresented = "ளி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell24
            }
        }
        symbol {
            textRepresented = "றி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell24
            }
        }
        symbol {
            textRepresented = "னி"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell24
            }
        }
        symbol {
            textRepresented = "கீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஙீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell35
            }
        }
        symbol {
            textRepresented = "சீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஞீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell35
            }
        }
        symbol {
            textRepresented = "டீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell35
            }
        }
        symbol {
            textRepresented = "ணீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell35
            }
        }
        symbol {
            textRepresented = "தீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell35
            }
        }
        symbol {
            textRepresented = "நீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell35
            }
        }
        symbol {
            textRepresented = "பீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell35
            }
        }
        symbol {
            textRepresented = "மீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell35
            }
        }
        symbol {
            textRepresented = "யீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell35
            }
        }
        symbol {
            textRepresented = "ரீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell35
            }
        }
        symbol {
            textRepresented = "லீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell35
            }
        }
        symbol {
            textRepresented = "வீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell35
            }
        }
        symbol {
            textRepresented = "ழீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell35
            }
        }
        symbol {
            textRepresented = "ளீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell35
            }
        }
        symbol {
            textRepresented = "றீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell35
            }
        }
        symbol {
            textRepresented = "னீ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell35
            }
        }
        symbol {
            textRepresented = "கு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஙு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell136
            }
        }
        symbol {
            textRepresented = "சு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஞு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell136
            }
        }
        symbol {
            textRepresented = "டு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell136
            }
        }
        symbol {
            textRepresented = "ணு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell136
            }
        }
        symbol {
            textRepresented = "து"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell136
            }
        }
        symbol {
            textRepresented = "நு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell136
            }
        }
        symbol {
            textRepresented = "பு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell136
            }
        }
        symbol {
            textRepresented = "மு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell136
            }
        }
        symbol {
            textRepresented = "யு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell136
            }
        }
        symbol {
            textRepresented = "ரு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell136
            }
        }
        symbol {
            textRepresented = "லு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell136
            }
        }
        symbol {
            textRepresented = "வு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell136
            }
        }
        symbol {
            textRepresented = "ழு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell136
            }
        }
        symbol {
            textRepresented = "ளு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell136
            }
        }
        symbol {
            textRepresented = "று"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell136
            }
        }
        symbol {
            textRepresented = "னு"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell136
            }
        }
        symbol {
            textRepresented = "கூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஙூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell1256
            }
        }
        symbol {
            textRepresented = "சூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஞூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell1256
            }
        }
        symbol {
            textRepresented = "டூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ணூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell1256
            }
        }
        symbol {
            textRepresented = "தூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell1256
            }
        }
        symbol {
            textRepresented = "நூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell1256
            }
        }
        symbol {
            textRepresented = "பூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell1256
            }
        }
        symbol {
            textRepresented = "மூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell1256
            }
        }
        symbol {
            textRepresented = "யூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ரூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell1256
            }
        }
        symbol {
            textRepresented = "லூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell1256
            }
        }
        symbol {
            textRepresented = "வூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ழூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ளூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell1256
            }
        }
        symbol {
            textRepresented = "றூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell1256
            }
        }
        symbol {
            textRepresented = "னூ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell1256
            }
        }
        symbol {
            textRepresented = "கெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஙெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell26
            }
        }
        symbol {
            textRepresented = "செ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஞெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell26
            }
        }
        symbol {
            textRepresented = "டெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell26
            }
        }
        symbol {
            textRepresented = "ணெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell26
            }
        }
        symbol {
            textRepresented = "தெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell26
            }
        }
        symbol {
            textRepresented = "நெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell26
            }
        }
        symbol {
            textRepresented = "பெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell26
            }
        }
        symbol {
            textRepresented = "மெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell26
            }
        }
        symbol {
            textRepresented = "யெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell26
            }
        }
        symbol {
            textRepresented = "ரெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell26
            }
        }
        symbol {
            textRepresented = "லெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell26
            }
        }
        symbol {
            textRepresented = "வெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell26
            }
        }
        symbol {
            textRepresented = "ழெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell26
            }
        }
        symbol {
            textRepresented = "ளெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell26
            }
        }
        symbol {
            textRepresented = "றெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell26
            }
        }
        symbol {
            textRepresented = "னெ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell26
            }
        }
        symbol {
            textRepresented = "கே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஙே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell15
            }
        }
        symbol {
            textRepresented = "சே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஞே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell15
            }
        }
        symbol {
            textRepresented = "டே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell15
            }
        }
        symbol {
            textRepresented = "ணே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell15
            }
        }
        symbol {
            textRepresented = "தே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell15
            }
        }
        symbol {
            textRepresented = "நே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell15
            }
        }
        symbol {
            textRepresented = "பே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell15
            }
        }
        symbol {
            textRepresented = "மே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell15
            }
        }
        symbol {
            textRepresented = "யே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell15
            }
        }
        symbol {
            textRepresented = "ரே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell15
            }
        }
        symbol {
            textRepresented = "லே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell15
            }
        }
        symbol {
            textRepresented = "வே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell15
            }
        }
        symbol {
            textRepresented = "ழே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell15
            }
        }
        symbol {
            textRepresented = "ளே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell15
            }
        }
        symbol {
            textRepresented = "றே"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell15
            }
        }
        symbol {
            textRepresented = "னே "
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell15
            }
        }
        symbol {
            textRepresented = "கை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஙை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell34
            }
        }
        symbol {
            textRepresented = "சை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஞை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell34
            }
        }
        symbol {
            textRepresented = "டை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell34
            }
        }
        symbol {
            textRepresented = "ணை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell34
            }
        }
        symbol {
            textRepresented = "தை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell34
            }
        }
        symbol {
            textRepresented = "நை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell34
            }
        }
        symbol {
            textRepresented = "பை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell34
            }
        }
        symbol {
            textRepresented = "மை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell34
            }
        }
        symbol {
            textRepresented = "யை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell34
            }
        }
        symbol {
            textRepresented = "ரை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell34
            }
        }
        symbol {
            textRepresented = "லை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell34
            }
        }
        symbol {
            textRepresented = "வை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell34
            }
        }
        symbol {
            textRepresented = "ழை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell34
            }
        }
        symbol {
            textRepresented = "ளை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell34
            }
        }
        symbol {
            textRepresented = "றை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell34
            }
        }
        symbol {
            textRepresented = "னை"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell34
            }
        }
        symbol {
            textRepresented = "கொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஙொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell1346
            }
        }
        symbol {
            textRepresented = "சொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஞொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell1346
            }
        }
        symbol {
            textRepresented = "டொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ணொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell1346
            }
        }
        symbol {
            textRepresented = "தொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell1346
            }
        }
        symbol {
            textRepresented = "நொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell1346
            }
        }
        symbol {
            textRepresented = "பொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell1346
            }
        }
        symbol {
            textRepresented = "மொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell1346
            }
        }
        symbol {
            textRepresented = "யொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ரொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell1346
            }
        }
        symbol {
            textRepresented = "லொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell1346
            }
        }
        symbol {
            textRepresented = "வொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ழொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ளொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell1346
            }
        }
        symbol {
            textRepresented = "றொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell1346
            }
        }
        symbol {
            textRepresented = "னொ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell1346
            }
        }
        symbol {
            textRepresented = "கோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஙோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell346
                + Cell135
            }
        }
        symbol {
            textRepresented = "சோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஞோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell135
            }
        }
        symbol {
            textRepresented = "டோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell135
            }
        }
        symbol {
            textRepresented = "ணோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell135
            }
        }
        symbol {
            textRepresented = "தோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell135
            }
        }
        symbol {
            textRepresented = "நோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell135
            }
        }
        symbol {
            textRepresented = "போ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell135
            }
        }
        symbol {
            textRepresented = "மோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell135
            }
        }
        symbol {
            textRepresented = "யோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell135
            }
        }
        symbol {
            textRepresented = "ரோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell135
            }
        }
        symbol {
            textRepresented = "லோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell135
            }
        }
        symbol {
            textRepresented = "வோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell135
            }
        }
        symbol {
            textRepresented = "ழோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell135
            }
        }
        symbol {
            textRepresented = "ளோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell135
            }
        }
        symbol {
            textRepresented = "றோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell135
            }
        }
        symbol {
            textRepresented = "னோ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell135
            }
        }
        symbol {
            textRepresented = "கௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13
                + Cell246
            }
        }
        symbol {
            textRepresented = "சௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell14
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஞௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell25
                + Cell246
            }
        }
        symbol {
            textRepresented = "டௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell23456
                + Cell246
            }
        }
        symbol {
            textRepresented = "ணௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell3456
                + Cell246
            }
        }
        symbol {
            textRepresented = "தௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell2345
                + Cell246
            }
        }
        symbol {
            textRepresented = "நௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1345
                + Cell246
            }
        }
        symbol {
            textRepresented = "பௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1234
                + Cell246
            }
        }
        symbol {
            textRepresented = "மௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell134
                + Cell246
            }
        }
        symbol {
            textRepresented = "யௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell13456
                + Cell246
            }
        }
        symbol {
            textRepresented = "ரௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1235
                + Cell246
            }
        }
        symbol {
            textRepresented = "லௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell123
                + Cell246
            }
        }
        symbol {
            textRepresented = "வௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell1236
                + Cell246
            }
        }
        symbol {
            textRepresented = "ழௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12356
                + Cell246
            }
        }
        symbol {
            textRepresented = "ளௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell456
                + Cell246
            }
        }
        symbol {
            textRepresented = "றௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell12456
                + Cell246
            }
        }
        symbol {
            textRepresented = "னௌ"
            dictionaryType = UYIRMEI2
            cells {
                + Cell56
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஷ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
            }
        }
        symbol {
            textRepresented = "ஸ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
            }
        }
        symbol {
            textRepresented = "ஹ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
            }
        }
        symbol {
            textRepresented = "க்ஷ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
            }
        }
        symbol {
            textRepresented = "ஜ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
            }
        }
        symbol {
            textRepresented = "ஜ்"
            dictionaryType = GRANTHA
            cells {
                + Cell4
                + Cell245
            }
        }
        symbol {
            textRepresented = "ஷ்"
            dictionaryType = GRANTHA
            cells {
                + Cell4
                + Cell12346
            }
        }
        symbol {
            textRepresented = "ஸ்"
            dictionaryType = GRANTHA
            cells {
                + Cell4
                + Cell234
            }
        }
        symbol {
            textRepresented = "ஹ்"
            dictionaryType = GRANTHA
            cells {
                + Cell4
                + Cell125
            }
        }
        symbol {
            textRepresented = "க்ஷ்"
            dictionaryType = GRANTHA
            cells {
                + Cell4
                + Cell12345
            }
        }
        symbol {
            textRepresented = "ஜா"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஷா"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஸா"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஹா"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell345
            }
        }
        symbol {
            textRepresented = "க்ஷா"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell345
            }
        }
        symbol {
            textRepresented = "ஜி"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஷி"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஸி"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஹி"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell24
            }
        }
        symbol {
            textRepresented = "க்ஷி"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell24
            }
        }
        symbol {
            textRepresented = "ஜீ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஷீ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஸீ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஹீ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell35
            }
        }
        symbol {
            textRepresented = "க்ஷீ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell35
            }
        }
        symbol {
            textRepresented = "ஜு"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஷு"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஸு"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஹு"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell136
            }
        }
        symbol {
            textRepresented = "க்ஷு"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell136
            }
        }
        symbol {
            textRepresented = "ஜூ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஷூ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஸூ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஹூ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell1256
            }
        }
        symbol {
            textRepresented = "க்ஷூ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell1256
            }
        }
        symbol {
            textRepresented = "ஜெ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஷெ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஸெ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஹெ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell26
            }
        }
        symbol {
            textRepresented = "க்ஷெ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell26
            }
        }
        symbol {
            textRepresented = "ஜே"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஷே"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஸே"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஹே"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell15
            }
        }
        symbol {
            textRepresented = "க்ஷே"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell15
            }
        }
        symbol {
            textRepresented = "ஜை"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஷை"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஸை"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஹை"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell34
            }
        }
        symbol {
            textRepresented = "க்ஷை"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell34
            }
        }
        symbol {
            textRepresented = "ஜொ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஷொ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஸொ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஹொ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell1346
            }
        }
        symbol {
            textRepresented = "க்ஷொ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell1346
            }
        }
        symbol {
            textRepresented = "ஜோ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஷோ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஸோ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஹோ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell135
            }
        }
        symbol {
            textRepresented = "க்ஷோ"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell135
            }
        }
        symbol {
            textRepresented = "ஜௌ"
            dictionaryType = GRANTHA
            cells {
                + Cell245
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஷௌ"
            dictionaryType = GRANTHA
            cells {
                + Cell12346
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஸௌ"
            dictionaryType = GRANTHA
            cells {
                + Cell234
                + Cell246
            }
        }
        symbol {
            textRepresented = "ஹௌ"
            dictionaryType = GRANTHA
            cells {
                + Cell125
                + Cell246
            }
        }
        symbol {
            textRepresented = "க்ஷெள"
            dictionaryType = GRANTHA
            cells {
                + Cell12345
                + Cell246
            }
        }
        symbol {
            textRepresented = ""
            dictionaryType = NUMBER
            cells {
                + Cell3456
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
                + Cell1
            }
        }
        symbol {
            textRepresented = "2"
            dictionaryType = NUMBER
            cells {
                + Cell12
            }
        }
        symbol {
            textRepresented = "3"
            dictionaryType = NUMBER
            cells {
                + Cell14
            }
        }
        symbol {
            textRepresented = "4"
            dictionaryType = NUMBER
            cells {
                + Cell145
            }
        }
        symbol {
            textRepresented = "5"
            dictionaryType = NUMBER
            cells {
                + Cell15
            }
        }
        symbol {
            textRepresented = "6"
            dictionaryType = NUMBER
            cells {
                + Cell124
            }
        }
        symbol {
            textRepresented = "7"
            dictionaryType = NUMBER
            cells {
                + Cell1245
            }
        }
        symbol {
            textRepresented = "8"
            dictionaryType = NUMBER
            cells {
                + Cell125
            }
        }
        symbol {
            textRepresented = "9"
            dictionaryType = NUMBER
            cells {
                + Cell24
            }
        }
        symbol {
            textRepresented = "0"
            dictionaryType = NUMBER
            cells {
                + Cell245
            }
        }
        symbol {
            textRepresented = "."
            dictionaryType = NUMBER
            cells {
                + Cell256
            }
            descriptiveNameRes = R.string.braille_decimal_point
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ","
            dictionaryType = NUMBER
            cells {
                + Cell2
            }
            descriptiveNameRes = R.string.braille_thousands_separator
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = " "
            dictionaryType = INVISIBLE
            cells {
                + CellEmpty
            }
        }
        symbol {
            textRepresented = "."
            dictionaryType = PUNCTUATION
            cells {
                + Cell256
            }
            descriptiveNameRes = R.string.braille_fullstop
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "?"
            dictionaryType = PUNCTUATION
            cells {
                + Cell26
            }
            descriptiveNameRes = R.string.braille_questionmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "¿"
            dictionaryType = PUNCTUATION
            cells {
                + Cell26
            }
            descriptiveNameRes = R.string.braille_questionmark_inverse
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "“"
            dictionaryType = PUNCTUATION
            cells {
                + Cell236
            }
            descriptiveNameRes = R.string.braille_openquote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "!"
            dictionaryType = PUNCTUATION
            cells {
                + Cell235
            }
            descriptiveNameRes = R.string.braille_exclamationmark
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "¡"
            dictionaryType = PUNCTUATION
            cells {
                + Cell235
            }
            descriptiveNameRes = R.string.braille_exclamationmark_inverse
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ","
            dictionaryType = PUNCTUATION
            cells {
                + Cell2
            }
            descriptiveNameRes = R.string.braille_comma
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ":"
            dictionaryType = PUNCTUATION
            cells {
                + Cell25
            }
            descriptiveNameRes = R.string.braille_colon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ";"
            dictionaryType = PUNCTUATION
            cells {
                + Cell23
            }
            descriptiveNameRes = R.string.braille_semicolon
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "'"
            dictionaryType = PUNCTUATION
            cells {
                + Cell3
            }
            descriptiveNameRes = R.string.braille_apostrophe
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "-"
            dictionaryType = PUNCTUATION
            cells {
                + Cell36
            }
            descriptiveNameRes = R.string.braille_hyphen
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "”"
            dictionaryType = PUNCTUATION
            cells {
                + Cell356
            }
            descriptiveNameRes = R.string.braille_closequote
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ""
            dictionaryType = PUNCTUATION
            cells {
                + Cell56
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
                + Cell6
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
                + Cell6
                + Cell6
            }
            descriptiveNameRes = R.string.braille_capitalword
            onEntryClickType = BrailleSymbolDatabaseEntry.OnEntryClickType.SHOW_INFO
            extraInfoRes = R.string.capitalwordExplanation
            modifierType = INDICATOR
        }
        symbol {
            textRepresented = "*"
            dictionaryType = PUNCTUATION
            cells {
                + Cell5
                + Cell35
            }
            descriptiveNameRes = R.string.braille_asterisk
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "("
            dictionaryType = PUNCTUATION
            cells {
                + Cell5
                + Cell126
            }
            descriptiveNameRes = R.string.braille_openbracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = ")"
            dictionaryType = PUNCTUATION
            cells {
                + Cell5
                + Cell345
            }
            descriptiveNameRes = R.string.braille_closebracket
            onEntryClickType = SHOW_LETTERS_REP
        }
        symbol {
            textRepresented = "/"
            dictionaryType = PUNCTUATION
            cells {
                + Cell456
                + Cell34
            }
            descriptiveNameRes = R.string.braille_slash
            onEntryClickType = SHOW_LETTERS_REP
        }
    }
}