

import java.awt.Point;
import java.awt.Rectangle;


/**
 * This class contains the wrong answer3 screen when the wrong answer choice has been selected
 * @author Saloni and Faith
 * @version May 24,2021
 *
 */
public class WrongAnswer3 extends Screen {

	private DrawingSurface surface;
	private Rectangle startButton;

	/**
	 * Constructs the wrong answer3 class 
	 * @param surface, the PApplet surface for which the class is to be shown on
	 */
	public WrongAnswer3(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		startButton = new Rectangle(150,200,50,40);

	}

	/**
	 * Draws the wrong answer class and displays it onto the PApplet screen
	 */
	public void draw() {

		// Draw stuff

		surface.pushStyle();


		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.rect(startButton.x, startButton.y, startButton.width, startButton.height, 10, 10, 10, 10);

		surface.fill(0);
		surface.textSize(9);
		surface.text("Oh no! You've chosen the wrong answer :( Please try again.",10,30);

		surface.textSize(10);
		surface.fill(75,0,130);
		String start = "Back";
		float w = surface.textWidth(start); //start button
		surface.text(start, startButton.x+startButton.width/2-w/2, startButton.y+startButton.height/2);


		surface.popStyle();


	}

	/**
	 * Checks whether the mouse has been pressed and taked actions depending on where the mouse has been pressed
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (startButton.contains(p))
			surface.switchScreen(ScreenSwitcher.CLUE8); //switch to welcome screen

	}
}
