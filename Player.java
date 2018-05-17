// Austin Nguyen
// Player 1.0
// 10/16/18

import java.util.*;

public class Player
{
	private Scanner key;
	private String name;
	private boolean isTall;
	private int classRelationship;
	
	public Player(String n, boolean tall)
	{
		key = new Scanner(System.in);
		name = n;
		isTall = tall;
		if(isTall)
			classRelationship = 10;
		else
			classRelationship = 0;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getClassRelationship()
	{
		return classRelationship;
	}
	
	public void changeClassRelationship(int n)
	{
		classRelationship += n;
	}
	
}
