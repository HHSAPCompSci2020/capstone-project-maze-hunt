	import java.awt.Point;
	import java.awt.Rectangle;
//	import java.awt.event.*;

import processing.core.PImage;

//	import javax.swing.JOptionPane;



	public class YouLose extends Screen {
		
		private DrawingSurface surface;
		private Rectangle exitButton;
		private PImage youLose;
		
		public YouLose(DrawingSurface surface) {
			
			super(400,300);
			this.surface = surface;
			exitButton = new Rectangle(150,200,50,40);
		
		}
		
		public void draw() {
			
			// Draw stuff
			
			surface.pushStyle();
			
			
			surface.background(255);   // Clear the screen with a white background
			surface.stroke(0);     // Set line drawing color to white
			surface.noFill();
			youLose= surface.loadImage("YouLoseScreen.jpg");
			surface.image(youLose, 0, 0, 400 , 300);
			surface.rect(exitButton.x, exitButton.y, exitButton.width, exitButton.height, 10, 10, 10, 10);
			
			surface.textSize(10);
			surface.fill(75,0,130);
			String exit = "Exit";
			float w = surface.textWidth(exit); //start button
			surface.text(exit, exitButton.x+exitButton.width/2-w/2, exitButton.y+exitButton.height/2);

			
			surface.popStyle();

			
			
			// Change stuff

		

			
		}
		public void mousePressed() {
			Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
			if (exitButton.contains(p))
				surface.dispose();
			System.exit(0);//switch to welcome screen
			
			}
		}