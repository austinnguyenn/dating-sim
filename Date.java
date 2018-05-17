// Teja
// 5/17/18
// 1.1

import java.util.*;

public class Date extends Events
{
	private ArrayList<String> scene = new ArrayList<String>();
	private ArrayList<String> choices = new ArrayList<String>();
	private int value = 10;
	
	public Date(ArrayList<String> s, ArrayList<String[]> c, int v)
	{
		super(s, c, v);
	}
	
	public String getString(int index)
	{
		return startScene().get(index) + "\n";
	}
	
	public String getChoices(int index)
	{
		String[] x = getOptions(index);
		String output = "";
		for(int i = 1; i < x.length; i++)
		{
			output += i + ". " + x[i-1] + "\n";
		}
		return output;
	}
	
	
	
	
	

}