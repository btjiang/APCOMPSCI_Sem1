public class Toyota2 extends Car
{
	
	public Toyota2(String sos)
	{
		super();
		this.move(Double.parseDouble(sos.split(",")[0]),Double.parseDouble(sos.split(",")[1]));
		
	}
	
}