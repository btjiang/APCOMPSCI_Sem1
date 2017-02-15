public abstract class TicketSuperclass
{
	int SerialNumber;
	
	public TicketSuperclass()
	{
		SerialNumber = 1 + (int)(Math.random()*9999999);
	}
	
	public int getSerialNo()
	{
		return SerialNumber;
	}
	
	public abstract int getPrice();
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
	
}