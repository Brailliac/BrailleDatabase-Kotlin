package com.lukeneedham.brailledatabase.Braille;

import android.content.Context;

// TODO migrate to enum
public abstract class BrailleCellDatabase
{
	public static final BrailleCellDatabaseEntry CellEmpty = new BrailleCellDatabaseEntry(' ', false, false, false, false, false, false);

    public static final BrailleCellDatabaseEntry Cell1 = new BrailleCellDatabaseEntry('A', true, false, false, false, false, false);
    public static final BrailleCellDatabaseEntry Cell12 = new BrailleCellDatabaseEntry('B', true, true, false, false, false, false);
	public static final BrailleCellDatabaseEntry Cell123 = new BrailleCellDatabaseEntry('L', true, true, true, false, false, false);
    public static final BrailleCellDatabaseEntry Cell124 = new BrailleCellDatabaseEntry('F', true, true, false, true, false, false);
    public static final BrailleCellDatabaseEntry Cell1245 = new BrailleCellDatabaseEntry('G', true, true, false, true, true, false);
    public static final BrailleCellDatabaseEntry Cell125 = new BrailleCellDatabaseEntry('H', true, true, false, false, true, false);

	public static final BrailleCellDatabaseEntry Cell1234 = new BrailleCellDatabaseEntry('P', true, true, true, true, false, false);
	public static final BrailleCellDatabaseEntry Cell12345 = new BrailleCellDatabaseEntry('Q', true, true, true, true, true, false);
	public static final BrailleCellDatabaseEntry Cell1235 = new BrailleCellDatabaseEntry('R', true, true, true, false, true, false);
	public static final BrailleCellDatabaseEntry Cell1236 = new BrailleCellDatabaseEntry('V', true, true, true, false, false, true);

	public static final BrailleCellDatabaseEntry Cell13 = new BrailleCellDatabaseEntry('K', true, false, true, false, false, false);
	public static final BrailleCellDatabaseEntry Cell134 = new BrailleCellDatabaseEntry('M', true, false, true, true, false, false);
	public static final BrailleCellDatabaseEntry Cell1345 = new BrailleCellDatabaseEntry('N', true, false, true, true, true, false);
	public static final BrailleCellDatabaseEntry Cell13456 = new BrailleCellDatabaseEntry('Y', true, false, true, true, true, true);
	public static final BrailleCellDatabaseEntry Cell1346 = new BrailleCellDatabaseEntry('X', true, false, true, true, false, true);
	public static final BrailleCellDatabaseEntry Cell135 = new BrailleCellDatabaseEntry('O', true, false, true, false, true, false);
	public static final BrailleCellDatabaseEntry Cell1356 = new BrailleCellDatabaseEntry('Z', true, false, true, false, true, true);
	public static final BrailleCellDatabaseEntry Cell136 = new BrailleCellDatabaseEntry('U', true, false, true, false, false, true);

	public static final BrailleCellDatabaseEntry Cell14 = new BrailleCellDatabaseEntry('C', true, false, false, true, false, false);
	public static final BrailleCellDatabaseEntry Cell145 = new BrailleCellDatabaseEntry('D', true, false, false, true, true, false);
	public static final BrailleCellDatabaseEntry Cell15 = new BrailleCellDatabaseEntry('E', true, false, false, false, true, false);

    public static final BrailleCellDatabaseEntry Cell24 = new BrailleCellDatabaseEntry('I', false, true, false, true, false, false);
    public static final BrailleCellDatabaseEntry Cell245 = new BrailleCellDatabaseEntry('J', false, true, false, true, true, false);
    public static final BrailleCellDatabaseEntry Cell234 = new BrailleCellDatabaseEntry('S', false, true, true, true, false, false);
    public static final BrailleCellDatabaseEntry Cell2345 = new BrailleCellDatabaseEntry('T', false, true, true, true, true, false);
    public static final BrailleCellDatabaseEntry Cell2456 = new BrailleCellDatabaseEntry('W', false, true, false, true, true, true);


    public static final BrailleCellDatabaseEntry Cell3456 = new BrailleCellDatabaseEntry('#', false, false, true, true, true, true); // [3456]

    public static final BrailleCellDatabaseEntry Cell256 = new BrailleCellDatabaseEntry('4', false, true, false, false, true, true); //dis [256]
    public static final BrailleCellDatabaseEntry Cell236 = new BrailleCellDatabaseEntry('8', false, true, true, false, false, true); //his [236
    public static final BrailleCellDatabaseEntry Cell235 = new BrailleCellDatabaseEntry('6', false, true, true, false, true, false); //ff [235]
    public static final BrailleCellDatabaseEntry Cell2 = new BrailleCellDatabaseEntry('1', false, true, false, false, false, false); //ea [2]
    public static final BrailleCellDatabaseEntry Cell25 = new BrailleCellDatabaseEntry('3', false, true, false, false, true, false); //con, cc [25]
    public static final BrailleCellDatabaseEntry Cell23 = new BrailleCellDatabaseEntry('2', false, true, true, false, false, false); //bb, be [23]
    public static final BrailleCellDatabaseEntry Cell3 = new BrailleCellDatabaseEntry('\'', false, false, true, false, false, false); // [3]
    public static final BrailleCellDatabaseEntry Cell36 = new BrailleCellDatabaseEntry('-', false, false, true, false, false, true); // [36]
    public static final BrailleCellDatabaseEntry Cell356 = new BrailleCellDatabaseEntry('0', false, false, true, false, true, true); //was [356]

    public static final BrailleCellDatabaseEntry Cell6 = new BrailleCellDatabaseEntry(',', false, false, false, false, false, true); // [6]

