package codeio;

public class IterativeStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// For Loop 
		
		int sum = 0;
		int n = 5;
		int i;
		for(i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Numbers with For Loop: " + sum);
		
		// While Loop 
		
		int sum2 = 0;
		int n2 = 5;
		int i2 = 1;
		while(i2 <= n2) {
			sum2 = sum2 + i2;
			i2++;
		}
		System.out.println("Sum of Numbers with While Loop: " + sum2);
		
		// Do While Loop
		
		int sum3 = 0;
		int n3 = 5;
		int i3 = 1;
		do {
			sum3 = sum3 + i3;
			i3++;
		}
		while(i3 <= n3); 
		System.out.println("Sum of Numbers with Do While Loop: " + sum3); 
		System.out.println();
		
		// Nested For Loop 
		
		for(int k = 1; k <= 3; k++) {
			for(int j = 1; j <=3; j++) {
				System.out.println(k + " " + j);
			}
		}
		System.out.println("Iterative Statement Is End."); 
	}
}
