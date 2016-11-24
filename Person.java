import java.util.*;

public class Person
{	
	// common fields for person
	public int personID;
	public String personName;
	public boolean isChecked;

	// Person constructor
	public Person(int newPersonID, String setName, boolean setChecked)
	{
		personID = newPersonID;
		personName = setName;
		isChecked = setChecked;
	}

	// toString method used to format the output
	public String toString()
	{
		return personID + " " + personName + " " + isChecked;
	}

	// method used to get the name in the list
	public String getName()
	{
		return personName;
	}

	// method used to get the ID of an account in the list
	public int getID()
	{
		return personID;
	}

	public String changeName()
	{
		personName = "Jarrad";

		return personName;
	}

}