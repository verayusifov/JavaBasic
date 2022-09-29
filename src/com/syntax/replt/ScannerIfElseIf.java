package com.syntax.replt;

import java.util.Scanner;

public class ScannerIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	if(num>0)
		{
			System.out.println(num+" is positive");
		}
		else if(num<0)
		{
			System.out.println(num+" is negative");	
		}
		else if(num==0)
		{
				
		System.out.println(num+" is equals to 0");
	}
		}

	
	

}
