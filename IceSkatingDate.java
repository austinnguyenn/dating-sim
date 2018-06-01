import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class IceSkatingDate
{
	
	private JTextArea output;
	private JTextField t;
	private LoveInterest girl;
	private JButton b1;
	private int points;
	private String g;
	private int index;

	public IceSkatingDate(LoveInterest x, JTextArea w, JTextField tt, JButton b)
	{
		girl = x;
		output = w;
		t = tt;
		b1 = b;
		Part1IceSkating();
	}

	public void Part1IceSkating()
	{
		String[] part1 =    {"Claire! You look really cute in those winter clothes!",
			     "You sneak up behind her and grab the pom pom hat that she’s wearing.",
			     "You walk up behind Claire and put your arms around her."};

		//Prints the introduction question for Part 1 and its corresponding answers
		output.append("When you were younger, you loved watching the professional ice skaters during the Winter Olympics, so you are well acquainted with ice skating. You pull on a sweater, warm pants, a winter jacket, and a beanie and drive to the ice skating rink.\n\nAs you walk into the rink, you spot Claire’s blond hair and walk toward her. She looks very cute in her warm clothing.\n");
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
					Part1IceSkatingA();
				}
				else if(g.equals("2"))
				{
					points++;
					Part1IceSkatingB();
				}
				else if(g.equals("3"))
				{
					Part1IceSkatingC();
				}
			}
		});

	}

	public void Part1IceSkatingA()
	{
		String[] p1_BLUE =  {"\"To be honest, I walked out of my house wearing shorts before remembering that it was 40 degrees,\" you joke.",
				 "You get her a cup of hot chocolate to warm her up.",
				 "You do not respond because you’re staring at her face."};

		//Prints the path for part 1 or part 2
		output.append("\n\n\"Thanks! I’ve been waiting to wear these clothes for a while. You know how Texas summers are.\" Her cheeks are red from the cold and you can see her breath clouding up in the frozen air.\n");
		output.append(getChoices(p1_BLUE));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points++;
					output.append("\n\nShe giggles and rolls her eyes. \"And I wore my bikini outside before I checked the weather,\" she responds.");
					Part2IceSkating();
				}
				else if(g.equals("2"))
				{
					points+=2;
					output.append("\n\n“Thanks so much!” She takes the cup of hot chocolate gratefully. “You’re too kind.” You’ve never been more proud of yourself.");
					Part2IceSkating();
				}
				else if(g.equals("3"))
				{
					output.append("\n\nShe waves a hand in front of your face. “Hello? Anyone home? I know I’m pretty but you don’t have to stare!” You snap out of your stupor and smile sheepishly. She has a smirk and seems quite proud of herself for some reason.");
				}
			}
		});
	}

	public void Part1IceSkatingB()
	{
		String[] p1_ORANGE = {"You smile and return her hat.",
				 "You decide to continue to tease her and run away with her hat.",
				 "You put the hat back on her head for her."};

		output.append("\n\nShe whirls around, looking for her hat. When she sees that you have it, she blushes and puts her hand out to get it back.\n");
		output.append(getChoices(p1_ORANGE));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					points++;
					output.append("\n\n“Thank you,” she says, putting her hat back on with a smile. “Next time just tap me on the shoulder!” she jokes.");
					Part2IceSkating();
				}
				else if(g.equals("2"))
				{
					points++;
					output.append("\n\n“Hey!” she chases after you. You lead her around the rink before trapping yourself at a dead end. She snatches her hat back and puts it back on with a smile. She playfully punches your arm and you walk to pick up your ice skates with her.");
					Part2IceSkating();

				}
				else if(g.equals("3"))
				{
					points++;
					output.append("\n\nShe laughs as you shove the hat onto her head, pushing her hair every which way. “Thanks. At least the mess is hidden under my hat!” she jokes.");

				}
			}
		});
	}

	public void Part1IceSkatingC()
	{
		String[] p1_GREEN =   {"You begin to deny.",
		 "You smile confidently and say \"Get used to it, toots!\""};

		output.append("\n\n“Guess who?” you tease. \nA distinctly manly voice responds “Bro, what are you doing?” You look more closely at “Claire” and see a guy staring back at you! \n“My bad! Wrong person!” \nClaire walks up behind you. “Uh, I didn’t think you liked guys. I’m not judging you since it’s 2018 and everything, but I just wasn’t expecting it.”\n");
		output.append(getChoices(p1_GREEN));
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				g = t.getText();
				t.setText("");
				if(g.equals("1"))
				{
					output.append("\n\nClaire cuts you off. “I get that it’s hard to admit this kind of thing, but I’m here for you. Why don’t you head home and think it off?”You can’t really get a word out, so you head home to be alone. We didn’t really know this about you either. You must have been so uncomfortable playing this game! We’ll end it here to save you a bit of suffering. Good luck in life!");
					// Game Crashes
					
				}
				else if(g.equals("2"))
				{
					output.append("\n\nYou turn to the surprised, long-haired man that you put your arms around. “Sorry man, I thought you were someone else!” You turn back to Claire and say that it was a simple mistake. She rolls her eyes and you two walk off to pick up ice skates.");
					Part2IceSkating();
				}
			}
		});
	}

	private void Part2IceSkating()
	{
		String[] part2 =    {"You pull her out of harm’s way.",
			     "You tackle Claire in order to get her out of the man’s flight path.",
			     "You do nothing, afraid of getting hurt."};

		//Prints the introduction question for Part 2 and its corresponding answers
		output.append("After picking up the ice skates, you and Claire hit the ice. It’s very relaxing skating in circles on this white expanse. A teenager is skating in the center of the rink, showing off the tricks that he can perform. It seems like he’s trying to impress Claire! You watch, annoyed, as he takes a large approach and jumps into an intricate spin. It looks like he’s going to fall right into Claire!\n");
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
					points++;
					output.append("“Are you okay?” you ask. “That guy was getting too confident. You could’ve been badly hurt!”\n“I’m okay,” she responds, out of breath. “Good thing you were there to protect me.” You notice that you still have your arms around Claire and let go immediately. She blushes and begins to continue skating.\n\nYou’ve never been that close to Claire before. Actually, when you think about it, you’ve never been that close to a girl before! Your animal magnetism is finally beginning to shine through. Your self-confidence has never been better. You feel like you could take on the world! You smile and skate on!");
					Part3IceSkating();
				}
				else if(g.equals("2"))
				{
					points++;
					output.append("\n\n“Are you okay?” you ask as you stand up and help Claire up. “That guy was getting too confident. You could’ve been badly hurt!”\n“I’m okay,” she responds, out of breath. “Good thing you were there to protect me.” She’s still clasping your hand like a lifeline, and you don’t really mind it.\n\nYou’ve never been that close to Claire before. Actually, when you think about it, you’ve never been that close to a girl before! Your animal magnetism is finally beginning to shine through. Your self-confidence has never been better. You feel like you could take on the world! You smile and skate on!");
					Part3IceSkating();
				}
				else if(g.equals("3"))
				{
					points--;
					output.append("\n\nLuckily, the man wipes out and falls out of the way of Claire. Unluckily, she looks really upset that he fell down. She quickly goes to help him up and puts a lot more care into it than you would like. You should’ve done something that would’ve kept her attention on you!\n\nYou decide to try to recover the situation. “Claire, are you okay?” you ask. “Your name is Claire?” asks the show-off. Claire blushes and says yes. “What a beautiful name, perfect for a beautiful girl. What are the Chances that we met like this, love?” Claire looks like she’s in love. She turns to you and says “Hey, I’ll talk to you at school, okay?” It hurts, but what can you do? You fake a smile, nod, and head home early.");
					Part3IceSkating();
				}
			}
		});
	}

	public void Part3IceSkating()
	{
		String[] part3 ={"You ask her to open the hood so you can take a look.",
				 "You pull out your phone to call her an Uber.",
				 "You suggest calling her parents for a ride.",
				 "You offer to drive her home."};

		//Prints the introduction question for Part 3 and its corresponding answers
		output.append("\n\nIt’s been a great time ice skating, but the rink is closing. You leave the rink with Claire, walking a little more closely than necessary, but who cares? You walk her to her car and wait for her to drive away. You wait, and wait, and wait…\n\nShe emerges from her car, “It won’t start. I guess this old rustbucket finally gave up in the cold.”\n");
		output.append(getChoices(part3));

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
					points += 2;
					output.append("\n\nShe opens the hood, and you bend down to take a look. You have no idea what’s wrong. You don’t even know why you thought asking her to open the hood for you was a good idea. You decide to offer her a ride home. She rolls her eyes and smiles as you close the trunk.");	
					output.append("\n\nClaire lives on the other side of town, but who even cares? Anything to spend more time with her. She accepts your offer. You start to walk toward your car before you feel something warm between your fingers. Claire has taken your hand! You smile as she leans into you and you walk into the night.\n");
				}
				else if(g.equals("2"))
				{
					output.append("\n\nClaire thanks you for the evening and hops into the Uber. You watch it drive off before heading home yourself. That night, you fall asleep with a smile knowing that you went on a successful date today!");
				}
				else if(g.equals("3"))
				{
					points++;
					output.append(" “Good idea,” she says. You stay and wait with her while her dad comes to pick her up. You watch them drive off before heading home yourself. That night, you fall asleep with a smile knowing that you went on a successful date today!");
				}
				else if(g.equals("4"))
				{
					points += 2;
					output.append("Claire lives on the other side of town, but who even cares? Anything to spend more time with her. She accepts your offer. You start to walk toward your car before you feel something warm between your fingers. Claire has taken your hand! You smile as she leans into you and you walk into the night.");
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