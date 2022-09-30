package com.syntax.review3;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";

		System.out.println(str);
		System.out.println("--------------");
		str = str.toUpperCase();
		System.out.println(str);
		System.out.println("--------------");
		int size = str.length();
		System.out.println(size);
		System.out.println("--------------");
		char letter=str.charAt(4);
		System.out.println(letter);
		System.out.println("--------------");
		//how to get last character
		char lastCharacter=str.charAt(str.length()-1);
		System.out.println(lastCharacter);
		System.out.println("--------------");

	}

}
