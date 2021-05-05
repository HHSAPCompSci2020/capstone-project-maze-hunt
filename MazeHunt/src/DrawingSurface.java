import processing.core.PApplet;
public class DrawingSurface extends PApplet{
	
	
	public DrawingSurface() {
		
	}
	
	public void draw() { 
		background(255);   // Clear the screen with a white background
		fill(0);
		textAlign(LEFT);
		textSize(12);
		
		text("Enter: Run 1 step\nSpace: Start/Stop\nUp arrow: Increase speed\nDown arrow: Decrease speed\n\nSpeed: " + " per sec", height+20, 30);
		
		
		
	}
}
