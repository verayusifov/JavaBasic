package com.syntax.replt;

import java.util.Scanner;

public class LogicalOperators036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		System.out.println("Please enter two numbers");
		int int1 = input.nextInt();
		int int2 = input.nextInt();
		if (int1==int2 && (word1).equalsIgnoreCase(word2)) {
			System.out.println("AND");
		
	}else if(int1==int2 || word1==word2){
	      System.out.println("OR");
	}else if (int1!=int2 && word1!=word2){
	      System.out.println("NONE");
	    }}}