package com.lukeneedham.brailledatabase.Braille.SymbolDatabases

import android.content.Context
import com.lukeneedham.brailledatabase.Braille.*
import com.lukeneedham.brailledatabase.R
import java.io.File
import java.util.ArrayList
import kotlin.collections.HashMap

abstract class BrailleDatabase
{
    abstract val symbols: List<BrailleSymbolDatabaseEntry>

    val longestBrailleWord by lazy {
        findLongestBrailleWord()
    }
    val longestBrailleSymbolCells by lazy {
        findLongestSymbolCells()
    }

    private val symbolTypes: Map<DictionaryType, List<BrailleSymbolDatabaseEntry>> by lazy {
        val buildingMap = HashMap<DictionaryType, MutableList<BrailleSymbolDatabaseEntry>>()
        for (entry in symbols)
        {
            val type = entry.dictionaryType
            if (buildingMap.containsKey(type))
            {
                buildingMap[type]!!.add(entry)
            }
            else
            {
                val newList = ArrayList<BrailleSymbolDatabaseEntry>()
                newList.add(entry)
                buildingMap[type] = newList
            }
        }
        val res = mutableMapOf<DictionaryType, List<BrailleSymbolDatabaseEntry>>()
        buildingMap.forEach {
            res[it.key] = it.value.toList()
        }
        res.toMap()
    }

    val dictionaryTypes: List<DictionaryType> by lazy {
        symbolTypes.keys.toList()
    }

    val defaultPractise: List<BrailleSymbolDatabaseEntry> by lazy {
        val cats = dictionaryCategories
        val res = ArrayList<BrailleSymbolDatabaseEntry>()

        for (cat in cats)
        {
            if (cat.unlockLevel == 0)
            {
                val types = cat.subsections
                types.forEach {
                    val symbolsForType = getSymbols(it) ?: return@forEach
                    res.addAll(symbolsForType)
                }
            }
        }
        res
    }

    abstract val dictionaryCategories: List<DictionaryCategory>

    protected abstract val challengeSymbolTypes: List<DictionaryType>
    val challengeSymbols: List<BrailleSymbolDatabaseEntry> by lazy {
        mutableListOf<BrailleSymbolDatabaseEntry>().apply {
            challengeSymbolTypes.forEach {
                val symbols = getSymbols(it) ?: return@forEach
                addAll(symbols)
            }
        }.toList()
    }
    val canDoChallenge by lazy { challengeSymbols.isNotEmpty() }

    abstract val canDoTranslation: Boolean

    val capitalSymbol by lazy { findSymbolDataByDescriptionFirst(R.string.braille_capital) }

    val capitalWordSymbol by lazy { findSymbolDataByDescriptionFirst(R.string.braille_capitalword) }

    val numberSignSymbol by lazy { findSymbolDataByDescriptionFirst(R.string.braille_number_sign) }

    val letterSign by lazy { findSymbolDataByDescriptionFirst(R.string.braille_lettersign) }

    open val closeQuote by lazy { findSymbolDataByDescriptionFirst(R.string.braille_closequote) }

    open val openQuote by lazy { findSymbolDataByDescriptionFirst(R.string.braille_openquote) }

    val space by lazy {
        val entries = findSymbolDataByLettersRepresented(" ")
        entries.firstOrNull()
    }

    fun getSymbols(type: DictionaryType): List<BrailleSymbolDatabaseEntry>?
    {
        return symbolTypes[type]
    }

    fun getSymbols(category: DictionaryCategory): List<BrailleSymbolDatabaseEntry>
    {
        val symbols = mutableListOf<BrailleSymbolDatabaseEntry>()
        category.subsections.forEach()
        {
            val symbolsForType = getSymbols(it) ?: return@forEach
            symbols.addAll(symbolsForType)
        }
        return symbols
    }

    fun findSymbolDataByLettersRepresented(`in`: String): List<BrailleSymbolDatabaseEntry>
    {
        val res = ArrayList<BrailleSymbolDatabaseEntry>()
        for (i in 0 until symbols.size)
        {
            if (symbols[i].textRepresented == `in`)
            {
                res.add(symbols[i])
            }
        }
        return res
    }

    fun findSymbolDataByDescription(`in`: String, c: Context): List<BrailleSymbolDatabaseEntry>
    {
        var `in` = `in`
        val res = ArrayList<BrailleSymbolDatabaseEntry>()
        `in` = `in`.toLowerCase()
        for (i in 0 until symbols.size)
        {
            if (symbols[i].getDescriptiveName(c)!!.toLowerCase() == `in`)
            {
                res.add(symbols[i])
            }
        }
        return res
    }

    fun findSymbolDataByDescription(`in`: Int): List<BrailleSymbolDatabaseEntry>
    {
        val res = ArrayList<BrailleSymbolDatabaseEntry>()
        for (i in 0 until symbols.size)
        {
            if (symbols[i].descriptiveNameRes == `in`)
            {
                res.add(symbols[i])
            }
        }
        return res
    }

