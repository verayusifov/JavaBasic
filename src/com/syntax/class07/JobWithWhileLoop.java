package com.syntax.class07;

import java.util.Scanner;

public class JobWithWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String answer;

System.out.println("Did you get a job?");
answer= sc.nextLine();
while(!answer.equals("yes")) {
System.out.println("Did you get a job?");
answer=sc.nextLine();
	}}

}
