package com.syntax.class02;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=7;
int b=4;
int c=100;
int d=250;

double sum=a+b;
double sub=d-c;
double div=c/a;
double multi=a*b;

System.out.println("The addition of 2 numbers "+a+" and "+b+" is equal to "+sum);
System.out.println("The multiplication of 2 numbers "+a+" and "+b+" is equal to "+multi);
System.out.println("The division of 2 numbers "+c+" and "+a+" is equal to "+div);
System.out.println("The substraction of 2 numbers "+d+" and "+c+" is equal to "+sub);

double num1=3.9;

double square=num1*num1;

System.out.println("The square of the "+num1+" is "+square);


int width=8;
int height=5;

double area=width*height;
double perimeter=(width*2)+(height*2);

System.out.print("The perimeter of a rectangle with width "+width+" and height "+height+" is equal to "+perimeter+" and the area is ");
System.out.println(area);
	}

}
