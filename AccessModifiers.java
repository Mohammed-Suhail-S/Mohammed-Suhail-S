package codeio;

public class AccessModifiers {
	
	// Private Access Modifiers 
	// Encapsulation  
	
	private String pname;
	private int page;

	public String getName() {
		return pname;
	}
	
	public void setName(String name) {
		pname = name;
	}
	
	public int getAge() {
		return page;
	}
	
	public void setAge(int age) {
		page = age;
	}
	
	// Public Access Modifiers 
	
	public void display() {
		String name = "Suhail";
		int age = 21;
		System.out.println("Name: " + name + "\n" + "Age: " + age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifiers obj = new AccessModifiers();
		obj.display();
		
	}

}
