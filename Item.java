// Austin Nguyen
// Item 1.0
// 10/14/18

public class Item
{
	private String name;
	private String description;
	private int value;
	private int cost;

	public Item()
	{
		name = null;
		description = null;
		value = 0;
		cost = 0;
	}

	public Item(String n, String d, int v, int c)
	{
		name = n;
		description = d;
		value = v;
		cost = c;
	}

	public void setName(String n)
	{
		name = n;
	}

	public String getName() 
	{	
		return name;
	}

	public void setDescription(String d) 
	{	
		description = d;
	}

	public String getDescription() 
	{	
		return description;
	}

	public void setValue(int v) 
	{
		value = v;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public void setCost(int c)
	{
		cost = c;
	}
	
	public int getCost()
	{
		return cost;
	}
	
	@Override
	public String toString()
	{
		String output = "";
		output += String.format("%-7s %n", getName());
		
		output += "---------------\n";
		
		output += String.format("%-7s %7s %n", "Cost", getCost());
		output += String.format("%-7s %7s %n", "Value", getValue());
		output += "\n\"" + getDescription() + "\"\n";
		
		output += "---------------\n";
		return output;
		
	}
	
}
