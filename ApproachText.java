// Teja
// Item 1.0
// 5/11/18



import java.util.concurrent.TimeUnit;
public class ApproachText
{
	public static void main(String[] args) throws Exception
	{
		printWithDelays("add stuff", 50);
		printWithDelays("\n", 100);
		printWithDelays("add stuff", 50);


	}

	public static void printWithDelays(String data, int delay) throws InterruptedException
	{
		for (char ch:data.toCharArray())
		{
			TimeUnit unit = TimeUnit.MILLISECONDS;
			System.out.print(ch);
			unit.sleep(delay);
		}
	}
}