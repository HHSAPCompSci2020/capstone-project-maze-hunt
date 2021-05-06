import java.awt.event.KeyEvent;

import processing.core.PApplet;
import processing.event.MouseEvent;


public class DrawingSurface extends PApplet {

	private Maze curve;
	
	
	public DrawingSurface() {
		
		curve = new Maze ();
		
	}
	
	/**The statements in the setup() function 
	 execute once when the program begins
	 **/
	public void setup() {
		
	}
	
	 /**The statements in draw() are executed until the 
	 program is stopped. Each statement is executed in 
	 sequence and after the last line is read, the first 
	 line is executed again.
	 **/
	public void draw() { 
		background(255);   // Clear the screen with a white background
		
		textSize(30);
		fill(129,20,40);
		text("Welcome to ",90,50);
		text("the Maze Hunt",70,90);
		
		fill(255);
		stroke(0);
		rect(80,150,90,60);
		
		textSize(25);
		fill(20,130,40);
		text("Start ",93,190);

		fill(255);
		stroke(0);
		rect(250,150,90,60);
		
		textSize(25);
		fill(20,20,150);
		text("Help ",270,190);
		
		stroke(0);
		curve.draw(this);		
	}
	
	
	
	
	
}










