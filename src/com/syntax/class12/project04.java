package com.syntax.class12;

public class project04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 10, 9, 8, 7 }, { 20, 30, 40 }, { 56, 78 } };
		
		for (int[] ar : arr) {
			for (int num : ar) {
				if (num % 2 == 0) {
					System.out.println(num);
				}

			}

		}
	}

}
