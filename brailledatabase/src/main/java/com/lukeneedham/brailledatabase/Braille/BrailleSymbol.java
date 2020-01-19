package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Luke on 30/07/2016.
 */
public class BrailleSymbol
{
    private final BrailleCellDatabaseEntry[] cells;

    public BrailleSymbol(BrailleCellDatabaseEntry... cellsIn)
    {
        cells = cellsIn;
    }

    public BrailleSymbol(List<BrailleCellDatabaseEntry> cellsIn)
    {
        cells = cellsIn.toArray(new BrailleCellDatabaseEntry[cellsIn.size()]);
    }

    public BrailleCellDatabaseEntry[] getCells()
    {
        return cells;
    }

    public boolean equals(BrailleSymbol bc)
    {
        BrailleCellDatabaseEntry[] otherCells = bc.getCells();
        if (otherCells.length == cells.length)
        {
            for (int i = 0; i < otherCells.length; i++)
            {
                if (!otherCells[i].equals(cells[i]))
                {
                    return false;
                }
            }
            return true;
        }
        else return false;
    }

    public String getDotsDescription(Context c)
    {
        String res = "";
        for(BrailleCellDatabaseEntry bc : cells)
        {
			if(bc != null)
			{
				res += bc.getDotsDescription(c) + ". ";
			}
        }
        return res;
    }

    public String getFont()
    {
        StringBuilder res = new StringBuilder();
		for (BrailleCellDatabaseEntry cell : cells)
		{
			if (cell == null)
			{
				res.append(BrailleTranslator.UNKNOWN_CHARACTER);
			}
			else
			{
				res.append(cell.getFontSymbol());
			}
		}
        return res.toString();
    }

    public String getUnicodeCellSymbol()
	{
		StringBuilder res = new StringBuilder();
		for (BrailleCellDatabaseEntry cell : cells)
		{
			if (cell == null)
			{
				res.append(BrailleTranslator.UNKNOWN_CHARACTER);
			}
			else
			{
				res.append(cell.getUnicodeCellSymbol());
			}
		}
		return res.toString();
	}

	@Override
	public String toString()
	{
		return Arrays.toString(cells);
	}

	@Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrailleSymbol that = (BrailleSymbol) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(cells, that.cells);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(cells);
    }
}
