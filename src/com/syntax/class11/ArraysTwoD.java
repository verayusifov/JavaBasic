package com.syntax.class11;

public class ArraysTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String[] individualsInRoom1=new String[] {"Vera", "Anar","Michael", "Adam"};
 String[] individualsInRoom2=new String[] {"Bara", "Lenka","Basti", "Mahmud"};
 String[] individualsInRoom3=new String[] {"Petr", "Monika", "Jan"};
 String[] [] rooms=new String[3][];
 rooms [0]=individualsInRoom1;
 rooms [1]=individualsInRoom2;
 rooms [2]=individualsInRoom3;
 
 System.out.println(rooms[1][1]);
 System.out.println(rooms[2][2]);
 
	}

}
