package com.syntax.class04;

import java.util.Scanner;

public class HwDiploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a degree?");
		boolean degree=scanner.nextBoolean();
		
		if(degree) {
		System.out.println("Congratulations");
		}
		else {
			System.out.println("Go get a degeree");
		}
	System.out.println("What is your gpa?");
	double gpa=scanner.nextDouble();
	if (gpa>=3.5) {
		System.out.println("You are eligible for scholarship!");
	}
	else {
		System.out.println("You should have studied harder.");
	}
			
		}
		
		
	}


