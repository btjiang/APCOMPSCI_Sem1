/**=====================================================
 * Exercise_02:     At Counter
 *--------------
 * In this lab, you will create a grid that contains
 * @s and -s at random. Then, you will create a program
 * that finds all the @s that are connected together at
 * a given row and column #.
 *======================================================*/

import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main( String args[] )
	{
		/**Test Cases*/
		AtCounter test = new AtCounter(10, 10);
		System.out.println(test);
		out.println("0 0 has "+test.countAts(0,0) + "\n\n");

		test = new AtCounter(10, 10);
		System.out.println(test);
		out.println("5 5 has "+test.countAts(5,5) + "\n\n");

		/**Take user inputs for row and column #s*/
	}
}