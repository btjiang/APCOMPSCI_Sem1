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
			return 30; 
		}
		
		return 40;
		
	}
}