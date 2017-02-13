public class TicketSuperclass
{
	int SerialNumber;
	int Price;
	
	public TicketSuperclass()
	{
		SerialNumber = 0;
		Price = 0;
	}
	
	public int getSerialNo()
	{
		return 1 + (int)(Math.random()*9999999);
	}
	
	public abstract int getPrice()
	{
		return Price;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
	
}