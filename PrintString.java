

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
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class PrintString {

	private static JFrame ProjectPlaceholdText;
	private static JTextField textField;
	private static String text;
	private static JTextArea textArea;
	

	

	/**
	 * Launch the application.
	 */
	public  static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					PrintString window = new PrintString();
					window.ProjectPlaceholdText.setTitle("ProjectPlaceholderText");
					window.ProjectPlaceholdText.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrintString() {
		initialize("flag-e.jpg");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String pic)
		{
		
			ImageIcon img = new ImageIcon(pic);
			Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
			
			
		
			ProjectPlaceholdText = new JFrame();
			ProjectPlaceholdText.setBounds(0, 0, 716, 702);
			
			
			ProjectPlaceholdText.getContentPane().setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(0, 642, 607, 20);
		
			ProjectPlaceholdText.getContentPane().add(textField);
			textField.setColumns(10);
			textField.setBorder(border);

			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
			scrollPane.setBounds(0, 497, 700, 141);
			ProjectPlaceholdText.getContentPane().add(scrollPane);
			
			JButton EnterBtn = new JButton("Enter");
			EnterBtn.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent evt) {
				String word = textField.getText();
				try {
					stringdelay.printWithDelays(word, 1000,textArea);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
			);
			
			
			
			EnterBtn.setBounds(607, 642, 93, 20);
			ProjectPlaceholdText.getContentPane().add(EnterBtn);
			JLabel label = new JLabel(img);
			label.setBounds(0, 0, 700, 500);
			ProjectPlaceholdText.getContentPane().add(label);
			
			textArea = new JTextArea();
			scrollPane.setViewportView(textArea);
			textArea.append("Do you think shailene woodley is hot?");
			
			
		
			    
			
			
			ProjectPlaceholdText.setVisible(true);

	
		
		
		
		
	        
		
		
		
		

		
		
	
}
}
