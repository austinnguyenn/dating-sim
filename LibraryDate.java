import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LibraryDate
{

	private JTextArea output;
	private JTextField t;
	private LoveInterest girl;
	private JButton b1;
	private int points;
	private String g;
	private int index;

	public BeachDate(LoveInterest x, JTextArea w, JTextField tt, JButton b)
	{
		girl = x;
		output = w;
		t = tt;
		b1 = b;
		Part1Beach();
	}

	public void Part1Beach()
	{
		String[] part1 =    {"\"Sure. When and where?\"",
				"\"Of course. Are you okay, though?\"",
				"\"Sorry, I would but I’m super busy this week.\"",
		"\"Libraries are for NERDS!\""};

		//Prints the introduction question for Part 1 and its corresponding answers
		output.append("You’re getting a call from " + girl.getName() + ". What could she need? You pick up immediately. \"Hey, uh, I was wondering if you would want to come to the library for a study session with me.\" " + girl.getName() +" sounds kind of nervous while she asks you this.");

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
				if(g.equals("1"))
				{
					points++;
					Part1LibraryA();
				}
				else if(g.equals("2"))
				{
					points++;
					Part1LibraryB();
				}
				else if(g.equals("3"))
				{
					points--;
					Part1LibraryC();
				}
				else if(g.equals("4"))
				{
					points-= 2;
					Part1LibraryD();
				}
			}
		});

	}

	public void Part1LibraryA()
	{
		String[] p1_BLUE = {"\"Sounds good!\"",
		"\"Awesome. You seem a little bit nervous though, are you okay?\""};
		//Prints the path for part 1
		output.append("\"How about this weekend? We can meet after lunch on Saturday at the Hebron and Josey library,\" " + girl.getName() + " says. She still seems kind of nervous.");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points-=1;
					output.append("\n\n\"Confident, are we?\" She opens it and gets out a fork to try a small bite. Her face turns green and she throws up. \"This is disgusting. How can you eat this garbage? I feel sick now, so I’m going to go home.\" She gets up and leave.");
					Part2Picnic();
				}
				else if(g.equals("2"))
				{
					points++;
					output.append("\n\n\"I’m sure it’s great.\" She opens it and gets out a fork to try a small bite. Her face turns green, but for your sake, she swallows it anyways. \"It’s … good, but I’m not really that hungry anymore. You should cook for me more often.\"");
					Part2Picnic();

				}
				else if(g.equals("3"))
				{
					points++;
					output.append("\n\n\"Don’t be so modest. I’m sure it’s great.\" She opens it and gets out a fork to try a small bite. Her face turns green, but for your sake, she swallows it anyways. \"It’s … good, but I’m not really that hungry anymore. You should cook for me more often.\"");

				}

			});
		}
	}

	public void Part1PicnicB()
	{
		String[] p1_BLUE = {"\"I’m an amazing chef. You will like it.\"",
				"\"I hope it turned out good.\" You sweat drop.",
		"\"Don’t get all excited. I’m not that good of a chef.\""};

		output.append("\n\nAn hour later, you’re at the park with " girl.getName() + ". You lay out the blanket while " + girl.getName() + " takes all the contents out of the basket. She comes across the pasta and looks surprised. \"This looks really good. I can’t wait to try this!\"\n");
		output.append(getChoices(p1_BLUE));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points-=1;
					output.append("\n\n\"Confident, are we?\" She opens it and gets out a fork to try a small bite. Her face turns green and she throws up. \"This is disgusting. How can you eat this garbage? I feel sick now, so I’m going to go home.\" She gets up and leave.");
					Part2Picnic();
				}
				else if(g.equals("2"))
				{
					points++;
					output.append("\n\n\"I’m sure it’s great.\" She opens it and gets out a fork to try a small bite. Her face turns green, but for your sake, she swallows it anyways. \"It’s … good, but I’m not really that hungry anymore. You should cook for me more often.\"");
					Part2Picnic();

				}
				else if(g.equals("3"))
				{
					points++;
					output.append("\n\n\"Don’t be so modest. I’m sure it’s great.\" She opens it and gets out a fork to try a small bite. Her face turns green, but for your sake, she swallows it anyways. \"It’s … good, but I’m not really that hungry anymore. You should cook for me more often.\"");

				}
			}
		});
	}

	public void Part1PicnicC()
	{


		output.append("An hour later, you’re at the park with " + girl.getName() + ". You lay out the blanket while " + girl.getName() +" takes all the contents out of the basket. When she gets to the item you bought, she gets up and walks away. We warned you, didn’t we?");
		//GAME CRASHES

	}

	private void Part2Picnic()
	{
		String[] part2 =    {"You shove it off you.",
				"You fall on to your back and rub its back to calm it down.",
				"You scream and act like you’re dying.",
		"You eat it. Again, don’t pick this."};

		//Prints the introduction question for Part 2 and its corresponding answers
		output.append("You both are relaxing on the blanket and talking away. She mentions that she loves flowers, which you make a note of. Suddenly, a frightened dog comes out of nowhere and jumps on you. What do you do?\n");
		output.append(getChoices(part2));

		//Waits here until the button is pressed.
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//Records the Text Field and then clears it.
				g = t.getText();
				t.setText("");

				//Checks which option was chosen.
				if(g.equals("1"))
				{
					points--;
					Part2PicnicA();
				}
				else if(g.equals("2") || g.equals("3"))
				{
					points++;
					Part2PicnicB();
				}
				else if(g.equals("4"))
				{
					output.append("This is illegal. We warned you, didn’t we?");
					//GAME CRASHES
				}
			}
		});
	}

	public void Part2PicnicA()
	{
		String[] p2_RED =   {"\"Yep. Mind if we play with him for a bit?\"",
				"You look at the dog for bit longer before you give him back.",
		"You give him back."};

		output.append("\n\n\"Hey, be nice!\" " + girl.getName() + " starts petting the dog to calm it down. A few seconds later, the owner catches up to you guys. \"Thanks for holding on to him. I just got him and she’s a handful.\" he looks kind of shady to you.\n");

		output.append(getChoices(p2_RED));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points--;
					output.append("\n\n\"Actually, we have to go,\" he tells you. You give him back his dog and he goes on his way. \"Didn’t he seem a bit off to you?\" " +  girl.getName() + " asks. You tell her you didn’t notice anything. \"Let’s just get on with this date.\" \"I’m serious,\" she replies back. \"So am I,\" you reply. She gives up and the date continues.");

				}
				else if(g.equals("2"))
				{
					points+=2;
					output.append("\n\nYou notice that she has a bunch of scars around her neck. You look back at the shady owner and then back at the dog. Something wasn’t right here. You question the owner about it. \"I got him like that from a shelter.\" You could tell he’s lying. You refuse to give the dog back to him until he leaves and call a nearby animal shelter. When they arrive, you give them the dog. \"This dog actually was stolen a while back from us. Thank you so much for your help and finding him!\" You nod. After they leave, " + girl.getName() + " gives you a big hug. \"That was really sweet of you. You’re a good person at heart.\" You hug her back.");

				}
				else if(g.equals("3"))
				{
					points-= 1;
					output.append("\n\nYou give him back his dog and he goes on his way. \"Didn’t he seem a bit off to you?\" " +  girl.getName() + " asks. You tell her you didn’t notice anything. \"Let’s just get on with this date.\" \"I’m serious,\" she replies back. \"So am I,\" you reply. She gives up and the date continues.");
				}
			}
		});
	}
	public void Part2PicnicB()
	{
		String[] p2_BLUE =   {"\"Yep. Mind if we play with him for a bit?\"",
				"You look at the dog for bit longer before you give him back.",
		"You give him back."};

		output.append("\n\n\"Hey, be nice!\" " + girl.getName() + " starts petting the dog to calm it down. A few seconds later, the owner catches up to you guys. \"Thanks for holding on to him. I just got him and she’s a handful.\" he looks kind of shady to you.\n");

		output.append(getChoices(p2_BLUE));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points--;
					output.append("\n\n\"Actually, we have to go,\" he tells you. You give him back his dog and he goes on his way. \"Didn’t he seem a bit off to you?\" " +  girl.getName() + " asks. You tell her you didn’t notice anything. \"Let’s just get on with this date.\" \"I’m serious,\" she replies back. \"So am I,\" you reply. She gives up and the date continues.");

				}
				else if(g.equals("2"))
				{
					points+=2;
					output.append("\n\nYou notice that she has a bunch of scars around her neck. You look back at the shady owner and then back at the dog. Something wasn’t right here. You question the owner about it. \"I got him like that from a shelter.\" You could tell he’s lying. You refuse to give the dog back to him until he leaves and call a nearby animal shelter. When they arrive, you give them the dog. \"This dog actually was stolen a while back from us. Thank you so much for your help and finding him!\" You nod. After they leave, " + girl.getName() + " gives you a big hug. \"That was really sweet of you. You’re a good person at heart.\" You hug her back.");

				}
				else if(g.equals("3"))
				{
					points-= 1;
					output.append("\n\nYou give him back his dog and he goes on his way. \"Didn’t he seem a bit off to you?\" " +  girl.getName() + " asks. You tell her you didn’t notice anything. \"Let’s just get on with this date.\" \"I’m serious,\" she replies back. \"So am I,\" you reply. She gives up and the date continues.");
				}
			}
		});
	}



	public int getPoints()
	{
		return points;
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