/**
 * 
 */
package com.bridgelabz;

/**
 * @author Iam_A
 *
 */
public class SumOFCom {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int n,cnt=0,sum=0;
		for(int i =0;i<args.length;i++) {
//			System.out.println(args[i]);
			if (sum >= 0) {
			n= Integer.parseInt(args[i]);
			sum = sum+n;
			
//			System.out.println("Sum of vaild number :"+sum);
			
		}
			else {
				System.out.println("Invaild Interger:");
				cnt++;
			}
				
			System.out.println("sum of vaild numers:"+sum);
			System.out.println("Invaild number:"+cnt);

	}
		

}
	
}
