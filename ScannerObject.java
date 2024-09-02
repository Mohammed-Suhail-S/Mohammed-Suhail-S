package codeio;

import java.util.Scanner;

public class ScannerObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner 

		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the Name: ");
		String name = obj.nextLine();
		
		System.out.print("Enter the Initial: ");
		char initial = obj.next().charAt(0); 
		
		System.out.println("The Entered Name is: " + name);
		System.out.println("The Entered Initial is: " + initial);
		
		obj.close();
	}

}
