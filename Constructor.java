package codeio;

public class Constructor {
	
	int a;
	int b;
	
	Constructor() {
		a = 10;
		b = 20;
	}
	
	Constructor(int a1, int b1) {
		a = a1;
		b = b1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Constructor 
		
		Constructor con = new Constructor();
		System.out.println(con.a);
		System.out.println(con.b);
		System.out.println("Constructor Answer: " + (con.a + con.b));
		System.out.println();
		
		// Parameterized Constructor 
		
		Constructor con1 = new Constructor(25,25);
		System.out.println(con1.a);
		System.out.println(con1.b);
		System.out.println("Parameterized Constructor Answer: " + (con1.a + con1.b));
		System.out.println();
		
	}
	
}
