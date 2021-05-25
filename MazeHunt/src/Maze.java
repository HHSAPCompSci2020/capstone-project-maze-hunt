import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import processing.core.PImage;
import java.awt.geom.Line2D;
import java.util.concurrent.TimeUnit;
public class Maze extends Screen{

	protected DrawingSurface surface;
	protected double z=20,m=35;
	protected double a=300,b=35;
	private  int cluesFound=1;
	private boolean clue1Found = false;
	private boolean clue2Found = false;
	private boolean clue3Found = false;
	private boolean clue4Found = false;
	private boolean clue5Found = false;
	private boolean clue6Found = false;
	private boolean clue7Found = false;
	private boolean clue8Found = false;
	private boolean speedUp=false;
	private boolean slowDown=false;
	private PImage rat;
	private PImage kitten;


	protected double speedX= 0, speedY= 0;
	private double catX= 0, catY= 0;
	private ArrayList<Line2D> mazeLines; 

	private Mouse p1;
	private Cat p2;

	//	private Clues clue;
	private Rectangle mouse;
	private Rectangle cat;
	private Rectangle diamond;
	private Rectangle diamond2;
	private Mouse Mouse;
	private Cat Cat;
	int savedTime;
	int totalTime = 15000;


	private Rectangle superBoost1;
	private Rectangle superBoost2;


	/**
	 * Constructs a maze 
	 */
	public Maze(DrawingSurface surface) {
		super(345,255);
		this.surface = surface;
		Mouse = new Mouse(25,30,15,15);
		Cat = new Cat(300,35,17,17);
		
		mazeLines = new ArrayList<Line2D>();

	}

