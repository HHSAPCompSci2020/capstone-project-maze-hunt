import java.awt.Point;
import java.awt.Rectangle;
import processing.core.PImage;

/**
 * This class holds the screen that pops up after the cat and mouse intersect each other.
 * @author Anika and Faith
 *
 */
public class YouLose extends Screen {

	private DrawingSurface surface;
	private Rectangle exitButton;
	private PImage youLose;

	/**
	 * Constructs the you lose screen to be shown onto the screen
	 * @param surface, the PApplet screen in which the you lose text and the exit button will be displayed.
	 */
	public YouLose(DrawingSurface surface) {

		super(400,300);
		this.surface = surface;
		exitButton = new Rectangle(150,200,50,40);

	}
	
	/**
	 * Displays the you lose text and exit button
	 */
	public void draw() {

		// Draw stuff

		surface.pushStyle();


		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		youLose= surface.loadImage("YouLoseScreen.jpg");
		surface.image(youLose, 0, 0, 400 , 300);
		surface.fill(204,204,255);
		surface.rect(exitButton.x, exitButton.y, exitButton.width, exitButton.height, 10, 10, 10, 10);


		surface.textSize(10);
		surface.fill(0);
		String exit = "Exit";
		float w = surface.textWidth(exit); //start button
		surface.text(exit, exitButton.x+exitButton.width/2-w/2, exitButton.y+exitButton.height/2);

		surface.popStyle();

	}
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (exitButton.contains(p))
			surface.dispose();
		System.exit(0);//switch to welcome screen

	}
}