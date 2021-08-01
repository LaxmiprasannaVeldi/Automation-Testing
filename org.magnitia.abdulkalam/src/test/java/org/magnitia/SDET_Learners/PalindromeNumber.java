package org.magnitia.SDET_Learners;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,rev=0,palindrome=0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=in.nextInt();
		palindrome=num;
		while (num!=0) 
		{
			rev = rev * 10 + num % 10;
	        num = num / 10;
			
		}
		
		//System.out.println("Reverse Number is:"+rev);
		
		if (rev==palindrome) {
			System.out.println("given number is palindrome");
		}
		else {
			System.out.println("given number is not palindrome");
			
		}
		in.close();
	}

}
