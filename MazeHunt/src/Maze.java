import processing.core.PApplet;
import jchoi182.shapes.Line;
import java.awt.Color;
import java.awt.event.KeyEvent;

public class Maze extends Screen{

	private DrawingSurface surface;
	int z,m;
	private Color exitRevel;
	private int cluesFound=0;
	
	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		

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
		surface.background(176,224,230);
		
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
		tope.setStroke(new Color(176,224,230));
		tope.draw(surface);
		
		//top line
		Line top = new Line(x+gap, y, x+w, y);
		top.draw(surface);

		//right line
		Line right = new Line(x + w, y, x + w, y + h);
		right.draw(surface);

		//bottom exit
		Line bottome = new Line(x+w, y+h, x+w-gap, y+h);
		if (cluesFound==5)
		{
			exitRevel = new Color(176,224,230);
		}
		else
			exitRevel = Color.BLACK;
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
		Line line2 = new Line(x+gap*2, y+gap, x+w, y+gap);
		line2.draw(surface);

		// line3
		Line line3 = new Line(x+gap, y+gap*2, x+w-gap, y+gap*2);
		line3.draw(surface);

		// line4
		Line line4 = new Line(x+gap, y+gap*2, x+gap, y+gap*3);
		line4.draw(surface);

		// line5
		Line line5 = new Line(x+gap*2, y+gap*3, x+gap*2, y+gap*4);
		line5.draw(surface);

		// line6
		Line line6 = new Line(x+gap*3, y+gap*2, x+gap*3, y+gap*3);
		line6.draw(surface);

		// line7
		Line line7 = new Line(x+gap*4, y+gap*3, x+gap*6, y+gap*3);
		line7.draw(surface);

		// line8
		Line line8 = new Line(x+gap*7, y+gap*3, x+w, y+gap*3);
		line8.draw(surface);

		// line9
		Line line9 = new Line(x+gap, y+gap*4, x+gap*3, y+gap*4);
		line9.draw(surface);

		// line10
		Line line10 = new Line(x+gap*4, y+gap*3, x+gap*4, y+gap*5);
		line10.draw(surface);

		// line11
		Line line11 = new Line(x+gap*5, y+gap*4, x+gap*6, y+gap*4);
		line11.draw(surface);
		
		
		
		
		
		
		//lastline
		Line lastline = new Line(x+w-gap, y+h, x+w-gap, y+h-gap);
		lastline.draw(surface);
		
		
		
		

		surface.rect(z,m,30,30);
		
		
		if (surface.isPressed(KeyEvent.VK_LEFT))
			keyPressed();
		if (surface.isPressed(KeyEvent.VK_RIGHT))
			keyPressed();
		if (surface.isPressed(KeyEvent.VK_UP))
			keyPressed();
		if (surface.isPressed(KeyEvent.VK_DOWN))
			keyPressed();
		


	}
	
	public void keyPressed()
	{
		
		if (surface.isPressed(KeyEvent.VK_LEFT))
			z -= 3;
		if (surface.isPressed(KeyEvent.VK_RIGHT))
			z += 3;
		if (surface.isPressed(KeyEvent.VK_UP))
			m -= 3;
		if (surface.isPressed(KeyEvent.VK_DOWN))
			m += 3;
	}	
	

	
	

}
