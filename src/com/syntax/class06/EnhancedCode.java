package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("What's time of day is it now? Use 24 hour format. ");
		double time = scanner.nextDouble();

		String timeOfTheDay = null;
		
		if (time >= 1 && time <= 11) {
			timeOfTheDay="Morning";
		} else if (time >= 12 && time < 15) {
			timeOfTheDay="Afternoon";
		} else if (time >= 16 && time <= 20) {
			timeOfTheDay="Evening";
		} else if (time >= 21 && time <= 24) {
			timeOfTheDay="Night";}
	 else {
		System.out.print("Wrong number is entered. ");
			timeOfTheDay="Invalid";
	 }
		System.out.println(timeOfTheDay);
		

	}}
			
	

