package com.syntax.class08;

public class NestedLoopsIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 3; i++) {
			System.out.println("I say Hello");
			for (int j = 1; j <= 3; j++) {
				System.out.println("You say Goodbye");
			}
		}
		System.out.println("End of the Code");
		
		System.out.println("--------------------------");
		

		for (int i = 0; i <= 2; i++) {

			for (int j = 1; j < 4; j++) {
				System.out.println(i+" "+j);
			}
		}
	}

}
