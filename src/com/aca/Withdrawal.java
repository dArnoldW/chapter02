package com.aca;

public class Withdrawal {

	public static void main(String[] args) {

		int withdrawal = 137;
		
		int twenties = withdrawal / 20;
		System.out.println("Twenties: " + twenties);
		
		int remainingAmt = (withdrawal - (twenties * 20));
		
		int ten = remainingAmt / 10;
		System.out.println("Tens: " + ten);
		
		remainingAmt = remainingAmt - (ten * 10);
		
		int five = remainingAmt / 5;
		System.out.println("Fives:" + five);
		
		remainingAmt = remainingAmt - (five * 5);
		
		int one = remainingAmt / 1;
		System.out.println("Ones: " + one);
	
		
		
		

	}

}
