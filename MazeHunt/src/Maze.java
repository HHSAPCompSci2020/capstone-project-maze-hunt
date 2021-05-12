import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PApplet;

//import fdominique576.shapes.Rectangle;
//import fdominique576.shapes.Rectangle;
import g4p_controls.GAlign;
import g4p_controls.GButton;
import g4p_controls.GLabel;

//import fdominique576.physicsshapedemo.PhysicsShape;

public class Maze extends Screen{

	private DrawingSurface surface;
	private Clues c = new Clues();
	int z,m;
	private Color exitRevel;
	private int cluesFound=0;

	private Clues clue;
	private Rectangle player1;
	
	private Rectangle tester;

	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		clue = new Clues();

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

		//Rectangle(x,y,angle,length)
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

		player1 = new Rectangle(z,m,50,20);
		tester = new Rectangle(100,203,50,20);
		//top entry
//		Rectangle tope = new Rectangle(x, y, x+gap, y);
//		//color
//		tope.setStrokeColor(new Color(176,224,230));
//		tope.draw(surface);
//
//		//top line
//		Rectangle top = new Rectangle(x+gap, y, x+w, y);
//		top.draw(surface);
//
//		//right line
//		Rectangle right = new Rectangle(x+w, y, x+w, y+h);
//		right.draw(surface);
//
//		//bottom exit
//		Rectangle bottome = new Rectangle(x+w, y+h, x+w-gap, y+h);
		if (cluesFound==5)
		{
			exitRevel = new Color(176,224,230);
		}
		else
			exitRevel = Color.BLACK;
		//color
//		bottome.draw(surface);
//
		//bottom line
		Rectangle bottom = new Rectangle(x+w-gap, y+h, x, y+h);
		surface.rect(bottom.x, bottom.y, bottom.width, bottom.height);
		

		//left line
		Rectangle left = new Rectangle(x, y+h, x, y);
		surface.rect(left.x, left.y, left.width, left.height);

		//line1
		Rectangle line1 = new Rectangle(x+gap, y, x+gap, y+gap);
		surface.rect(line1.x, line1.y, line1.width, line1.height);

		//line2
		Rectangle line2 = new Rectangle(x+gap*2, y+gap, x+w, y+gap);
		surface.rect(line2.x, line2.y, line2.width, line2.height);

		//line3
		Rectangle line3 = new Rectangle(x+gap, y+gap*2, x+w-gap, y+gap*2);
		surface.rect(line3.x, line3.y, line3.width, line3.height);

		//line4
		Rectangle line4 = new Rectangle(x+gap, y+gap*2, x+gap, y+gap*3);
		surface.rect(line4.x, line4.y, line4.width, line4.height);

		//line5
		Rectangle line5 = new Rectangle(x+gap*2, y+gap*3, x+gap*2, y+gap*4);
		surface.rect(line5.x, line5.y, line5.width, line5.height);

		//line6
		Rectangle line6 = new Rectangle(x+gap*3, y+gap*2, x+gap*3, y+gap*3);
		surface.rect(line6.x, line6.y, line6.width, line6.height);

		//line7
		Rectangle line7 = new Rectangle(x+gap*4, y+gap*3, x+gap*6, y+gap*3);
		surface.rect(line7.x, line7.y, line7.width, line7.height);

		//line8
		Rectangle line8 = new Rectangle(x+gap*7, y+gap*3, x+w, y+gap*3);
		surface.rect(line8.x, line8.y, line8.width, line8.height);

		//line9
		Rectangle line9 = new Rectangle(x+gap, y+gap*4, x+gap*3, y+gap*4);
		surface.rect(line9.x, line9.y, line9.width, line9.height);

		//line10
		Rectangle line10 = new Rectangle(x+gap*4, y+gap*3, x+gap*4, y+gap*5);
		surface.rect(line10.x, line10.y, line10.width, line10.height);

		//line11
		Rectangle line11 = new Rectangle(x+gap*5, y+gap*4, x+gap*6, y+gap*4);
		surface.rect(line11.x, line11.y, line11.width, line11.height);

		//line12
		Rectangle line12 = new Rectangle(x+gap*7, (((y+gap*4)+(y+gap*5))/2)-gap/5, x+w-gap*2, (((y+gap*4)+(y+gap*5))/2)-gap/5);
		surface.rect(line12.x, line12.y, line12.width, line12.height);

		//line13
		Rectangle line13 = new Rectangle(x+w-gap*2, y+(gap*4-gap/4), x+w-gap*2, y+gap*5);
		surface.rect(line13.x, line13.y, line13.width, line13.height);

		//line14
		Rectangle line14 = new Rectangle(x+w-gap, y+gap*3, x+w-gap, y+gap*4);
		surface.rect(line14.x, line14.y, line14.width, line14.height);

		//line15
		Rectangle line15 = new Rectangle(x+w-gap, y+(gap*5-gap/6), x+w, y+(gap*5-gap/6));
		surface.rect(line15.x, line15.y, line15.width, line15.height);

		//line16
		Rectangle line16 = new Rectangle(x+gap, y+gap*4, x+gap, y+(gap*5+gap/2));
		surface.rect(line16.x, line16.y, line16.width, line16.height);

		//line17
		Rectangle line17 = new Rectangle(x+gap*2, y+(gap*5-gap/6), x+gap*3, y+(gap*5-gap/6));
		surface.rect(line17.x, line17.y, line17.width, line17.height);

