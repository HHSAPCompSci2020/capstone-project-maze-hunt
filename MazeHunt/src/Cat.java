import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This class is the cat class in which the class is created and displayed
 * @author Anika, Saloni, Faith
 * @version May 24,2021
 *
 */
public class Cat extends PApplet {

		private Rectangle bounding;
		private PImage cat;
		double x, y;
		int width=19;
		int height=19;

		/**
		 * Constructs the cat to be drawn on the PApplet surface
		 * @param x1, the starting x coordinate of the cat
		 * @param y1, the starting y coordinate of the cat
		 * @param width, the width of the cat
		 * @param height, the height of the cat
		 */
		public Cat(double x1, double y1, double width, double height) {
			x=x1;
			y=y1;
			
		}
		
		/**
		 * This method moves the cat around in the x direction 
		 * @param dir, the x direction in which the cat should move
		 */
		public void walk(int dir) {
			x = x+dir;	
			
		}
		
		/**
		 * This method moves the cat around in the y direction
		 * @param dir, the y direction in which the cat should move
		 */
		public void walkUp(int dir) {
			y = y+dir;	
			
		}
		
		/**
		 * Draws the cat onto the PApplet surface
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
		public void keyPressed() // method call for when a key is pressed
		{
			if (keyCode=='A') 
			{
				this.walkUp(-2); 
			}
			
			if (keyCode=='D') 
			{
				this.walk(2); 
			}
			
			if (keyCode=='W') 
			{
				this.walk(-2); 
			}
			
			if (keyCode=='S') 
			{
				this.walkUp(2); 
			}
		}
	}


