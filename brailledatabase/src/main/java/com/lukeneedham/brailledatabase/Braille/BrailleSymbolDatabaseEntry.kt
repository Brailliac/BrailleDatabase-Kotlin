package com.lukeneedham.brailledatabase.Braille

import android.content.Context

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleDatabase
import com.lukeneedham.brailledatabase.R

import java.util.Arrays

/**
 * Created by Luke on 30/07/2016.
 */
class BrailleSymbolDatabaseEntry(val allTextsRepresented: List<String>, val dictionaryType: DictionaryType, cells: List<BrailleCell>, val ruleForUsage: BrailleSymbolUsageRule = BrailleSymbolUsageRule.ANYWHERE, val descriptiveNameRes: Int = 0, val onEntryClickType: OnEntryClickType = OnEntryClickType.NOTHING, val extraInfoRes: Int = 0, val fillEntryWidth: Boolean = false, val symbolModifierType: BrailleSymbolModifierType = BrailleSymbolModifierType.NONE)
{
    val symbol = BrailleSymbol(cells)
    // the literal ascii to be read when reading this symbol - like "and", "?". Use NO_STRING when the symbol has to literal meaning (modifiers)
    // the descriptive title of the symbol - like "Question mark" - should be an int referencing the value in strings.xml
    // rule for where the symbol can be used
    // dictionaryType of symbol

    val textRepresented: String
        get() = allTextsRepresented.first()

    val cells: Array<BrailleCell>
        get() = symbol.cells

    val brailleFont: String
        get() = symbol.font


    fun getCategory(db: BrailleDatabase): DictionaryCategory?
    {
        val cats = db.dictionaryCategories
        for (cat in cats)
        {
            if (Arrays.asList(*cat.subsections).contains(dictionaryType)) return cat
        }
        return null
    }

    fun getOnClickText(c: Context): String?
    {
        return when (onEntryClickType)
        {
            OnEntryClickType.SHOW_LETTERS_REP -> textRepresented
            OnEntryClickType.SHOW_INFO -> c.getString(extraInfoRes)
            OnEntryClickType.SHOW_USAGE_RULE -> getRuleDescription(c)
            OnEntryClickType.NOTHING -> ""
        }
    }

    enum class OnEntryClickType
    {
        SHOW_LETTERS_REP,
        SHOW_INFO,
        SHOW_USAGE_RULE,
        NOTHING
    }

    fun getDescriptiveName(c: Context): String?
    {
        return if (descriptiveNameRes == 0)
        {
            textRepresented
        }
        else
        {
            c.resources.getString(descriptiveNameRes)
        }
    }

    override fun toString(): String
    {
        return "( $symbol, $allTextsRepresented, $ruleForUsage, $dictionaryType )"
    }

    fun getRuleDescription(c: Context): String
    {
        return "${c.resources.getString(R.string.theContraction)}${getDescriptiveName(c)}${ruleForUsage.getRuleDescription(c)}"
    }

    override fun equals(other: Any?): Boolean
    {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }

        val that = other as BrailleSymbolDatabaseEntry

        if (!symbol.equals(that.symbol)) {
            return false
        }
        if (allTextsRepresented != that.allTextsRepresented) {
            return false
        }
        if (ruleForUsage != that.ruleForUsage) {
            return false
        }
        return dictionaryType == that.dictionaryType
    }

    override fun hashCode(): Int
    {
        var result = symbol.hashCode()
        result = 31 * result + allTextsRepresented.hashCode()
        result = 31 * result + ruleForUsage.hashCode()
        result = 31 * result + dictionaryType.hashCode()
        return result
    }

    companion object
    {
        @JvmStatic
        fun LegacyConstructor(nameIn: String, typeIn: DictionaryType, onClick: BrailleSymbolDatabaseEntry.OnEntryClickType, vararg cellsIn: BrailleCell): BrailleSymbolDatabaseEntry
        {
            return BrailleSymbolDatabaseEntry(allTextsRepresented = listOf(nameIn), dictionaryType = typeIn, onEntryClickType = onClick, cells = listOf(*cellsIn))
        }

        @JvmStatic
        fun LegacyConstructor(nameIn: String, descRes: Int, typeIn: DictionaryType, onClick: BrailleSymbolDatabaseEntry.OnEntryClickType, vararg cellsIn: BrailleCell): BrailleSymbolDatabaseEntry
        {
            return BrailleSymbolDatabaseEntry(allTextsRepresented = listOf(nameIn), descriptiveNameRes = descRes, dictionaryType = typeIn, onEntryClickType = onClick, cells = listOf(*cellsIn))
        }
    }
}