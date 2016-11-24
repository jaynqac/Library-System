import java.util.*;

public class Users
{	
	// creates a list of object 'Person' to store user accounts
	public List<Person> personList = new ArrayList<Person>();
	public int counter = 0;
	public boolean isChecked;

	// instantiates Menu class 
	//public Menu myMenu = new Menu();

	public Users()
	{

	}

	public void registerPerson()
	{
		
		
		/*
		NEED TO USE A DATABASE TO SAVE DATA AFTER PROGRAM CLOSES
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = sc.nextLine();
		
		System.out.println("Has this user checked in a book? y/n");
		char confirm = sc.next().charAt(0);
		
		if (confirm == 'y')
		{
			isChecked = true;
		}
		else 
		{ 
			isChecked = false; 
		}
		int userID = counter++; */

		// hard code user accounts information
		Person myPerson = new Person(1, "Jay", true);
		Person myPerson2 = new Person(2, "John", false);
		Person myPerson3 = new Person(3, "Tag", false);

		// adds user accounts to array list
		personList.add(myPerson);
		personList.add(myPerson2);
		personList.add(myPerson3);
		System.out.println();

		// for loop to iterate through list and print information within list
		for (int i = 0; i < personList.size(); i++)
		{
			System.out.println(personList.get(i).toString());
		}
		
		System.out.println("New users have been added.");
		System.out.println();

		deletePerson();

		//myMenu.displayMenu();

	}

	public void deletePerson()
	{
		// hard code user accounts information again because it does not save after 'registerPerson' method ends
		/*Person myPerson = new Person(1, "Jay", true);
		Person myPerson2 = new Person(2, "John", false);
		Person myPerson3 = new Person(3, "Tag", false);

		personList.add(myPerson);
		personList.add(myPerson2);
		personList.add(myPerson3);*/

		// requests user input to choose which account to delete
		System.out.println("What user do you want to delete?");
		Scanner sc = new Scanner(System.in);
		int requiredID = sc.nextInt();

		// removes a given account from the list
		personList.remove(requiredID);

		// for loop to iterate through list and print the new list after the deletion
		

		updatePerson();
	}

	public void updatePerson()
	{
		System.out.println("Which user account do you want to update?");
		// search for user account using ID or name
		Scanner sc = new Scanner(System.in);
		int requiredID = sc.nextInt();
		
		// update appropriate fields
		Person temp = personList.get(requiredID);
		temp.changeName();

		for (int i = 0; i < personList.size(); i++)
		{
			System.out.println(personList.get(i).toString());
		}

	}



}