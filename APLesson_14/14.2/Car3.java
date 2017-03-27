public abstract class Car3 implements Location3
{
	int ID;
	double x, y;
	double[] location;
	
	public Car3()
	{
		x=0;
		y=0;
		ID = 1 + (int)(Math.random()*999999);
	}
	
	public void move(double r, double t)
	{
		x += r;
		y += t;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public double[] getLoc()
	{
		double [] loc = new double [2];
		loc[0] = x;
		loc[1] = y;
		return loc;
	}
}