package com.syntax.class14;

public class Task2WriteBackwards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a String and print it in reverse order (sunday-yadnus)
		String str = "Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		char[] charArr = str.toCharArray();
		for (int i = charArr.length - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}

}
