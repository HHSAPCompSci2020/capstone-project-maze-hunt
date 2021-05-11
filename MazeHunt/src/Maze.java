import processing.core.PApplet;
import jchoi182.shapes.Line;
import java.awt.Color;

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
		surface.textSize(5);
		surface.text("Maze Hunt Reminder: \nMove the mouse around to run from the cat and find the clues. "
				+ "Remember you can only leave the maze once you have found all the clues. Good luck!", 5, 15);
		
		//Line(x,y,angle,length)
		//System.out.println("here");
		// marker.background(255);

		// circle.draw(marker);
		// marker.rect(20, 10, 20, 10);

		int x, y, w, h, gap;
		x = 50;
		y = 60;
		w = 300;
		h = 200;
		gap = 30;

		
		//top entry
		Line tope = new Line(x, y, x+gap, y);
		//color
		surface.fill(255,255,255);
		tope.setStroke(Color.WHITE);
		tope.draw(surface);
		
		//top line
		Line top = new Line(x+gap, y, x+w, y);
		top.draw(surface);

		//right line
		
		Line right = new Line(x + w, y, x + w, y + h);
		
		right.draw(surface);

		//bottom exit
		Line bottome = new Line(x+w, y+h, x+w-gap, y+h);
		bottome.setStroke(Color.WHITE);
		//color
		
		bottome.draw(surface);

		//bottom line
		Line bottom = new Line(x+w-gap, y+h, x, y+h);
		bottom.draw(surface);

		//left line
		Line left = new Line(x, y+h, x, y);
		left.draw(surface);

		//line1
		Line line1 = new Line(x+gap, y, x+gap, y+gap);
		
		line1.draw(surface);
		
		//line2
		Line line2 = new Line(x+w-gap, y+h, x+w-gap, y+h-gap);
		line2.draw(surface);
		
		
		
		


	}
}
