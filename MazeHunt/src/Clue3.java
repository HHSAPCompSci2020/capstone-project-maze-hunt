

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the third clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Faith and Saloni
 * @version May 24, 2021
 *
 */
public class Clue3 extends Screen {
	private DrawingSurface surface;
	private Rectangle back;

	/**
	 * Constructs the third clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue3(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		back = new Rectangle(150,200,50,40);
	}

	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {


		surface.pushStyle();


		surface.background(204,255,255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();

		surface.rect(back.x, back.y, back.width, back.height, 10, 10, 10, 10);


		surface.fill(0);
		surface.textSize(9);
		surface.text("Yay, you found me! You forgot your glasses, but I love your hair. "
				+ "\n                 Let me help you see a little clearer, "
				+ "\n       walk around the square to try to find a mirror.",60,30);

		surface.textSize(10);
		surface.fill(75,0,130);
		String Back = "back";
		float w = surface.textWidth(Back); //start button
		surface.text(Back, back.x+back.width/2-w/2, back.y+back.height/2);


	}
	
	/**
	 * Checks for whether the mouse has been pressed and different action will be taken depending on where the mouse is pressed
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (back.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3); //switch to welcome screen
	}
}
