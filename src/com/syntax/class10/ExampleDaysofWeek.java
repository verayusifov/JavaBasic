package com.syntax.class10;

public class ExampleDaysofWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] week={"Monday","Sunday", "Tuesday","Friday" };
		for (String day:week) {
			if (day.equals("Sunday")) {
				System.out.println(day+" is a fun day");
			}else if (day.equals("Friday")){
				System.out.println(day+" is a relax day");
			}else {
				System.out.println(day+" is a boring day");
			}
			}
			//enhanced code
		for (int i=0; i<week.length; i++) {System.out.println(week[i]);
		}
		
	}}


