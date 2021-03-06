/**
 * 
 * This class pops up when the player selects "start" and will display background information about the cat
 * and the mouse. The player will be able to see the screen before playing the game.
 * @author Saloni Nadarajan
 */

import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PImage;

public class History extends Screen{


	private DrawingSurface surface;
	private Rectangle continueButton;
	private PImage backgroundInfo;

	/**
	 * Constructs the background screen to be shown onto the screen
	 * @param surface; The PApplet screen in which the background information and the continue button will be displayed.
	 */
	public History(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		continueButton = new Rectangle(325,240,50,40);
	
	}
	
	/**
	 * Draws the background information and continue button on the screen
	 */
	public void draw() {
		
		// Draw stuff
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		backgroundInfo= surface.loadImage("BackgroundInfo.png");
		surface.image(backgroundInfo, 0, 0, 400 , 300);
		
		//surface.fill(255);
		surface.rect(continueButton.x, continueButton.y, continueButton.width, continueButton.height, 10, 10, 10, 10);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String cont = "Continue";
		float w = surface.textWidth(cont); //start button
		surface.text(cont, continueButton.x+continueButton.width/2-w/2, continueButton.y+continueButton.height/2);

		
		surface.popStyle();

		
	}
	
	/**
	 * Checks whether the player has pressed the continue button and returns to the maze
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (continueButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3); //switch to maze screen
		
		}
}
