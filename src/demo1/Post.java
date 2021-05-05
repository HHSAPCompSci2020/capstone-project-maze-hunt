package demo1;


/**
 * 
 *  The class you store in the database must fit 2 simple constraints:

	The class must have a default constructor that takes no arguments.
	The class must define public getters for the properties to be assigned. Properties without a public getter will be set to their default value when an instance is deserialized.
	
	Classes from the Java library will often not fit these requirements, so you may need to make simpler classes
	yourself.
	
	
	
	I recommend that you *only* use this class for database posts. Don't use this class for storing
	real data in your program. Just create these objects at the moment you want to put something in the
	database, and when you read from the database, quickly turn these objects into some other form that
	is more useful.
	
 * 
 * 
 * @author john_shelby
 *
 */
public class Post {

	private String author;
	private String message;
	
	public Post() {
		
	}

	public Post(String author, String message) {
		this.author = author;
		this.message = message;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getMessage() {
		return message;
	}

	public String toString() {
		return "NAME: " + author + ", MESSAGE: " + message;
	}

}