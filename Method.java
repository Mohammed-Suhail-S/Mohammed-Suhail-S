package codeio;

public class Method {
	
	public static void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Void without Parameters: " + c);
	}
	
	public static void sub(int a, int b) {
		int c = a - b;
		System.out.println("Void with Parameters: " + c); 
	}
	
	public static int multi() {
		int a = 5;
		int b = 5;
		return a * b;
	}
	
	public static int div(int a, int b) {
		return a / b; 
	} 
	
	public static void recursive(int n) {
		if(n==1) {
			System.out.println(1);
		}
		else {
			System.out.println(n);
			recursive(n-1); 
		} 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Void without Parameters 
		
		add();
		
		// Void with Parameters 
		
		sub(20,10); 
		
		// Non-void without Parameters 
		
		System.out.println("Non-void without Parameters: " + multi());
		
		// Non-void with Parameters 
		
		System.out.println("Non-void with Parameters: " + div(20,5));
		
		// Recursion 
		
		recursive(10);
	} 

}
 