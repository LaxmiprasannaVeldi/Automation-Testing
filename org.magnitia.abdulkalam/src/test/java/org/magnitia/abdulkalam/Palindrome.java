package org.magnitia.abdulkalam;


public class Palindrome {

	public static void main(String[] args) {
		
        int num,rev=0;int j=0;
        
		for ( int i = 10;i<=100; i++) {
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
