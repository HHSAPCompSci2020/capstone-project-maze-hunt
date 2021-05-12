import java.awt.Color;

import jchoi182.shapes.Rectangle;
import jchoi182.shapes.Shape;

public class Player1  {

	//fields
	int Clues;
	int numSuperBoost;
	int numDiamonds;
	private Shape s;
	private double vx, vy;
	private int R=10;
	private int G=20;
	private int B=30;

	/**
	 * Constructs a player1.
	 */
	public Player1(Shape s) {
		this.s = s;
		vx=0;
		vy=0;
	}


	public void act() {

		s.translate(vx, vy);

		//checks for whether a shape is hitting the window and should bounce off when it does
		Rectangle window = new Rectangle (0,0,350,250) ;
		if (!window.isPointInside(s.getx(), s.gety())) {
			vx= -vx;
			s.translate(vx,vy);
		}

		s.translate(vx,vy);

		if (!window.isPointInside(s.getx(), s.gety()))
		{
			vy= -vy;
			s.translate(vx,vy);
		}



		vx*=0.98;
		vy*=0.98;
	}
	public double getCX()
	{
		return s.getx();
	}

	/**This method gets the y value of the shape and returns it
	 * 
	 * @return the y value of the shape
	 */
	public double getCY()
	{
		return s.gety();
	}

	/**change the color of the shape when it bounces against another shape
	 * @post the color value is changed each time the method is called
	 */
	public void changeColor()
	{
		Color bouncer = new Color (R,G,B);

		s.setFilled(true);
		s.setFill(bouncer);

		//change the color values each time this method is called
		R+=80;
		G+=150;
		B+=90;


		if (R>254) R=40;
		if (G>254) G=60;
		if (B>254) B=80;

	}

	/**This method bounces makes it so that when a shape interacts with another shape it bounces off
	 */
	public void bounceOff()
	{


		vx= -vx;
		vy=-vy;

		s.translate(vx,vy);

		vx*=0.99;
		vy*=0.99;//velocity


	}



	/**
	 * This method accelerates the shape in the direction that it is moving 
	 * @param ax
	 * @param ay
	 */
	public void accelerate(double ax, double ay)
	{
		vx+=ax;
		vy+=ay;
	}

	/**
	 * This method checks whether a given point lies inside of the shape
	 * @param x , the x coordinate that is to be checked
	 * @param y, the y coordinate that is to be check
	 * @return true or false depending on whether the given point lies inside of the shape
	 */
	public boolean isPointInside(double x, double y) {
		return s.isPointInside(x, y);
	}

	/**
	 * Allows player to run around the maze.
	 */
	public void run() {

	}

	/**
	 * Chooses the speed in which the player will run.
	 */
	public void speed() {

	}

	/**
	 * Helps the player solve clues.
	 */
	public void solveClue() {

	}

	/**
	 * Checks is if the player collided with the walls of the maze.
	 */
	public void mazeDetector() {

	}

}
