package com.syntax.review3;

public class Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//how would you reverse a string without using a reverse function?
		/*
		 * 1. use StringBuilder and revere method 2.
		 * 2. use charAt()
		 * 
		 */
		String str = "Hello";
		String newString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newString = newString + str.charAt(i);
			System.out.println(newString);
		}
		StringBuilder sb=new StringBuilder("Hello");
		sb.reverse();
		System.out.println(sb);
		

	}

}
