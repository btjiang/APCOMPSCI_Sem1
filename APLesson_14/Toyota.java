import java.util.*;
public class Toyota implements Location
{
	private double x, y;
	
	public Toyota(String sos)
	{
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(sos.split(", ")));
		x = Double.parseDouble(l.get(0));
		y = Double.parseDouble(l.get(1));
		
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