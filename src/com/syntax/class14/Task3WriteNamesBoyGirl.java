package com.syntax.class14;

import java.io.InputStream;
import java.util.Scanner;

public class Task3WriteNamesBoyGirl {

	public static void main(String[] args) {
		  String motherName;
	        String fatherName;
	        String babyType;
	        String firstHalf;
	        String secondHalf;

	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Please Enter the name of mother");
	        motherName=scanner.next();
	        System.out.println("Please Enter the name of father");
	        fatherName=scanner.next();
	        System.out.println("Are you expecting a boy or girl boy=true girl=false");
	        babyType=scanner.next();

	        if(babyType.equals("boy")) {
	            firstHalf=fatherName.substring(0,fatherName.length()/2);
	             secondHalf=motherName.substring(motherName.length()/2);

	        }else {
	             firstHalf=motherName.substring(0,motherName.length()/2);
	             secondHalf=fatherName.substring(fatherName.length()/2);

	        }
	        System.out.println(firstHalf+secondHalf);

	    }}