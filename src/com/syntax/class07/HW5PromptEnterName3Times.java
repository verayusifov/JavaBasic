package com.syntax.class07;

import java.util.Scanner;

public class HW5PromptEnterName3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String name = null;
		for (int i = 1; i <= 3; i++) {
			System.out.println("Please enter your name");
			name = scanner.nextLine();
		}
		System.out.println("Good afternoon " + name);

	}
}
