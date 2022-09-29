package com.syntax.class13;

public class Phone {

	// TODO Auto-generated method stub
//create a class "Phone". Create 3 objects of it: Iphone, Pixel, Samsung with specific atributes & beahaviours
	String make;
	String model;
	String color;
	int year;
	int storage;

	void makeCall() {
		System.out.println("Making a call using " + model);
	}

	void takePictures() {
		System.out.println("Taking pictures with " + model);
	}
	void browseInternet() {
		System.out.println("Browsing the internet with " + model);
	}

}
