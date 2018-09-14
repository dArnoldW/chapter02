package com.aca;

public class Time {

	public static void main(String[] args) {
		
		int hour = 23;
		int minute = 02;
		int second = 0;
		int secondsInADay = 24 * 60 *60;
		
		System.out.println("total seconds in a day: " + secondsInADay);
		
		// number of seconds since midnight
		//convert hours to seconds
		int totalSecondsHour = hour * 60 * 60;
		
		//convert minutes to seconds
		int totalSecondsMinute = minute * 60;
							
		float totalSecondsSinceMidnight = totalSecondsHour + totalSecondsMinute + second;
		System.out.println("total seconds since midnight: " + totalSecondsSinceMidnight);
		
		float remainingSeconds = secondsInADay - totalSecondsSinceMidnight;
		System.out.println("Seconds remaining: " +remainingSeconds );
		
		//percentage of the day that has passed
		
		float percent = (totalSecondsSinceMidnight / secondsInADay) * 100;
		System.out.println("Percent of Day that has passed: " + percent);
		
	}
	
}
		
		
		
