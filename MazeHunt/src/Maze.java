import processing.core.PApplet;
import jchoi182.shapes.Line;

public class Maze extends Screen{

	private DrawingSurface surface;
	int x;
	
	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		x = 0;

	}
	
	/**
	 * Place to draw the maze and characters on
	 * @param marker the place on with the maze and characters will be drawn on
	 */
	public void draw() {
		surface.pushStyle();
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.fill(0);
		surface.textSize(10);
		surface.text("This is where the maze will be "
				+ "\n create lines using the template in line 36 and add it in",10,30);
		
		
		//System.out.println("here");
		//marker.background(255);
		Line circle = new Line (100,300, 102, 200);
		circle.draw(surface);
		//circle.draw(marker);
		//marker.rect(20, 10, 20, 10);
	}
}
