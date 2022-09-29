package com.syntax.class07;

import java.util.Scanner;

public class SwitchCaseHWReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your country");
		String country=input.nextLine();
		String yourLanguage;
		switch (country) {
		case "Czech Republic":
		    yourLanguage="Czech";
		    break;
		case "Slovakia":
		    yourLanguage="Slovak";
		    break;
		case "Russia":
		    yourLanguage="Rushian";
		    break;
		case "Italy":
		    yourLanguage="Italian";
		    break;
		case "Germany":
		    yourLanguage="German";
		    break;
		case "Austria":
		    yourLanguage="German";
		    break;
		case "Spain":
		    yourLanguage="Spanish";
		    break;
		case "France":
		    yourLanguage="French";
		    break;
		    default:
		        yourLanguage="Unknown";
		}
		System.out.println(yourLanguage);
		    }

		}