package org.magnitia.SDET_Learners;

import java.util.Scanner;

public class PalindromeNumbersInRange {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
	        int num,rev=0;int j=0;
	        
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.println("give me the range and get palindrome numbers:");
	        
	        int n=sc.nextInt();
	        
			for ( int i = 10;i<=n; i++) {
				 num=i;
				while (num!=0) 
				{
					rev = rev * 10 + num % 10;
			        num = num / 10;
					
				}
				if (rev==i) {
					j++;
					if(j==1)
					{
						System.out.println("Palindrome Numbers:");
					}
					
					System.out.println(rev);
				}
				
				rev=0;
				
			}
			
		   System.out.println("Palindrome Numbers count:"+j);
		

	}

}
