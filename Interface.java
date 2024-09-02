package codeio;

interface Example {
	abstract void print();
}

interface Example2 {
	abstract void print2();
}

// Interface and Multiple Inheritance 

class Display implements Example,Example2 {
	public void print() {
		System.out.println("It is a Concept of Interface.");
	}
	public void print2() {
		System.out.println("It is a Concept of Interface and Multiple Inheritance."); 
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display obj = new Display();
		obj.print();
		obj.print2();
	}

}
