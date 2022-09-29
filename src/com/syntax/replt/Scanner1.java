package com.syntax.replt;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scanner.nextLine();
		System.out.println("Enter your mobile number (please use xxx-xxx-xxxx format)");
		String phone = scanner.nextLine();
		System.out.println("Enter your age");
String age = scanner.nextLine();
		System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + phone);

	}
}
