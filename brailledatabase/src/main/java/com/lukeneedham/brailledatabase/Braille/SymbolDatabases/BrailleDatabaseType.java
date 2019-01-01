package com.lukeneedham.brailledatabase.Braille.SymbolDatabases;

import android.content.Context;

import com.lukeneedham.brailledatabase.R;

import java.util.Arrays;

public enum BrailleDatabaseType
{
	UEB(new BrailleDatabaseUEB(), R.string.database_ueb, R.string.database_ueb_desc, "eng"),
	SWEDISH(new BrailleDatabaseSwedish(), R.string.database_swedish, R.string.database_swedish_desc, "swe"),
	CZECH(new BrailleDatabaseCzech(), R.string.database_czech, R.string.database_czech_desc, new String[]{"cze", "ces"}),
	SLOVAK(new BrailleDatabaseSlovak(), R.string.database_slovak, R.string.database_slovak_desc, new String[]{"slo", "slk"}),
	TAMIL(new BrailleDatabaseTamil(), R.string.database_tamil, R.string.database_tamil_desc, "tam"),
	SPANISH(new BrailleDatabaseSpanish(), R.string.database_spanish, R.string.database_spanish_desc, "spa");

	BrailleDatabase db;
	int name;
	int desc;
	String[] locale;

	BrailleDatabaseType(BrailleDatabase d, int n, int de, String... locale)
	{
		db = d;
		name = n;
		desc = de;
		this.locale = locale;
	}

	public BrailleDatabase getDatabase()
	{
		return db;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(name);
	}

	public String getDesc(Context c)
	{
		return c.getResources().getString(desc);
	}

	public String[] getLocale()
	{
		return locale;
	}

	public static BrailleDatabaseType fromLocale(String localeIn)
	{
		for (BrailleDatabaseType db : values())
		{
			if (Arrays.asList(db.getLocale()).contains(localeIn))
			{
				return db;
			}
		}
		return null;
	}

	public static BrailleDatabaseType fromSave(String s)
	{
		return valueOf(s);
	}

	public String toSave()
	{
		return name();
	}
}
