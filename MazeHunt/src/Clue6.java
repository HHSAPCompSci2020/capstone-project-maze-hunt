import java.awt.Point;
import java.awt.Rectangle;

public class Clue6 extends Screen{
	
	private DrawingSurface surface;
	private Rectangle brownButton;
	private Rectangle orangeButton;
	private Rectangle beigeButton;
	
	public Clue6(DrawingSurface surface) {
		super(400,300);
		this.surface = surface;
		
		
		brownButton = new Rectangle(150,200,50,40);
		orangeButton = new Rectangle(150,150,50,40);
		beigeButton = new Rectangle(150,100,50,40);
	}
	
	public void draw() {
		
		surface.pushStyle();
		
		
		surface.background(255);   // Clear the screen with a white background
		surface.stroke(0);     // Set line drawing color to white
		surface.noFill();
		surface.fill(255,235,205);
		surface.rect(brownButton.x, brownButton.y, brownButton.width, brownButton.height, 10, 10, 10, 10);
		surface.fill(255,165,0);
		surface.rect(orangeButton.x, orangeButton.y, orangeButton.width, orangeButton.height, 10, 10, 10, 10);
		surface.fill(210,180,140);
		surface.rect(beigeButton.x, beigeButton.y, beigeButton.width, beigeButton.height, 10, 10, 10, 10);
		
		surface.fill(0);
		surface.textSize(9);
		surface.text("You've hit a dead end and you don't know what to do! Maybe turn around and look for "
				+ "\nsomething blue. Make sure you go slow because the clue is in that row. You'll be able to sprint "
				+ "\nwhen you find the next hint."
				+"\nBut before you proceed, let me help you succeed! Don't put on your victory cape just yet,"
				+ "\nFirst tell me the color of a parisian baguette", 10, 30);
		
		surface.textSize(10);
		surface.fill(0);
		String Brown = "Brown";
		float w = surface.textWidth(Brown); //start button
		surface.text(Brown, brownButton.x+brownButton.width/2-w/2, brownButton.y+brownButton.height/2);
		String Orange = "Orange";
		float y = surface.textWidth(Orange); //start button
		surface.text(Orange, orangeButton.x+orangeButton.width/2-y/2, orangeButton.y+orangeButton.height/2);
		String Beige = "Beige";
		float z = surface.textWidth(Beige); //start button
		surface.text(Beige, beigeButton.x+beigeButton.width/2-z/2, beigeButton.y+beigeButton.height/2);
		surface.popStyle();
		
	}
	
	public void mousePressed() {
		Point p = surface.actualCoordinatesToAssumed(new Point(surface.mouseX,surface.mouseY));
		if (brownButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER6);
		if (orangeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.WRONGANSWER6);
		if (beigeButton.contains(p))
			surface.switchScreen(ScreenSwitcher.SCREEN3);
		}

}
