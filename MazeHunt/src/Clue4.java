import java.awt.Point;
import java.awt.Rectangle;
//import java.awt.event.*;
//
//import javax.swing.JOptionPane;

/**
 * This class holds and contains the fourth clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika and Saloni
 * @version May 24, 2021
 *
 */
public class Clue4 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle backButton;
	

	/**
	 * Constructs the fourth clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and answer choices are displayed onto the screen
	 */
	public Clue4(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		backButton = new Rectangle(150,200,50,40);
	}
	
	/**
	 * Displays the clues and answers onto the screen with answer choices
	 */
	public void draw() {
		
		surface.pushStyle();
		
		surface.background(255,204,204);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		//surface.fill(255);
		surface.rect(backButton.x, backButton.y, backButton.width, backButton.height, 10, 10, 10, 10);
		
	
		surface.fill(0);
		surface.textSize(9);
		surface.text("                         Well hello again! "
				+ "\n  It sure has been fun watching you run around a ton."
				+ "\n             The next one sits upon an island. "
				+ "\n                   But don't be frightened, "
				+ "\n          it's not one you can get stranded on.", 70,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String back = "Back";
		float z = surface.textWidth(back); //start button
		surface.text(back, backButton.x+backButton.width/2-z/2, backButton.y+backButton.height/2);
		surface.popStyle();
		// Change stuff
	}
	
	
	/**
	 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
	 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (backButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3); //switch to welcome screen
		}
	}
