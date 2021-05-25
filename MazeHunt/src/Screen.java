/**
 * This class that manages the screens. 
 * @author Mr.Shelby
 *
 */
public abstract class Screen {

	public final int DRAWING_WIDTH, DRAWING_HEIGHT;
	
	/**
	 * Constructs the screen with a given height and width.
	 * @param width, width of the screen
	 * @param height, height of the screen 
	 */
	public Screen(int width, int height) {
		this.DRAWING_WIDTH = width;
		this.DRAWING_HEIGHT = height;
	}
	
	/**
	 * Sets up the PApplet
	 */
	public void setup() {
		
	}
	
	/**
	 * Displays the screen
	 */
	public void draw() {
		
	}
	
	/**
	 * Checks whether the mouse is pressed
	 */
	public void mousePressed() {
		
	}
	
	/**
	 * Checks whether the mouse is moved
	 */
	public void mouseMoved() {
		
	}
	
	/**
	 * Checks whether the mouse is dragged
	 */
	public void mouseDragged() {
		
	}
	
	/**
	 * Checks whether the mouse is released
	 */
	public void mouseReleased() {
		
	}
	
	
	
}
