import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PImage;

//import javax.swing.JButton;

//import processing.core.PApplet;

public class StartWindow extends Screen{

	private DrawingSurface surface;
	private Rectangle helpButton;
	private Rectangle startButton;
	private PImage welcome;


//	private Maze maze;


	/**
	 * Constructs the start window and displays the start of the game with options
	 * @param surface, the PApplet surface that the start window is to be shown on
	 */
	public StartWindow(DrawingSurface surface)
	{
		super(400,300);
		this.surface = surface;
		helpButton = new Rectangle(250,190,90,60);
		startButton = new Rectangle(65,190,90,60);

		//maze = new Maze();

	}

	public void draw() { 

		surface.pushStyle();

		surface.background(255,255,255);
		welcome= surface.loadImage("WelcomeScreen.png");
		surface.image(welcome,0,0,400,300);
		//button
		surface.fill(204,229,255);
		surface.rect(helpButton.x, helpButton.y, helpButton.width, helpButton.height, 10, 10, 10, 10);
		surface.rect(startButton.x, startButton.y, startButton.width, startButton.height, 10, 10, 10, 10);

		
		
		
		surface.textSize(15);
		surface.fill(139,78,59);
		String start = "Let's start!";
		
		surface.fill(139,0,139);
		surface.textSize(15);
		String help = "Help";

		
		
		
		//surface.text(start, 80, 70);
		
		float w = surface.textWidth(start); //start button
		float y = surface.textWidth(help); //help button

		
		surface.text(start, startButton.x+startButton.width/2-w/2, startButton.y+startButton.height/2);
		surface.text(help, helpButton.x+helpButton.width/2-y/2, helpButton.y+helpButton.height/2);
		surface.popStyle();

		//stroke(0);
		
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

	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (helpButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN2); //switch to help screen
		
		if (startButton.contains(p))
			surface.switchScreen(ScreenSwitcher.HISTORY); //switch to start screen
	}
}
