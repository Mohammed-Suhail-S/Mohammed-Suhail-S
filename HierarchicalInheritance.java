package codeio;

class Mother {
	char gender = 'F';
}

class Daughter extends Mother {
	
}

class Son1 extends Mother {
	char gender = 'M';
}

// Hybrid Inheritance -> It means two inheritance concept is running in the one inheritance is called as hybrid inheritance. eg: In this class there 
// are two inheritance is running in the concept 1, hierarchical inheritance and 2, single inheritance. So it is called as hybrid inheritance.  

class GrandSon extends Son1 {
	
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Hierarchical Inheritance 
		
		Daughter d = new Daughter();
		System.out.println("Mother and Daughter Gender: " + d.gender); 
		
		GrandSon g = new GrandSon(); 
		System.out.println("Son and Grand Son Gender: " + g.gender); 
		
	}

}
