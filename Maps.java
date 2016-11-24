import java.util.*;

public class Maps extends Item
{

	public Maps(int setID, String setType, String setName, boolean setChecked)
	{
		super(setID, setType, setName, setChecked);
	}

	public void rentalPrice()
	{
		double rental = 2.99;
		System.out.println("Maps cost £" + rental + " to rent.");
	}
	
}