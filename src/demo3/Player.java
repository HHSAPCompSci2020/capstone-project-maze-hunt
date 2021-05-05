package demo3;
import java.awt.Color;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PShape;

public class Player {

	private String uniqueID;
	
	private String username;
	private double x, y;
	
	private PShape shape;
	
	private boolean dataUpdated;  // Allows us to limit database writes by only sending data when something has actually been modified

	public Player(String uniqueID, PApplet surface) {
		this(uniqueID, null, 0, 0, surface);
	}
	
	public Player(String uniqueID, String username, double x, double y, PApplet surface) {
		this.uniqueID = uniqueID;
		this.username = username;
		this.x = x;
		this.y = y;
		Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		int rand = (int)(Math.random()*3);
		
		
		if (rand == 0)
			shape = surface.createShape(PApplet.ELLIPSE, -25,-25,50,50);
		else if (rand == 1)
			shape = surface.createShape(PApplet.TRIANGLE, -25,-25, 0,25, 25,-25);
		else if (rand == 2)
			shape = surface.createShape(PApplet.RECT, -25,-25, 50,50);
		shape.setFill(color.getRGB());
		shape.setStroke(0);
		shape.setStrokeWeight(5);
		
		dataUpdated = false;
	}
	
	public boolean idMatch(String uid) {
		return this.uniqueID.equals(uid);
	}
	
	public boolean isDataChanged() {
		return dataUpdated;
	}
	
	public String getUsername() {
		return username;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public void move(double x, double y, Rectangle boundary) {
		this.x += x;
		if (!boundary.contains(this.x, this.y)) 
			this.x -= x;
		
		this.y += y;
		if (!boundary.contains(this.x, this.y)) 
			this.y -= y;
		
		dataUpdated = true;
	}
	
	
	public void draw(PApplet surface) {
		surface.shape(shape, (float)x, (float)y);
	}
	
	
	public PlayerData getDataObject() {
		dataUpdated = false;
		PlayerData p = new PlayerData();
		p.username = username;
		p.x = x;
		p.y = y;
		return p;
	}
	
	public void syncWithDataObject(PlayerData data) {
		dataUpdated = false;
		this.x = data.x;
		this.y = data.y;
		this.username = data.username;
	}
	
	
	
}
