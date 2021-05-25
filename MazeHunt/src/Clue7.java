

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the 7th clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika and Saloni
 * @version May 24, 2021
 *
 */
public class Clue7 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle backbutton;
	/**
	 * Constructs the 7th clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue7(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		backbutton = new Rectangle(160,200,50,40);
	}
	
	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {
		surface.pushStyle();
		
		surface.background(204,229,255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		surface.fill(204,204,255);
		surface.rect(backbutton.x, backbutton.y, backbutton.width, backbutton.height, 10, 10, 10, 10);
		
		
		surface.fill(0);
		surface.textSize(9);
		surface.text("You think this maze is hard. Wait till the cat catches you offgaurd. "
				+ "\nUse this diamond to get ahead. If you slow down you'll soon be dead! ",10,30);
		
		String back = "Back";
		float w = surface.textWidth(back); //start button
		surface.text(back, backbutton.x+backbutton.width/2-w/2, backbutton.y+backbutton.height/2);


	}
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (backbutton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
	}
	}
