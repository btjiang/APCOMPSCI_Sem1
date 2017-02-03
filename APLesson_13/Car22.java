public class Car22 extends ToyInventory
{
	private  String name;
	
	
		public Car22()
		{
		name = "";
		}
	
		public Car22(String n)
		{
		name = n;
		}
		
		public String getType()
		{
			return "Car";
		}
		
		public String toString()
		{
			return name; 
		}
	
}