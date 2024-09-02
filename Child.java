package codeio;

public class Child extends Inheritance {
	
	// Method Overriding 
	
	@Override 
	public void Job() {
		System.out.println("Job: HR Manager");
	}
	
	@Override
	public void Salary() {
		System.out.println("Salary: 30,000");
	}
	
	public void Character() {
		System.out.println("Character: Innocent and Honest");
	}
	
	public String name = "Suhail";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single Inheritance 
		
		Inheritance obj = new Inheritance();
		System.out.println("Parent: ");
		obj.Job();
		obj.Salary(); 
		
		System.out.println();
		
		Child obj1 = new Child();
		System.out.println("Child: "); 
		obj1.Job();
		obj1.Salary();
		obj1.Character();
		System.out.println("Name: " + obj1.name);
	}

}
