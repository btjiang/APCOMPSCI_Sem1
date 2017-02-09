public class GameSystem
{
	String platform;
	int serialNumber;
	
	public GameSystem()
	{
		platform = "";
		serialNumber = 1 + (int)(Math.random()*9999999); 
	}
	
	public GameSystem(String p)
	{
		platform = p;
		serialNumber = 1 + (int)(Math.random()*9999999);
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNumber()
	{
		return serialNumber;
	}
}