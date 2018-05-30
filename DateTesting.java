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
	private LoveInterest GIRL;
	private JButton b1;
	private int points;
	private String g;

	public DateTesting(LoveInterest x, JTextArea w, JTextField tt, JButton b)
	{
		GIRL = x;
		output = w;
		t = tt;
		b1 = b;
		part1();
	}

	public void part1()
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
	}

}