package com.syntax.replt;

import java.util.Scanner;

public class ConditionalScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	String name = inp.nextLine();

	  	if(name.equals("Chen"))
	  	{
	  	System.out.println("teacher");
	}
	  	else if(name.equals("Faa"))
	  	{
	  		System.out.println("student");
	  	}
}
}