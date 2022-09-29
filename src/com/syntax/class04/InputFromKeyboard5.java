package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Did you solve Repl Assignment please enter tru or false?");
	boolean solvedAnyRepls=scanner.nextBoolean();
	
	if(solvedAnyRepls) {
		System.out.println("How many Repls did you solve");
		
		int noOfReplsSolved=scanner.nextInt();
		
		if(noOfReplsSolved>=17)
		{
			System.out.println("You're doing great");
		}
		else if(noOfReplsSolved>10)
		{
			System.out.println("Keep working and complete the rest ASAP");	
		}
		else
		{
				
		System.out.println("you should solve some more repls");
	}
		}
	else 
	{System.out.println("They are very important to learn java, please solve them");

	}

}}
