public class Advance extends TicketSuperclass
{
	private int daysLeft;
	
	public Advance(int days)
	{
		daysLeft = days;
	}
	
	public int getPrice()
	{
		if (daysLeft >= 10)
		{
			return 30.00; 
		}
		
		else
		{
			return 40.00;
		}
	}
}