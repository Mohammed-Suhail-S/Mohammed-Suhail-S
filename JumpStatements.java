package codeio;

public class JumpStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Break 
		
		for(int i = 1; i <= 10; i++) {
			if(i==5) {
				System.out.println("Stop the Loop!");
				break;
			}
			System.out.println(i);
		}
		System.out.println();
		
		// Continue 
		
		for(int j = 1; j <= 10; j++) {
			if(j==5) {
				System.out.println("Skip the Loop!");
				continue;
			}
			System.out.println(j);
		}
		System.out.println();
	}

}
