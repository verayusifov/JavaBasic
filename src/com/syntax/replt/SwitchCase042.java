package com.syntax.replt;

import java.util.Scanner;

public class SwitchCase042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rollNumber = scanner.nextInt();
		System.out.println("Enter the roll number of the Child");
		String name = null;


		switch (rollNumber) {
		case 101:
			name = "Ramesh";
			break;
		case 102:
			name = "Mahesh";
			break;
		case 103:
			name = "Mukesh";
			break;
		default:
			name = "Not found Student name: in Class";

		}
		System.out.println(name);
	}

}
