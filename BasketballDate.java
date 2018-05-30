package dates;

//Ryan
//1.0
//5-30-2018
//this got really confusing

import java.util.concurrent.TimeUnit;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasketballDate
{
	private JTextArea output;
	private JTextField t;
	private LoveInterest GIRL;

	//Part 1 Text
	private String[] part1 =    {"You purchase tickets for yourself and for Shailene.",
		     					 "You make Shailene buy tickets.",
		     					 "Both of you purchase your own ticket.",
		     					 "You sneak into the game."};
	private String[] p1_BLUE =  {"You offer to take her bag and head to the beach.",
								 "You don’t buy snacks because they’re way too expensive.",
								 "You let her buy her own snacks.",
								 "You steal snacks."};
	private String[] p1_GREEN = {"“My bad! I completely forgot!”",
								 "“Why would I? These tickets are way too expensive for that.”"};
	private String[] p1_RED =   {"“Hey, uhh, would you mind buying snacks as well?” you ask.",
								 "“I feel really bad that I forgot my wallet, so don’t worry about snacks.”"};
								

	//Part 2 Text
	private String[] part2 =    {"Playing Fortnite on your phone.",
							     "Trying to talk to Shailene.",
							     "Talking to the person behind you.",
							     "Anything except watching the game."};
	private String[] p2_RED =   {"You decide to be a good sport about it and laugh along with " + GIRL.getName() + ".",
							     "Angry, you pick up the frisbee and chuck it back at one of the middle schoolers, hitting him in the nose and knocking him over.",
							     "“Nice throw!” you sarcastically exclaim. You break the frisbee on your knee and throw it to the ground."};

	//Part 3 Text
	private String[] part3 = 	{"“Goodnight, " + GIRL.getName() + ",” you say. “I had a great time. I’ll see you soon?” you ask.",
								 "You try to go in for a kiss.",
								 "You walk " + GIRL.getName() + " to her car and open the door for her."};


	public BasketballDate(LoveInterest x, JTextArea w, JTextField tt)
	{
		GIRL = x;
		output = w;
		t = tt;
		play();
	}

	private int play()
	{
		int points = 0;
		// Part 1
		output.append("It’s the championship game. Hebron has had a perfect record this year and are looking to take home the title. You invited Shailene to the game with you, knowing that even though she seems nerdy, she’s a huge basketball fan.\n");
		output.append(getChoices(part1)); 
		String g = t.getText();
		if(g.equals("1")) //Blue Path
		{
			points++;
			output.append("“I got you,” you say to Shailene as you pull out your wallet. You walk to the booth and purchase two tickets.\n");
			output.append(getChoices(p1_BLUE)); 
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“Would you like any snacks?” you ask Shailene. She says she wants a drink and nachos, so you run and grab snacks. What a nice guy."); 
				return points;
			}
			else if(g.equals("2"))
			{
				output.append("“I don’t usually buy snacks here because they’re too expensive,” you tell Shailene. “No worries,” she responds, “I know how you feel.” You agree to go snackless at this game.");
				return points;
			}
			else if(g.equals("3"))
			{
				output.append("“I don’t usually buy snacks here because they’re too expensive,” you tell Shailene. “No worries,” she responds, “I can buy my own.” You let her walk to the snack bar and get her own snacks.");
				return points;
			}
			else
			{
				output.append("“Would you like any snacks?” you ask Shailene. She says she wants a drink and nachos, so you run and grab snacks. You notice that the door to the snack bar is open, so you walk in and try to get free snacks. "); 
				return points;
			}

		}
		else if(g.equals("3")) //Green Path
		{
			output.append("You walk to the ticket booth and purchase one ticket. “I’ll wait for you inside,” you say to Shailene.\n" + "“You’re not going to buy one for me?” she asks, affronted.");
			output.append(getChoices(p1_GREEN));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("You walk back and purchase one more ticket for Shailene. How could you forget that, anyway? "); 
				return points;
			}
			else if(g.equals("2"))
			{
				output.append("She rolls her eyes as you turn back around and walk in. What was she thinking? You don’t want to spend that much! "); 
				return points;
			}
			

		}
		else //Yellow Path
		{
			points--;
			output.append("“This is awkward, but I forgot my wallet,” you say to Shailene, “would you mind buying tickets?” You didn’t really forget your wallet, but tickets to these games are way too expensive.\n");
			output.append(getChoices(p1_RED));
			g = t.getText();
			if(g.equals("2"))
			{
				output.append("“Alright, but you better be more respectful,” she says suspiciously. You apologize again and walk to the water next to her."); // Make this longer
				points--;
			}
			else if(g.equals("2"))
			{
				output.append(" “That’s it! You’re the worst. I never want to talk to you again.” You really suck at this. We’ll just end the game here and save you the pain.");
				points -= 2;
				try {
					TimeUnit.MILLISECONDS.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
				return points;
			}
			else
			{
				output.append("“Alright, but you better be more respectful,” she says suspiciously. You apologize again and walk to the water next to her."); // Make this longer
				points--;
			}

		}

		// Part 2
		output.append("The match is really close. Exceptionally close. There’s a tension in the air as the players fight with all their might to take home the title. Too bad it’s only the first quarter. They’re gonna be so tired at the end of this.\n");
		output.append(getChoices(part2));
		g = t.getText();
		if(g.equals("1")) //Blue Path
		{
			points++;
			output.append("“We have that in common, then! I’m glad to be with you here today.”\n");
			output.append("You and " + GIRL.getName() + " drop your stuff before wading out into the water and spending a fun day in the sun."); 

		}
		else if(g.equals("3") || t.getText().equals("2")) //Green Path
		{
			output.append("“Well you’ve never been with me. We’ll try to change that by the end of the day,” she says with a flirtatious smile.\n");
			output.append("She grabs your hand and pulls you to the water.");

		}
		else //Red Path
		{
			output.append("The force of the frisbee knocks you off your feet. " + GIRL.getName() + "’s face lights up and she begins to laugh uncontrollably. Red-faced, you stand up and pick up the frisbee.\n");
			output.append(getChoices(p2_RED));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“Sorry,” she says, trying to recover, “You should’ve seen the look on your face!” You toss the frisbee back to the middle schoolers before wading into the water with " + GIRL.getName() + "."); // Make this longer
				points += 2;
			}
			else if(g.equals("2"))
			{
				output.append("“Oh my goodness! I’m so sorry!” she says to the middle schooler. She helps him up and demands that you head home early. You should’ve kept your temper in check.");
				points--;
				return points;
			}
			else
			{
				output.append("“Oh my goodness! I’m so sorry!” she says to the middle schooler. She gives him money to buy a new frisbee and demands that you head home early. You should’ve kept your temper in check."); // Make this longer
				points--;
				return points;
			}

		}
		
		// Part 3
		output.append("You and " + GIRL.getName() + " drop your stuff before wading out into the water and spending a fun day in the sun."); 
		output.append(getChoices(part3));
		g = t.getText();
		if(g.equals("1"))
		{
			output.append("“For sure! I had a really good time.”"); // Make this longer
			points++;
			return points;
		}
		else if(g.equals("2"))
		{
			output.append("Rejected. Embarrassed, you run away and drive off. You toss and turn all night thinking about how much of a loser you are.");
			return points;
		}
		else
		{
			output.append("“What a gentleman. I’ll see you soon!”");
			points++;
			return points;
		} 

	}

	public String getChoices(String[] num)
	{
		String output = "";
		for(int i = 1; i < num.length; i++)
		{
			output += i + ". " + num[i-1] + "\n";
		}
		return output;
	}
}