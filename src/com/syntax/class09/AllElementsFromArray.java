package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] iceCream= {"Vanilla", "Chocolate", "Pistachio", "Mint", "Mango"};

//How to get all values from the string
System.out.println(iceCream[0]);

for (int i=0; i<iceCream.length; i++) {
	System.out.println(iceCream[i]);
}
	System.out.println("----------------------");
	
	char [] letters= {'A','B','C','D','E','F'};
	for(int i=0; i<letters.length;i++) {
		System.out.print(letters[i]+" ");
	}
	
	
}



	}


