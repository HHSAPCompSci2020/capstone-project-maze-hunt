import java.awt.Rectangle;

public class Clue6 extends Screen{
	
	private DrawingSurface surface;
	
	public Clue6(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
	}
	
	public void draw() {
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		
		surface.fill(0);
		surface.textSize(9);
		surface.text("You've hit a dead end and you don't know what to do! "
				+ "\nMaybe turn around and look for something blue. "
				+ "\nMake sure you go slow because the clue is in that row. "
				+ "\nYou may be able to sprint when you find the next hint.",10,30);
		
	}

}
