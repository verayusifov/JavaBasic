package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a 2D array (longer way)where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print following String:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		//Create a 2D array(shorter way) in which first array will consist of 4 names and second array will
		//contain grades. Then your program should print name of the students that has A and B grade

		String[][] name = new String[2][4];
		//1 row

				name[0][0] = "Mr ";
				name[0][1] = "Mrs ";
				name[0][2] = "Ms ";
				name[0][3] = "Miss ";

		//2 row
				name[1][0] = "Smith";
				name[1][1] = "Obama";
				name[1][2] = "Jackson";
				name[1][3] = "Jordan";
				
System.out.println(name[0][1]+name[1][0]);
System.out.println(name[0][0]+name[1][1]);
System.out.println(name[0][2]+name[1][2]);		
System.out.println(name[0][3]+name[1][3]);		
System.out.println("------------------------");
	
String[][] arr = { { "Vera", "Anar", "Adam", "Michael"}, 
		{ " A", " B"," C", " D"},
		
		};
System.out.println(arr[0][0]+arr[1][0]);
System.out.println(arr[0][1]+arr[1][1]);

	}

}
