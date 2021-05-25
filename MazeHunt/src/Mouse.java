import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This class contrusts the mouse
 * @author anika, Faith, Saloni
 *
 */
public class Mouse extends PApplet{
	private Rectangle bounding;
	private PImage rat;
	double x, y;
	int width=19;
	int height=19;

	/**
	 * Constructs the mouse to be drawn on the PApplet surface
	 * @param x1, the starting x coordinate of the mouse
	 * @param y1, the starting y coordinate of the mouse
	 * @param width, the width of the mouse
	 * @param height, the height of the mouse
	 */
	public Mouse(double x1, double y1, double width, double height) {
		x=x1;
		y=y1;
		
	}
	
	/**
	 * This method moves the mouse around in the x direction 
	 * @param dir, the x direction in which the mouse should move
	 */
	public void walk(int dir) {
		x = x+dir;	
		
	}
	
	/**
	 * This method moves the mouse around in the y direction
	 * @param dir, the y direction in which the mouse should move
	 */
	public void walkUp(int dir) {
		y = y+dir;	
		
	}
	
	/**
	 * Draws the mouse onto the PApplet surface
	 * @param surface, the PApplet surface for which the car is to be drawn onto
	 */
	public void draw(PApplet surface)
	{
		surface.fill(0,0,50);
		surface.rect(25,30,19,19);
	}
	
	/**
	 * This method checks for when a key is pressed and which key is pressed
	 */
	public void keyPressed() 
	{
		if (keyCode==LEFT) 
		{
			this.walk(-2); 
		}
		
		if (keyCode==RIGHT)
		{
			this.walk(2); 
		}
		
		if (keyCode==UP) 
		{
			this.walkUp(-2); 
		}
		
		if (keyCode==DOWN) 
		{
			this.walkUp(2); 
		}
	}
	
}
