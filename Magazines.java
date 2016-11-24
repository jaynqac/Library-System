import java.util.*;

public class Magazines extends Item
{
	public int issueNum;
	public String monthReleased;
	public String yearReleased;

	public Magazines(int setID, String setType, String setName, int setIssueNum, String setMonthReleased, String setYearReleased, boolean setChecked)
	{
		super(setID, setType, setName);
		issueNum = setIssueNum;
		monthReleased = setMonthReleased;
		yearReleased = setYearReleased;
	}

	public void rentalPrice()
	{
		double rental = 1.49;
		System.out.println("Magazines cost £" + rental + " to rent.");
	}

}