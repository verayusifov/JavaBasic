package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// only when we deal with arrays or collections
		// we can use for each loop, enhanced for loop, advanced for loop

		String[] iceCream = { "Vanilla", "Chocolate", "Pistachio", "Mint", "Mango", "Coffee", "Caramel" };

		for (String flavor : iceCream) {
			System.out.println(flavor);
		}
		System.out.println("-----------------");

		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F' };
		for (char letter : letters) {
			System.out.println(letter);
		}
		System.out.println("-----------------");
		
		int[] numbers= {1,2,3,4,5,6,789,743};
		//get all elements using regular for loop
		for (int i=0; i<numbers.length; i++){
			System.out.println(numbers [i]+" ");
			
		//get all values using enhanced loop
			for(int num:numbers) {
			System.out.println(num+" ");	
			}
		}
		}

	}
