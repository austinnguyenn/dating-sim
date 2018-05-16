// Austin Nguyen
// Events 1.0
// 10/16/18

import java.util.*;

public abstract class Events
{
	private Scanner key = new Scanner(System.in);
	private ArrayList<String> scene = new ArrayList<String>();
	private ArrayList<String[]> choices = new ArrayList<String[]>();
	
	public Events(ArrayList<String> s, ArrayList<String[]> c)
	{
		scene = s;
		choices = c;
	}
	
	public void pause()
	{
		key.next();
	}
	
	public ArrayList<String> startScene()
	{
		return scene;
	}
	
	public String[] getOptions(int place)
	{
		return choices.get(place);
	}
	
}
