package com.syntax.replt;

import java.util.Scanner;

public class switchCaseDaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month number");
		int dayOfweek = scanner.nextInt();

		String day = null;

		switch (dayOfweek) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
			break;

		default:
			day = "Invalid";

		}
		System.out.println(day);
	}

}
