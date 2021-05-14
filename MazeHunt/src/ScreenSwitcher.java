

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

	
	public void switchScreen(int i);
}
