

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 *  This class holds and contains the second clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Saloni and Anika
 *
 */
public class Clue2 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle back;

	/**
	 * Constructs the second clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue2(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		back = new Rectangle(150,200,50,40);
	}
	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {
		
		// Draw stuff
		
		surface.pushStyle();
		
		
		surface.background(255,204,255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		//surface.fill(255);
		surface.rect(back.x, back.y, back.width, back.height, 10, 10, 10, 10);
		
	
		surface.fill(0);
		surface.textSize(11);
		surface.text("Oh no! You've hit a wall, that's okay stand up tall. "
				+ "\n     To measure your height, walk down a hall."
				+ "\n    Let me tell you something that I already knew,"
				+ "\nNow be aware of the lines as you might move and go through.",60,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String Back = "back";
		float w = surface.textWidth(Back); //start button
		surface.text(Back, back.x+back.width/2-w/2, back.y+back.height/2);
		
		
		// Change stuff

	

		
	}
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (back.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3); //switch to welcome screen
		}
	}
