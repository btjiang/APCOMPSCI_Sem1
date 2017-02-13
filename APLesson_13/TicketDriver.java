public class TicketDriver
{
	TicketSuperclass walkup = new Walkup(15);
	TicketSuperclass advance = new Advance(9);
	TicketSuperclass student = new StudentAdvance(5);
	System.out.println(walkup.getSerialNumber());
}