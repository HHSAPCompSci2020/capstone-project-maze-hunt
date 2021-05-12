import java.awt.Color;

import fdominique576.shapes.Rectangle;
import fdominique576.shapes.Shape;
import processing.core.PApplet;

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
		if (!window.isPointInside(s.getX(), s.getY())) {
//			vx= -vx;
//			s.translate(vx,vy);
		}

		s.translate(vx,vy);

		if (!window.isPointInside(s.getX(), s.getY()))
		{
//			vy= -vy;
//			s.translate(vx,vy);
		}



		vx*=0;
		vy*=0;
	}
	
	public void draw(PApplet surface) {
		s.draw(surface);

	}

	public double getCX()
	{
		return s.getX();
	}

	/**This method gets the y value of the shape and returns it
	 * 
	 * @return the y value of the shape
	 */
	public double getCY()
	{
		return s.getY();
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
