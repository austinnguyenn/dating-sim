package dates;

//Teja
//1.0
//5-28-2018

import java.util.concurrent.TimeUnit;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MovieDate
{
	private JTextArea output;
	private JTextField t;
	private LoveInterest GIRL;

	//Part 1 Text
	private String[] part1 =     {"You throw a rock at her window, attempting to let her know you’re there.",
							     "You sneak around the back to surprise her.",
							     "What’s with all of these options. You decide to be a reasonable person and knock on the front door.",
							     "It’s the 21st century. Who even gets out of the car these days? You get back into the car and text her that you’re here."};
	private String[] p1_RED   =  {"You wave indicating that you’re ready to go.",
								 "You point to your phone and make a text gesture.",
								 "You display a grin and lean back on the car."};
	private String[] p1_GREEN =  {"“Uh, hello sir,” you say nervously. “How are you?”",
								 "“Yo! What’s GOUDA?” You panic and make a cheese pun. Are you sure you want to do this?",
								 "You weren’t expecting this! You’re so afraid that you run back to your car and speed away."};
	private String[] p1_ORANGE = {"You turn on the radio and tune in to a station playing some rock and roll.",
								 "You turn on the radio and tune in to a station playing some R&B.",
								 "You don’t do anything letting your anxiety take over."};

	//Part 2 Text
	private String[] part2 =    {"Hold her hand.",
							     "Move her in front of you so she is out of the view of the creeper.",
							     "Give her your jacket."};
	private String[] p2_BLUE =   {"“Get your freaking hands off her you creep!”",
							      "“20 bucks.”"};

	//Part 3 Text
	private String[] part3 = 	{"Of course.",
								 "No thanks."};


	public MovieDate(LoveInterest x, JTextArea w, JTextField tt)
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
		output.append("It was Saturday night. You and " + GIRL.getName() + " had decided to go see one of the new movies that came out recently, and so here you are, parked outside of her house dressed with a light colored hoodie and black jeans. You step out of the car and decide what to do next.\n");
		output.append(getChoices(part1));
		String g = t.getText();
		if(g.equals("1"))
		{
			points++;
			output.append("Nothing happens. She must have not noticed.");
			output.append(getChoices(part1));
			g = t.getText();
			if(g.equals("1"))
			{
				points++;
				output.append("Nothing happens. She must have not noticed.");
				output.append(getChoices(part1));
				g = t.getText();
				if(g.equals("1"))
				{
					points++;
					output.append("" + GIRL.getName() + " finally comes out to her window.");
					output.append(getChoices(p1_RED));
					if(t.getText().equals("1"))
					{
						output.append("She nods and gestures for you to give her a few more minutes. You nod and wait for a bit. Eventually she comes out. “Sorry I made you wait, but I found these!” " + GIRL.getName() + " pulls out 2 coupons for free popcorn and a drink. You smile. Looks like this won’t be such a drain on your wallet after all. You open the door for her in a gentleman like manner. She grins and gets in."); // Make this longer
						points++;
					}
					else if(t.getText().equals("2"))
					{
						output.append("She gets the message and pulls out her phone."); // Make this longer
						points++;
						g = "4";
					}
					else
					{
						output.append("She smiles brightly and waves to you. Before you can do anything, she rushes out of the room and out of the house. “I didn’t realize you were already here. Otherwise, I would’ve come faster.” You tell her it’s fine and open the door for her in a gentleman like manner. She grins and gets in."); // Make this longer
						points++;
					}
				}
			}
		}
		else if(g.equals("2")) //Blue Path
		{
			output.append("You quietly walk into " + GIRL.getName() + "’s house. Luckily the door was unlocked. When you walk into her house, it’s too dark to see anything and you walk into something with an ear splitting crack. The next thing you know " + GIRL.getName() + "’s father yells “Robber!” You begin to hear the crack of a shotgun and everything goes dark.");
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
		else if(g.equals("3")) //Green Path
		{
			output.append("You walk up to " + GIRL.getName() + "’s front door and knock. You hear someone unlock the door and put on your best smile. “Hey " + GIRL.getName() + "--” you begin to say. " + GIRL.getName() + "’s dad stares menacingly back at you!\n");
			output.append(getChoices(p1_GREEN));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“I don’t want whatever the hell you’re selling. GET OUT!” He must’ve mistook you for a salesman, but at least you aren’t getting murdered right now. You take your leave, texting " + GIRL.getName() + " that something came up and you couldn’t take her to the movies."); // Make this longer
				return points;
			}
			else if(g.equals("2"))
			{
				output.append("He lowers his voice. “You’re here for the cheese right? Here, I got the goods.” He gives you a brown smelly paper bag. This probably isn’t something you want to get involved in nor is it something that smells… pleasant. You return it to him and let him know you are waiting for his daughter. Embarrassed, he leaves and goes to fetch her. “Hey!” She pokes her head out of the doorway. You both get into the car and drive off."); // Make this longer
				points++;
			}
			else
			{
				output.append("You go home and text " + GIRL.getName() + " saying that something else came up and you couldn’t take her to the movies. You draw a warm bath and try to stop the shivering…"); // Make this longer
				points -= 2;
				return points;
			}

		}
		if(g.equals("4")) //Yellow Path
		{
			output.append("She responds quickly, texting you that she needs a moment to finish getting ready. You decide to wait for her, but after 5 minutes, anxiety starts to set in. Holy shoot you’re actually going on a date. No on every thought this would happen in their wildest dreams. You need to calm down before she gets here.\n");
			output.append(getChoices(p1_ORANGE));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("After another 2 minutes, " + GIRL.getName() + " comes out and gets in the passenger seat. Your nerves have calmed down and things seem to be going well."); // Make this longer
				points++;
				if(" + GIRL.getName() + ".equals("Shailene"))
				{
					output.append("“I love this song!” She starts to sing along as you back out of the driveway and start heading out to the movies.");
					points++;
				}
				
			}
			else if(g.equals("2"))
			{
				output.append("After another 2 minutes, " + GIRL.getName() + " comes out and gets in the passenger seat. Your nerves have calmed down and things seem to be going well.");
				points++;
				if(" + GIRL.getName() + ".equals("Clair"))
				{
					output.append("“I love this song!” She starts to sing along as you back out of the driveway and start heading out to the movies.");
					points++;
				}
			}
			else
			{
				output.append("After another 2 minutes, " + GIRL.getName() + " comes out and gets in the passenger seat. You start to panic. You’re actually on a date with her. " + GIRL.getName() + ". This is the best day of your life! Don’t ruin by not doing anything. But no matter what you try, you can’t move. You start to say something, but it comes out as a stutter. Thankfully " + GIRL.getName() + " takes notice. “Don’t worry, I’m nervous too.” She smiles and grabs on to your hand to calm you down. “It’ll be fun though so let’s go! I don’t want to miss the movie.” You relax and " + GIRL.getName() + " turns on the radio to "); // Make this longer
				if(" + GIRL.getName() + ".equals("Clair"))
				{
					output.append("the R&B station.");
				}
				else
				{
					output.append("the Rock & Roll station.");
				}
				output.append(" I love this song! She starts to sing along as you back out of the driveway and start heading out to the movies. ");
				points += 3;
			}

		}

		// Part 2
		output.append("You get to the movies, and decide to watch The Emoji Movie. While waiting in line at the crowded concession stand, you see a shady man standing in the back of the room. He was wearing a hoodie, so his eyes were covered. " + GIRL.getName() + " sees him too and shivers a bit. Maybe she feels uncomfortable. You don’t know if she does, but you do know that you have to do something.\n");
		output.append(getChoices(part2));
		g = t.getText();
		if(g.equals("1")) //Red Path
		{
			points++;
			output.append("She looks up and smiles, but you keep looking away, obviously embarrassed. She squeezes your hand a little bit, reassured now that you’re there with her. You end up buying a medium popcorn to share along with 2 drinks. The creeper seems to have left. You smile and while still holding hands, both of you enter theatre 12 and take your seats just in time for the movie to start.\n");

		}
		else if(g.equals("2")) //Green Path
		{
			points++;
			output.append("“T-Thanks.” She smiles a little bit, reassured now that you’re there to protect her. You end up buying a medium popcorn to share along with 2 drinks. The creeper seems to have left. You smile and both of you enter theatre 12 and take your seats just in time for the movie to start.\n");
		}
		else //Blue Path
		{
			output.append("She declines the offer, still shivering. You don’t understand why. Shivering = cold, right? After buying a medium popcorn to share along with 2 drinks, you enter theatre 12 just in time for the movie to start. You both take your seats, intently watching the movie. However, about half-way through the movie, you feel an additional hand touch your shoulder. You look around to see it was the creeper dude, still wearing his hoodie so his face was covered. He also had his other hand on GIRL’s shoulder, which kinda pissed you off. “I want your girl. How much does she cost?” This really pissed you off.\n");
			output.append(getChoices(p2_BLUE));
			g = t.getText();
			if(g.equals("1"))
			{
				output.append("“Wait, she’s your " + GIRL.getName() + "? I didn’t think ugly guys like you could get anyone that hot. “Don’t talk to him like that you monster.” The commotion attracted the unwanted attention of many of the other movie goers there. She then looks at you, her eyes seeming to tell you that she’d rather be anywhere else but here. You take her hand and leave the movie. It wasn’t worth it to see that movie anyways."); // Make this longer
			}
			else
			{
				output.append("" + GIRL.getName() + " looks shocked and hurt. “You should rot in a jail cell for choosing that option.” She then slaps you across the face. “I thought you were better than that.”"); // Make this longer
				try {
					TimeUnit.MILLISECONDS.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}

		}
		
		// Part 3
		output.append("You both exit the theatre. The movie was really bad, but you’re glad you got to spend time with " + GIRL.getName() + " and that she was safe. You open the door to the passenger seat of the car for her again, emulating a butler. “Why thank you kind sir.” She gets in and you close the door behind. You then get in yourself and driver her home. “I had a lot of fun today,” she tells you at her doorstep. “Let’s do this again, okay?”"); 
		output.append(getChoices(part3));
		g = t.getText();
		if(g.equals("1"))
		{
			output.append("She smiles before she pulls out a key to enter her house. You start walking back to your car, smiling like an idiot."); // Make this longer
			points++;
			return points;
		}
		else
		{
			output.append("Well, if that’s how you feel, we don’t want to waste your time. Thanks for playing.");
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		} 
		return points;

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
