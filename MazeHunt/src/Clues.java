import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Clues {

	
	protected int clueNumber;
	protected ArrayList<String> clues; 
	
//	public static void main(String args[]) {
//		
//		 final JFrame parent = new JFrame();
//	        JButton button = new JButton();
//
//	        button.setText("Click here!");
//	        parent.setBounds(300,300,100,100);
//	        parent.add(button);
//	        parent.pack();
//	        parent.setVisible(true);
//
//	        button.addActionListener(new java.awt.event.ActionListener() {
//	            @Override
//	            public void actionPerformed(java.awt.event.ActionEvent evt) {
//	            	parent.setVisible(false);
//	                String name = JOptionPane.showInputDialog(parent,
//	                        "Aha! You want to enter, I don't even know if you'll make it to the center. "
//	                        + "\nWatch out for the cat, as he likes to eat rats. "
//	                        + "\nBefore I let you enter the maze, what's a dessert that may contain glaze?", 
//	                        "Type your answer here");
//	            }
//	        });
//	}
	
	/**
	 * Constructs a set of clues.
	 */
	public Clues ()
	{
//		clues.add("Aha! You want to enter, I don't even know if you'll make it to the center. "
//				+ "\nWatch out for the cat, as he likes to eat rats. "
//				+ "\nBefore I let you enter the maze, what's a dessert that may contain glaze?");
//		clues.add("Oh no! You've hit a wall, that's okay stand up tall. "
//				+ "\nTo measure your height, walk down a hall.");
//		clues.add("Yay, you found me! You forgot your galsses, but I love your hair. "
//				+ "\nLet me help you see a little clearer, "
//				+ "\nwalk around the square to try to find a mirror.");
//		clues.add("You're almost done, just one more to go. "
//				+ "\n'Ughh' I know what a bummer! "
//				+ "\nJust tell me your favourite thing to throw "
//				+ "\nand then you'll have reached the summer!");
	}
	
	/**
	 * Checks for the location of the clue found.
	 */
	public void clueLocation()
	{
		
	}
	
	public void clueNumber1()
	{
		System.out.println("clues");
		String answer = JOptionPane.showInputDialog("\"Aha! You want to enter, I don't even know if you'll make it to the center. \"\n" + 
				"\nWatch out for the cat, as he likes to eat rats. \"\n" + 
				"\nBefore I let you enter the maze, what's a dessert that may contain glaze?\", \n" + 
				"	                        \"Type your answer here");
		if (answer == null)
			answer = "";
	}
	/**
	 * Checks if the player has already used clues.
	 * @return true is the user used a clue before else false.  
	 */
	public boolean lastClue()
	{
		return false;
		
	}
}
