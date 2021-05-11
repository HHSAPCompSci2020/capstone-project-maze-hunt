import javax.swing.JButton;

import processing.core.PApplet;

public class Help extends PApplet{

	
	public JButton button;
	
	/**
	 * Constructs the help screen
	 */
	public Help()
	{
		
	}
	
	public void draw() { 
		background(255);   // Clear the screen with a white background
		
		textSize(30);
		fill(129,20,40);
		text("Help ",90,50);
		text("Window",70,90);
		
		
		//stroke(0);
		//curve.draw(this);		
	}
	/**
	 * Checks when a button on the help screen is pressed and redirects the user accordingly
	 */
	public void keyPressed()
	{
		
	}
	
	/**
	 * This method displays the instructions and rules of the game onto the screen 
	 * for the players to read and understand
	 */
	public void instructions()
	{
		
	}
	
	/**
	 * This method indicates for the startup window to pop up again once the user clicks a button
	 * to exit the help screen
	 */
	public void backToStart()
	{
		
	}
}
