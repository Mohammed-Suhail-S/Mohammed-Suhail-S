package codeio;

// Multi-level Inheritance 

class GrandFather {
	public void coin() {
		System.out.println("It is My Generation Coin.");
	}
}

class Father extends GrandFather {
	
	@Override // Method Overriding 
	public void coin() {
		System.out.println("I modify the Generation Coin.");
	}
}

class Son extends Father {
	
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Single Inheritance 
		
		GrandFather g = new GrandFather();
		System.out.println("Grandfather said: ");
		g.coin();
		
		Son s = new Son();
		System.out.println("Father said: ");
		s.coin();
		System.out.println("Finally it comes to the son.");
	}

}
