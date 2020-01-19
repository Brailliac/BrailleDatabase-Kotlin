package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

public class BrailleCell
{
    public boolean[] dots = new boolean[6];

    public BrailleCell(boolean d1, boolean d2, boolean d3, boolean d4, boolean d5, boolean d6)
    {
        dots[0] = d1;
        dots[1] = d2;
        dots[2] = d3;
        dots[3] = d4;
        dots[4] = d5;
        dots[5] = d6;
    }

    public BrailleCell(boolean[] dotsIn)
    {
        if (dotsIn.length == 6)
        {
            dots = dotsIn;
        }
    }

    public boolean getDotAt(int dotNumber)
    {
        return dots[dotNumber];
    }

    public boolean equals(Object o)
    {
        if(!(o instanceof BrailleCell)) {
            return false;
        }
        BrailleCell bc = (BrailleCell) o;

        return Arrays.equals(this.dots, bc.dots);
    }

    public String getDotsDescription(Context c)
    {
        String res = "";
        for(int i = 1; i <= dots.length; i++)
        {
            if(dots[i-1])
                res += i + ", ";
        }
		if(res.equals(""))
		{
			return c.getResources().getString(R.string.braille_space);
		}
		else
        	return c.getResources().getString(R.string.dots) + " " + res.substring(0, res.length()-2);
    }

    public String toString()
    {
        return Arrays.toString(dots);
    }

    @Override
    public int hashCode()
    {
        return Arrays.hashCode(dots);
    }

    public String getVariableName() {
    	String dotsOn =
				isDotInName(0) +
				isDotInName(1) +
				isDotInName(2) +
				isDotInName(3) +
				isDotInName(4) +
				isDotInName(5);
    	if(dotsOn.equals("")) dotsOn = "Empty";
        return "Cell" + dotsOn;
    }

    private String isDotInName(int dot) {
        return getDotAt(dot) ? (dot+1) + "" : "";
    }
}