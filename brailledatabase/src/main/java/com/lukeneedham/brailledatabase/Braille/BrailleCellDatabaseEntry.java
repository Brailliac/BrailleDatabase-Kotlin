package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

public class BrailleCellDatabaseEntry
{
    public BrailleCell brailleCell;
    private char fontSymbol;

    public BrailleCellDatabaseEntry(char font, BrailleCell cell)
    {
        brailleCell = cell;
        fontSymbol = font;
    }

    public BrailleCellDatabaseEntry(char font, boolean d1, boolean d2, boolean d3, boolean d4, boolean d5, boolean d6)
    {
        brailleCell = new BrailleCell(d1, d2, d3, d4, d5, d6);
        fontSymbol = font;
    }

    public char getUnicodeCellSymbol()
	{
		int total = 10240;
		for(int i = 0; i < brailleCell.dots.length; i++)
		{
			int score = (int) Math.pow(2, i);
			if(brailleCell.dots[i]) total += score;
		}

		return (char) total;
	}

    public char getFontSymbol()
    {
        return fontSymbol;
    }

    public boolean getDotAt(int dotNumber)
    {
        return brailleCell.getDotAt(dotNumber);
    }

    public String getDotsDescription(Context c)
    {
        return brailleCell.getDotsDescription(c);
    }

    public String toString()
    {
        return ""+getUnicodeCellSymbol();
    }

    @Override
    public boolean equals(Object o)
    {
        if(!(o instanceof BrailleCellDatabaseEntry)) {
            return false;
        }
        BrailleCellDatabaseEntry that = (BrailleCellDatabaseEntry) o;

        return that.fontSymbol == this.fontSymbol &&
                that.brailleCell.equals(this.brailleCell);
    }

    @Override
    public int hashCode()
    {
        return ((int) this.fontSymbol) + brailleCell.hashCode();
    }

    public String getVariableName() {
        return brailleCell.getVariableName();
    }
}