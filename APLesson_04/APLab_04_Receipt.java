import java.util.Scanner;

public class  APLab_04_Receipt
{
	public static void main(String[]args)
	{
		
		
		APLab_04_Receipt menu = new APLab_04_Receipt();
		
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
		String item4 = "Subtotal:";
		double price4 = price1 + price2 + price3;
		String item5 = "Tax:";
		double price5 = .08 * price4;
		String item6 = "Total:";
		double price6 = price4 + price5;
		
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
	
	public void receipt(String item, double price)
	{
		System.out.printf("\n*  %20s          %10.2f", item, price);
	}
}

