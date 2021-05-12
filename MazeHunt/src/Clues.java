import java.util.ArrayList;

public class Clues {

	
	protected int clueNumber;
	protected ArrayList<String> clues; 
	
	/**
	 * Constructs a set of clues.
	 */
	public Clues ()
	{
		clues.add("Aha! You want to enter, I don't even know if you'll make it to the center. "
				+ "Watch out for the cat, as he likes to eat rats. Before I let you enter the maze, what's dessert that may contain glaze.");
		clues.add("Oh no! You've hit a wall, that's okay stand up tall. To measure your height, walk down a hall.");
		clues.add("Yay, you found me! You forgot your galsses, but I love your hair. Let me help you see a clearer, walk around the squre to "
				+ "try to find a mirror.");
		clues.add("You're almost done, just one more to go. 'Ughh' I know what a bummer! Just tell me your favourite thing to throw and then "
				+ "you'll have reached the summer!");
	}
	
	/**
	 * Checks for the location of the clue found.
	 */
	public void clueLocation()
	{
		
	}
	
	/**
	 * Checks if the player has already used clues.
	 * @return true is the user used a clue before else false.  
	 */
	public boolean lastClue()
	{
		return false;
		
	}
}
