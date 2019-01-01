package com.lukeneedham.brailledatabase.Braille

import android.content.Context
import com.lukeneedham.brailledatabase.R

/**
 * Created by Luke on 15/06/2017.
 */

enum class BrailleSymbolModifierType
{
    INDICATOR, NONE, DIACRITIC;

    override fun toString(): String
    {
        return name
    }
}
