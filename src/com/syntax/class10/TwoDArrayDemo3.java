package com.syntax.class10;

public class TwoDArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = { { "Vera", "Anar", "Adam", "Michael" }, { " A", " B", " C", " D" }, };
		 for(int i=0; i<arr.length; i++) {

	            for (int j=0; j<arr[i].length; j++) {
	                System.out.println(arr[i][j]+"  ");
	            }

			}
		}
	}

