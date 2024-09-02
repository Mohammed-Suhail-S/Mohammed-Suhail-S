package codeio;

public class Keywords {
	
	// Final Keyword -> If i used the final keyword, then no way to change the value of the variable. 
	
	final static int num = 23;
	
	// Static Keyword -> If i used the static keyword to the method, then i will call the method with classname not compulsory to use object. 
	
	static void method() {
		System.out.println("This Method is used with Static Keyword. ");
	}
	
	String name;
	int age;
	
	// This Keyword -> If i used same name for the parameters and variables, then compiler will be confused. so, i used this keyword for the 
	// variable. Then compiler will be understood. 
	
	public void profile(String name, int age) {
		this.name = name; 
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Keywords.num);
		
		Keywords.method();
		
		Keywords obj = new Keywords();
		obj.profile("Suhail", 21);
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		
	}

}