		//line18
		Rectangle line18 = new Rectangle(x+gap*4, y+gap*5, x+gap*6, y+gap*5);
		surface.rect(line18.x, line18.y, line18.width, line18.height);

		//line19
		Rectangle line19 = new Rectangle(x+gap*6, y+gap*4, x+gap*6, y+gap*5);
		surface.rect(line19.x, line19.y, line19.width, line19.height);

		//line20
		Rectangle line20 = new Rectangle(x, y+(gap*5+gap/2), x+gap,y+(gap*5+gap/2));
		surface.rect(line20.x, line20.y, line20.width, line20.height);

		//line21
		Rectangle line21 = new Rectangle(((x+gap*2)+(x+gap*3))/2, y+h-gap, ((x+gap*2)+(x+gap*3))/2, y+h);
		surface.rect(line21.x, line21.y, line21.width, line21.height);

		//line22
		Rectangle line22 = new Rectangle(x+(gap*4-gap/2), y+h-gap+gap/4, x+gap*5, y+h-gap+gap/4);
		surface.rect(line22.x, line22.y, line22.width, line22.height);

		//line23
		Rectangle line23 = new Rectangle(x+gap*5, y+gap*5, x+gap*5, y+h-gap+gap/4);
		surface.rect(line23.x, line23.y, line23.width, line23.height);

		//line24
		Rectangle line24 = new Rectangle(x+gap*6, y+h-(gap-gap/4), x+gap*6, y+h);
		surface.rect(line24.x, line24.y, line24.width, line24.height);

		//line25
		Rectangle line25 = new Rectangle(x+gap*7, y+h-gap, x+w-gap, y+h-gap);
		surface.rect(line25.x, line25.y, line25.width, line25.height);

		//lastline
		Rectangle lastline = new Rectangle(x+w-gap, y+h, x+w-gap, y+h-gap);
		surface.rect(lastline.x, lastline.y, lastline.width, lastline.height);
		
		//selectClue();


		surface.rect(player1.x, player1.y,player1.width, player1.height);
		surface.rect(tester.x, tester.y, tester.width, tester.height);
		
		//player.act();
		//shapesInteraction();


		if (surface.isPressed(KeyEvent.VK_LEFT))
		{
			z-=2;

			//player.accelerate(-1.1,0);

		}
		if (surface.isPressed(KeyEvent.VK_RIGHT))
		{
			z+=2;

			//player.accelerate(1.1,0);


		}
		if (surface.isPressed(KeyEvent.VK_UP))
		{
			m-=2;
			//shapesInteraction();

			//player.accelerate(0,-1);


		}
		if (surface.isPressed(KeyEvent.VK_DOWN))
		{
			m+=2;
			shapesInteraction();

			//player.accelerate(0,1);


		}


		if (player1.intersects(tester))
		{
			System.out.println("intersects");
			m= (int) (m-0.5);
			z= (int) (z-0.5);		
		}

	}

//	public void keyPressed()
//	{
//
//		if (surface.isPressed(KeyEvent.VK_LEFT))
//			z -= 3;
//		if (surface.isPressed(KeyEvent.VK_RIGHT))
//		{
//			z += 3;
//			shapesInteraction();
//
//			//player.translate()
//
//		}
//		if (surface.isPressed(KeyEvent.VK_UP))
//			m -= 3;
//		if (surface.isPressed(KeyEvent.VK_DOWN))
//			m += 3;
//	}	


	public void shapesInteraction()
	{
//		double x1;
//		x1 = player.getCX();
//		double y1;
//		y1 = player.getCY();

		int x, y, w, h, gap;
		x = 50;
		y = 60;
		w = 300;
		h = 200;
		gap = 30;
		//drawing the bounding lines for the rectangle and circle


//		Rectangle botRect = new Rectangle (x1, y1+50, x1+50,y1+50);
//		Rectangle top = new Rectangle(x+gap, y, x+w, y);
		//checks if circle lines intersects with rect
		//boolean leftRect = circle.intersects(rect); //CH vs RLH

		//checks circle's vertical line
		//boolean circ = circleVert.intersects(rect);

		//checks rect bounding lines against the circle's bounding lines
		//boolean rectTop = circleVert.intersects(topRect); // CV vs RTopH
		//boolean botRectangle = top.intersects(botRect); // CV vs RBotH
		//boolean rightRectangle = circle.intersects(rightRect); // CV vs RBotH
		//System.out.println("here");


//		if ( botRectangle)
//		{
//			System.out.println("here");
//			//clue.clueNumber1();
//			//			shape.bounceOff();
//			//			shape.changeColor();
//			//			shape2.bounceOff();
//
//
//		}
	}
	
	public String showClues() {
		ArrayList<String> clued = c.getClues();
		//System.out.println(clued);
		int k = (int) (Math.random()*clued.size());
		return clued.get(k);
	}
	
//	public void selectClue() {
//		GButton b1, b2, b3;
//		GLabel lblOut;
//		long timer;
//		//PApplet marker = null;
//		b1 = new GButton(surface, 100, 60, 100, 40, "Button 1");
//		b2 = new GButton(surface, 100, 120, 100, 40, "Button 2");
//		b3 = new GButton(surface, 100, 180, 100, 40, "Button 3");
//
//		lblOut = new GLabel(surface, 10, 190, 560, 20, "");
//		lblOut.setTextAlign(GAlign.CENTER, null);
//		lblOut.setText("CLICK ON A BUTTON");
//	}


}
