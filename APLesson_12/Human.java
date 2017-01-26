public class Human
{
	static private String hair;
	static private String eyes;
	static private String skin;
	
	public Human()
	{
		hair = "";
		eyes = "";
		skin = "";
	}
	public Human(h,e,s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHES(hair, eyes, skin)
	{
		hair = hair;
		eyes = eyes;
		skin = skin;
		
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