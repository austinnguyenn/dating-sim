// Teja
// Item 1.0
// 5/14/18


import java.util.*;

public abstract class Characters
{
	
	private String name;
	private int age;
	private int friendship = 0;
	
	public String setName(String n)
	{
		name = n;
		return n;
	}
	
	public int setAge(int a)
	{
		age = a;
		return a;
	}
	
	public int setFriendship(int f)
	{
		friendship = f;
		return f;
	}
	
	public int changeFriendship(int num)
	{
		friendship += num;
		return num;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int getFriendship()
	{
		return friendship;
	}	
	
}
