package com.syntax.class06;

import java.util.Scanner;

public class Task1EnhancedCodeAverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is your quiz score? ");
		double quizExam=scanner.nextDouble();
		System.out.println("What is your midterm score?  ");
		double midTermExam=scanner.nextDouble();
		System.out.println("What is your final score? ");
		double finalExam=scanner.nextDouble();
		
		double average;
		String grade="null";
		
 average =(quizExam+midTermExam+finalExam)/3;
 
 if(average>=90 && average<=100) {
	 grade="A";
 }
 else if (average>=70 && average<90){
	 grade="B";
 }
 else if(average>=50 && average<70) {
	 grade="C";
 }
 else if(average>50 && average>0) {
	 grade="F";
 }
 else {
	 System.out.println("Please enter valid score ");
	 grade="None";
 }
 System.out.println("Grade: "+grade);
	}}
