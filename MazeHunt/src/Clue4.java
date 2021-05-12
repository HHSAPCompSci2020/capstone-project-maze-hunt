import java.awt.Rectangle;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;
public class Clue4 extends Screen{
	private DrawingSurface surface;
	private Rectangle startButton;

	public Clue4(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		startButton = new Rectangle(150,200,50,40);

		// TODO Auto-generated constructor stub
	}
	public void draw() {

		// Draw stuff

		surface.pushStyle();


		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();

		surface.fill(255);
				surface.rect(startButton.x, startButton.y, startButton.width, startButton.height, 10, 10, 10, 10);


		surface.fill(0);
		surface.textSize(9);
		surface.text("Maze Hunt is an interactive game where the users can control their players using keys." 
				+ "\n The player is given clues along its way. Once the player finds all the clues the"
				+ "\n the exit will be revealed and the game will end. You have the option to pause or"
				+ "\n exit the during the game. The players of the game include a cat and a mouse. If your"
				+ "\n charecter is a mouse your task is to find all the clues before the cat eats you."
				+ "\n If you are a cat, you task is to catch the mouse and end the game. The cat can be"
				+ "\n controlled usimg WASD keys and the mouse should be controlled using the arrow keys."
				+ "\n You will also need to drag and click to view the menu options and to look at the clues."
				+ "\n Please press the back button to return to the main menu.",10,30);

		surface.textSize(10);
		surface.fill(75,0,130);
		String start = "TEST";
		float w = surface.textWidth(start); //start button
		surface.text(start, startButton.x+startButton.width/2-w/2, startButton.y+startButton.height/2);


		surface.popStyle();



		// Change stuff




	}
}
