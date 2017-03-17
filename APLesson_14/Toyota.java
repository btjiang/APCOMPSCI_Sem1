public class Toyota implements Location
{
	private double x, y;
	
	public Toyota(String sos)
	{
		ArrayList<String> location = new ArrayList<String>();
		x = Double.parseDouble(sos.split(",")[0]);
		y = Double.parseDouble(sos.split(",")[1]);
		
	}
	
	public int getID()
	{
		return 1 + (int)(Math.random()*999999);
	}
	
	public void move(double c, double d)
	{
		x += c;
		y += d;
	}
	
	public double[] getLoc()
	{
		double [] loc = new double [2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}