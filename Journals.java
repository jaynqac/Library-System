import java.util.*;

public class Journals extends Item
{
	public String authorName;
	public String topicTitle;
	
	public Book(int setID, String setType, String setName, String setAuthorName, String setTopic, boolean setChecked)
	{
		super(setID, setType, setName);
		authorName = setAuthorName;
		topicTitle = setTopic;
	}

	public void rentalPrice()
	{
		double rental = 1.29;
		System.out.println("Journals cost £" + rental + " to rent.");
	}
	
}