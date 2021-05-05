package demo1;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.*;
import com.google.firebase.database.*;


/**
 * 
 * For this to work, you must first create a "realtime" database:
 * https://firebase.google.com/
 * 
 * And use the "service accounts" menu to generate a JSON key for access.
 * 
 * Check here for more code samples:
 * https://firebase.google.com/docs/database/admin/save-data
 * 
 * 
 * 
 * @author john_shelby
 *
 */
public class ChatPanel extends JPanel implements ActionListener, ChildEventListener {
	
	
	private JTextField messageField;
	private JTextArea output;
	private String name;
	
	
	
	private DatabaseReference postsRef;
	
	
	
	public ChatPanel(String name) {
		super(new BorderLayout());
		
		this.name = name;
		
		// UI SETUP
		output = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(output);
		add(scrollPane, BorderLayout.CENTER);
		
		messageField = new JTextField(50);
		
		JButton goButton = new JButton("POST");
		goButton.addActionListener(this);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));

		
		JPanel messagePanel = new JPanel();
		messagePanel.add(new JLabel("Message: "));
		messagePanel.add(messageField);
		
		
		bottomPanel.add(messagePanel);
		bottomPanel.add(goButton);
		JPanel holder = new JPanel();
		holder.add(bottomPanel);
		add(holder, BorderLayout.SOUTH);
		
		
		
		// DATABASE SETUP
		FileInputStream refreshToken;
		try {
			
			refreshToken = new FileInputStream("APCSDemoKey.json");
			
			FirebaseOptions options = new FirebaseOptions.Builder()
				    .setCredentials(GoogleCredentials.fromStream(refreshToken))
				    .setDatabaseUrl("https://apcsdemo-ea59b.firebaseio.com/")
				    .build();

				FirebaseApp.initializeApp(options);
				DatabaseReference database = FirebaseDatabase.getInstance().getReference();
				postsRef = database.child("posts");

				postsRef.addChildEventListener(this);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if (!messageField.getText().trim().isEmpty())
			postsRef.push().setValueAsync(new Post(name, messageField.getText()));
		messageField.setText("");
		
	}
	
	
	
	@Override
	public void onCancelled(DatabaseError arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onChildAdded(DataSnapshot dataSnapshot, String arg1) {
		Post post = dataSnapshot.getValue(Post.class);

		String text = output.getText();
		text += post + "\n";
		
		output.setText(text);
	}


	@Override
	public void onChildChanged(DataSnapshot arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onChildMoved(DataSnapshot arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onChildRemoved(DataSnapshot arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	

	

}
