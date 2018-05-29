package dates;

//Teja
//1.1
//5-28-2018

import java.util.concurrent.TimeUnit;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BeachDate
{
	private JTextArea output;
	private JTextField t;
	private LoveInterest GIRL;

	//Part 1 Text
	private String[] part1 =    {"“Wow, " + GIRL.getName() + "! You look great in that swimsuit. This is probably the best day of my life!”",
							     "“Hey " + GIRL.getName() + "! I’m glad you agreed to come to the beach with me!”",
							     "*You step out of the car and trip on nothing*",
							     "“You couldn’t have worn something to show a little bit more skin?”"};
	private String[] p1_BLUE =  {"You offer to take her bag and head to the beach.",
								 "You begin to run to the beach and wave her to follow.",
								 "Your swim trunks are trapped in the car door and rip off as you head toward " + GIRL.getName() + "."};
	private String[] p1_GREEN = {"You get up, shake the sand off your legs, and thank " + GIRL.getName() + ". You walk down toward the water with her.",
								 "You bat her hand away, get up yourself, and walk to the beach with your nose in the air.",
								 "You get up and begin to cry before running to the restroom to be alone."};
	private String[] p1_RED =   {"“Sorry, it just slipped out. I didn’t mean it!”",
								 "“You heard what I said! Next time wear something else or I won’t invite you out again.”",
								 "“I didn’t mean it. It was a bad joke.”"};

	//Part 2 Text
	private String[] part2 =    {"“The beach is great! I’ve always loved coming here with my family.”",
							     "“The beach is okay, I guess.”",
							     "“To be honest, I hate the beach. I only invited you here because I thought you would like it.”",
							     "You begin to respond but are beaned by the poorly thrown frisbee of some loser middle schoolers."};
	private String[] p2_RED =   {"You decide to be a good sport about it and laugh along with " + GIRL.getName() + ".",
							     "Angry, you pick up the frisbee and chuck it back at one of the middle schoolers, hitting him in the nose and knocking him over.",
							     "“Nice throw!” you sarcastically exclaim. You break the frisbee on your knee and throw it to the ground."};

	//Part 3 Text
	private String[] part3 = 	{"“Goodnight, " + GIRL.getName() + ",” you say. “I had a great time. I’ll see you soon?” you ask.",
								 "You try to go in for a kiss.",
								 "You walk " + GIRL.getName() + " to her car and open the door for her."};


	public BeachDate(LoveInterest x, JTextArea w, JTextField tt)
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
		output.append("You head to Lake Lewisville with " + GIRL.getName() + ". It’s not a real beach but it’s the closest thing you have nearby. As you pull in, you look over and see " + GIRL.getName() + " in a swimsuit! Wow! This is probably the best day of your life.\n");
		output.append(getChoices(part1)); 
		String g = t.getText();
		if(g.equals("1") || g.equals("2")) //Blue Path
		{
			points++;
			output.append("“Thanks!” she responds, “I’m glad you invited me.”\n");
			output.append(getChoices(p1_BLUE)); 
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“Thank you. Such a gentleman!”"); // Make this longer
				points++;
			}
			else if(g.equals("2"))
			{
				output.append("She giggles playfully and follows."); // Make this longer
				points++;
			}
			else
			{
				output.append("“Oh my gosh! I didn’t need to see that!” exclaims " + GIRL.getName() + ". You quickly cover up and head home early, dejected."); // Make this longer
				points -= 2;
				return points;
			}

		}
		else if(g.equals("3")) //Green Path
		{
			output.append("" + GIRL.getName() + " giggles and walks over to offer you some help.\n");
			output.append(getChoices(p1_GREEN));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“We all have accidents sometimes! No worries!” she encourages you."); // Make this longer
				points++;
			}
			else if(g.equals("2"))
			{
				output.append("“Alright then,” " + GIRL.getName() + " says."); // Make this longer
				points--;
			}
			else
			{
				output.append("After sitting in the restroom for a while crying your eyes out, you walk out and find that it’s now dark. “" + GIRL.getName() + "?” you call, looking for her. You don’t see anyone at the lake and decide to head home and continue to be alone. " + GIRL.getName() + " must be so disappointed."); // Make this longer
				points -= 2;
				return points;
			}

		}
		else //Yellow Path
		{
			points--;
			output.append("“How dare you!” " + GIRL.getName() + " says, outraged. “I didn’t think you were this much like Quin!”\n");
			output.append(getChoices(p1_RED));
			g = t.getText();
			if(g.equals("1"))
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
		output.append("The beach! What a great idea. You mentally pat yourself on the back as you and " + GIRL.getName() + " walk to the shoreline. She kicks off her sandals so she can feel the sand under her feet. “This is awesome. I love going to the beach. What about you?”\n");
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
