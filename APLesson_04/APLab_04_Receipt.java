public class  APLab_04_Receipt
{
	public static void main(String[]args)
	{
		System.out.println("<<<<<<<<<<<<<<<<<<Receipt>>>>>>>>>>>>>>>>>>");
		
		APLab_04_Receipt menu = new APLab_04_Receipt();
		
		String item1 = "Cheese Sandwich";
		double price1 = 4.50;
		
		menu.receipt(item1, price1);
		
		String item2 = "French Fries";
		double price2 = 2.88;
		
		menu.receipt(item2, price2);
		
		String item3 = "Soda";
		double price3 = 1.63;
		
		menu.receipt(item3, price3);
		
		System.out.println();
		
		String item4 = "Subtotal:";
		double price4 = 9.01;
		
		menu.receipt(item4, price4);
		
		String item5 = "Tax:";
		double price5 = 0.63;
		
		menu.receipt(item5, price5);
		
		String item6 = "Total";
		double price6 = 9.64;
		
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

