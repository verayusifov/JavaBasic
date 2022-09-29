package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Plase enter your name");
		String name=scanner.nextLine();
		System.out.println("Please enter your age");
		int age=scanner.nextInt();
		System.out.println("Hi "+name+", you are "+age+" years old");
		

	}

}
