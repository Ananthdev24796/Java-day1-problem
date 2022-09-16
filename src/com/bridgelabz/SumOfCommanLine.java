/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class SumOfCommanLine {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int n,cnt=0,sum=0;
		for(int i=0;i<args.length;i++)
		{
			try
			{	
				
				n=Integer.parseInt(args[i]);
				sum = sum+n;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Invaild Interger:");
				cnt++;
			}
		}
		System.out.println("sum of vaild numers:"+sum);
		System.out.println("Invaild number:"+cnt);

	}

}