    fun findSymbolDataByFont(font: String): List<BrailleSymbolDatabaseEntry>?
    {
        val symbols = ArrayList<BrailleSymbolDatabaseEntry>()
        for (i in 0 until symbols.size)
        {
            val current = symbols[i]

            if (font == current.font)
            {
                symbols.add(current)
            }
        }
        return if (symbols.size == 0)
            null
        else
            symbols
    }

    fun findSymbolDataBySymbol(brailleCharIn: BrailleSymbol): List<BrailleSymbolDatabaseEntry>
    {
        val res = ArrayList<BrailleSymbolDatabaseEntry>()
        for (i in 0 until symbols.size)
        {
            val currentSymbol = symbols[i]
            if (brailleCharIn.equals(currentSymbol.symbol))
            {
                res.add(currentSymbol)
            }
        }

        return res
    }

    private fun findLongestBrailleWord(): Int
    {
        var maxLength = 0

        for (entry in symbols)
        {
            val allLetters = entry.allTextsRepresented
            for (letter in allLetters)
            {
                val checkLength = letter.length
                if (checkLength > maxLength)
                {
                    maxLength = checkLength
                }
            }
        }
        return maxLength
    }

    private fun findLongestSymbolCells(): Int
    {
        var maxLength = 0
        for (entry in symbols)
        {
            val checkLength = entry.cells.size
            if (checkLength > maxLength)
            {
                maxLength = checkLength
            }
        }
        return maxLength
    }

    fun convertToKotlin(context: Context): String
    {
        var res = "override val symbols = entries {"
        res += "\n"

        val entries = symbols
        for (entry in entries)
        {
            res += "symbol {"
            res += "\n"

            // lettersrepped
            val allLettersRepped = entry.allTextsRepresented
            res += "textRepresented = \"" + allLettersRepped[0] + "\""
            res += "\n"

            if (allLettersRepped.size > 1)
            {
                res += "alternativeTextRepresented = listOf("
                var sep = ""
                for (lettersRep in allLettersRepped)
                {
                    res += sep
                    res += "\"" + lettersRep + "\""
                    sep = ", "
                }
                res += ")"
                res += "\n"
            }

            // dictionaryType
            res += "dictionaryType = " + entry.dictionaryType.name
            res += "\n"

            // cells
            res += "cells {"
            res += "\n"
            val cells = entry.cells
            for (cell in cells)
            {
                res += "+ " + cell.variableName
                res += "\n"
            }
            res += "}"
            res += "\n"

            // ruleForUsage
            val rule = entry.ruleForUsage
            if (rule != BrailleSymbolUsageRule.ANYWHERE)
            {
                res += "ruleForUsage = " + rule.name
                res += "\n"
            }

            // descriptiveNameRes
            val descNameRes = entry.descriptiveNameRes
            if (descNameRes != 0)
            {
                val name = context.resources.getResourceEntryName(descNameRes)
                res += "descriptiveNameRes = R.string.$name"
                res += "\n"
            }

            // onEntryClickType
            val clickType = entry.onEntryClickType
            if (clickType !== BrailleSymbolDatabaseEntry.OnEntryClickType.NOTHING)
            {
                res += "onEntryClickType = " + entry.onEntryClickType.name
                res += "\n"
            }

            // extraInfoRes
            val extraInfoRes = entry.extraInfoRes
            if (extraInfoRes != 0)
            {
                val name = context.resources.getResourceEntryName(extraInfoRes)
                res += "extraInfoRes = R.string.$name"
                res += "\n"
            }

            // fillEntryWidth
            val fillWidth = entry.fillEntryWidth
            if (fillWidth == true)
            {
                res += "fillEntryWidth = $fillWidth"
                res += "\n"
            }

            // modifierType
            val modType = entry.symbolModifierType
            if (modType !== BrailleSymbolModifierType.NONE)
            {
                res += "modifierType = $modType"
                res += "\n"
            }

            // end
            res += "}"
            res += "\n"
        }

        res += "}"

        val exportFile = File(context.filesDir, this::class.java.simpleName + ".kt")
        exportFile.createNewFile()
        exportFile.writeText(res)

        return res
    }

    private fun findSymbolDataByDescriptionFirst(desc: Int): BrailleSymbolDatabaseEntry?
    {
        val entries = findSymbolDataByDescription(desc)
        return entries.getOrNull(0)
    }

    override fun toString(): String
    {
        var res = ""
        for (entry in symbols)
        {
            res += entry.textRepresented + " "
        }
        return res
    }

    fun getNumberDataEntryForSymbol(symbolIn: BrailleSymbol): BrailleSymbolDatabaseEntry?
    {
        val allMatches = findSymbolDataBySymbol(symbolIn)
        for (entry in allMatches)
        {
            if (entry.dictionaryType === DictionaryType.NUMBER || entry.symbolModifierType === BrailleSymbolModifierType.INDICATOR)
            {
                return entry
            }
        }
        return null
    }

    companion object
    {
        @JvmStatic
        val NO_STRING = ""
        @JvmStatic
        val BLANK_BRAILLE_SYMBOL = "\u2800"
    }
}
