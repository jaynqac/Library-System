import java.util.*;

public class Main
{

	public static void main(String[] args)
	{
		// instantiate Menu class to use methods within Menu
		Menu myMenu = new Menu();
		System.out.println(String.format("\033[H\033[2J"));
		String userName;

		// user interface to request user input
		System.out.println("What is your name?");
		Scanner userInput = new Scanner(System.in);
		userName = userInput.nextLine();

		System.out.println(String.format("\033[H\033[2J"));
		System.out.println("Welcome to my library system " + userName + " :)");
		System.out.println("How can I help?");

		// calls method from Menu class to display the menu
		myMenu.displayMenu();
	}

}
