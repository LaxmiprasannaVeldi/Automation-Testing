package org.magnitia.SDET_Learners;

import java.util.Scanner;

public class Factorial {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=in.nextInt();
		int fact=num;
        long factorial = multiplyNumbers(num,fact);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num,int fact)
    {
    	
        if (num >= 1)
        {
        	return num * multiplyNumbers((num - 1),fact);
        }
            
        else
        {
        	if (fact== 0)
        	{
        		return 0;
        	}  
            else {
            	return 1;
            }
                
        }
    }
}