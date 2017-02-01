public class Human
{
	static private String hair;
	static private String eyes;
	static private String skin;
	
	public Human(String hair, String eyes, String skin)
	{
		this.hair = hair;
		this.eyes = eyes;
		this.skin = skin;
	}
	
	public void setHES(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
		
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes()
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}