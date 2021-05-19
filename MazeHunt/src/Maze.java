//import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

//import fdominique576.shapes.Circle;
//import processing.core.PApplet;
import processing.core.PImage;

import java.awt.geom.Line2D;


public class Maze extends Screen{

	private DrawingSurface surface;
	private Clues c = new Clues();
	double z=15,m=35;
	double a=300,b=35;
//	private Color exitRevel;
	public int cluesFound=1;
	public boolean clue1Found = false;
	public boolean clue2Found = false;
	public boolean clue3Found = false;
	public boolean clue4Found = false;
	private PImage rat;
	private PImage cat;
	private int timeout=0;
	private int superboost=0;
	private double speedX= 2, speedY= 2;
	private double catX= 2, catY= 2;
	private ArrayList<Line2D> mazeLines; 

//	private Clues clue;
	private Rectangle player1;
	private Rectangle player2;
	private Rectangle diamond;


//	private Rectangle tester;
	private Rectangle tester2;
	

	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(345,255);
		this.surface = surface;
		mazeLines = new ArrayList<Line2D>();
		int x, y, w, h, gap;
		x = 15;
		y = 35;
		w = 300;
		h = 200;
		gap = 30;


	}


	/**
	 * Place to draw the maze and characters on
	 * @param marker the place on with the maze and characters will be drawn on
	 */
	public void draw() {
		//int clues=0;
		surface.pushStyle();
		surface.background(176,224,230);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.fill(0);
		surface.textSize(5);
		surface.text("Maze Hunt Reminder: \nMove the mouse around to run from the cat and find the clues. "
				+ "Remember you can only leave \n the maze once you have found all the clues. Good luck!", 5, 15);
		//		surface.background(176,224,230);

		//Rectangle(x,y,angle,length)
		//System.out.println("here");
		// marker.background(255);

		// circle.draw(marker);
		// marker.rect(20, 10, 20, 10);

		int x, y, w, h, gap;
		x = 15;
		y = 35;
		w = 300;
		h = 200;
		gap = 30;

		player1 = new Rectangle((int)z,(int)m,19,19);

		player2 = new Rectangle((int)a,(int)b,17,17);
		diamond = new Rectangle(297, 130, 14, 10);
		tester2 = new Rectangle (140, 130, 10, 10);
		


		//tester = new Rectangle(100,203,50,20);
		
		
		//top entry
		//Line2D tope = new Line2D.Float(x, y, x+gap, y);//clue
		//color
		//tope.setStroke(new Color(176,224,230));
//		float tex1 = (float) tope.getX1();
//		float tey1 = (float) tope.getY1();
//		float tex2 = (float) tope.getX2();
//		float tey2 = (float) tope.getY2();
		//surface.line(tex1, tey1, tex2, tey2);

		//top line
		Line2D top = new Line2D.Float(x+gap, y, x+w, y);
		float tx1 = (float) top.getX1();
		float ty1 = (float) top.getY1();
		float tx2 = (float) top.getX2();
		float ty2 = (float) top.getY2();
		surface.line(tx1, ty1, tx2, ty2);
		mazeLines.add(top);

		//right line
		Line2D right = new Line2D.Float(x+w, y, x+w, y+h);
		float rx1 = (float) right.getX1();
		float ry1 = (float) right.getY1();
		float rx2 = (float) right.getX2();
		float ry2 = (float) right.getY2();
		surface.line(rx1, ry1, rx2, ry2);
		mazeLines.add(right);


		//bottom exit
		Line2D bottome = new Line2D.Float(x+w, y+h, x+w-gap, y+h); //clue
		//color
		float bex1 = (float) bottome.getX1();
		float bey1 = (float) bottome.getY1();
		float bex2 = (float) bottome.getX2();
		float bey2 = (float) bottome.getY2();
		surface.line(bex1, bey1, bex2, bey2);
		mazeLines.add(bottome);

		
		//bottom line
		Line2D bottom = new Line2D.Float(x+w-gap, y+h, x, y+h);
		float bx1 = (float) bottom.getX1();
		float by1 = (float) bottom.getY1();
		float bx2 = (float) bottom.getX2();
		float by2 = (float) bottom.getY2();
		surface.line(bx1, by1, bx2, by2);
		mazeLines.add(bottom);


		
		Line2D tester = new Line2D.Float(x+w-gap, y+h, x, y+h);
		//Line2D test = new Line2D(x+w-gap, y+h, x, y+h);
		float x1 = (float) tester.getX1();
		float y1 = (float) tester.getY1();
		float x2 = (float) tester.getX2();
		float y2 = (float) tester.getY2();
		surface.line(x1, y1, x2, y2);
		mazeLines.add(tester);


		//left line
		Line2D left = new Line2D.Float(x, y+h, x, y);
		float lx1 = (float) left.getX1();
		float ly1 = (float) left.getY1();
		float lx2 = (float) left.getX2();
		float ly2 = (float) left.getY2();
		surface.line(lx1, ly1, lx2, ly2);
		mazeLines.add(left);

		
		//line1
		Line2D line1 = new Line2D.Float(x+gap, y, x+gap, y+gap);
		float l1x1 = (float) line1.getX1();
		float l1y1 = (float) line1.getY1();
		float l1x2 = (float) line1.getX2();
		float l1y2 = (float) line1.getY2();
		surface.line(l1x1, l1y1, l1x2, l1y2);
		mazeLines.add(line1);


		//line2
		Line2D line2 = new Line2D.Float(x+gap*2, y+gap, x+w, y+gap);
		float l2x1 = (float) line2.getX1();
		float l2y1 = (float) line2.getY1();
		float l2x2 = (float) line2.getX2();
		float l2y2 = (float) line2.getY2();
		surface.line(l2x1, l2y1, l2x2, l2y2);
		mazeLines.add(line2);


		//line3
		Line2D line3 = new Line2D.Float(x+gap, y+gap*2, x+w-gap, y+gap*2);
		float l3x1 = (float) line3.getX1();
		float l3y1 = (float) line3.getY1();
		float l3x2 = (float) line3.getX2();
		float l3y2 = (float) line3.getY2();
		surface.line(l3x1, l3y1, l3x2, l3y2);
		mazeLines.add(line3);


		//line4
		Line2D line4 = new Line2D.Float(x+gap, y+gap*2, x+gap, y+gap*3);
		float l4x1 = (float) line4.getX1();
		float l4y1 = (float) line4.getY1();
		float l4x2 = (float) line4.getX2();
		float l4y2 = (float) line4.getY2();
		surface.line(l4x1, l4y1, l4x2, l4y2);
		mazeLines.add(line4);
		

		//line5
		Line2D line5 = new Line2D.Float(x+gap*2, y+gap*3, x+gap*2, y+gap*4);
		float l5x1 = (float) line5.getX1();
		float l5y1 = (float) line5.getY1();
		float l5x2 = (float) line5.getX2();
		float l5y2 = (float) line5.getY2();
		surface.line(l5x1, l5y1, l5x2, l5y2);
		mazeLines.add(line5);

		//line6
		Line2D line6 = new Line2D.Float(x+gap*3, y+gap*2, x+gap*3, y+gap*3);
		float l6x1 = (float) line6.getX1();
		float l6y1 = (float) line6.getY1();
		float l6x2 = (float) line6.getX2();
		float l6y2 = (float) line6.getY2();
		surface.line(l6x1, l6y1, l6x2, l6y2);
		mazeLines.add(line6);

		//line7
		Line2D line7 = new Line2D.Float(x+gap*4, y+gap*3, x+gap*6, y+gap*3);
		float l7x1 = (float) line7.getX1();
		float l7y1 = (float) line7.getY1();
		float l7x2 = (float) line7.getX2();
		float l7y2 = (float) line7.getY2();
		surface.line(l7x1, l7y1, l7x2, l7y2);
		mazeLines.add(line7);

		//line8
		Line2D line8 = new Line2D.Float(x+gap*7, y+gap*3, x+w, y+gap*3);
		float l8x1 = (float) line8.getX1();
		float l8y1 = (float) line8.getY1();
		float l8x2 = (float) line8.getX2();
		float l8y2 = (float) line8.getY2();
		surface.line(l8x1, l8y1, l8x2, l8y2);
		mazeLines.add(line8);

		//line9
		Line2D line9 = new Line2D.Float(x+gap, y+gap*4, x+gap*3, y+gap*4);
		float l9x1 = (float) line9.getX1();
		float l9y1 = (float) line9.getY1();
		float l9x2 = (float) line9.getX2();
		float l9y2 = (float) line9.getY2();
		surface.line(l9x1, l9y1, l9x2, l9y2);
		mazeLines.add(line9);

		//line10
		Line2D line10 = new Line2D.Float(x+gap*4, y+gap*3, x+gap*4, y+gap*5);
		float l10x1 = (float) line10.getX1();
		float l10y1 = (float) line10.getY1();
		float l10x2 = (float) line10.getX2();
		float l10y2 = (float) line10.getY2();
		surface.line(l10x1, l10y1, l10x2, l10y2);
		mazeLines.add(line10);

		//line11
		Line2D line11 = new Line2D.Float(x+gap*5, y+gap*4, x+gap*6, y+gap*4);
		float l11x1 = (float) line11.getX1();
		float l11y1 = (float) line11.getY1();
		float l11x2 = (float) line11.getX2();
		float l11y2 = (float) line11.getY2();
		surface.line(l11x1, l11y1, l11x2, l11y2);
		mazeLines.add(line11);

		//line12
		Line2D line12 = new Line2D.Float(x+gap*7, (((y+gap*4)+(y+gap*5))/2)-gap/5, x+w-gap*2, (((y+gap*4)+(y+gap*5))/2)-gap/5);
		float l12x1 = (float) line12.getX1();
		float l12y1 = (float) line12.getY1();
		float l12x2 = (float) line12.getX2();
		float l12y2 = (float) line12.getY2();
		surface.line(l12x1, l12y1, l12x2, l12y2);
		mazeLines.add(line12);

		//line13
		Line2D line13 = new Line2D.Float(x+w-gap*2, y+(gap*4-gap/4), x+w-gap*2, y+gap*5);
		float l13x1 = (float) line13.getX1();
		float l13y1 = (float) line13.getY1();
		float l13x2 = (float) line13.getX2();
		float l13y2 = (float) line13.getY2();
		surface.line(l13x1, l13y1, l13x2, l13y2);
		mazeLines.add(line13);

		//line14
		Line2D line14 = new Line2D.Float(x+w-gap, y+gap*3, x+w-gap, y+gap*4);
		float l14x1 = (float) line14.getX1();
		float l14y1 = (float) line14.getY1();
		float l14x2 = (float) line14.getX2();
		float l14y2 = (float) line14.getY2();
		surface.line(l14x1, l14y1, l14x2, l14y2);
		mazeLines.add(line14);

		//line15
		Line2D line15 = new Line2D.Float(x+w-gap, y+(gap*5-gap/6), x+w, y+(gap*5-gap/6));
		float l15x1 = (float) line15.getX1();
		float l15y1 = (float) line15.getY1();
		float l15x2 = (float) line15.getX2();
		float l15y2 = (float) line15.getY2();
		surface.line(l15x1, l15y1, l15x2, l15y2);
		mazeLines.add(line15);

		//line16
		Line2D line16 = new Line2D.Float(x+gap, y+gap*4, x+gap, y+(gap*5+gap/2));
		float l16x1 = (float) line16.getX1();
		float l16y1 = (float) line16.getY1();
		float l16x2 = (float) line16.getX2();
		float l16y2 = (float) line16.getY2();
		surface.line(l16x1, l16y1, l16x2, l16y2);
		mazeLines.add(line16);

		//line17
		Line2D line17 = new Line2D.Float(x+gap*2, y+(gap*5-gap/6), x+gap*3, y+(gap*5-gap/6));
		float l17x1 = (float) line17.getX1();
		float l17y1 = (float) line17.getY1();
		float l17x2 = (float) line17.getX2();
		float l17y2 = (float) line17.getY2();
		surface.line(l17x1, l17y1, l17x2, l17y2);
		mazeLines.add(line17);

		//line18
		Line2D line18 = new Line2D.Float(x+gap*4, y+gap*5, x+gap*6, y+gap*5);
		float l18x1 = (float) line18.getX1();
		float l18y1 = (float) line18.getY1();
		float l18x2 = (float) line18.getX2();
		float l18y2 = (float) line18.getY2();
		surface.line(l18x1, l18y1, l18x2, l18y2);
		mazeLines.add(line18);

		//line19
		Line2D line19 = new Line2D.Float(x+gap*6, y+gap*4, x+gap*6, y+gap*5);//clue
		float l19x1 = (float) line19.getX1();
		float l19y1 = (float) line19.getY1();
		float l19x2 = (float) line19.getX2();
		float l19y2 = (float) line19.getY2();
		surface.line(l19x1, l19y1, l19x2, l19y2);
		mazeLines.add(line19);

		//line20
		Line2D line20 = new Line2D.Float(x, y+(gap*5+gap/2), x+gap,y+(gap*5+gap/2)); //clue
		float l20x1 = (float) line20.getX1();
		float l20y1 = (float) line20.getY1();
		float l20x2 = (float) line20.getX2();
		float l20y2 = (float) line20.getY2();
		surface.line(l20x1, l20y1, l20x2, l20y2);
		mazeLines.add(line20);

		//line21
		Line2D line21 = new Line2D.Float(((x+gap*2)+(x+gap*3))/2, y+h-gap, ((x+gap*2)+(x+gap*3))/2, y+h);
		float l21x1 = (float) line21.getX1();
		float l21y1 = (float) line21.getY1();
		float l21x2 = (float) line21.getX2();
		float l21y2 = (float) line21.getY2();
		surface.line(l21x1, l21y1, l21x2, l21y2);
		mazeLines.add(line21);

		//line22
		Line2D line22 = new Line2D.Float(x+(gap*4-gap/2), y+h-gap+gap/4, x+gap*5, y+h-gap+gap/4);
		float l22x1 = (float) line22.getX1();
		float l22y1 = (float) line22.getY1();
		float l22x2 = (float) line22.getX2();
		float l22y2 = (float) line22.getY2();
		surface.line(l22x1, l22y1, l22x2, l22y2);
		mazeLines.add(line22);

		//line23
		Line2D line23 = new Line2D.Float(x+gap*5, y+gap*5, x+gap*5, y+h-gap+gap/4);
		float l23x1 = (float) line23.getX1();
		float l23y1 = (float) line23.getY1();
		float l23x2 = (float) line23.getX2();
		float l23y2 = (float) line23.getY2();
		surface.line(l23x1, l23y1, l23x2, l23y2);
		mazeLines.add(line23);

		//line24
		Line2D line24 = new Line2D.Float(x+gap*6, y+h-(gap-gap/4), x+gap*6, y+h);
		float l24x1 = (float) line24.getX1();
		float l24y1 = (float) line24.getY1();
		float l24x2 = (float) line24.getX2();
		float l24y2 = (float) line24.getY2();
		surface.line(l24x1, l24y1, l24x2, l24y2);
		mazeLines.add(line24);

		//line25
		Line2D line25 = new Line2D.Float(x+gap*7, y+h-gap, x+w-gap, y+h-gap);
		float l25x1 = (float) line25.getX1();
		float l25y1 = (float) line25.getY1();
		float l25x2 = (float) line25.getX2();
		float l25y2 = (float) line25.getY2();
		surface.line(l25x1, l25y1, l25x2, l25y2);
		mazeLines.add(line25);

		//lastline
		Line2D lastline = new Line2D.Float(x+w-gap, y+h, x+w-gap, y+h-gap);
		float llx1 = (float) lastline.getX1();
		float lly1 = (float) lastline.getY1();
		float llx2 = (float) lastline.getX2();
		float lly2 = (float) lastline.getY2();
		surface.line(llx1, lly1, llx2, lly2);
		mazeLines.add(lastline);

		//selectClue();


		surface.noFill();
		surface.noStroke();
		surface.rect(player1.x, player1.y,player1.width, player1.height);

		surface.noFill();
		surface.noStroke();
		surface.rect(player2.x, player2.y, player2.width, player2.height);



		rat= surface.loadImage("rat.png");
		surface.image(rat, (float)z, (float)m,19,19);


		cat= surface.loadImage("cat.png");
		surface.image(cat, (float)a, (float)b,19,19);

		surface.fill(0); //fill 

		surface.rect(297, 130, 14, 10);

		surface.fill(0,0,204); //fill 
		surface.quad(305, 130, 297, 135, 305, 140, 310, 135);
		surface.fill(0);
		surface.rect(140, 130, 10, 10);
		surface.fill(255, 165,0 );
		surface.circle(145, 135, 8);

		if (cluesFound ==1)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line20.getX1(), (float)line20.getY1(), 30, (float)1.75);
		}

		if (cluesFound ==2)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line19.getX1(), (float)line19.getY1(),(float)1.9, 30);
		}

		if (cluesFound ==3)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line4.getX1(), (float)line4.getY1(),(float)1.90, 30);
		}

		if (cluesFound ==4)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line1.getX1(), (float)line1.getY1(),(float)1.9, 30);
		}

		if (cluesFound==5)
		{
			surface.stroke(176,224,230);
			surface.fill(176,224,230);
			surface.rect((float)bottome.getX2()+1, (float)bottome.getY2()-1, 30, (float)2);
		}

		if (player1.intersectsLine(bottome) && cluesFound==5)
		{
			surface.switchScreen(ScreenSwitcher.THANKYOU); // replace screen1 with the end screen

		}
		

		//if (player1)
		if (player1.intersectsLine(top))
		{
			System.out.println("here");
			speedX = -speedX;
			speedY = -speedY;
			//z= (int) (z+1);		
		}

		else if (player1.intersectsLine(line1))
		{
			if (clue4Found == false && clue3Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE4);
				cluesFound=5;
				clue4Found=true;
			};
			//m= (int) (m-2);
			z= (int) (z-2);		
		}


		else if (player1.intersectsLine(line2))
		{
			 
			m= (int) (m-2);
			z= (int) (z+1);		
		}

		else if (player1.intersectsLine(left))
		{
			 
			//m= (int) (m+1.5);
			z= (int) (z+2);	

		}

		else if (player1.intersectsLine(right))
		{
			 
			//m= (int) (m+1);
			z= (int) (z-2);	
			showClues();
		}

		else if (player1.intersectsLine(bottom))
		{
			 
			m= (int) (m-2);
			z= (int) (z-1);		
		}


		else if (player1.intersectsLine(line3))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line4))
		{
			if (clue3Found == false && clue2Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE3);
				cluesFound=4;
				clue3Found=true;
			}
			 
			//m= (int) (m-2);
			z= (int) (z+1);		
		}

		else if (player1.intersectsLine(line5))
		{
			 
			m= (int) (m-2);
			z= (int) (z-1);		
		}


		else if (player1.intersectsLine(line6))
		{
			 
			//m= (int) (m+1);
			z= (int) (z-1);		
		}


		else if (player1.intersectsLine(line8))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line7))
		{
			 
			m= (int) (m-2);
			z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line20))
		{
			if (clue1Found == false)
			{
				surface.switchScreen(ScreenSwitcher.CLUE1);
				cluesFound=2;
				clue1Found=true;
			}
			 
			m= (int) (m-2);
			z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line16))
		{
			 
			m= (int) (m-2);
			z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line9))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		else if (player1.intersectsLine(line17))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		if (player1.intersectsLine(line10))
		{
			 
			//m= (int) (m-1);
			z= (int) (z+1);		
		}

		if (player1.intersectsLine(line21))
		{
			 
			//m= (int) (m-1);
			z= (int) (z-1);		
		}

		if (player1.intersectsLine(line22))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		if (player1.intersectsLine(line23))
		{
			 
			//m= (int) (m-1);
			z= (int) (z+1);		
		}

		if (player1.intersectsLine(line24))
		{
			 
			//m= (int) (m-1);
			z= (int) (z-1);		
		}

		if (player1.intersectsLine(line19))
		{
			if (clue2Found == false && clue1Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE2);
				cluesFound=3;
				clue2Found=true;
			}
			 
			//m= (int) (m-1);
			z= (int) (z-1);		
		}

		if (player1.intersectsLine(line18))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		if (player1.intersectsLine(line11))
		{
			 
			m= (int) (m+1);
			//z= (int) (z-1);		
		}

		if (player1.intersectsLine(line12))
		{
			 
			m= (int) (m-2);
			//z= (int) (z-1);		
		}

		if (player1.intersectsLine(line13))
		{
			 
			//m= (int) (m+1);
			z= (int) (z+1);		
		}

		if (player1.intersectsLine(line25))
		{
			 
			m= (int) (m-2);
			//z= (int) (z+1);		
		}

		if (player1.intersectsLine(lastline))
		{
			 
			//m= (int) (m-1);
			z= (int) (z+1);		
		}

		if (player1.intersectsLine(bottome) && cluesFound!=5)
		{

			 
			m= (int) (m-2);
			//z= (int) (z+1);		
		}

		if (player1.intersectsLine(line14))
		{
			 
			//m= (int) (m-1);
			z= (int) (z+1);		
		}

		if (player1.intersectsLine(line15))
		{
			 
			m= (int) (m+1);
			//z= (int) (z+1);		
		}

		if (player1.intersects(player2))
		{
			surface.switchScreen(ScreenSwitcher.YOULOSE);//change to lose screen

		}

		if (player2.intersectsLine(top))
		{
			System.out.println("test");
			b = (int) (b+2);
			//a = (int) (a+1);		
		}

		if (player2.intersectsLine(line1))
		{
			//b= (int) (b-2);
			a= (int) (a-1);		
		}


		if (player2.intersectsLine(line2))
		{
			 
			b = (int) (b-2);
			//a = (int) (a+1);		
		}

		if (player2.intersectsLine(left))
		{
			 
			//b = (int) (b+1.5);
			a = (int) (a+2);	

		}

		if (player2.intersectsLine(right))
		{
			 
			//b = (int) (b+1);
			a = (int) (a-2);	
			showClues();
		}

		if (player2.intersectsLine(bottom))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}


		if (player2.intersectsLine(line3))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line4))
		{
			 
			//b = (int) (b-2);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line5))
		{
			 
			b = (int) (b-2);
			a = (int) (a-1);		
		}


		if (player2.intersectsLine(line6))
		{
			 
			//b = (int) (b+2);
			a = (int) (a-1);		
		}


		if (player2.intersectsLine(line8))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line7))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line20))
		{
			 
			b = (int) (b-2);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line16))
		{
			 
			b = (int) (b-2);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line9))
		{
			 
			b = (int) (b-2);
			//a= (int) (a-1);		
		}

		if (player2.intersectsLine(line17))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line10))
		{
			 
			//b = (int) (b-1);
			a = (int) (a+1);		
		}

		if (player2.intersectsLine(line21))
		{
			 
			//b = (int) (b-1);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line22))
		{
			 
			b = (int) (b-2);
			//a= (int) (a-1);		
		}

		if (player2.intersectsLine(line23))
		{
			 
			//b = (int) (b-1);
			a = (int) (a+1);		
		}

		if (player2.intersectsLine(line24))
		{
			 
			//b = (int) (b-1);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line19))
		{
			 
			//b = (int) (b-1);
			a = (int) (a-1);		
		}

		if (player2.intersectsLine(line18))
		{
			 
			b = (int) (b-1);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line11))
		{
			 
			b = (int) (b+2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line12))
		{
			 
			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		if (player2.intersectsLine(line13))
		{
			 
			//b= (int) (b+1);
			a = (int) (a+1);		
		}

		if (player2.intersectsLine(line25))
		{
			 
			b = (int) (b-2);
			//a= (int) (a+1);		
		}

		if (player2.intersectsLine(lastline))
		{
			 
			//b = (int) (b-1);
			a = (int) (a+1);		
		}

		if (player2.intersectsLine(line14))
		{
			 
			//b = (int) (b-1);
			a= (int) (a+1);		
		}

		if (player2.intersectsLine(line15))
		{
			 
			b = (int) (b+2);
			//a = (int) (a+1);		
		}

		if (surface.isPressed(KeyEvent.VK_LEFT))
		{

			z = z-speedX;

		}
		if (surface.isPressed(KeyEvent.VK_RIGHT))
		{

			z = z+speedX;

		}
		if (surface.isPressed(KeyEvent.VK_UP))
		{

			m = m-speedY;

		}

		if (surface.isPressed(KeyEvent.VK_DOWN))
		{

			m = m+speedY;


		}

		if (surface.isPressed(KeyEvent.VK_W)) //up
		{

			b = b-catY;

		}
		if (surface.isPressed(KeyEvent.VK_A)) //left
		{

			a= a-catX;;

		}
		if (surface.isPressed(KeyEvent.VK_S))//down
		{

			b= b+catY;

		}

		if (surface.isPressed(KeyEvent.VK_D))//right
		{

			a = a+catX;

		}

		if (player1.intersects(diamond)&&timeout==0)
		{
			this.slowSpeed();
			while (timeout>0)
			{
				catX = catX-1;
				catY = catY-1;
				timeout--;
			}


		}

		if (timeout==0)
		{
			speedNorm();
		}


		if (player1.intersects(tester2)) //change r to circle box
		{
			this.Speedup();
			while(superboost >0)
			{
				speedX = speedX+2;
				speedY = speedY+2;
				superboost--;
			}
		}
		
		if (superboost == 0)
		{
			speedNorm();
		}
		

	}






	public String showClues() {
		ArrayList<String> clued = c.getClues();
		//System.out.println(clued);
		int k = (int) (Math.random()*clued.size());

		return clued.get(k);

	}


	public void slowSpeed()
	{

		timeout = 60*15;
	}
	
	public void Speedup()
	{

		superboost = 60*15;
	}

	
	public void speedNorm()
	{

		catX = 2.5;
		catY=2.5;

		speedX = 2;
		speedY=2;
	}

}
