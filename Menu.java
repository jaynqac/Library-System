import java.util.*;

public class Menu
{
	public Users myUser = new Users();

	public void displayMenu()
	{
		Scanner userInput = new Scanner(System.in);


		// output the menu for user input - creates an interface for user
		System.out.println("Please select an option : ");
		System.out.println("1. Person Menu");
		System.out.println("2. Item Menu");
		System.out.println("3. Quit");
		int option = userInput.nextInt();

		// switch statement to execute required method
		switch(option)
		{
			case 1:	displayPersonMenu(); break;
			case 2: displayItemMenu(); break;
			case 3: System.exit(0); break;
		}

	}

	public void displayPersonMenu()
	{
		String name;
		
		Scanner userInput = new Scanner(System.in);

		// output the menu for user input - creates an interface for user
		System.out.println("Please select an option : ");
		System.out.println("1. Register a new user");
		System.out.println("2. Update a current user");
		System.out.println("3. Delete a user");
		System.out.println("4. Return to main menu");
		int option = userInput.nextInt();

		// switch statement to execute required method
		switch(option)
		{
			case 1:	myUser.registerPerson(); break;
			case 2: myUser.updatePerson(); break;
			case 3: myUser.deletePerson(); break;
			case 4: displayMenu(); break;
		}
	}

	public void displayItemMenu()
	{	
		// instantiate Item class to use methods from Items class
		Item myItem = new Book(0, 0, "type", "name");
		Scanner userInput = new Scanner(System.in);

		// output the menu for user input - creates an interface for user
		System.out.println("Please select an option : ");
		System.out.println("1. Check in an item");
		System.out.println("2. Check out an item");
		System.out.println("3. Add an item");
		System.out.println("4. Update an item");
		System.out.println("5. Remove an item");
		System.out.println("6. Get an item");
		System.out.println("7. Display all current items");
		System.out.println("8. Return to main menu");
		int option = userInput.nextInt();

		//switch statement to execute required method
		switch(option)
		{
			case 1: myItem.checkInItem(); break;
			case 2: myItem.checkOutItem(); break;
			case 3: myItem.addItem(); break;
			case 4: myItem.updateItem(); break;
			case 5: myItem.removeItem(); break;
			case 6: myItem.getItem(); break;
			case 7: myItem.displayItems(); break;
			case 8: displayMenu(); break;
		}
	}

}