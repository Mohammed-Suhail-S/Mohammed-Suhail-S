package codeio;

import java.util.Date; 

public class ReferenceDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = a;
		a = 10;
		System.out.println(a);
		System.out.println(b); 

		// Reference Datatypes 
		
		Date today = new Date();
		System.out.println(today);
		
	} 

}
