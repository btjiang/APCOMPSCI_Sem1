public class StudentAdvance extends Advance
{
	private int daysLeft;
	
	public StudentAdvance(int days)
	{
		super(days);
		daysLeft = days;
	}
	
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice()+ "\n(STUDENT ID REQUIRED)";
	}
}