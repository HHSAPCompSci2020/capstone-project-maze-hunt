

import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PImage;

/**
 * This class displays the Help window that contains instructions and rules of the game
 * @author Anika, Saloni, Faith
 * @version May 24, 2021
 *
 */
public class Help extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle startButton;
	private PImage helpScreen;

	/**
	 * Contructs the help class
	 * @param surface, the PApplet surface that the help class will be drawn on 
	 */
	public Help(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		startButton = new Rectangle(170,240,50,40);
	
	}
	
	/**
	 * Constructs the help screen to be shown onto the screen
	 * @param surface, the PApplet screen in the rules and directions of the game are displayed
	 */
	public void draw() {
		
		// Draw stuff
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		helpScreen= surface.loadImage("HelpScreen.jpg");
		surface.image(helpScreen, 0, 0, 400 , 300);
		
		//surface.fill(255);
		surface.rect(startButton.x, startButton.y, startButton.width, startButton.height, 10, 10, 10, 10);
		
		
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String start = "Back";
		float w = surface.textWidth(start); //start button
		surface.text(start, startButton.x+startButton.width/2-w/2, startButton.y+startButton.height/2);

		
		surface.popStyle();

		
		
		// Change stuff

	

		
	}
	
	/**
	 * Checks for whether the mouse has been pressed and different action will be taken depending on where the mouse is pressed
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (startButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN1); //switch to welcome screen
		
		}
	}
	
	
