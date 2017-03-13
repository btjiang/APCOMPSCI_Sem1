public class Honda extends Car
{
	
	private double x, y;
	public Honda(double[] loc)
	{
		x = loc[0];
		y = loc[1];
	}

	public int getID()
	{
		return ID;
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