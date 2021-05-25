import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PImage;

public class ThankYou extends Screen {

	private DrawingSurface surface;
	private Rectangle exitButton;
	private PImage thankYou;


	public ThankYou(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		exitButton = new Rectangle(150,200,50,40);

	}

	public void draw() {

		// Draw stuff

		surface.pushStyle();


		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		thankYou= surface.loadImage("ThankYouScreen.jpg");
		surface.image(thankYou, 0, 0, 400 , 300);

		surface.rect(exitButton.x, exitButton.y, exitButton.width, exitButton.height, 10, 10, 10, 10);

		surface.textSize(10);
		surface.fill(75,0,130);
		String exit = "Exit";
		float w = surface.textWidth(exit); //start button
		surface.text(exit, exitButton.x+exitButton.width/2-w/2, exitButton.y+exitButton.height/2);


		surface.popStyle();



		// Change stuff




	}
	/**
	 * Checks whether the mouse has been pressed and taked actions depending on where the mouse has been pressed
	 */
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (exitButton.contains(p))
			surface.dispose();
		System.exit(0);//switch to welcome screen

	}
}

