package codeio;

// Abstract Class 
abstract class Employee {
	
	// Abstract Method 
	abstract void display();
	
	// Normal Method 
	void show() {
		System.out.println("Method Without Abstract");
	} 
	
}

// Concrete Class 
class User extends Employee {
	void display() {
		System.out.println("Method With Abstract");
	}
} 

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Abstarction 
		
		User obj = new User();
		obj.display();
		obj.show();
		
	}

}
