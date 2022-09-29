package com.syntax.class05;

public class JavaStringsMultipleConditions {

	public static void main(String[] args) {
		// shortcut to autocomplete is type main and press ctrl+space

		String phone="Ericson";
		if(phone.equals("IPhone")) {
			System.out.println("I want to buy it for me");
		}
		else if(phone.equals("Samsung")) {
			System.out.println("I want to buy it for my husband");
		}
		else if(phone.equals("Nokia")) {
			System.out.println("I want to buy it for my Grandma");
		}
		else {
			System.out.println("That is not the phone I'm looking for");
		}
	}
}
