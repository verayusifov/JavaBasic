package com.syntax.class07;

public class Loops {

	public static void main(String[] args) {
		// print numbers from 1 to 20

		for (int i = 1; i <= 100; i++) {

			System.out.print(i + " ");
		}
		System.out.println("--------------------");
		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("------------------------");
		for (int i = 20; i >= 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println("------------------------");

		int i = 20;
		while (i >= 1) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i--;
		}
		System.out.println("------------------------");

	}

}
