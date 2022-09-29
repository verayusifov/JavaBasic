package com.syntax.class08;

import java.util.Scanner;

public class Task01calculateSumOddEven {

	public static void main(String[] args) {
		// TODO

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 2; i <= 50; i += 2) {
			sum1 += i;
		}
		System.out.println("The sum of even numbers from 1 to 50 is " + sum1);

		for (int j = 1; j <= 50; j += 2) {
			sum2 += j;
		}
		System.out.println("The sum of odd numbers from 1 to 50 is " + sum2);
	}
}