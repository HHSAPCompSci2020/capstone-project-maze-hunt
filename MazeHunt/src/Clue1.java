

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the first clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Anika and Faith
 *
 */
public class Clue1 extends Screen {
	

	
	private DrawingSurface surface;
	private Rectangle iceCreamButton;
	private Rectangle donutsButton;
	private Rectangle cakeButton;

	/**
	 * Constructs the first clue to be shown onto the screen
	 * @param surface, the PApplet screen in which the clues and 
	 */
	public Clue1(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		iceCreamButton = new Rectangle(150,200,50,40);
		donutsButton = new Rectangle(150,150,50,40);
		cakeButton = new Rectangle(150,100,50,40);
	}
	
	public void draw() {
		

		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		surface.rect(iceCreamButton.x, iceCreamButton.y, iceCreamButton.width, iceCreamButton.height, 10, 10, 10, 10);
		surface.rect(donutsButton.x, donutsButton.y, donutsButton.width, donutsButton.height, 10, 10, 10, 10);
		surface.rect(cakeButton.x, cakeButton.y, cakeButton.width, cakeButton.height, 10, 10, 10, 10);
	
		surface.fill(0);
		surface.textSize(9);
		surface.text("Aha! You want to enter, I don't even know if you'll make it to the center. "
				+ "\nWatch out for the cat, as he likes to eat rats. "
				+ "\nBefore I let you enter the maze, what's a dessert that may contain glaze?",10,30);
		
		surface.textSize(10);
		surface.fill(75,0,130);
		String iceCream = "Ice Cream";
		float w = surface.textWidth(iceCream); //start button
		surface.text(iceCream, iceCreamButton.x+iceCreamButton.width/2-w/2, iceCreamButton.y+iceCreamButton.height/2);
		String donut = "Donut";
		float y = surface.textWidth(donut); //start button
		surface.text(donut, donutsButton.x+donutsButton.width/2-y/2, donutsButton.y+donutsButton.height/2);
		String cake = "Cake";
		float z = surface.textWidth(cake); //start button
		surface.text(cake, cakeButton.x+cakeButton.width/2-z/2, cakeButton.y+cakeButton.height/2);
		surface.popStyle();

		
		
		

	

		
	}
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (iceCreamButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER); //switch to welcome screen
		if (donutsButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
		if (cakeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER);
		}
	}
