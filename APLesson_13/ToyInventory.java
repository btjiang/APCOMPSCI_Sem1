public abstract class ToyInventory
{
	private  String name;
	private  int count;
	
	public ToyInventory()
		{
		name = "";
		count = 1;
		}
	
	public ToyInventory(String n)
		{
			name = n;
			count = 1;
		}
		
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
	public void setName(String n)
	{
		name = n;
	}
	public void setCount(int c)
	{
		count = c;
	}
	public abstract String getType();
	
	public String toString()
	{
		return name + count;
	}
}
	
