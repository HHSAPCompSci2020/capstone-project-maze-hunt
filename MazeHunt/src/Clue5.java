

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the first clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika and Faith
 *
 */
public class Clue5 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle knightButton;
	private Rectangle kingButton;
	private Rectangle queenButton;

	/**
	 * Constructs the first clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue5(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		knightButton = new Rectangle(150,200,50,40);
		queenButton = new Rectangle(150,150,50,40);
		kingButton = new Rectangle(150,100,50,40);
	}
	
	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {
		

		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		surface.fill(204,204,255);
		surface.rect(queenButton.x, queenButton.y, queenButton.width, queenButton.height, 10, 10, 10, 10);
		surface.fill(204,204,255);
		surface.rect(knightButton.x, knightButton.y, knightButton.width, knightButton.height, 10, 10, 10, 10);
		surface.fill(204,204,255);
		surface.rect(kingButton.x, kingButton.y, kingButton.width, kingButton.height, 10, 10, 10, 10);
	
		surface.fill(0);
		surface.textSize(9);
		surface.text("The maze is just begun, now will end your time of fun! "
				+ "\nIts gonna get harder before that tell us who wears an armour",10,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String Knight = "Knight";
		float w = surface.textWidth(Knight); //start button
		surface.text(Knight, knightButton.x+knightButton.width/2-w/2, knightButton.y+knightButton.height/2);
		String King = "King";
		float y = surface.textWidth(King); //start button
		surface.text(King, kingButton.x+kingButton.width/2-y/2, kingButton.y+kingButton.height/2);
		String Queen = "Queen";
		float z = surface.textWidth(Queen); //start button
		surface.text(Queen, queenButton.x+queenButton.width/2-z/2, queenButton.y+queenButton.height/2);
		surface.popStyle();


	}
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (kingButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER5); //switch to welcome screen
		if (knightButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
		if (queenButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER5);
		}
	}