	/**
	 * Place to draw the maze and characters on
	 * @param marker the place on with the maze and characters will be drawn on
	 */
	public void draw() {
		//int clues=0;
		Mouse.draw();
		surface.pushStyle();
		surface.background(176,224,230);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.fill(0);
		surface.textSize(5);
		surface.text("Maze Hunt Reminder: \nMove the mouse around to run from the cat and find the clues. "
				+ "Remember you can only leave the maze once you have found all the clues."
				+ "\nSuperboosts are yellow (increase mouse's speed for 15 secs) and diamonds are blue (decreases cat's speed for 15 secs). Good luck!", 1, 0);
		

		int x, y, w, h, gap;
		x = 15;
		y = 35;
		w = 300;
		h = 200;
		gap = 30;





		//top line
		Line2D top = new Line2D.Float(x+gap, y, x+w, y);
		surface.line(getLineX1(top), getLineY1(top), getLineX2(top), getLineY2(top));
		mazeLines.add(top);

		//right line
		Line2D right = new Line2D.Float(x+w, y, x+w, y+h);
		surface.line(getLineX1(right), getLineY1(right), getLineX2(right), getLineY2(right));
		mazeLines.add(right);


		//bottom exit
		Line2D bottome = new Line2D.Float(x+w, y+h, x+w-gap, y+h); //clue
		surface.line(getLineX1(bottome), getLineY1(bottome), getLineX2(bottome), getLineY2(bottome));
		mazeLines.add(bottome);


		//bottom line
		Line2D bottom = new Line2D.Float(x+w-gap, y+h, x, y+h);
		surface.line(getLineX1(bottom), getLineY1(bottom), getLineX2(bottom), getLineY2(bottom));
		mazeLines.add(bottom);



		Line2D tester = new Line2D.Float(x+w-gap, y+h, x, y+h);
		surface.line(getLineX1(tester), getLineY1(tester), getLineX2(tester), getLineY2(tester));
		mazeLines.add(tester);


		//left line
		Line2D left = new Line2D.Float(x, y+h, x, y);
		surface.line(getLineX1(left), getLineY1(left), getLineX2(left), getLineY2(left));
		mazeLines.add(left);

		//line1
		Line2D line1 = new Line2D.Float(x+gap, y, x+gap, y+gap);
		surface.line(getLineX1(line1), getLineY1(line1), getLineX2(line1), getLineY2(line1));
		mazeLines.add(line1);


		//line2
		Line2D line2 = new Line2D.Float(x+gap*2, y+gap, x+w, y+gap);
		surface.line(getLineX1(line2), getLineY1(line2), getLineX2(line2), getLineY2(line2));
		mazeLines.add(line2);


		//line3
		Line2D line3 = new Line2D.Float(x+gap, y+gap*2, x+w-gap, y+gap*2);
		surface.line(getLineX1(line3), getLineY1(line3), getLineX2(line3), getLineY2(line3));
		mazeLines.add(line3);


		//line4
		Line2D line4 = new Line2D.Float(x+gap, y+gap*2, x+gap, y+gap*3);
		surface.line(getLineX1(line4), getLineY1(line4), getLineX2(line4), getLineY2(line4));
		mazeLines.add(line4);


		//line5
		Line2D line5 = new Line2D.Float(x+gap*2, y+gap*3, x+gap*2, y+gap*4);
		surface.line(getLineX1(line5), getLineY1(line5), getLineX2(line5), getLineY2(line5));
		mazeLines.add(line5);

		//line6
		//		Line2D line6 = new Line2D.Float(x+gap*3, y+gap*2, x+gap*3, y+gap*3);
		//		surface.line(getLineX1(line6), getLineY1(line6), getLineX2(line6), getLineY2(line6));
		//		mazeLines.add(line6);

		//line7
		Line2D line7 = new Line2D.Float(x+gap*4, y+gap*3, x+gap*6, y+gap*3);
		surface.line(getLineX1(line7), getLineY1(line7), getLineX2(line7), getLineY2(line7));
		mazeLines.add(line7);

		//line8
		Line2D line8 = new Line2D.Float(x+gap*7, y+gap*3, x+w, y+gap*3);
		surface.line(getLineX1(line8), getLineY1(line8), getLineX2(line8), getLineY2(line8));
		mazeLines.add(line8);

		//line9
		Line2D line9 = new Line2D.Float(x+gap, y+gap*4, x+gap*3, y+gap*4);
		surface.line(getLineX1(line9), getLineY1(line9), getLineX2(line9), getLineY2(line9));
		mazeLines.add(line9);

		//line10
		Line2D line10 = new Line2D.Float(x+gap*4, y+gap*3, x+gap*4, y+gap*5);
		surface.line(getLineX1(line10), getLineY1(line10), getLineX2(line10), getLineY2(line10));
		mazeLines.add(line10);

		//line11
		Line2D line11 = new Line2D.Float(x+gap*5, y+gap*4, x+gap*6, y+gap*4);
		surface.line(getLineX1(line11), getLineY1(line11), getLineX2(line11), getLineY2(line11));
		mazeLines.add(line11);

		//line12
		Line2D line12 = new Line2D.Float(x+gap*7, (((y+gap*4)+(y+gap*5))/2)-gap/5, x+w-gap*2, (((y+gap*4)+(y+gap*5))/2)-gap/5);
		surface.line(getLineX1(line12), getLineY1(line12), getLineX2(line12), getLineY2(line12));
		mazeLines.add(line12);

		//line13
		Line2D line13 = new Line2D.Float(x+w-gap*2, y+(gap*4-gap/4), x+w-gap*2, y+gap*5);
		surface.line(getLineX1(line13), getLineY1(line13), getLineX2(line13), getLineY2(line13));
		mazeLines.add(line13);

		//line14
		Line2D line14 = new Line2D.Float(x+w-gap, y+gap*3, x+w-gap, y+gap*4);
		surface.line(getLineX1(line14), getLineY1(line14), getLineX2(line14), getLineY2(line14));
		mazeLines.add(line14);

		//line15
		Line2D line15 = new Line2D.Float(x+w-gap, y+(gap*5-gap/6), x+w, y+(gap*5-gap/6));
		surface.line(getLineX1(line15), getLineY1(line15), getLineX2(line15), getLineY2(line15));
		mazeLines.add(line15);

		//line16
		Line2D line16 = new Line2D.Float(x+gap, y+gap*4, x+gap, y+(gap*5+gap/2));
		surface.line(getLineX1(line16), getLineY1(line16), getLineX2(line16), getLineY2(line16));
		mazeLines.add(line16);

		//line17
		Line2D line17 = new Line2D.Float(x+gap*2, y+(gap*5-gap/6), x+gap*3, y+(gap*5-gap/6));
		surface.line(getLineX1(line17), getLineY1(line17), getLineX2(line17), getLineY2(line17));
		mazeLines.add(line17);

		//line18
		Line2D line18 = new Line2D.Float(x+gap*4, y+gap*5, x+gap*6, y+gap*5);
		surface.line(getLineX1(line18), getLineY1(line18), getLineX2(line18), getLineY2(line18));
		mazeLines.add(line18);

		//line19
		Line2D line19 = new Line2D.Float(x+gap*6, y+gap*4, x+gap*6, y+gap*5);//clue
		surface.line(getLineX1(line19), getLineY1(line19), getLineX2(line19), getLineY2(line19));
		mazeLines.add(line19);

		//line20
		Line2D line20 = new Line2D.Float(x, y+(gap*5+gap/2), x+gap,y+(gap*5+gap/2)); //clue
		surface.line(getLineX1(line20), getLineY1(line20), getLineX2(line20), getLineY2(line20));
		mazeLines.add(line20);

		//line21
		Line2D line21 = new Line2D.Float(((x+gap*2)+(x+gap*3))/2, y+h-gap, ((x+gap*2)+(x+gap*3))/2, y+h);
		surface.line(getLineX1(line21), getLineY1(line21), getLineX2(line21), getLineY2(line21));
		mazeLines.add(line21);

		//line22
		Line2D line22 = new Line2D.Float(x+(gap*4-gap/2), y+h-gap+gap/4, x+gap*5, y+h-gap+gap/4);
		surface.line(getLineX1(line22), getLineY1(line22), getLineX2(line22), getLineY2(line22));
		mazeLines.add(line22);

		//line23
		Line2D line23 = new Line2D.Float(x+gap*5, y+gap*5, x+gap*5, y+h-gap+gap/4);
		surface.line(getLineX1(line23), getLineY1(line23), getLineX2(line23), getLineY2(line23));
		//surface.line(mazeLines.get(0));
		mazeLines.add(line23);

		//line24
		Line2D line24 = new Line2D.Float(x+gap*6, y+h-(gap-gap/4), x+gap*6, y+h);
		surface.line(getLineX1(line24), getLineY1(line24), getLineX2(line24), getLineY2(line24));
		mazeLines.add(line24);

		//line25
		Line2D line25 = new Line2D.Float(x+gap*7, y+h-gap, x+w-gap, y+h-gap);
		surface.line(getLineX1(line25), getLineY1(line25), getLineX2(line25), getLineY2(line25));
		mazeLines.add(line25);

		//lastline
		Line2D lastline = new Line2D.Float(x+w-gap, y+h, x+w-gap, y+h-gap);
		surface.line(getLineX1(lastline), getLineY1(lastline), getLineX2(lastline), getLineY2(lastline));
		mazeLines.add(lastline);

		//selectClue();


		mouse = new Rectangle((int)z,(int)m,16,15);
		//surface.rect((float)z, (float)m, 16, 16);
		cat = new Rectangle((int)a,(int)b,17,17);
		diamond = new Rectangle(297, 130, 14, 10);
		diamond2 = new Rectangle(270, 45, 14, 10);
		superBoost1 = new Rectangle (140, 130, 10, 10);
		superBoost2 = new Rectangle(20, 215, 10, 10);

		rat= surface.loadImage("rat.png");
		surface.image(rat, (float)z, (float)m,16,15);
		surface.noFill();
		surface.noStroke();
		surface.rect(mouse.x, mouse.y,mouse.width, mouse.height);

		surface.noFill();
		surface.noStroke();
		surface.rect(cat.x, cat.y, cat.width, cat.height);






		kitten= surface.loadImage("cat.png");
		surface.image(kitten, (float)a, (float)b,19,19);

		surface.fill(0); //fill 

		surface.fill(0,0,204); //fill 
		surface.quad(305, 130, 297, 135, 305, 140, 310, 135);
		surface.quad(278, 45, 270, 50, 278, 55, 283, 50);
		//
		
		surface.fill(255, 165,0 );
		surface.circle(145, 135, 8);
		surface.fill(255, 165,0 );
		surface.circle(25, 220, 8);
		

		if (cluesFound ==1)
		{
			surface.fill(10,153,153);
			surface.strokeWeight(1);
			surface.rect((float)line1.getX1(), (float)line1.getY1(), (float)1.7, 30);
		}

		if (cluesFound ==2)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line8.getX1(), (float)line8.getY1(),60,(float)1.9);
		}

		if (cluesFound ==3)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line20.getX1(), (float)line20.getY1(),30,(float)1.90);
		}

		if (cluesFound ==4)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line19.getX1(), (float)line19.getY1(),(float)1.9, 30);
		}

		if (cluesFound==5)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line17.getX1(), (float)line17.getY1(),(float)30, (float)1.9);
		}
		
		if (cluesFound==6)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line4.getX1(), (float)line4.getY1(),(float)1.9,30);
		}
		
		if (cluesFound==7)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line14.getX1(), (float)line14.getY1(),(float)1.9,30);
		}
		if (cluesFound==8)
		{
			surface.fill(255,0,255);
			surface.strokeWeight(1);
			surface.rect((float)line21.getX1(), (float)line21.getY1(),(float)1.9,30);
		}

		if (cluesFound==9)
		{
			surface.stroke(176,224,230);
			surface.fill(176,224,230);
			surface.rect((float)bottome.getX2()+1, (float)bottome.getY2()-1, 30, (float)2);
		}
		
		if (surface.isPressed(KeyEvent.VK_LEFT))
		{
			z-=speedX;

		}
		if (surface.isPressed(KeyEvent.VK_RIGHT))
		{
			z+=speedX;

		}
		if (surface.isPressed(KeyEvent.VK_UP))
		{
			m -=speedY;
		}

		if (surface.isPressed(KeyEvent.VK_DOWN))
		{
			m +=speedY;
		}

		if (surface.isPressed(KeyEvent.VK_W)) //up
		{
			b -=catY;
		}
		if (surface.isPressed(KeyEvent.VK_A)) //left
		{
			a-=catX;;
		}
		if (surface.isPressed(KeyEvent.VK_S))//down
		{
			b+=catY;
		}

		if (surface.isPressed(KeyEvent.VK_D))//right
		{
			a +=catX;
		}

		if (mouse.intersectsLine(bottome) && cluesFound==9)
		{
			surface.switchScreen(ScreenSwitcher.THANKYOU); // replace screen1 with the end screen
		}
		else if (mouse.intersectsLine(top))
		{
			m= (int) (m+3);		
		}
		else if (mouse.intersectsLine(line1))
		{
			if (clue1Found == false)
			{
				surface.switchScreen(ScreenSwitcher.CLUE1);
				cluesFound=2;
				clue1Found=true;
			}
			z= (int) (z-3);
		}
		
		else if (mouse.intersectsLine(line2))
		{
			m-=3;	
		}

		else if (mouse.intersectsLine(left))
		{
			z= z+3;	
		}

		else if (mouse.intersectsLine(right))
		{
			z= z-3;	
		}

		else if (mouse.intersectsLine(bottom))
		{

			m= m-3;		
		}

		else if (mouse.intersectsLine(line3))
		{
			m+=3;		
		}

		else if (mouse.intersectsLine(line4))
		{
			if (clue6Found == false && clue5Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE6);
				cluesFound=7;
				clue6Found=true;
			}
			z+=3;		
		}

		else if (mouse.intersectsLine(line5))
		{
			z-=3;	
		}

		else if (mouse.intersectsLine(line8))
		{
			if (clue2Found == false && clue1Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE2);
				cluesFound=3;
				clue2Found=true;
			}
			m+=2;	
		}

		else if (mouse.intersectsLine(line7))
		{
			m+=3;	
		}

		else if (mouse.intersectsLine(line20))
		{
			if (clue3Found == false && clue2Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE3);
				cluesFound=4;
				clue3Found=true;
			}

			m= m-3;		
		}

		else if (mouse.intersectsLine(line16))
		{
			z-=3;	
		}

		else if (mouse.intersectsLine(line9))
		{
			m-=2;	
		}

		else if (mouse.intersectsLine(line17))
		{
			if (clue5Found == false && clue4Found==true)
			{
				System.out.println("clue5");
				surface.switchScreen(ScreenSwitcher.CLUE5);
				cluesFound=6;
				clue5Found=true;
			}
			m+=2;	
		}

		else if (mouse.intersectsLine(line10))
		{
			z+=2;	
		}

		else if (mouse.intersectsLine(line21))
		{
			if (clue8Found == false && clue7Found==true)
			{
				
				surface.switchScreen(ScreenSwitcher.CLUE8);
				cluesFound=9;
				clue8Found=true;
			}
			z-=3;		
		}

		else if (mouse.intersectsLine(line22))
		{

			m+=2;	
		}

		else if (mouse.intersectsLine(line23))
		{
			z+=2;	
		}

		else if (mouse.intersectsLine(line24))
		{
			z-=2;	
		}

		else if (mouse.intersectsLine(line19))
		{
			if (clue4Found == false && clue3Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE4);
				cluesFound=5;
				clue4Found=true;
			}

			z+=2;		
		}

		else if (mouse.intersectsLine(line18))
		{

			m-=2;	
		}

		else if (mouse.intersectsLine(line11))
		{

			m-=2;		
		}

		else if (mouse.intersectsLine(line12))
		{

			m-=2;	
		}

		else if (mouse.intersectsLine(line13))
		{

			z+=2;	
		}

		else if (mouse.intersectsLine(line25))
		{

			m-=2;		
		}

		else if (mouse.intersectsLine(lastline))
		{

			z+=2;
		}

		else if (mouse.intersectsLine(bottome) && cluesFound!=9)
		{


			m-=3;		
		}

		else if (mouse.intersectsLine(line14))
		{
			if (clue7Found == false && clue6Found==true)
			{
				surface.switchScreen(ScreenSwitcher.CLUE7);
				cluesFound=8;
				clue7Found=true;
			}
			z+=2;	
		}

		else if (mouse.intersectsLine(line15))
		{

			m-=2;		
		}
		else
		{
			speedX=1;
			speedY=1;
		}

		if (mouse.intersects(cat))
		{
			surface.switchScreen(ScreenSwitcher.YOULOSE);//change to lose screen

		}

		if (cat.intersectsLine(top))
		{
			System.out.println("test");
			b = (int) (b+2);
			//a = (int) (a+1);		
		}

		else if (cat.intersectsLine(line1))
		{
			//b= (int) (b-2);
			a-=2;		
		}


		else if (cat.intersectsLine(line2))
		{

			b = (int) (b-2);
		}

		else if (cat.intersectsLine(left))
		{

			a = (int) (a+2);	

		}

		else if (cat.intersectsLine(right))
		{

			a = (int) (a-2);	
		}

		else if (cat.intersectsLine(bottom))
		{

			b = (int) (b-2);
		}


		else if (cat.intersectsLine(line3))
		{

			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		else if (cat.intersectsLine(line4))
		{

			//b = (int) (b-2);
			a = (int) (a-2);		
		}

		else if (cat.intersectsLine(line5))
		{

			a-=2;		
		}

		else if (cat.intersectsLine(line8))
		{

			b-=2;;
		}

		else if (cat.intersectsLine(line7))
		{

			b = (int) (b-2);
		}

		else if (cat.intersectsLine(line20))
		{

			b-=2;		
		}

		else if (cat.intersectsLine(line16))
		{

			a = (int) (a-2);		
		}

		else if (cat.intersectsLine(line9))
		{

			b = (int) (b-2);
		}

		else if (cat.intersectsLine(line17))
		{

			b = (int) (b-2);
		}

		else if (cat.intersectsLine(line10))
		{

			a+=2;		
		}

		else if (cat.intersectsLine(line21))
		{

			a = (int) (a-2);		
		}

		else if (cat.intersectsLine(line22))
		{

			b = (int) (b-2);
		}

		else if (cat.intersectsLine(line23))
		{

			a = (int) (a+2);		
		}

		else if (cat.intersectsLine(line24))
		{

			a = (int) (a-2);		
		}

		else if (cat.intersectsLine(line19))
		{

			a = (int) (a-2);		
		}

		else if (cat.intersectsLine(line18))
		{

			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		else if (cat.intersectsLine(line11))
		{

			b = (int) (b+2);
			//a = (int) (a-1);		
		}

		else if (cat.intersectsLine(line12))
		{

			b = (int) (b-2);
			//a = (int) (a-1);		
		}

		else if (cat.intersectsLine(line13))
		{

			//b= (int) (b+1);
			a = (int) (a+2);		
		}

		else if (cat.intersectsLine(line25))
		{

			b = (int) (b-2);
			//a= (int) (a+1);		
		}

		else if (cat.intersectsLine(lastline))
		{

			//b = (int) (b-1);
			a = (int) (a+1);		
		}

		else if (cat.intersectsLine(line14))
		{

			//b = (int) (b-1);
			a= (int) (a+1);		
		}

		else if (cat.intersectsLine(line15))
		{

			b = (int) (b+2);
			//a = (int) (a+1);		
		}
		else
		{
			catX=1;
			catY=1;
		}



		if (mouse.intersects(superBoost1)) //change r to circle box
		{
			System.out.println("here");
			savedTime = surface.millis();
			speedUp=true;
			//Speedup();

		}
		
		
		if(mouse.intersects(superBoost2))
		{
			System.out.println("here");
			savedTime = surface.millis();
			speedUp = true;
		}

		
		if (mouse.intersects(diamond)) //change r to circle box
		{
			System.out.println("here");
			savedTime = surface.millis();
			slowDown=true;
			//Speedup();

		}
		
		if (mouse.intersects(diamond2)) //change r to circle box
		{
			System.out.println("here");
			savedTime = surface.millis();
			slowDown=true;
			//Speedup();

		}

			int passedTime = surface.millis() - savedTime;

		if (speedUp==true) {
			if (passedTime < totalTime) 
			{
				System.out.println("in methid");

				speedX+=1;
				speedY+=1;
				System.out.println(speedX);
				System.out.println("5 seconds have passed!");
				//savedTime = surface.millis();
			}
			else
				speedUp=false;
		}
		if (slowDown==true) {
			if (passedTime < totalTime) 
			{
				System.out.println("in methid");

				catX*=0.5;
				catY*=0.5;
				System.out.println(speedX);
				System.out.println("5 seconds have passed!");
				//savedTime = surface.millis();
			}
			else
				slowDown=false;
		}



	}



	public float getLineX1(Line2D line)
	{
		return (float)line.getX1();
	}

	public float getLineY1(Line2D line)
	{
		return (float)line.getY1();
	}

	public float getLineX2(Line2D line)
	{
		return (float)line.getX2();
	}

	public float getLineY2(Line2D line)
	{
		return (float)line.getY2();
	}


}
