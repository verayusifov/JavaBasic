package com.syntax.replt;

import java.util.Scanner;

public class SwitchInstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name of the instructor");
		String name = input.nextLine();
		String assignment;

		switch (name) {
		case "Asghar":
			assignment = "Will take care of Java Assignment";
			break;
		case "Moazam":
			assignment = "Will take care of SDLC Assignment";
			break;
		case "Wegas":
			assignment = "Will take care of Selenium Assignment";
			break;
		case "Asel":
			assignment = "Will take care of every Assignment";
			break;
		default:
			assignment = "Invalid instructor selected";
		}
		System.out.println(assignment);
	}

}