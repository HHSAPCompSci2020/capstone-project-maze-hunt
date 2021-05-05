package demo1;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		JOptionPane.showMessageDialog(null, "Welcome to the APCS message board! \nNote that your posts will be visible to all members of APCS (stay school appropriate).");
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		JFrame w = new JFrame("FirebaseDemo");
		w.setBounds(100, 100, 800, 600);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChatPanel panel = new ChatPanel(name);
		
		w.add(panel);
		w.setResizable(true);
		w.setVisible(true);
	}
	
	
}
