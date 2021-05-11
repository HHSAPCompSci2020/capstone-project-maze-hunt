import processing.core.PApplet;
import jchoi182.shapes.Line;

public class Maze extends PApplet{


	int x;
	
	/**
	 * Constructs a maze 
	 */
	public Maze() {
		x = 0;

	}
	
	/**
	 * Place to draw the maze and characters on
	 * @param marker the place on with the maze and characters will be drawn on
	 */
	public void draw(PApplet marker) {
		
		Line circle = new Line (20,10, 32, 40);
		circle.draw(marker);
		marker.rect(20, 10, 20, 10);
	}
}
