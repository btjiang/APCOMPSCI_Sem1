public class TicketDriver
{
	public static void main(String[]args)
	{
	TicketSuperclass x = new Walkup();
	TicketSuperclass y = new Advance(9);
	TicketSuperclass z = new Advance(14);
	TicketSuperclass ab = new StudentAdvance(5);
	TicketSuperclass xy = new StudentAdvance(11);
	System.out.println(ab);
	System.out.println(xy);
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	}
}