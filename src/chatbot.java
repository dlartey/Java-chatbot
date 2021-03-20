import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//Imports the Action listener, so the bot can respond to user input

import javax.swing.*; // Imports all the JFrame utilities

public class chatbot extends JFrame {
	private JTextArea ChatArea = new JTextArea(); // Creates a Chat Area to display the conversation
	private JTextField chatbot = new JTextField(); // Creates the Text Field where you can enter 
	
	public chatbot() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // The program will close when you exit
		frame.setVisible(true); // The program will be visible
		frame.setResizable(false); // The program will not be able to be resized
		frame.setLayout(null);
		frame.setSize(600 ,  600); // Sets the boundaries of the program
		frame.setLocationRelativeTo(null); // The window will be in the center of the screen
		frame.setTitle("Premier League Chatbot"); // Sets the title of the Chatbot
		frame.add(ChatArea); // Adds the Chat Area to the program	
		frame.add(chatbot); // Adds the field where you can type
		
		

		// FOR TEXT AREA
		ChatArea.setSize(580 , 470 ); // Sets the size of the Chat Area
		ChatArea.setLocation(5, 5); // Sets the location of the Chat Area

		// FOR TEXT FIELD
		chatbot.setSize(580, 40); // Sets the size of the chatbot
		chatbot.setLocation(5, 520);  // Sets the location of the chatbot
		
		JLabel lblNewLabel = new JLabel("Type below to chat to the chatbot"); // Creates a label for a label
		lblNewLabel.setBounds(5, 475, 500, 50); // Sets the position of the label, and how big it is
		frame.add(lblNewLabel); // Adds the label to the JFrame
		
		
		chatbot.addActionListener(new ActionListener() { // Adds a action listener to the chatbot, so it can respond to input

					@Override
					public void actionPerformed(ActionEvent arg0) { // When text is entered, it will do what is in the bracket
						String gtext = chatbot.getText().toLowerCase(); // Converts the user's input to lower case
						ChatArea.append("You :" + gtext + "\n"); // Prints out what you typed in the chat area, and creates a new line
						chatbot.setText("");
						
						if (gtext.contains("hi")) {// If the user types a certain word, it will do what is in the brackets
							bot("Welcome to the Chatbot. Ask me questions on the Premier League");
							
						}
						else if (gtext.equals("most goals")) {// If the user types a certain word, it will do what is in the brackets
							bot("Alan Shearer has the most PL goals with 260!");
						}
						else if (gtext.contains("most apperances")) {// If the user types a certain word, it will do what is in the brackets
							bot("Gareth Barry has the most PL apperances with 653!");
						}
						else if (gtext.contains("most clean sheets")) {// If the user types a certain word, it will do what is in the brackets
							bot("Petr Cech has the most PL clean sheets with 161!");
						}
						else if (gtext.contains("most assists")) {// If the user types a certain word, it will do what is in the brackets
							bot("Ryan Giggs has the most PL assists with 162!");
						}
						else if (gtext.contains("most wins")) {// If the user types a certain word, it will do what is in the brackets
							bot("Man UTD have the most PL wins with 633!");
						}
						else if (gtext.contains("most losses")) {// If the user types a certain word, it will do what is in the brackets
							bot("West Ham have the most PL losses with 354!");
						}
						else if (gtext.contains("most goals scored")) {// If the user types a certain word, it will do what is in the brackets
							bot("Man UTD have the most PL goals scored with 1,939!");
						}
						else if (gtext.contains("most goals conceded")) {// If the user types a certain word, it will do what is in the brackets
							bot("Everton have the most PL goals conceded with 1,277!");
						}
						else if (gtext.contains("most pl titles")) {// If the user types a certain word, it will do what is in the brackets
							bot("Man UTD has the most PL titles with 13!");
						}
						else if (gtext.contains("most pl wins in a season")) {// If the user types a certain word, it will do what is in the brackets
							bot("Manchester City has the most PL goals with 32!");
						}
						else if (gtext.contains("most pl goals in a season")) {// If the user types a certain word, it will do what is in the brackets
							bot("Mohamed Salah has the most PL goals with 32!");
						} 
						else if (gtext.contains("most manager of the season awards")) {// If the user types a certain word, it will do what is in the brackets
							bot("Sir Alex Ferguson has the most awards with 11!");
						} 
						else if (gtext.contains("most pl matches")) {// If the user types a certain word, it will do what is in the brackets
							bot("Arsene Wenger has the most PL matches with 828!");
						} else {
							bot("I don't understand");
						}
						
					}
			
		});
		
	}

	private void bot(String String) {// Creates a bot response
		ChatArea.append("Bot :"+ String + "\n");
	}
	public static void main(String[] args) {
		new chatbot();

	}

}
