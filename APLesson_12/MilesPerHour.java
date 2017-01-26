import java.lang.Math.*;
public class MilesPerHour
{
	private static int d;
	private static int h;
	private static int m;
	private static double mph;
	
	public MilesPerHour()
	{
		d=0;
		h=0;
		m=0;
		mph=0;
	}
		
	public MilesPerHour(int di, int ho, int mi)
	{
		d = di;
		h = ho;
		m = mi;
		mph=0;
	}
	
	public void setValues (int dis, int hou, int min)
	{
		d = dis;
		h = hou;
		m = min;
	}
	
	public double getMPH ()
	{
		return Math.round(d / (h + m / 60.0));
	}
	
	public int getDistance ()
	{
		return d;
	}
	
	public int getHours()
	{
		return h;
	}
	
	public int getMinutes()
	{
		return m;
	}
}