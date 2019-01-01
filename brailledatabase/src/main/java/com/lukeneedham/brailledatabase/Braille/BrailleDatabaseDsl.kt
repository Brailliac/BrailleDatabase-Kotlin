package com.lukeneedham.brailledatabase.Braille

/**
 * Created by Luke on 25/11/2018.
 */

object BrailleDatabaseDsl
{
    @DslMarker
    annotation class BrailleDatabaseDsl

    @BrailleDatabaseDsl
    class BrailleSymbolDatabaseEntryBuilder
    {
        // required
        var dictionaryType: DictionaryType? = null
        var cells: Cells? = null
        var textRepresented: String? = null

        // optional
        var alternativeTextRepresented: List<String>? = null
        var ruleForUsage = BrailleSymbolUsageRule.ANYWHERE
        var descriptiveNameRes = 0
        var onEntryClickType = BrailleSymbolDatabaseEntry.OnEntryClickType.NOTHING
        var extraInfoRes = 0
        var fillEntryWidth = false
        var modifierType = BrailleSymbolModifierType.NONE

        fun cells(block: Cells.() -> Unit)
        {
            cells = Cells().apply(block)
        }

        fun build(): BrailleSymbolDatabaseEntry
        {
            val lettersRepresentedToUse = validateLettersRepresented(alternativeTextRepresented, textRepresented)
            val dictionaryTypeToUse = validateDictionaryType(dictionaryType)
            val cellsToUse = validateCells(cells)

            return BrailleSymbolDatabaseEntry(lettersRepresentedToUse, dictionaryTypeToUse, cellsToUse, ruleForUsage, descriptiveNameRes, onEntryClickType, extraInfoRes, fillEntryWidth, modifierType)
        }

        private fun validateLettersRepresented(alternativeTextRepresented: List<String>?, textRepresented: String?): List<String>
        {
            if (textRepresented == null)
            {
                throw InvalidBrailleSymbolException("Text Represented must be set")
            }
            if (alternativeTextRepresented != null)
            {
                return alternativeTextRepresented + textRepresented
            }
            else
            {
                return listOf(textRepresented)
            }
        }

        private fun validateDictionaryType(dictionaryType: DictionaryType?): DictionaryType
        {
            if (dictionaryType == null)
            {
                throw InvalidBrailleSymbolException("Dictionary type must be set")
            }
            return dictionaryType
        }

        private fun validateCells(cells: List<BrailleCell>?): List<BrailleCell>
        {
            if (cells == null || cells.isEmpty())
            {
                throw InvalidBrailleSymbolException("Cells must be set")
            }
            return cells
        }
    }

    @BrailleDatabaseDsl
    class Cells : ArrayList<BrailleCell>()
    {
        operator fun BrailleCell.unaryPlus()
        {
            add(this)
        }
    }

    @BrailleDatabaseDsl
    class BrailleSymbolDatabaseBuilder
    {
        val entries = mutableListOf<BrailleSymbolDatabaseEntry>()

        fun symbol(block: BrailleSymbolDatabaseEntryBuilder.() -> Unit)
        {
            val entry = BrailleSymbolDatabaseEntryBuilder().apply(block).build()
            entries.add(entry)
        }

        fun build(): List<BrailleSymbolDatabaseEntry> = entries.toList()
    }

    fun entries(block: BrailleSymbolDatabaseBuilder.() -> Unit): List<BrailleSymbolDatabaseEntry>
    {
        return BrailleSymbolDatabaseBuilder().apply(block).build()
    }

    private class InvalidBrailleSymbolException(message: String) : Exception(message)
}