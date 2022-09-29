package com.syntax.class05;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("What's time of day is it now? ");
		double time = scanner.nextDouble();

		if (time >= 1 && time <= 11) {
			System.out.println("Morning time");
		} else if (time >= 12 && time < 15) {
			System.out.println("Afternoon time");
		} else if (time >= 16 && time <= 20) {
			System.out.println("Evenin time");
		} else if (time >= 21 && time <= 24) {
			System.out.println("Night time");
		} else {
			System.out.println("Invalid Number");
		}
	}
}
