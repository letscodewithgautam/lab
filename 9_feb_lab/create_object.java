package feb_9_assigment;
// create a class with the name create_object
public class create_object {
// Declare the constructor with class name. This constructor is default
	create_object() {  // it will print the message on the console
		System.out.println("create object in java");
	}
	//declare a method and print any message which you want
	void display() {
		System.out.println("successfully object created in java eclipse");
	}
	// declare the main method to start the execution of program. this method is static.
	public static void main(String[] args) {
		// create an object of the class with the reference variable object(obj)
		create_object obj = new create_object();  // it will call default constructor as object created
		// now call the method to print the console using object refrence variable object
		obj.display();
	}
}
