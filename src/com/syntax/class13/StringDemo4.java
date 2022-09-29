package com.syntax.class13;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Shah";
		String str2 = "Shah";
		String str3 = new String("Shah");

		if (str.equals("shah")) {
			System.out.println("I found it");
		}
		if (str.equalsIgnoreCase("shah")) {
			System.out.println("I found it");
		}

	}
}