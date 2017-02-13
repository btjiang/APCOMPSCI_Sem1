public class ToyRunner
{
	public static void main(String[]args)
	{	String toy = "Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF";
		ToyStore store = new ToyStore(toy);
		System.out.println(store);
		System.out.println("The most frequent toy is: " + store.getMostFrequentToy());
		System.out.println("The most frequent type of toy is: " + store.getMostFrequentType());

	}
}