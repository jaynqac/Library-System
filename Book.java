import java.util.*;

public class Book extends Item
{
	public long sNum;

	public Book(int setID, long setSNum, String setType, String setName, boolean setChecked)
	{
		super(setID, setType, setName);
		sNum = setSNum;
	}

	public void rentalPrice()
	{
		double rental = 1.99;
		System.out.println("Books cost £" + rental + " to rent.");
	}

}