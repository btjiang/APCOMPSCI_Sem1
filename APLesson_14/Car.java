public abstract class Car implements Location
{
	int ID;
	public Car()
	{
		ID = 1 + (int)(Math.random()*999999);
	}
}