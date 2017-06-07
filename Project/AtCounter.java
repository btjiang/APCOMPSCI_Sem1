public class AtCounter
{
	String[][] atGrid;
    /**===================================
     * Create a 2D array called atGrid
     *=====================================*/
    /**==========================================
     * Constructor...
     * fill the array with "@" or "-" at random
     *==========================================*/
    public AtCounter(int rows, int cols)
    {
		atGrid = new String[10][10];
		for( int i = 0; i < atGrid.length; i++)
		{
			for (int j = 0; j < atGrid[i].length; j++)
			{
				int num = UtilRandomNumbers.getRandomInteger(1,2);
				atGrid[i][j] = (random == 1) ? "@" : "-" ;
			}
		}
    }

    /**==================================================================
     * CountAts() method...
     * ---------------------
     * 1. Take row and column #s as parameters
     *
     * As long as the row and column #s are less than the maximum and
     * the value at [row][column] is an "@"
     *
     * 2. set the value at [row][column] to a "-"
     * 3. return 1 + recursive call to countAts() with @params being the
     *    values to the right, left, top, and bottom of [row][col].
     *====================================================================*/
	public int countAts(int r, int c)
	{
		while (r < 10 && c < 10 && atGrid[r][c].equals("@"))
		{
			atGrid[r][c] = "-";
			return countAts([r + 1], [c + 1]) + 1;
		}
	}
    /**==========================================
     * toString() method
     * return the Array in grid format
     *==========================================*/
	public String toString()
	{
		return atGrid[][];
	}
}