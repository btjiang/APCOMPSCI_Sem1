public class  APLab_04_Receipt
{
	public static void main(String[]args)
	{
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
	}
	
	public void receipt(String item, double price)
	{
		System.out.printf("\n%20s          %10.2f", item, price);
	}
}

