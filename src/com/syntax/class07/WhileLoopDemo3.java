package com.syntax.class07;

public class WhileLoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 20;
		while (i <= 50) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("--------------");

		int a = 1;
		while (a <= 20) {
			if (a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		System.out.println("--------------");
		//easier way!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int d = 2;
		while (d <= 20 && d % 2 == 0) {
			System.out.print(d+" ");
			d += 2;
		}
	}
}