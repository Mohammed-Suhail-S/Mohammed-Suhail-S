package codeio;

public class Polymorphism {
	
	public void method() {
		System.out.println("First Method of Polymorphism");
	}
	
	public int method(int a, int b) {
		return a + b;
	}
	
	public String method(String a, String b) {
		return a + b;
	}
	
	public char method(char a) {
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Polymorphism and Method Overloading 
		
		Polymorphism poly = new Polymorphism();
		poly.method();
		
		int num = poly.method(12,8);
		System.out.println(num); 
		
		String str = poly.method("Mohammed ", "Suhail");
		System.out.println(str);
		
		char character = poly.method('S');
		System.out.println(character); 
		
	}

} 
