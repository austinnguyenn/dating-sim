// Teja
// Item 1.0
// 5/17/18

import java.util.Scanner;

public class ControlClass
{
	private LoveInterest waifu;
	public static void main(String[]args)
	{
		
		ControlClass runner = new ControlClass();
		runner.run();
		
	}
	
	public void run()
	{
		
		Scanner sc = new Scanner(System.in);
		
		//Get choice
		System.out.println("Choose your path! Type '1' for Clair or Type '2' for Shailene!");
		if(sc.nextLine().equals("Clair"))
		{
			waifu = new LoveInterest("LOL", "Clair");
		}
		else
		{
			waifu = new LoveInterest("LOL", "Shailene");
		}
		System.out.println(waifu);
	}
	
}
