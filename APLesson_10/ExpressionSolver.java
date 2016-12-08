import java.util.*;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an expression:");
		String expression = kb.nextLine();
		ArrayList<String> eqa = new ArrayList<>(Arrays.asList(expression.split(" ")));
		doEquation(eqa, expression);
		
	}
	
	public static void doEquation(ArrayList<String> eqa, String expression)
	{
		int i = 0;
		while(i < eqa.size())
		{
			if (eqa.get(i).equals("*") || eqa.get(i).equals("/"))
			{
				if (eqa.get(i).equals("*"))
				{
					eqa.set(i, " " + (Integer.parseInt(eqa.get(i-1)) * Integer.parseInt(eqa.get(i+1))));
				}
				else
				{
					eqa.set(i, " " + (Integer.parseInt(eqa.get(i-1)) / Integer.parseInt(eqa.get(i+1))));
				}
				eqa.remove(i-1);
				eqa.remove(i);
			}
			i++;
		}
		
		i = 0;
		while(i < eqa.size())
		{
			if (eqa.get(i).equals("+") || eqa.get(i).equals("-"))
			{
				if (eqa.get(i).equals("+"))
				{
					eqa.set(i, " " + (Integer.parseInt(eqa.get(i-1)) + Integer.parseInt(eqa.get(i+1))));
				}
				else
				{
					eqa.set(i, " " + (Integer.parseInt(eqa.get(i-1)) - Integer.parseInt(eqa.get(i+1))));
				}
				eqa.remove(i-1);
				eqa.remove(i);
			}
			i++;
		}
					
		System.out.println(expression + " = " + eqa);
	}
		
	
	
	
}