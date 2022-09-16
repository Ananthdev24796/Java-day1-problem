/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author Iam_A
 *
 */
public class StringEqual {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the input1");
		String s = sc1.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the input2");
		String s1 = sc2.nextLine();
		if (s.equals(s1)) 
			System.out.println("two strings are equal");
		
		else
			System.out.println("two strings are not equal");
			
	}

}
