package com.syntax.class11;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the number of dresses you want to buy");
		int noOfDresses = scanner.nextInt();

		double[] prices = new double[noOfDresses];

		for (int i = 0; i < noOfDresses; i++) {
			System.out.println("Please enter the price of dress no " + (i + 1));
			prices[i] = scanner.nextDouble();
		}
		System.out.println(Arrays.toString(prices));
		double sum=0;
for(double price:prices) {
sum+=price;

}
		System.out.println("Total for all the dresses ="+sum);
	}
}
