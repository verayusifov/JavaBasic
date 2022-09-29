package com.syntax.class07;

import java.util.Scanner;

public abstract class ClaculatorUsinfIFnoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number:");
        double num1 = scan.nextDouble();
        System.out.println("Please enter your second number:");
        double num2 = scan.nextDouble();
        System.out.println("Please enter the operator you want to use:");
        char op = scan.next().charAt(0);

        double result = 0;
        boolean wrongOperator=false;
        
        if (op=='+') {
        	result = num1 + num2;
        }
        
        
        
        
	}

}
