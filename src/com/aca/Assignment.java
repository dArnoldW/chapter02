package com.aca;

public class Assignment {

	public static void main(String[] args) {
		String txt = "Fantastic ";
		String lang = "Java ";
		txt += lang;	// Assign concatenated String
		System.out.println( "Add & Assign Strings: " + txt);
		
		int sum = 10;
		int num = 20;
		sum += num;		//Assign result ( 10 + 20 = 30 )
		System.out.println( "Add & Assign Integers: " + sum);
		
		int factor = 5;
		sum *= factor;	// Assign result ( 30 x 5 = 150 )
		System.out.println( "Multiplication sum: " + sum);
		
		sum /= factor;	//Assing result ( 150 divided by 5 = 30 )
		System.out.println( "Division sum: " + sum);
		

	}

}
