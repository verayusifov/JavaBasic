package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		String[]grade= {"A","B","C","D","E","F"};
		System.out.println(grade[1]);
		
		String[]grade1=new String[6];
		grade1[0]="A";
		grade1[1]="B";
		grade1[2]="C";
		grade1[3]="D";
		grade1[4]="E";
		grade1[5]="F";

		System.out.println(grade1[1]);
		
		//Names - 2 options
		
		String[]names= {"Vera","Anar","Adam","Michael"};
		
		System.out.println("Hello "+names[1]);
		
		/////Second option-longer
		String[]family=new String[4];
		names[0]="Vera";
		names[1]="Anar";
		names[2]="Adam";
		names[3]="Michael";
		
		System.out.println("Hello "+names[1]);
		
//Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements 
//of array:“Saturday is Java coding Day”.
		
		  String []word = new String[5];

	        word[0]="Java";
	        word[1]="Saturday";
	        word[2]="day";
	        word[3]="coding";
	        word[4]="is";

	        System.out.println(word[1]+" " + word[4]+" " +word[0]+" "+word[3]+" "+word[2] );
	}

}