    public static final BrailleCellDatabaseEntry Cell2356 = new BrailleCellDatabaseEntry('7', false, true, true, false, true, true); //were [2356]
    public static final BrailleCellDatabaseEntry Cell34 = new BrailleCellDatabaseEntry('/', false, false, true, true, false, false); //still [34]
    public static final BrailleCellDatabaseEntry Cell16 = new BrailleCellDatabaseEntry('*', true, false, false, false, false, true); //child [16]
    public static final BrailleCellDatabaseEntry Cell126 = new BrailleCellDatabaseEntry('<', true, true, false, false, false, true); // [126]
    public static final BrailleCellDatabaseEntry Cell146 = new BrailleCellDatabaseEntry('%', true, false, false, true, false, true); //shall [146]
    public static final BrailleCellDatabaseEntry Cell1456 = new BrailleCellDatabaseEntry('?', true, false, false, true, true, true); //this [1456]
    public static final BrailleCellDatabaseEntry Cell156 = new BrailleCellDatabaseEntry(':', true, false, false, false, true, true); //which [156]
    public static final BrailleCellDatabaseEntry Cell1246 = new BrailleCellDatabaseEntry('$', true, true, false, true, false, true); // [1246]
    public static final BrailleCellDatabaseEntry Cell12456 = new BrailleCellDatabaseEntry(']', true, true, false, true, true, true); // [12456]
    public static final BrailleCellDatabaseEntry Cell1256 = new BrailleCellDatabaseEntry('\\', true, true, false, false, true, true); //out [1256]
    public static final BrailleCellDatabaseEntry Cell246 = new BrailleCellDatabaseEntry('[', false, true, false, true, false, true); // [246]
    public static final BrailleCellDatabaseEntry Cell26 = new BrailleCellDatabaseEntry('5', false, true, false, false, false, true); //enough [26]
    public static final BrailleCellDatabaseEntry Cell346 = new BrailleCellDatabaseEntry('+', false, false, true, true, false, true); // [346]
    public static final BrailleCellDatabaseEntry Cell345 = new BrailleCellDatabaseEntry('>', false, false, true, true, true, false); // [345]
    public static final BrailleCellDatabaseEntry Cell35 = new BrailleCellDatabaseEntry('9', false, false, true, false, true, false); // [35]

    public static final BrailleCellDatabaseEntry Cell12346 = new BrailleCellDatabaseEntry('&', true, true, true, true, false, true); // [12346]
    public static final BrailleCellDatabaseEntry Cell123456 = new BrailleCellDatabaseEntry('=', true, true, true, true, true, true); // [123456]
    public static final BrailleCellDatabaseEntry Cell12356 = new BrailleCellDatabaseEntry('(', true, true, true, false, true, true); // [12356]
    public static final BrailleCellDatabaseEntry Cell2346 = new BrailleCellDatabaseEntry('!', false, true, true, true, false, true); // [2346]
    public static final BrailleCellDatabaseEntry Cell23456 = new BrailleCellDatabaseEntry(')', false, true, true, true, true, true); // [23456]

    public static final BrailleCellDatabaseEntry Cell5 = new BrailleCellDatabaseEntry('"', false, false, false, false, true, false); // [5]
    public static final BrailleCellDatabaseEntry Cell45 = new BrailleCellDatabaseEntry('^', false, false, false, true, true, false); // [45]
    public static final BrailleCellDatabaseEntry Cell456 = new BrailleCellDatabaseEntry('_', false, false, false, true, true, true); // [456]
    public static final BrailleCellDatabaseEntry Cell46 = new BrailleCellDatabaseEntry('.', false, false, false, true, false, true); // [46]
    public static final BrailleCellDatabaseEntry Cell56 = new BrailleCellDatabaseEntry(';', false, false, false, false, true, true); // [56]
    public static final BrailleCellDatabaseEntry Cell4 = new BrailleCellDatabaseEntry('@', false, false, false, true, false, false); // [4]

    private static final BrailleCellDatabaseEntry[] allCells = {Cell1, Cell12, Cell14, Cell145, Cell15, Cell124, Cell1245, Cell125, Cell24, Cell245, Cell13, Cell123, Cell134, Cell1345, Cell135, Cell1234, Cell12345, Cell1235, Cell234, Cell2345, Cell136, Cell1236, Cell2456, Cell1346,
			Cell13456, Cell1356, CellEmpty, Cell3456, Cell256, Cell236, Cell235, Cell2, Cell25, Cell23, Cell3, Cell36, Cell356,
			Cell6, Cell2356, Cell34, Cell16, Cell126, Cell146, Cell1456, Cell156, Cell1246, Cell12456, Cell1256, Cell246, Cell26, Cell346, Cell345, Cell35, Cell12346, Cell123456, Cell12356, Cell2346, Cell23456, Cell4, Cell5, Cell45, Cell456, Cell46, Cell56};

    public static BrailleCellDatabaseEntry lookUpCell(BrailleCell in)
    {
        for(BrailleCellDatabaseEntry cellEntry : allCells) {
            BrailleCell cell = cellEntry.brailleCell;
            if(cell.equals(in)) {
                return cellEntry;
            }
        }
        return null;
    }

    public static BrailleCellDatabaseEntry lookUpCell(char font)
    {
        for(BrailleCellDatabaseEntry cell : allCells)
        {
            if(cell.getFontSymbol()==font)
                return cell;
        }
        return null;
    }

    public static String getDotDescriptionsFromFont(String font, Context con)
    {
        StringBuilder res = new StringBuilder();

        for(char c : font.toCharArray())
        {
            BrailleCellDatabaseEntry cell = lookUpCell(c);
            if(cell != null)
            {
                res.append(cell.getDotsDescription(con)).append(". ");
            }
        }

        return res.toString();
    }
}
