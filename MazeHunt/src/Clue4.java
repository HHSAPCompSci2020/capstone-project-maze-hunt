import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the fourth clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika and Saloni
 *
 */
public class Clue4 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle glassesButton;
	private Rectangle phoneButton;
	private Rectangle frisbeeButton;

	/**
	 * 
	 * @param surface
	 */
	public Clue4(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		glassesButton = new Rectangle(150,200,50,40);
		phoneButton = new Rectangle(150,150,50,40);
		frisbeeButton = new Rectangle(150,100,50,40);
	}
	
	public void draw() {
		
		// Draw stuff
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		//surface.fill(255);
		surface.rect(glassesButton.x, glassesButton.y, glassesButton.width, glassesButton.height, 10, 10, 10, 10);
		surface.rect(phoneButton.x, phoneButton.y, phoneButton.width, phoneButton.height, 10, 10, 10, 10);
		surface.rect(frisbeeButton.x, frisbeeButton.y, frisbeeButton.width, frisbeeButton.height, 10, 10, 10, 10);
	
		surface.fill(0);
		surface.textSize(9);
		surface.text("Aha! You want to enter, I don't even know if you'll make it to the center. "
				+ "\nWatch out for the cat, as he likes to eat rats. "
				+ "\nBefore I let you enter the maze, what's a dessert that may contain glaze?",10,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String glasses = "Glasses";
		float w = surface.textWidth(glasses); //start button
		surface.text(glasses, glassesButton.x+glassesButton.width/2-w/2, glassesButton.y+glassesButton.height/2);
		String phone = "Phone";
		float y = surface.textWidth(phone); //start button
		surface.text(phone, phoneButton.x+phoneButton.width/2-y/2, phoneButton.y+phoneButton.height/2);
		String frisbee = "Frisbee";
		float z = surface.textWidth(frisbee); //start button
		surface.text(frisbee, frisbeeButton.x+frisbeeButton.width/2-z/2, frisbeeButton.y+frisbeeButton.height/2);
		surface.popStyle();

		
		
		// Change stuff

	

		
	}
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (glassesButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER2); //switch to welcome screen
		if (phoneButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER2);
		if (frisbeeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
		}
	}
