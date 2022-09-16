/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class StaticKeyword {

	/**
	 * @param args
	 */
	//Static variable
	
	static int counter = 10;
	{
		System.out.println("1st"+counter);
		counter +=1;
		System.out.println(counter);
	}
	// static method 
	static void display()
	{
		System.out.println("static Method");
	}
	// Static Block
	static {
		System.out.println("Inside Static Block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
		StaticKeyword sk1 = new StaticKeyword();
		StaticKeyword sk2 = new StaticKeyword();
		StaticKeyword sk3 = new StaticKeyword();
		display();

	}

}
