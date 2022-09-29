package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        String season = null;
        System.out.println("what is your birth month");
        String month=scan.next();
        if (month.equals("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May"))
        season="Spring";
        else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August"))
        season="Summer";
        else if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February") || month.equalsIgnoreCase("December"))
        season="Winter";
        else if (month.equalsIgnoreCase("Septemper") || month.equalsIgnoreCase("October")|| month.equalsIgnoreCase("November"))
            season="Fall";
        System.out.println("You were born in "+season);
	}

}
