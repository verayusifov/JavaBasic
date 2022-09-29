package com.syntax.class10;

public class TwoDArrayDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = { { "Vera ", "Anar ", "Adam ", "Michael " },
				{ " A", " B", " C", " D" },
				};
		for (String[] singleArray : arr) {
			for (String el : singleArray) {
				System.out.print(el);
			}
			System.out.println();
			
		}
	}

}
