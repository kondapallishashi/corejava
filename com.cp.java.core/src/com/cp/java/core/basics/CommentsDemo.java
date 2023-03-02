/* CommentsDemo.java program demonstrates the usage of Comments in Java */

//Single line comments have preceding double forward slashes followed by the comment till End-Of-Line
//Define a package com.cp.core.basics.
package com.cp.java.core.basics;

/* Multi-line comments span multiple lines and are enclosed between /* and a matching closing symbol
 * Define a CommentsDemo Class to demonstrate the comments
 * The class contains a constructor and a couple of methods that are used for demonstrating the comments
 * 
 */

/* The doc comment can be attached with a class, interface, constructor, method, or field declarations 
 * by writing the doc comment preceding the declaration.
 * The Javadoc comments placed inside the body of the message are ignored.
 */

/** CommentsDemo demonstrates the usage of Javadoc Comments */
public class CommentsDemo {
	
	String comment = "";
	/**CommentsDemo class supports constructor CommentsDemo() with no parameters*/
	CommentsDemo() {
		System.out.println("Demonstrating CommentsDemo with a Default Comment");
	}
	
	/** CommentsDemo class supports constructor CommentsDemo(String comment) with one String Parameter */
	CommentsDemo(String comment) {
		this.comment = comment;
		System.out.println("Demonstrating CommentsDemo with one Parameter of type String");
		System.out.println("The Comment provided is: "+ this.comment);
	}
	
	/** CommentsDemo class supports one method that prints out the comment provided*/
	public void printComment() {
		//The below javadoc comment is ignored.
		/**Javadoc comments provided in the body of the method are ignored*/
		System.out.println("Printing the comment provided: "+this.comment);
	}
}
