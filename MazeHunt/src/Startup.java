
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import processing.awt.PSurfaceAWT;
import processing.core.PApplet;

public class Startup {

	public static void main(String args[]) {
		
		 final JFrame parent = new JFrame();
	        JButton button = new JButton();

	        button.setText("Click me to show dialog!");
	        parent.add(button);
	        parent.pack();
	        parent.setVisible(true);

	        button.addActionListener(new java.awt.event.ActionListener() {
	            @Override
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                String name = JOptionPane.showInputDialog(parent,
	                        "What is your name?", null);
	            }
	        });

		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[] {""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();
		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		window.setSize(700, 500);
		window.setMinimumSize(new Dimension(100,100));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);

		window.setVisible(true);
		canvas.requestFocus();
	}
}
