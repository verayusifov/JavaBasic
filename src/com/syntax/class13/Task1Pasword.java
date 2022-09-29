package com.syntax.class13;

import java.util.Scanner;

public class Task1Pasword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "user1";
		String password = "pass123";
		String confirmPassword = "pass123";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the userName");
		userName=scanner.next();
		System.out.println("Please enter the password");
		password=scanner.next();
		System.out.println("Please enter the password again");
		confirmPassword=scanner.next();
		

		
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password can't contain username");
		} else if (!password.equals(confirmPassword)) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}

	}
}
