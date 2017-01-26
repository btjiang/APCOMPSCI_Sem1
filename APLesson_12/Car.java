public class Car
{
	static private String paint;
	static private String interior;
	static private String engine;
	static private String tires;
	
	public Car(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}

    public void setValues(String p, String i, String e, String t)
	{
		paint = p;
		interior = i;
		engine = e;
		tires = t;
	}
	
	public String getPaint()
	{
		return paint;
	}
	
	public String getInterior()
	{
		return interior;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	public String getTires()
	{
		return tires;
	}
	
	
}