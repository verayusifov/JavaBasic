package com.syntax.class06;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int childsAge = scanner.nextInt();
		String ability = null;

		switch (childsAge) {
		case 1:
			ability = "You can crawl";
			break;
		case 2:
			ability = "You can Talk";
			break;
		case 3:
			ability = "You can Dance";
			break;
		case 4:
			ability = "You can get Trouble";
			break;
		default:
	        ability="I don't know how old you are";

		}
		System.out.println(ability);
	}
}
