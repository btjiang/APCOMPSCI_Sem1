import java.lang.Math.*;
public class Distance
{
	static int xOne;
	static int yOne;
	static int xTwo;
	static int yTwo;
	double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
		distance = 0; 
	}
	
	public void setValues(int x3, int y3, int x4, int y4)
	{
		xOne = x3;
		yOne = y3;
		xTwo = x4;
		yTwo = y4;
	}
	
	public double getDist()
	{
		return Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
	}
	
	public int getXONE()
	{
		return xOne;
	}
	
	public int getYONE()
	{
		return yOne;
	}
	
	public int getXTWO()
	{
		return xTwo;
	}
	
	public int getYTWO()
	{
		return yTwo;
	}
	
	
}

