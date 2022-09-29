package com.syntax.class08;

import java.text.DecimalFormat;

public class LoopHWDigitalWatch {

	public static void main(String[] args) {

		// Simulate the clock.
		for (int	 hours = 01; hours <= 24; hours++) {
			for (int minutes = 00; minutes <= 59; minutes++) {
		
					System.out.println((hours) + ":" +(minutes));
				}
			}
		}
	}
