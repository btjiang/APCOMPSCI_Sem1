import java.util.Scanner; //import Statement 

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String name = keyboard.next();
		
		System.out.println( name + " is a really awful name I'm sorry you have to live with that.");
		
	
		System.out.println("How old are you, " + name + "?");
		
		
		int num = keyboard.nextInt();
		
		
		System.out.println("Oh " + num + " ? I never would have guessed, you look a lot more aged than that!");
		
		System.out.println("What do you do for fun?");
		
		String fun = keyboard.next();
		
		System.out.println("Oh, wow! I didn't know people actually liked to " + fun + "!");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("How interesting, I think that every genre of music except for " + music + " holds value in society!");
		
		System.out.println("How many siblings do you have, " + name + "?" );
		
		
		
		
	}
}