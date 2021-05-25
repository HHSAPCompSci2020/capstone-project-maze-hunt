import java.awt.Point;
import java.awt.Rectangle;

/**
 * This class creates a colorful window which asks the user to click on the pink window.
 * @author Anika and Saloni
 *
 */
public class KeyboardPress extends Screen {

	private DrawingSurface surface;
	private Rectangle blackButton;
	private Rectangle pinkButton;
	private Rectangle blueButton;
	private Rectangle redButton;
	private Rectangle greenButton;
	private Rectangle yellowButton;
	
	/**
	 * Constructs the KeyboardPress screen to be displayed
	 * @param surface, the PApplet screen in which different color buttons will be displayed.
	 */
	public KeyboardPress(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		blackButton = new Rectangle(70,100,50,40);
		pinkButton = new Rectangle(270,100,50,40);
		blueButton = new Rectangle(120,150,50,40);
		redButton = new Rectangle(220,150,50,40);
		greenButton = new Rectangle(170,200,50,40);
		yellowButton = new Rectangle(170,100,50,40);
	}
	
	/**
	 * Displays the different color buttons
	 */
	public void draw() {
		surface.pushStyle();

		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();

		surface.fill(0);
		surface.rect(blackButton.x, blackButton.y, blackButton.width, blackButton.height, 10, 10, 10, 10);
		surface.fill(255,204,204);
		surface.rect(pinkButton.x, pinkButton.y, pinkButton.width, pinkButton.height, 10, 10, 10, 10);
		surface.fill(204,229,255);
		surface.rect(blueButton.x, blueButton.y, blueButton.width, blueButton.height, 10, 10, 10, 10);
		surface.fill(255,51,51);
		surface.rect(redButton.x, redButton.y, redButton.width, redButton.height, 10, 10, 10, 10);
		surface.fill(204,255,204);
		surface.rect(greenButton.x, greenButton.y, greenButton.width, greenButton.height, 10, 10, 10, 10);
		surface.fill(255,255,102);
		surface.rect(yellowButton.x, yellowButton.y, yellowButton.width, yellowButton.height, 10, 10, 10, 10);
		surface.fill(0);
		surface.textSize(9);
		surface.text("Ah ha! Looks like you have made it till the end! But not so fast. "
				+ "\nClick on the pink button to really exit the maze.",10,30);
		surface.popStyle();


	}
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (pinkButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);//switch to maze screen
		if (blackButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER4);
		if (blueButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER4);
		if (redButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER4);
		if (greenButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER4);
		if (yellowButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER4);
	}
}