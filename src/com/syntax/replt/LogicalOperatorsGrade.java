package com.syntax.replt;

import java.util.Scanner;

public class LogicalOperatorsGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		double mark = scanner.nextDouble();

		if (mark > 1 && mark < 25) {
			System.out.println("your grade is F");
		} else if (mark >= 25 && mark < 45) {
			System.out.println("your grade is E");
		} else if (mark >= 45 && mark < 50) {
			System.out.println("your grade is D");
		} else if (mark >= 50 && mark < 60) {
			System.out.println("your grade is C");
		} else if (mark >= 60 && mark <= 80) {
			System.out.println("your grade is B");
		} else if (mark > 80) {
			System.out.println("your grade is A");
		} else if (mark<0) {
			System.out.println("Please enter a valid mark");
		}

	}

}
