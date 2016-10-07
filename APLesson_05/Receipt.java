import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Receipt menu = new Receipt();
		System.out.println("Please enter item 1:");
		String item1 = kb.next();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		String item2 = kb.next();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		String item3 = kb.next();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		System.out.println("Please enter item 4:");
		String item4 = kb.next();
		System.out.println("Please enter the price:");
		double price4 = kb.nextDouble();
		String item5 = "Subtotal:";
		double price5 = price1 + price2 + price3 + price4;
		String item6 = "Discount:";
		double price6 = price5 * dis(price5);
		String item7 = "Tax:";
		double price7 = .08 * (price5 - price6);
		String item8 = "Total:";
		double price8 = price5 - price6 + price7; 
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>");
		menu.format(item1, price1);
		menu.format(item2, price2);
		menu.format(item3, price3);
		menu.format(item4, price4);
		menu.format(item5, price5);
		menu.format(item6, price6);
		menu.format(item7, price7);
		menu.format(item8, price8);
	
		System.out.println();
		
		System.out.println("___________________________________________________");
		
		System.out.println("* Thank you for your support *");
		
	}
	
	public static double dis(double price5)
	{
		double dis = 0;
		if (price5 >= 2000)
		{
			dis = .15;
		}
		
		if (price5 <= 2000)
		{
			dis = 0;
		}
		return dis;
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %20s          %10.2f", item, price);
	}
}
