import java.util.*;

public class ToyStore
{
	ArrayList<ToyInventory> toysList = new ArrayList<ToyInventory>();
	
	public ToyStore()
	{
		toysList = new ArrayList<>();
	}
	
	public ToyStore(String toy)
	{
		loadToys(toy);
	}
	
	public void loadToys(String toy)
	{
		
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(toy.split(", ")));
		toysList = new ArrayList<>();
		for(int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			ToyInventory t = getThatToy(name);
			if (t == null)
			{
				if(type.equalsIgnoreCase("Car"))
					toysList.add(new Car22(name));
				if (type.equalsIgnoreCase("AF"))
					toysList.add(new AFigure(name));
			}
			else 
			{
				t.setCount(t.getCount() + 1);
			}
		}
	}
	
	public ToyInventory getThatToy(String nm)
	{
		for (ToyInventory t : toysList)
		{
			if (t.getName().equalsIgnoreCase(nm))
			{
				return t;
			}
		
		}
		
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(ToyInventory t : toysList)
		{
			if(max < t.getCount())
			{
				max = t.getCount();
				name = t.getName();
			}
		}
		return name;
		
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for ( ToyInventory t : toysList)
		{
			if (t.getType().equalsIgnoreCase("Car"))
			{
				cars++;
			}
			
			if (t.getType().equalsIgnoreCase("AF"))
			{
				figures++;
			}
		}
		
		if (cars > figures)
		{
			return "Cars";
		}
		
		if (figures > cars)
		{
			return "Action Figures";
		}
		
		else 
		{
			return "Equal amounts of action figures and cars!";
		}
		
	}
	
	public String toString()
	{
		return " " + toysList;
	}
}