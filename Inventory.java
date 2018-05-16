// Austin Nguyen
// Inventory 1.0
// 10/16/18

import java.util.*;

public class Inventory
{
	private ArrayList<Item> inventory;

	public Inventory()
	{
		inventory = new ArrayList<Item>();
	}

	public void addItem(Item i)
	{
		inventory.add(i);
	}

	public void useItem(int num)
	{
		inventory.remove(num);
	}

	@Override
	public String toString()
	{
		String output = "";
		output += "Inventory\n";
		output += "---------------\n";
		
		for(int i = 0; i < inventory.size(); i++)
		{
			output += inventory.get(i).toString();
			output += "\n";
		}
		
		return output;

	}

}
