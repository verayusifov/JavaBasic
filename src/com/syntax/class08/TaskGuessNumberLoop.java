package com.syntax.class08;

import java.util.Scanner;

public class TaskGuessNumberLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int secretNumber=8;
        int guessNumber;
        do{
            System.out.println("Please guess the secret number from 1 to 10");
            guessNumber=input.nextInt();
        }while(secretNumber!=guessNumber);
        System.out.println("Congratulations! You won!");
	}

}
