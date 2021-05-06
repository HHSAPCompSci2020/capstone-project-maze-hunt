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
		fill(184);
		text("Welcome to ",90,50);
		text("the Maze Hunt",70,90);
		
		fill(255);
		stroke(0);
		rect(90,50,60,90);
		
		stroke(0);
		curve.draw(this);		
	}
	
	
	
	
	
}










