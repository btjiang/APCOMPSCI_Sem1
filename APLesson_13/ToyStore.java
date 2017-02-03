import java.util.*;

public class ToyStore
{
	public static void main(String[]args)
	{
		ArrayList<ToyInventory> toysList = new ArrayList<ToyInventory>();
	}
	
	public ToyStore()
	{
		loadToys();
	}
	
	public ToyStore(ArrayList<ToyInventory> toysList)
	{
		loadToys();
	}
	
	public static void loadToys(String t)
	{
		ArrayList<String>toys = new ArrayList<String>(Arrays.asList(t.split(", ")));
		for(int i = 0; i < toysList.size(); i ++)
		{
			String name = toysList.get(i);
			String type = toysList.get(i+1);
			ToyInventory object = new ToyInventory(getThatToy(name));
			if (return = null)
			{
				object.ToyInventory()
			}
			else 
			{
				count += 1;
			}
		}
	}
}