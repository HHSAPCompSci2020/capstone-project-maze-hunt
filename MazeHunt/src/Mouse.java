import java.awt.Rectangle;
import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.core.PImage;

public class Mouse{
	private Rectangle bounding;
	private PImage rat;
	double x, y;
	int width=19;
	int height=19;

	public Mouse(PImage img, double x1, double y1) {
		x=x1;
		y=y1;
		
	}
	
	public void walk(int dir) {
		
	}
	public void draw(PApplet surface)
	{
		//making the house
		surface.fill(168,0,50);
		surface.rect(25,30,19,19);
	}
	
}
