import java.util.*;

public class Newspapers extends Item
{
	public String brandName;
	public String paperType;

	public Book(int setID, String setType, String setName, String setBrandName, String setPaperType, boolean setChecked)
	{
		super(setID, setType, setName);
		brandName = setBrandName;
		paperType = setPaperType;
		
	}

	public void rentalPrice()
	{
		double rental = 0.99;
		System.out.println("Newspapers cost £" + rental + " to rent.");
	}

}