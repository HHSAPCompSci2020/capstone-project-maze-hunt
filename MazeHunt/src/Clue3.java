

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.JOptionPane;

/**
 * This class holds and contains the third clue
 * Users are prompted with a question and are asked to select the correct answer.
 * @author Faith and Saloni
 *
 */
public class Clue3 extends Screen {



	private DrawingSurface surface;
	private Rectangle back;


	public Clue3(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		back = new Rectangle(150,200,50,40);
	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();


		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();

		//surface.fill(255);
		surface.rect(back.x, back.y, back.width, back.height, 10, 10, 10, 10);


		surface.fill(0);
		surface.textSize(9);
		surface.text("Yay, you found me! You forgot your galsses, but I love your hair. "
				+ "\nLet me help you see a little clearer, "
				+ "\nwalk around the square to try to find a mirror.",10,30);

		surface.textSize(10);
		surface.fill(75,0,130);
		String Back = "back";
		float w = surface.textWidth(Back); //start button
		surface.text(Back, back.x+back.width/2-w/2, back.y+back.height/2);


		// Change stuff




	}
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (back.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3); //switch to welcome screen
	}
}
