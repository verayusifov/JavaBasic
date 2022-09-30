package com.syntax.review3;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";

		str = str.toUpperCase();
		char lastCharacter = str.charAt(str.length() - 1);

		str.indexOf(lastCharacter);
		System.out.println(lastCharacter);

		int index = str.indexOf(lastCharacter);
		System.out.println(index);

		System.out.println(str.indexOf('a'));
		boolean empty = str.isEmpty();
		System.out.println(empty);
		// trim();

	}

}
