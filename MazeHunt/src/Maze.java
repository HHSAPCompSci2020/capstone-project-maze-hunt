import processing.core.PApplet;
import jchoi182.shapes.Line;
import jchoi182.shapes.Rectangle;

import java.awt.Color;
import java.awt.event.KeyEvent;

//import fdominique576.physicsshapedemo.PhysicsShape;

public class Maze extends Screen{

	private DrawingSurface surface;
	int z,m;
	private Color exitRevel;
	private int cluesFound=0;
	private Player1 player;
	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		player = new Player1(new Rectangle(z,m,50,50));


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
		Line right = new Line(x+w, y, x+w, y+h);
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

		//line3
		Line line3 = new Line(x+gap, y+gap*2, x+w-gap, y+gap*2);
		line3.draw(surface);

		//line4
		Line line4 = new Line(x+gap, y+gap*2, x+gap, y+gap*3);
		line4.draw(surface);

		//line5
		Line line5 = new Line(x+gap*2, y+gap*3, x+gap*2, y+gap*4);
		line5.draw(surface);

		//line6
		Line line6 = new Line(x+gap*3, y+gap*2, x+gap*3, y+gap*3);
		line6.draw(surface);

		//line7
		Line line7 = new Line(x+gap*4, y+gap*3, x+gap*6, y+gap*3);
		line7.draw(surface);

		//line8
		Line line8 = new Line(x+gap*7, y+gap*3, x+w, y+gap*3);
		line8.draw(surface);

		//line9
		Line line9 = new Line(x+gap, y+gap*4, x+gap*3, y+gap*4);
		line9.draw(surface);

		//line10
		Line line10 = new Line(x+gap*4, y+gap*3, x+gap*4, y+gap*5);
		line10.draw(surface);

		//line11
		Line line11 = new Line(x+gap*5, y+gap*4, x+gap*6, y+gap*4);
		line11.draw(surface);

		//line12
		Line line12 = new Line(x+gap*7, (((y+gap*4)+(y+gap*5))/2)-gap/5, x+w-gap*2, (((y+gap*4)+(y+gap*5))/2)-gap/5);
		line12.draw(surface);

		//line13
		Line line13 = new Line(x+w-gap*2, y+(gap*4-gap/4), x+w-gap*2, y+gap*5);
		line13.draw(surface);

		//line14
		Line line14 = new Line(x+w-gap, y+gap*3, x+w-gap, y+gap*4);
		line14.draw(surface);

		//line15
		Line line15 = new Line(x+w-gap, y+(gap*5-gap/6), x+w, y+(gap*5-gap/6));
		line15.draw(surface);

		//line16
		Line line16 = new Line(x+gap, y+gap*4, x+gap, y+(gap*5+gap/2));
		line16.draw(surface);

		//line17
		Line line17 = new Line(x+gap*2, y+(gap*5-gap/6), x+gap*3, y+(gap*5-gap/6));
		line17.draw(surface);

		//line18
		Line line18 = new Line(x+gap*4, y+gap*5, x+gap*6, y+gap*5);
		line18.draw(surface);

		//line19
		Line line19 = new Line(x+gap*6, y+gap*4, x+gap*6, y+gap*5);
		line19.draw(surface);

		//line20
		Line line20 = new Line(x, y+(gap*5+gap/2), x+gap,y+(gap*5+gap/2));
		line20.draw(surface);

		//line21
		Line line21 = new Line(((x+gap*2)+(x+gap*3))/2, y+h-gap, ((x+gap*2)+(x+gap*3))/2, y+h);
		line21.draw(surface);

		//line22
		Line line22 = new Line(x+(gap*4-gap/2), y+h-gap+gap/4, x+gap*5, y+h-gap+gap/4);
		line22.draw(surface);

		//line23
		Line line23 = new Line(x+gap*5, y+gap*5, x+gap*5, y+h-gap+gap/4);
		line23.draw(surface);

		//line24
		Line line24 = new Line(x+gap*6, y+h-(gap-gap/4), x+gap*6, y+h);
		line24.draw(surface);

		//line25
		Line line25 = new Line(x+gap*7, y+h-gap, x+w-gap, y+h-gap);
		line25.draw(surface);

		//lastline
		Line lastline = new Line(x+w-gap, y+h, x+w-gap, y+h-gap);
		lastline.draw(surface);





		player.draw(surface);
		player.act();
		shapesInteraction();


		if (surface.isPressed(KeyEvent.VK_LEFT))
		{
			z += 3;
			shapesInteraction();

			player.accelerate(1.1,0);

		}
		if (surface.isPressed(KeyEvent.VK_RIGHT))
		{
			z += 3;
			shapesInteraction();

			player.accelerate(-1.1,0);

		}
		if (surface.isPressed(KeyEvent.VK_UP))
		{

			shapesInteraction();

			player.accelerate(0,-1);

		}
		if (surface.isPressed(KeyEvent.VK_DOWN))
		{

			shapesInteraction();

			player.accelerate(0,1);

		}



	}

	public void keyPressed()
	{

		if (surface.isPressed(KeyEvent.VK_LEFT))
			z -= 3;
		if (surface.isPressed(KeyEvent.VK_RIGHT))
		{
			z += 3;
			shapesInteraction();

			player.accelerate(-1.1,0);

		}
		if (surface.isPressed(KeyEvent.VK_UP))
			m -= 3;
		if (surface.isPressed(KeyEvent.VK_DOWN))
			m += 3;
	}	


	public void shapesInteraction()
	{
		double x1;
		x1 = player.getCX();
		double y1;
		y1 = player.getCY();

		int x, y, w, h, gap;
		x = 50;
		y = 60;
		w = 300;
		h = 200;
		gap = 30;
		//drawing the bounding lines for the rectangle and circle


		Line botRect = new Line (x1, y1+50, x1+50,y1+50);
		Line top = new Line(x+gap, y, x+w, y);
		//checks if circle lines intersects with rect
		//boolean leftRect = circle.intersects(rect); //CH vs RLH

		//checks circle's vertical line
		//boolean circ = circleVert.intersects(rect);

		//checks rect bounding lines against the circle's bounding lines
		//boolean rectTop = circleVert.intersects(topRect); // CV vs RTopH
		boolean botRectangle = top.intersects(botRect); // CV vs RBotH
		//boolean rightRectangle = circle.intersects(rightRect); // CV vs RBotH
		//System.out.println("here");


		if ( botRectangle)
		{
			System.out.println("here");
			//			shape.bounceOff();
			//			shape.changeColor();
			//			shape2.bounceOff();


		}

	}



}
