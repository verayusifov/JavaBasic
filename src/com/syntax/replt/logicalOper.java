package com.syntax.replt;

import java.util.Scanner;

public class logicalOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		   boolean b=input.nextBoolean();
		   if(b)
		   {

		     int score=input.nextInt();
		     if(score<600)
		     {
		       System.out.println("The eligibility is Not eligible");
		     }
		     else if(score>=600 && score<700)
		     {
		       System.out.println("The eligibility is Maybe eligible");
		     }
		     else if(score>700 && score<800)
		     {
		       System.out.println("The eligibility is Eligible");
		     }
		     else if(score>800)
		     {
		       System.out.println("The eligibility is Definitely eligible");
		     }
		     else
		     {
		       System.out.println("Invalid entry");   
		       }
		   }
		   else{
		     System.out.println("eligibility is Unknown");
		   }
		 }}