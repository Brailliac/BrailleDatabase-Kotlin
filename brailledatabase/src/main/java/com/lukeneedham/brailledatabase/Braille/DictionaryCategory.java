package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

import com.lukeneedham.brailledatabase.Braille.SymbolDatabases.BrailleDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luke on 15/06/2017.
 */

public class DictionaryCategory
{
	private int nameRes;

	private String icon;

	private DictionaryType[] subpages;

	private int unlockLevel;

	private boolean translationToggle = false;

	public DictionaryCategory(int n, int l, String i, DictionaryType... ps)
	{
		nameRes = n;
		unlockLevel = l;
		subpages = ps;
		icon = i;
	}

	public DictionaryCategory setTranslateToggle(boolean t)
	{
		translationToggle = t;
		return this;
	}

	public int getNameRes()
	{
		return nameRes;
	}

	public String getIcon()
	{
		return icon;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public DictionaryType[] getSubsections()
	{
		return subpages;
	}

	public int getUnlockLevel()
	{
		return unlockLevel;
	}

	public boolean canBeToggledForTranslation()
	{
		return translationToggle;
	}

	public String toString()
	{
		return unlockLevel + "";
	}

	public boolean equals(Object obj)
	{
		try
		{
			DictionaryCategory cat = (DictionaryCategory) obj;
			return (nameRes == cat.getNameRes()) && (unlockLevel == cat.getUnlockLevel());
		}
		catch (ClassCastException ex)
		{
			try
			{
				DictionaryType type = (DictionaryType) obj;
				return subpages.length == 1 && subpages[0].equals(type);
			}
			catch (ClassCastException ex2)
			{
				return false;
			}
		}
	}

	public List<Object> getItems(BrailleDatabase d)
	{
		List<Object> res = new ArrayList<>();
		for (DictionaryType type : subpages)
		{
			res.add(type);
			List<BrailleSymbolDatabaseEntry> entries = d.getSymbols(type);
			if (entries != null)
			{
				res.addAll(entries);
			}
		}
		return res;
	}
}
