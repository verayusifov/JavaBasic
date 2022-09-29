package com.syntax.replt;

import java.util.Scanner;

public class NestedIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Boolean isSunny = false;
		int temperature = 83;

		System.out.println("Is it sunny outside?");
		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");

			if (temperature > 85) {
				System.out.println("I am going to the beach!");
			} else if (temperature < 85) {
				System.out.println("I am going to the park!");
			}
		} else {
			System.out.println("I stay home and practice Java!");
		}
	}
}