/**
 * This interface contains all the screens 
 * @author Faith and Anika
 *
 */
public interface ScreenSwitcher {
	public static final int SCREEN1 = 0;//welcome
	public static final int SCREEN2 = 1;//help
	public static final int SCREEN3 = 2;//maze
	public static final int CLUE1 = 3;//Clue 1
	public static final int CLUE2 = 4;//clue 2
	public static final int CLUE3 = 5;//clue 3
	public static final int CLUE4 = 6;//clue 4
	public static final int WRONGANSWER = 7;
	public static final int WRONGANSWER2 = 8;
	public static final int THANKYOU = 9;
	public static final int YOULOSE = 10;
	public static final int CLUE8 = 11;//clue 4
	public static final int WRONGANSWER3 = 12;
	public static final int KEYBOARDPRESS = 13;
	public static final int WRONGANSWER4 = 14;
	public static final int CLUE5 = 15;
	public static final int CLUE6 = 16;
	public static final int CLUE7 = 17;
	public static final int WRONGANSWER5 = 18;
	public static final int WRONGANSWER6 = 19;
	public static final int HISTORY = 20;

	/**
	 * This method switches from one screen to another
	 * @param i, the value of the screen
	 */
	public void switchScreen(int i);
}
