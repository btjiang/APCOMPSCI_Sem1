import java.util.Scanner

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
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
		double price4 = kb.nextDouble();
		String item5 = "Subtotal:";
		double price5 = price1 + price2 + price3 + price4;
		String item6 = "Discount";
		double add = total * discount;
		double subtotal = total + add;
		double tax = .08 * subtotal 
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>");
		menu.receipt(item1, price1);
		menu.receipt(item2, price2);
		menu.receipt(item3, price3);
		menu.receipt(item4, price4);
		menu.receipt(item5, price5);
		menu.receipt(item6, price6);
	
		System.out.println();
		
		System.out.println("___________________________________________________");
		
		System.out.println("* Thank you for your support *");
		
	}
	
	public static double discount()
	{
		String discount = "";
		if (total >= 2000)
		{
			discount = .15;
		}
		
		if (total <= 2000)
		{
			discount = 0;
		}
		
	}
	
	public void format(String item, double price)
	{
		System.out.printf("\n*  %20s          %10.2f", item, price);
	}
}
