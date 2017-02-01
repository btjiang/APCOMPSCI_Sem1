import java.util.Scanner;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter hair color:");
		String hair = kb.nextLine();
		System.out.println("Please enter eye color:");
		String eyes = kb.nextLine();
		System.out.println("Please enter skin color:");
		String skin = kb.nextLine();
		
		
		Human drive = new Human(hair, eyes, skin);
		System.out.println("My info...\nHair:\t" + drive.getHair() + "\nEyes:\t" + drive.getEyes() + "\nSkin:\t" + drive.getSkin());
		drive.setHES("black", "brown", "white");
		System.out.println("Friend's info...\nHair:\t" + drive.getHair() + "\nEyes:\t" + drive.getEyes() + "\nSkin:\t" + drive.getSkin());
	}
}