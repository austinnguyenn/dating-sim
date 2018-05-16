// Austin Nguyen
// Shop 1.0
// 10/14/18

import java.util.ArrayList;

public class Shop
{
	ArrayList<Item> shopList = new ArrayList<Item>();
	
	public Shop()
	{
		shopList.add(new Item("Roses", "Pretty Flowers", 2, 10));
		shopList.add(new Item("Wine", "LETS GET CRUNK", 10000, 50));
	}
	
	@Override
	public String toString()
	{
		String output = "";
		
		output += String.format("%-7s %7s %n", "Name", "Cost");
		output += "---------------\n";
		
		for(int i = 0; i < shopList.size(); i++)
		{
			String name = shopList.get(i).getName();
			String cost = "$" + String.valueOf(shopList.get(i).getCost());
			output += String.format("%-7s %7s %n", name, cost);
		}
		
		output += "---------------\n";
		return output;
	}
	
}
