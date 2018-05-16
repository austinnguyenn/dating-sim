// Teja
// Item 1.0
// 5/14/18

import java.util.*;

public class LoveInterest extends Characters
{
	private boolean dateable;
	private final int DATEABLE_THRESHOLD = 100;
	private String approachText = "";
	
	public LoveInterest(String ap, String name, int age)
	{
		dateable = false;
		super.setName(name);
		super.setAge(age);
		super.setFriendship(0);
		approachText = ap;
	}
	
	public int changeFriendship(int amount)
	{
		return super.changeFriendship(amount);
	}
	
	public boolean checkDateable()
	{
		if(super.getFriendship() >= DATEABLE_THRESHOLD)
		{
			dateable = true;
		}
		if(dateable)
			return true;
		return false;
	}
	
	public String setApproachText(String str)
	{
		approachText = str + "\n";
		return str;
	}
	
	public String toString()
	{
		return "Your friendship with " + getName() + " is " + getFriendship() + ".\n";
	}
	
	public void printText(String str)
	{
		try
		{
			ApproachText.printWithDelays(str, 50);
		} 
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	
}
