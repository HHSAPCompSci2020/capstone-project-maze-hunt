

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the first clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika 
 *
 */
public class Clue8 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle keyBoard;
	private Rectangle forest;
	private Rectangle castle;

	/**
	 * Constructs the first clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue8(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		castle = new Rectangle(150,200,50,40);
		forest = new Rectangle(150,150,50,40);
		keyBoard = new Rectangle(150,100,50,40);
	}
	
	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {
		

		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		surface.rect(castle.x, castle.y, castle.width, castle.height, 10, 10, 10, 10);
		surface.rect(forest.x, forest.y, forest.width, forest.height, 10, 10, 10, 10);
		surface.rect(keyBoard.x, keyBoard.y, keyBoard.width, keyBoard.height, 10, 10, 10, 10);
	
		surface.fill(0);
		surface.textSize(9);
		surface.text("I have keys, but no locks and space, and no rooms."
				+ "\nYou can enter, but you can't go outside. Choose the wrong answer and"
				+ "\nyou'll be fined",10,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String Castle = "Castle";
		float w = surface.textWidth(Castle); //start button
		surface.text(Castle, castle.x+castle.width/2-w/2, castle.y+castle.height/2);
		String Forest = "Forest";
		float y = surface.textWidth(Forest); //start button
		surface.text(Forest, forest.x+forest.width/2-y/2, forest.y+forest.height/2);
		String Keyboard = "Keyboard";
		float z = surface.textWidth(Keyboard); //start button
		surface.text(Keyboard, keyBoard.x+keyBoard.width/2-z/2, keyBoard.y+keyBoard.height/2);
		surface.popStyle();


	}
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (castle.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER3); //switch to welcome screen
		if (forest.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER3);
		if (keyBoard.contains(p))
			surface.switchScreen(ScreenSwitcher.KEYBOARDPRESS);
		}
	}