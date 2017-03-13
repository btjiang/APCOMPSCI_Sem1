public class GMC extends Car
{
	private double x, y;
	
	public GMC(double a, double b)
	{
		x = a;
		y = b;
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
		double[] loc = new double[2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
	
}