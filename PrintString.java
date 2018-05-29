

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
	private int count;
	private int choice;
	private String ans = new String("");
	private ArrayList<String> list = new ArrayList<String>();
	private JTextField textField;




	/**
	 * Launch the application.
	 */
	public  static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				PrintString w = new PrintString();
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrintString() {
		initialize("beach.jpg");


	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(String pic)
	{

		

		ImageIcon img = new ImageIcon(pic);
		Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
		list.add("");





		ProjectPlaceholdText = new JFrame();
		ProjectPlaceholdText.setBounds(0, 0, 716, 702);


		ProjectPlaceholdText.getContentPane().setLayout(null);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(0, 549, 700, 91);
		ProjectPlaceholdText.getContentPane().add(scrollPane);
		
				textArea = new JTextArea();
				scrollPane.setViewportView(textArea);
				textArea.append("Do you think shailene woodley is hot?");


		JLabel label = new JLabel(img);
		label.setBounds(0, 0, 696, 538);
		ProjectPlaceholdText.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setBounds(0, 644, 611, 20);
		ProjectPlaceholdText.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(611, 643, 89, 23);
		ProjectPlaceholdText.getContentPane().add(btnNewButton);
		pic p = new pic(btnNewButton,textField,textArea);
		













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
}
