package com.syntax.class05;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean allergy=true;
String allergyType="peanut";
if(allergy) {
	System.out.println("Let's check what allergy you have");
	
	if(allergyType.equals("Pollen")) {
		System.out.println("Try to stay indoors whn trees are blooming");
	}else if(allergyType.equalsIgnoreCase("Peanut")) {
		System.out.println("Try to stay away from peanuts");
	}else if(allergyType.equals("Dairy")) {
		System.out.println("Try to stay away from dairy products");
    }else {
    	System.out.println("Let's run some tests");
    }

}else {
	System.out.println("You're lucky");
}

}}