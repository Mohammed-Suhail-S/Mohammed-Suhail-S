package codeio;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// If
		
		int a = 10;
		if(a==10) {
			System.out.println("Correct Value");
		}
		
		// If Else
		
		int age = 18;
		if(age==18) {
			System.out.println("You're Eligible To Vote");
		}
		else {
			System.out.println("You're not Eligible To Vote"); 
		}
		
		// Else If
		
		int mark = 90;
		if(mark==90) {
			System.out.println("Outstanding");
		}
		else if(mark==70) {
			System.out.println("Good");
		}
		else if(mark==50) {
			System.out.println("Poor");
		}
		else {
			System.out.println("Fail");
		}
		
		// Nested If 
		
		int i = 10;
		int j = 15;
		if(i==10) {
			if(i<=j) {
				System.out.println("Perfect Nested If");
			}
			else {
				System.out.println("Something Error!");
			}
		}
		
		// Switch Case 
		
		int day = 7;
		switch(day) {
		case 1: 
			System.out.println("Sunday");
			break; 
		case 3: 
			System.out.println("Tuesday");
			break;
		case 5: 
			System.out.println("Thursday");
			break;
		case 7: 
			System.out.println("Saturday");
			break;
		default: 
			System.out.println("Invalid Day");
			break;
		}
	}

}
