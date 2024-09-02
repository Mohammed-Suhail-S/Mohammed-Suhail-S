package codeio;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Arithmetic Operators
		
		int a = 10;
		int b = 17;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((float) a/(float) b); 
		System.out.println(a%b);
		System.out.println();
		
		// Relational Operators 
		
		int c = 10;
		int d = 20;
		System.out.println(c>d);
		System.out.println(c>=d);
		System.out.println(c<d);
		System.out.println(c<=d);
		System.out.println(c==d);
		System.out.println(c!=d); 
		System.out.println();
		
		// Logical Operators 
		
		boolean e = true;
		boolean f = false;
		System.out.println(!e);
		System.out.println(!f);
		System.out.println(e && f);
		System.out.println(e || f);
		System.out.println(); 
		
		// Unary Operators
		
		int i = 7;
		int j = 5;
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(--j);
		System.out.println(j--); 
		
	} 

}
