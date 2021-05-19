import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.core.PImage;

public class Mouse extends PApplet{
	private Rectangle bounding;
	private PImage rat;
	double x, y;
	int width=19;
	int height=19;

	public Mouse(PImage img, double x1, double y1) {
		rat = img;
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
		//making the house
		surface.fill(168,0,50);
		surface.rect(25,30,19,19);
	}
	public void keyPressed() // method call for when a key is pressed
	{
		if (keyCode==LEFT) // if the left key is pressed translate the house to the left
		{
			this.walk(-2); // when the house moves left, the ref. line also moves left
		}
		
		if (keyCode==RIGHT) // if the left key is pressed translate the house to the left
		{
			this.walk(2); // when the house moves left, the ref. line also moves left
		}
		
		if (keyCode==UP) // if the left key is pressed translate the house to the left
		{
			this.walk(-2); // when the house moves left, the ref. line also moves left
		}
		
		if (keyCode==DOWN) // if the left key is pressed translate the house to the left
		{
			this.walk(2); // when the house moves left, the ref. line also moves left
		}
	}
	
}
