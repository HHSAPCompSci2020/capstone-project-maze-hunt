/**
 * Main class
 */

import java.awt.Dimension;

//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

public class Startup {

	public static void main(String args[]) {
		        

		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[] {""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		window.setLocation(300,100);
		window.setSize(800, 700);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
		canvas.requestFocus();
	}
}
