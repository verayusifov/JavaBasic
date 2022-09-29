package com.syntax.class13;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java");
		String name = "Vera Voracova Yusifov";
		System.out.println(str.length());
		System.out.println(name.length());

		if (name.length() > 15) {
			System.out.println("Name can't be more than 15 characters");

		}
	}

}
