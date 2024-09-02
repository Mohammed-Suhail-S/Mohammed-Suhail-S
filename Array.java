package codeio;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array 
		
		int[] student = new int[10];
		for(int i = 1; i <= student.length; i++) {
			System.out.println("Student No: " + i);
		}
		
		System.out.println();
		
		// Array with Random Numbers 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int size = scan.nextInt(); 
		
		int[] arr = new int[size];
		System.out.println("Enter the Numbers: ");
		for(int j = 0; j < arr.length; j++) {
			arr[j] = scan.nextInt(); 
		} 
		
		System.out.println("The Numbers are: ");
		for(int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		} 
		
		scan.close();
		System.out.println("\n"); 
		
		// Two Dimensional Array 
		
		int[][] arr2 = new int[3][2];
			for(int i = 1; i <= 3; i++) {
				System.out.println(); 
				for(int j = 1; j <= 3; j++) {
					System.out.println(i + " " + j); 
				}
			}
			arr2.clone();
	}

}
 