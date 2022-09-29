package com.syntax.replt;

import java.util.Scanner;

public class forLoopScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = inp.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num);
		}

	}
}

