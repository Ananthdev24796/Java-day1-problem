/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = str.nextInt();
		if (year >=1582) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			
				System.out.println("LeapYear");
			
		}
		else 
			System.out.println("NotLeapYear");
		 
		}
	}
}