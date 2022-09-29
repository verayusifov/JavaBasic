package com.syntax.class07;

import java.util.Scanner;

public class HW6CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double coffeePrice = 5;
		double amount;
		System.out.println("Please pay for a coffee using exact amount");
		do {
			amount = scanner.nextDouble();
			if (amount < coffeePrice) {
				System.out.println("Please give more");
			} else if (amount > coffeePrice) {
				System.out.println("Please give less");
			}

		} while (coffeePrice != amount);
		{
			System.out.println("Enjoy our coffee");
		}

	}
}
