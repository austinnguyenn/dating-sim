// Austin Nguyen
// Events 1.1
// 10/16/18

import java.util.*;

public abstract class Events
{
	private Scanner key = new Scanner(System.in);
	private ArrayList<String> scene = new ArrayList<String>();
	private ArrayList<String[]> choices = new ArrayList<String[]>();
	private int value;
	
	public Events(ArrayList<String> s, ArrayList<String[]> c, int v)
	{
		scene = s;
		choices = c;
		value = v;
	}
	
	public void pause()
	{
		key.next();
	}
	
	public void setScene(ArrayList<String> s, ArrayList<String[]> c, int v)
	{
		scene = s;
		choices = c;
	}
	
	public String startScene()
	{
		return scene.get(0);
	}
	
	public String[] getOptions(int place)
	{
		return choices.get(place);
	}
	
}
