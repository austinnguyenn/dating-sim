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
	
	//Part 1 Text
	private String[] part1 =    {"\"Wow, Claire ! You look great in that swimsuit. This is probably the best day of my life!\"",
		     "\"Hey Claire! I'm glad you agreed to come to the beach with me!\"",
		     "*You step out of the car and trip on nothing*",
		     "\"You couldn't have worn something to show a little bit more skin?\""};
	private String[] p1_BLUE =  {"You offer to take her bag and head to the beach.",
			 "You begin to run to the beach and wave her to follow.",
			 "Your swim trunks are trapped in the car door and rip off as you head toward Claire."};
	private String[] p1_GREEN = {"You get up, shake the sand off your legs, and thank Claire. You walk down toward the water with her.",
			 "You bat her hand away, get up yourself, and walk to the beach with your nose in the air.",
			 "You get up and begin to cry before running to the restroom to be alone."};
	private String[] p1_RED =   {"\"Sorry, it just slipped out. I didn't mean it!\"",
			 "\"You heard what I said! Next time wear something else or I won't invite you out again.\"",
			 "\"I didn't mean it. It was a bad joke.\""};

	//Part 2 Text
	private String[] part2 =    {"\"The beach is great! I've always loved coming here with my family.\"",
		     "\"The beach is okay, I guess.\"",
		     "\"To be honest, I hate the beach. I only invited you here because I thought you would like it.\"",
		     "You begin to respond but are beaned by the poorly thrown frisbee of some loser middle schoolers."};
	private String[] p2_RED =   {"You decide to be a good sport about it and laugh along with Claire.",
		     "Angry, you pick up the frisbee and chuck it back at one of the middle schoolers, hitting him in the nose and knocking him over.",
		     "\"Nice throw!\" you sarcastically exclaim. You break the frisbee on your knee and throw it to the ground."};

	//Part 3 Text
	private String[] part3 = 	{"\"Goodnight, Claire,\" you say. \"I had a great time. I'll see you soon?\" you ask.",
			 "You try to go in for a kiss.",
			 "You walk Claire to her car and open the door for her."};

	public void part1Beach()
	{
		//Prints the introduction question for Part 1 and its corresponding answers
		output.append("You head to Lake Lewisville with GIRL. It’s not a real beach but it’s the closest thing you have nearby. As you pull in, you look over and see GIRL in a swimsuit! Wow! This is probably the best day of your life.\n");
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
					output.append("" + Integer.parseInt(g));
					//Prints the path for part 1 or part 2
					output.append("\n\nPath A:");
					output.append("Answers PA.\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path A:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path A:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path A:");
							}
						}
					});
				}
				else if(g.equals("3"))
				{
					output.append("\n\nPath C:");
					output.append("Answers PC\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path C:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path C:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path C:");
							}
						}
					});
				}
				else if(g.equals("4"))
				{
					output.append("\n\nPath D:");
					output.append("Answers PD.\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path D:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path D:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path D:");
							}
						}
					});
				}
			}
		});
		
		//part2Beach();
	}
	
	/*public void part2Beach()
	{
		output.append("\n\nQuestion 1:");
		output.append("Answers 1.\n");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					output.append("\n\nPath A:");
					output.append("Answers PA.\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path A:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path A:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path A:");
							}
						}
					});
				}
				else if(g.equals("2"))
				{
					output.append("\n\nPath B:");
					output.append("Answers PB.\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path B:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path B:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path B:");
							}
						}
					});
				}
				else if(g.equals("3"))
				{
					output.append("\n\nPath C:");
					output.append("Answers PC\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path C:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path C:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path C:");
							}
						}
					});
				}
				else if(g.equals("4"))
				{
					output.append("\n\nPath D:");
					output.append("Answers PD.\n");
					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent event)
						{
							g = t.getText();
							t.setText("");
							if(g.equals("1"))
							{
								output.append("R1Path D:");
							}
							else if(g.equals("2"))
							{
								output.append("R2Path D:");
							}
							else if(g.equals("3"))
							{
								output.append("R3Path D:");
							}
						}
					});
				}
			}
		});
	}*/
	
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