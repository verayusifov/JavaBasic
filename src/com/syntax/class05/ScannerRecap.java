package com.syntax.class05;

import java.util.Scanner;

public class ScannerRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int I=10;
String str="Hello";

Scanner input=new Scanner(System.in);
System.out.println("Please enter your name:");
String name=input.next();
System.out.println("Nice to meet you "+name);
System.out.println("How old are you? "+name);
int age=input.nextInt();
System.out.println(name+" is "+age+" years old");
System.out.println("How much money do you have "+name);
double money=input.nextDouble();
System.out.println(name+" is "+age+" and has $"+money);
System.out.println(name+", what is your grade?");
char grade=input.next().charAt(0);
System.out.println(name+" is grade "+grade);


	}

}
