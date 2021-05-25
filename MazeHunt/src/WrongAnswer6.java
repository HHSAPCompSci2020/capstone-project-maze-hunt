	import java.awt.Point;
	import java.awt.Rectangle;



	/**
	 * This class holds the screen that pops up after the user chooses the wrong answer for a question.
	 * @author Faith and Saloni
	 *
	 */
	public class WrongAnswer6 extends Screen {
		
		private DrawingSurface surface;
		private Rectangle startButton;

		/**
		 * Constructs the wrong answer screen to be shown onto the screen
		 * @param surface, , the PApplet screen in which the you wrong answer text and the back button will be displayed.
		 */
		public WrongAnswer6(DrawingSurface surface) {
			super(400,300);
			this.surface = surface;
			startButton = new Rectangle(150,200,50,40);
		
		}
		
		/**
		 * Displays the wrong answer text and back button
		 */
		public void draw() {
			
			// Draw stuff
			
			surface.pushStyle();
			
			
			surface.background(255);   // Clear the screen with a white background
			surface.stroke(0);     // Set line drawing color to white
			surface.noFill();
			
			//surface.fill(255);
			surface.fill(204,204,255);
			surface.rect(startButton.x, startButton.y, startButton.width, startButton.height, 10, 10, 10, 10);
			
			
			surface.fill(0);
			surface.textSize(9);
			surface.text("Oh no! You've chosen the wrong answer :( Please try again.",10,30);
			
			surface.textSize(10);
			
			String start = "Back";
			float w = surface.textWidth(start); //start button
			surface.text(start, startButton.x+startButton.width/2-w/2, startButton.y+startButton.height/2);

			
			surface.popStyle();
		
		}
		
		/**
		 * Checks whether the mouse has pressed the correct answer choices and returns to the maze if the 
		 * correct answer is chosen else a try again screen appears to let the use know that they got the answer wrong
		 */
		public void mousePressed() {
			Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
			if (startButton.contains(p))
				surface.switchScreen(ScreenSwitcher.CLUE6); //switch to welcome screen
			
			}
		}
