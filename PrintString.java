

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Container;
import java.util.*;



public class PrintString {

	private static JFrame ProjectPlaceholdText;
	private static String text;
	private static JTextArea textArea;
	private int count = 0;
	private int choice;
	private String ans = new String("");
	private ArrayList<String> list = new ArrayList<String>();
	private JTextField textField;
	private LoveInterest waifu;
	private MovieDate m;
	private String pS ="";
	private ImageIcon img;
	private JLabel label;

	private String[] claireBeachDate = {"beachClairehappy.png","beachClaireMad","beachClaireSad","claireBeachDef"};
	private String[] shaileneBeachDate = {"beachShahappy.png","beachShaMad","beachShaSad","claireShaDef"};

	private String[] claireLibraryDate = {"libraryClairehappy.png","libraryClaireMad","libraryClaireSad","libraryBeachDef"};
	private String[] shaileneLibraryDate = {"libraryShahappy.png","libraryShaMad","libraryShaSad","libraryShaDef"};

	private String[] claireMovieDate = {"movieClairehappy.png","movieClaireMad","movieClaireSad","movieClaireDef"};
	private String[] shaileneMovieDate = {"movieShahappy.png","movieShaMad","movieShaSad","movieShaDef"};

	private String[] clairePicnicDate = {"picnicClairehappy.png","picnicClaireMad","picnicClaireSad","picnicClaireDef"};
	private String[] shailenePicnicDate = {"picnicShahappy.png","picnicShaMad","picnicShaSad","picnicShaDef"};
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				PrintString w = new PrintString();
				w.initialize("title.png");

			}
		});
	}

	/**
	 * Create the application.
	 */
	

	/**
	 * Initialize the contents of the frame.
	 */

	public void initialize(String pic)
	{



		img = new ImageIcon(pic);
		ImageIcon img2 = new ImageIcon("beachClaireHappy.png");
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		list.add("");





		ProjectPlaceholdText = new JFrame();
		ProjectPlaceholdText.setBounds(0, 0, 716, 702);


		ProjectPlaceholdText.getContentPane().setLayout(null);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(0, 506, 700, 134);
		ProjectPlaceholdText.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.append("Which girl would you like to date?\n\n");
		textArea.append("Shailene is a quiet, scholarly, brunette student. She is an avid student, but don’t that fool you! She is a huge basketball fan\n and hasn’t missed a Hawks match since middle school.\n");
		textArea.append("Claire is an outgoing, friendly, blond. She loves meeting new people and trying new things and is great at making friends \nwherever she goes.\n");



		label = new JLabel(img);
		label.setBounds(0, 0, 700, 509);
		ProjectPlaceholdText.getContentPane().add(label);

		textField = new JTextField();
		textField.setBounds(0, 644, 611, 20);
		ProjectPlaceholdText.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(611, 643, 89, 23);
		ProjectPlaceholdText.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				waifu = new LoveInterest(textField.getText());
				DateTesting x = new DateTesting(waifu,textArea,textField,btnNewButton);

			}
		});













		ProjectPlaceholdText.setVisible(true);











	}






	public JTextArea getTextArea()
	{
		return textArea;
	}
	public String getAns()
	{
		return list.get(list.size()-1);
	}
	public void changeBeachClaire(String choice)
	{
		
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(claireBeachDate[0]);
			label.setIcon(img);
		}
			
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(claireBeachDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(claireBeachDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(claireBeachDate[3]);
			label.setIcon(img);
		}
	}
	public void changeBeachSha(String choice)
	{
		
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(shaileneBeachDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(shaileneBeachDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(shaileneBeachDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(shaileneBeachDate[3]);
			label.setIcon(img);
		}
	}
	public void changeLibraryClaire(String choice)
	{
		
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(claireLibraryDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(claireLibraryDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(claireLibraryDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(claireLibraryDate[3]);
			label.setIcon(img);
		}
	}
	public void changeLibrarySha(String choice)
	{
		
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(shaileneLibraryDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(shaileneLibraryDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(shaileneLibraryDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(shaileneLibraryDate[3]);
			label.setIcon(img);
		}
	}

	public void changeMovieClaire(String choice)
	{
		
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(claireMovieDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(claireMovieDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(claireMovieDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"));
		{
			img = new ImageIcon(claireMovieDate[3]);
			label.setIcon(img);
		}
	}
	public void changeMovieSha(String choice)
	{
		img = new ImageIcon(choice);
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(shaileneMovieDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(shaileneMovieDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(shaileneMovieDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(shaileneMovieDate[3]);
			label.setIcon(img);
		}
	}

	public void changePicnicClaire(String choice)
	{
		img = new ImageIcon(choice);
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(clairePicnicDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(clairePicnicDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(clairePicnicDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(clairePicnicDate[3]);
			label.setIcon(img);
		}
	}
	public void changePicnicSha(String choice)
	{
		img = new ImageIcon(choice);
		if(choice.equalsIgnoreCase("happy"))
		{
			img = new ImageIcon(shailenePicnicDate[0]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("mad"))
		{
			img = new ImageIcon(shailenePicnicDate[1]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("sad"))
		{
			img = new ImageIcon(shailenePicnicDate[2]);
			label.setIcon(img);
		}
		if(choice.equalsIgnoreCase("def"))
		{
			img = new ImageIcon(shailenePicnicDate[3]);
			label.setIcon(img);
		}
	}
}
