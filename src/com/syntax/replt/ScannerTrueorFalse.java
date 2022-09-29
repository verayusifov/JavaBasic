package com.syntax.replt;

import java.util.Scanner;

public class ScannerTrueorFalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		  System.out.println("Please enter first number");
		  int x=scanner.nextInt();
		System.out.println("Please enter second number");
		  int y=scanner.nextInt();
int num=x*y;

		if(num>0)
		{
		  System.out.println("true");
		}
		else if(num<0)
		  {
		    System.out.println("false");
		}
	}

}
