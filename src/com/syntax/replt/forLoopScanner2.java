package com.syntax.replt;

import java.util.Scanner;

public class forLoopScanner2 {

	public static void main(String[] args) {
		// Write a for loop that will print out a series 
		//of numbers starting at 0 and ending at the doubled 
		//value of end(value must be taken from a user), exclusive.
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		for (int i = 0; i < userInput * 2; i++) {
			System.out.print(i + " ");
		}

	}

}
