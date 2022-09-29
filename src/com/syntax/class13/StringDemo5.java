package com.syntax.class13;

public class StringDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love java programming";
		System.out.println(str.charAt(7));

		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) == ' ')) {
				System.out.println(str.charAt(i));

			}
		}
	}

}
