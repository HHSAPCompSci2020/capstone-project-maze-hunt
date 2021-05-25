import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PImage;

public class Cat extends PApplet {

		private Rectangle bounding;
		private PImage cat;
		double x, y;
		int width=19;
		int height=19;

		public Cat(double x1, double y1, double width, double height) {
			x=x1;
			y=y1;
			
		}
		
		public void walk(int dir) {
			x = x+dir;	
			
		}
		
		public void walkUp(int dir) {
			y = y+dir;	
			
		}
		public void draw(PApplet surface)
		{
			surface.fill(0,0,50);
			surface.rect(25,30,19,19);
		}
		public void keyPressed() // method call for when a key is pressed
		{
			if (keyCode=='A') 
			{
				this.walk(-2); 
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
				this.walk(2); 
			}
		}
	}


