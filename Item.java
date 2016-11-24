import java.util.*;

abstract class Item
{
	// Items have 4 common fields
	public int itemID;
	public String itemType;
	public String itemName;
	public boolean isChecked;

	public Scanner sc = new Scanner(System.in);
	public List<Item> itemList = new ArrayList<Item>();

	// Item class has one constructor
	public Item (int setID, String setType, String setName, boolean setChecked)
	{
		itemID = setID;
		itemType = setType;
		itemName = setName;
		isChecked = setChecked;
	}

	// Item class has various methods
	public void checkOutItem()
	{
		// get item ID
		System.out.println("Which item do you want to check out?");
		Scanner userInput = new Scanner(System.in);
		int temp = userInput.nextInt();
		// change isChecked to true item in list or database

		checkOut(itemList.get(temp));


	}

	public void checkOut(int itemID)
	{
		updateItem(itemID);
		String temp = itemList.get(itemID);
		isChecked = true;
	}

	public void checkInItem()
	{
		// get item ID
		System.out.println("Which item do you want to check in?");
		Scanner userInput = new Scanner(System.in);
		int temp = userInput.nextInt();
		// change isChecked to false item in list or database

		checkIn(temp.get(itemID));
	}

	public void checkIn(int itemID)
	{
		isChecked = false;
	}

	public void addItem()
	{
		// add books to list
		Item nBook = new Book();
		Item nBook1 = new Book();
		Item nBook2 = new Book();

		// add magazines to list
		Item nMagazine = new Magazines();
		Item nMagazine1 = new Magazines();
		Item nMagazine2 = new Magazines();

		// add Newspapers to list
		Item nNewspaper = new Newspapers();
		Item nNewspaper1 = new Newspapers();
		Item nNewspaper2 = new Newspapers();

		// add Journals to list
		Item nJournals = new Journals();
		Item nJournals1 = new Journals();
		Item nJournals2 = new Journals();

		// add Maps to list
		Item nMap = new Maps();
		Item nMap1 = new Maps();
		Item nMap2 = new Maps();

	}

	public void removeItem()
	{
		// search for item in list
		System.out.println("Which item do you want to remove?");
		String requiredName = sc.nextLine();

		// remove item from list
		String temp = itemList.get(requiredName);
		itemList.remove(temp);

		for (int i = 0; i < itemList.size(); i++)
		{
			System.out.println(itemList.get(i).toStringBook());
		}
	}

	public void updateItem()
	{
		// search for item in list
		System.out.println("Which item do you want to update?");
		Scanner userInput = new Scanner(System.in);
		String temp = userInput.nextLine();
		// change appropriate fields for record

		changeName();
	}

	public void getItem()
	{
		System.out.println("Which item do you want to search for?");
		Scanner userInput = new Scanner(System.in);
		String temp = userInput.nextLine();

		// search for item in list
		// print out item details
		for (Item itemList : arrayList)
		{

			if (itemList.get().equals(temp))
			{
				System.out.println(itemList.get(temp).toStringBook());
			}
		}
		
	}

	public void displayItems()
	{
		// print out the list of items
		for (Item itemList : arrayList)
		{
			System.out.println(itemList.toString());
		}
	}

	public String changeName()
	{
		itemName = "Hello this is a test";

		return itemName;
	}

	/*public String toStringBook()
	{
		return itemID + " " + itemType + " " + itemName + " " + sNum + " " + isChecked;
	}

	public String toStringMagazine()
	{
		return personID + " " + personName + " " + isChecked;
	}

	public String toStringNewspapers()
	{
		return personID + " " + personName + " " + isChecked;
	}

	public String toStringJournals()
	{
		return personID + " " + personName + " " + isChecked;
	}

	public String toStringMaps()
	{
		return personID + " " + personName + " " + isChecked;
	}*/

	public abstract void rentalPrice();

}