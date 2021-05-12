import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import processing.core.PApplet;
import processing.event.MouseEvent;


public class DrawingSurface extends PApplet implements ScreenSwitcher{
	public float ratioX, ratioY;

	private ArrayList<Integer> keys;

	private Screen activeScreen;
	private ArrayList<Screen> screens;

	private StartWindow helpWindow;
	
	private Maze maze;
	
	

	/**
	 * Constructs a maze
	 */
	public DrawingSurface() {

		
		keys = new ArrayList<Integer>();

		screens = new ArrayList<Screen>();
		StartWindow screen1 = new StartWindow(this);
		screens.add(screen1);

		Help screen2 = new Help(this);
		screens.add(screen2);
		
		Maze screen3 = new Maze(this);
		screens.add(screen3);
		
		Clue1 clue1 = new Clue1(this);
		screens.add(clue1);
		
		Clue2 clue2 = new Clue2(this);
		screens.add(clue2);
		
		Clue3 clue3 = new Clue3(this);
		screens.add(clue3);
		
		Clue4 clue4 = new Clue4(this);
		screens.add(clue4);
		
		activeScreen = screens.get(0);


	}

	public void settings() {
		// size(DRAWING_WIDTH, DRAWING_HEIGHT, P2D);
		size(activeScreen.DRAWING_WIDTH, activeScreen.DRAWING_HEIGHT);
	}

	/**The statements in the setup() function 
	 execute once when the program begins
	 **/
	public void setup() {
		surface.setResizable(true);
		for (Screen s : screens)
			s.setup();
	}

	/**The statements in draw() are executed until the 
	 program is stopped. Each statement is executed in 
	 sequence and after the last line is read, the first 
	 line is executed again.
	 **/
	public void draw() { 
		ratioX = (float)width/activeScreen.DRAWING_WIDTH;
		ratioY = (float)height/activeScreen.DRAWING_HEIGHT;

		pushMatrix();

		scale(ratioX, ratioY);

		activeScreen.draw();

		popMatrix();
		//background(255);   // Clear the screen with a white background

		//		textSize(30);
		//		fill(129,20,40);
		//		text("Welcome to ",90,50);
		//		text("the Maze Hunt",70,90);
		//		
		//		fill(255);
		//		stroke(0);
		//		rect(80,150,90,60);
		//		
		//		textSize(25);
		//		fill(20,130,40);
		//		text("Start ",93,190);
		//
		//		fill(255);
		//		stroke(0);
		//		rect(250,150,90,60);
		//		
		//		textSize(25);
		//		fill(20,20,150);
		//		text("Help ",270,190);

		//stroke(0);
		//curve.draw(this);		
	}

	public void keyPressed() {
		keys.add(keyCode);
	}

	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}

	public void mousePressed() {
		activeScreen.mousePressed();
	}

	public void mouseMoved() {
		activeScreen.mouseMoved();
	}

	public void mouseDragged() {
		activeScreen.mouseDragged();
	}

	public void mouseReleased() {
		activeScreen.mouseReleased();
	}

	public Point assumedCoordinatesToActual(Point assumed) {
		return new Point((int)(assumed.getX()*ratioX), (int)(assumed.getY()*ratioY));
	}

	public Point actualCoordinatesToAssumed(Point actual) {
		return new Point((int)(actual.getX()/ratioX) , (int)(actual.getY()/ratioY));
	}


	
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}




//	public void mousePressed()
//	{
//		if (mouseX >=250 && mouseX <= 340)
//		{
//			if (mouseY>=150 && mouseY <=210)
//			{
//				System.out.println("here");
//				helpWindow.draw();
//
//			}
//		}
//	}


}











