package com.syntax.class12;

public class Project08fromInstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int previous = 0;
		int currentNumber = 1;
		int nextNum = 0;
		System.out.println(previous);
		System.out.println(currentNumber);
		for (int i = 0; i < 8; i++) {
			nextNum = previous + currentNumber;
			System.out.println(nextNum);
			previous = currentNumber;
			currentNumber = nextNum;
		}
	}

}
