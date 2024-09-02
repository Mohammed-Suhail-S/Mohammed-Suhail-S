package codeio;

public class Private extends AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Private obj = new Private();
		obj.display();
		
		obj.setName("Asif");
		obj.setAge(20);
		String name = obj.getName();
		int age = obj.getAge(); 
		
		System.out.println("Name: " + name + "\n" + "Age: " + age);
		
	}

}
 