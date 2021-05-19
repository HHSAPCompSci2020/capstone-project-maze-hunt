import java.awt.Point;
import java.awt.Rectangle;

public class Clue6 extends Screen{
	
	private DrawingSurface surface;
	private Rectangle beigeButton;
	private Rectangle orangeButton;
	private Rectangle brownButton;
	
	public Clue6(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		
		beigeButton = new Rectangle(175,225,50,40);
		orangeButton = new Rectangle(175,175,50,40);
		brownButton = new Rectangle(175,125,50,40);
	}
	
	public void draw() {
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.fill(255,228,196);
		surface.rect(beigeButton.x, beigeButton.y, beigeButton.width, beigeButton.height, 10, 10, 10, 10);
		surface.fill(255,165,0);
		surface.rect(orangeButton.x, orangeButton.y, orangeButton.width, orangeButton.height, 10, 10, 10, 10);
		surface.fill(210,180,140);
		surface.rect(brownButton.x, brownButton.y, brownButton.width, brownButton.height, 10, 10, 10, 10);
		
		surface.fill(0);
		surface.textSize(8);
		surface.text("You've hit a dead end and you don't know what to do! Maybe turn around and look for "
				+ "\nsomething blue. Make sure you go slow because the clue is in that row. You'll be able to sprint "
				+ "\nwhen you find the next hint."
				+"\nBut before you proceed, let me help you succeed! Don't put on your victory cape just yet,"
				+ "\nFirst tell me the color of a parisian baguette", 10, 30);
		
		surface.textSize(10);
		surface.fill(0);
		String Beige = "Beige";
		float w = surface.textWidth(Beige); //start button
		surface.text(Beige, beigeButton.x+beigeButton.width/2-w/2, beigeButton.y+beigeButton.height/2);
		String Orange = "Orange";
		float y = surface.textWidth(Orange); //start button
		surface.text(Orange, orangeButton.x+orangeButton.width/2-y/2, orangeButton.y+orangeButton.height/2);
		String Brown = "Brown";
		float z = surface.textWidth(Brown); //start button
		surface.text(Brown, brownButton.x+brownButton.width/2-z/2, brownButton.y+brownButton.height/2);
		surface.popStyle();
		
	}
	
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (beigeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
		if (orangeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER6);
		if (brownButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER6);
		}

}
