public class Toyota2 extends Car
{
	private double x, y;
	
	public Toyota(String sos)
	{
		ArrayList<String> location = new ArrayList<String>();
		x = Double.parseDouble(sos.split(",")[0]);
		y = Double.parseDouble(sos.split(",")[1]);
		
	}
	
}