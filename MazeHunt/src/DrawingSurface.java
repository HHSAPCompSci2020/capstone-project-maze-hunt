import java.awt.Point;
//import java.awt.event.KeyEvent;
import java.util.ArrayList;

import processing.core.PApplet;
//import processing.event.MouseEvent;


public class DrawingSurface extends PApplet implements ScreenSwitcher{
	public float ratioX, ratioY;

	private ArrayList<Integer> keys;

	private Screen activeScreen;
	private ArrayList<Screen> screens;

//	private StartWindow helpWindow;
//	
//	private Maze maze;
	
	

	/**
	 * Constructs the maze and sets up the different screens to be switched
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
		
		WrongAnswer WrongAnswer = new WrongAnswer(this);
		screens.add(WrongAnswer);
		
		WrongAnswer2 WrongAnswer2 = new WrongAnswer2(this);
		screens.add(WrongAnswer2);
		
		ThankYou ThankYou = new ThankYou(this);
		screens.add(ThankYou);
		
		YouLose YouLose = new YouLose(this);
		screens.add(YouLose);
		
		Clue8 clue8 = new Clue8(this);
		screens.add(clue8);
		
		WrongAnswer3 WrongAnswer3 = new WrongAnswer3(this);
		screens.add(WrongAnswer3);
		
		KeyboardPress KeyboardPress = new KeyboardPress(this);
		screens.add(KeyboardPress);
		
		WrongAnswer4 WrongAnswer4 = new WrongAnswer4(this);
		screens.add(WrongAnswer4);
		
//		Clue2 clue5 = new Clue5(this);
//		screens.add(clue5);
		
		Clue6 Clue6 = new Clue6(this);
		screens.add(Clue6);
		
		Clue7 Clue7 = new Clue7(this);
		screens.add(Clue7);
		
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
	}

	/**
	 * This method checks for which key has been pressed
	 */
	public void keyPressed() {
		keys.add(keyCode);
	}

	/**
	 * This method checks for when a key has been released
	 */
	public void keyReleased() {
		while(keys.contains(keyCode))
			keys.remove(new Integer(keyCode));
	}

	/**
	 * This method checks if a certain key is pressed
	 * @param code, the integer code of the key being pressed
	 * @return, true if the key is pressed
	 */
	public boolean isPressed(Integer code) {
		return keys.contains(code);
	}

	/**
	 * This method checks if the mouse is pressed
	 */
	public void mousePressed() {
		activeScreen.mousePressed();
	}

	/**
	 * This method checks if the mouse has been moved
	 */
	public void mouseMoved() {
		activeScreen.mouseMoved();
	}

	/**
	 * This method checks if the mouse has been dragged
	 */
	public void mouseDragged() {
		activeScreen.mouseDragged();
	}

	/**
	 * This method checks if the mouse has been released
	 */
	public void mouseReleased() {
		activeScreen.mouseReleased();
	}

	/**
	 * This method returns a point that is assumed to be the point passed in
	 * @param assumed, the point to be assumed  
	 * @return returns a point that is assumed to be the point passed in
	 */
	public Point assumedCoordinatesToActual(Point assumed) {
		return new Point((int)(assumed.getX()*ratioX), (int)(assumed.getY()*ratioY));
	}

	/**
	 * The method returns a point that is actual to the coordinated that is assumed
	 * @param actual, the point that is the actual coordinate
	 * @return returns the coordinate that is the actual point
	 */
	public Point actualCoordinatesToAssumed(Point actual) {
		return new Point((int)(actual.getX()/ratioX) , (int)(actual.getY()/ratioY));
	}


	/**
	 * this method gets the active screen that is being displayed
	 */
	public void switchScreen(int i) {
		activeScreen = screens.get(i);
	}







}











