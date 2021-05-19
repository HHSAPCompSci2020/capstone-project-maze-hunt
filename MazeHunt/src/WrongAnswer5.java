


	import java.awt.Point;
	import java.awt.Rectangle;
//	import java.awt.event.*;

//	import javax.swing.JOptionPane;



	public class WrongAnswer5 extends Screen {
		
		private DrawingSurface surface;
		private Rectangle startButton;

		
		public WrongAnswer5(DrawingSurface surface) {
			super(400,300);
			this.surface = surface;
			startButton = new Rectangle(150,200,50,40);
		
		}
		
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

			
			
			// Change stuff

		

			
		}
		public void mousePressed() {
			Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
			if (startButton.contains(p))
				surface.switchScreen(ScreenSwitcher.CLUE5); //switch to welcome screen
			
			}
		}
