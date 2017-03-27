public class Toyota3 extends Car3
{
	
	public Toyota3(String sos)
	{
		super();
		this.move(Double.parseDouble(sos.split(",")[0]),Double.parseDouble(sos.split(",")[1]));
		
	}
	
}