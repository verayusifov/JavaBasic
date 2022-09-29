package com.syntax.replt;

import java.util.Scanner;

public class BooleanScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Are you thirsty?");
		boolean Thirsty = scanner.nextBoolean();
		System.out.println("Are you sleepy?");
		boolean sleepy = scanner.nextBoolean();

		if (Thirsty && sleepy) {
			System.out.println("Looks like you need to dink coffee.");
		} else if (Thirsty && !sleepy) {
			System.out.println("Looks like you need to drink water.");
		} else if (!Thirsty && sleepy) {
			System.out.println("Look like you need to drink tea");
		} else {
			System.out.println("Looks like you need to drink nothing");
		}

	}

}
