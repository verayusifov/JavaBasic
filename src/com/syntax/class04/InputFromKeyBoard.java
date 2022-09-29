package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method ;
		
Scanner input=new Scanner(System.in);
//A message will be displayed to the user on the consol to prompt them to enter their name
System.out.println("Please enter your name");
//Activates the java program to take  the input from the keyboard and store
//it inside the name variable
String name=input.next();
System.out.println("Hello "+name+", don't be confused");

	}

}
