package com.syntax.class13;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am always confused";

		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("m"));
		System.out.println(str.indexOf("d"));

		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));

		int num = 123232323;
		String numStr = String.valueOf(num).substring(1, 3);
		System.out.println(numStr);
		num = Integer.parseInt(numStr);
		System.out.println(num);

	}
}
