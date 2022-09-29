package com.syntax.replt;

import java.util.Scanner;

public class forLoopScannerNoSeeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();

		for (int i = 0; i <= x; i++) {
			System.out.print(i + " ");
		}
	}
}