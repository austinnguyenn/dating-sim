import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DateTesting
{

	private JTextArea output;
	private JTextField t;
	private LoveInterest girl;
	private JButton b1;
	private int points;
	private String g;
	private int index;

	public DateTesting(LoveInterest x, JTextArea w, JTextField tt, JButton b)
	{
		girl = x;
		output = w;
		t = tt;
		b1 = b;
		part1Beach();
	}

	//Part 2 Text
	/*
	String[] part2 =    {"\"The beach is great! I've always loved coming here with my family.\"",
		     "\"The beach is okay, I guess.\"",
		     "\"To be honest, I hate the beach. I only invited you here because I thought you would like it.\"",
		     "You begin to respond but are beaned by the poorly thrown frisbee of some loser middle schoolers."};
	String[] p2_RED =   {"You decide to be a good sport about it and laugh along with " + girl.getName() + ".",
		     "Angry, you pick up the frisbee and chuck it back at one of the middle schoolers, hitting him in the nose and knocking him over.",
		     "\"Nice throw!\" you sarcastically exclaim. You break the frisbee on your knee and throw it to the ground."};

	//Part 3 Text
	String[] part3 = 	{"\"Goodnight, " + girl.getName() + ",\" you say. \"I had a great time. I'll see you soon?\" you ask.",
			 "You try to go in for a kiss.",
			 "You walk " + girl.getName() + " to her car and open the door for her."};
	*/

	public void part1Beach()
	{
		String[] part1 =    {"\"Wow, " + girl.getName() + "! You look great in that swimsuit. This is probably the best day of my life!\"",
			     "\"Hey " + girl.getName() + "! I'm glad you agreed to come to the beach with me!\"",
			     "You step out of the car and trip on nothing",
			     "\"You couldn't have worn something to show a little bit more skin?\""};
		
		//Prints the introduction question for Part 1 and its corresponding answers
		output.append("You head to Lake Lewisville with " + girl.getName() + ". It's not a real beach but it's the closest thing you have nearby. As you pull in, you look over and see " + girl.getName() + " in a swimsuit! Wow! This is probably the best day of your life.\n");
		output.append(getChoices(part1) + "\n");
		
		//Waits here until the button is pressed.
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//Records the Text Field and then clears it.
				g = t.getText();
				t.setText("");
				
				//Checks which option was chosen.
				if(g.equals("1") || (g.equals("2")))
				{
					Part1BeachA();
				}
				else if(g.equals("3"))
				{
					Part1BeachB();
				}
				else if(g.equals("4"))
				{
					Part1BeachC();
				}
			}
		});
		
		//part2Beach();
	}
	
	public void Part1BeachA()
	{
		String[] p1_BLUE =  {"You offer to take her bag and head to the beach.",
				 "You begin to run to the beach and wave her to follow.",
				 "Your swim trunks are trapped in the car door and rip off as you head toward " + girl.getName() + "."};
		
		//Prints the path for part 1 or part 2
		output.append("\n\n\"Thanks!\" she responds, \"I'm glad you invited me.\"\n");
		output.append(getChoices(p1_BLUE));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					output.append("\n\n\"Thank you. Such a gentleman!\"");
				}
				else if(g.equals("2"))
				{
					output.append("\n\nShe giggles playfully and follows.");
				}
				else if(g.equals("3"))
				{
					output.append("\n\n\"Oh my gosh! I didn't need to see that!\" exclaims " + girl.getName() + ". You quickly cover up and head home early, dejected.");
				}
			}
		});
	}
	
	public void Part1BeachB()
	{
		String[] p1_GREEN = {"You get up, shake the sand off your legs, and thank " + girl.getName() + ". You walk down toward the water with her.",
				 "You bat her hand away, get up yourself, and walk to the beach with your nose in the air.",
				 "You get up and begin to cry before running to the restroom to be alone."};
		
		output.append("\n\n" + girl.getName() + " giggles and walks over to offer you some help.\n");
		output.append(getChoices(p1_GREEN));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					output.append("\n\n\"We all have accidents sometimes! No worries!\" she encourages you.");
				}
				else if(g.equals("2"))
				{
					output.append("\n\n\"Alright then,\" " + girl.getName() + " says.");
				}
				else if(g.equals("3"))
				{
					output.append("\n\nAfter sitting in the restroom for a while crying your eyes out, you walk out and find that it's now dark. \"" + girl.getName() + "?\" you call, looking for her. You don't see anyone at the lake and decide to head home and continue to be alone. " + girl.getName() + " must be so disappointed.");
				}
			}
		});
	}
	
	public void Part1BeachC()
	{
		String[] p1_RED =   {"\"Sorry, it just slipped out. I didn't mean it!\"",
				 "\"You heard what I said! Next time wear something else or I won't invite you out again.\"",
				 "\"I didn't mean it. It was a bad joke.\""};
		
		output.append("\n\n\"How dare you!\" " + girl.getName() + " says, outraged. \"I didn't think you were this much like Quin!\"\n");
		output.append(getChoices(p1_RED));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					output.append("\n\n\"Alright, but you better be more respectful,\" she says suspiciously. You apologize again and walk to the water next to her.");
				}
				else if(g.equals("2"))
				{
					output.append("\n\n\"That's it! You're the worst. I never want to talk to you again.\" You really suck at this. We'll just end the game here and save you the pain.");
				}
				else if(g.equals("3"))
				{
					output.append("\n\n\"Alright, but you better be more respectful,\" she says suspiciously. You apologize again and walk to the water next to her.");
				}
			}
		});
	}	
	
	
	public String getChoices(String[] num)
	{
		String output = "";
		for(int i = 1; i <= num.length; i++)
		{
			output += i + ". " + num[i-1] + "\n";
		}
		return output;
	}

}