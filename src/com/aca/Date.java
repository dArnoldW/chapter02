package com.aca;

public class Date {

	public static void main(String[] args) {
		String day = "Thursday";
		String date = "26";
		String comma = ",";
		String month = "July";
		String year = "2018";
		String space = " ";
		System.out.println("American format:");
		System.out.println(day + comma + space + month + space + date + comma + space + year );
		System.out.println("European format:");
		System.out.println(day + space + date + space + month + space + year);

	}

}
