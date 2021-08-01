package org.magnitia.examples;

public class StaticBlock {
	
	static int a=10;
	static int n;
	
	static {
		System.out.println("It is a static block");
		n=a*10;
	}
	

	public static void main(String[] args) {
		//Static Variables
		
		System.out.println("It is a Main method block");
	
		System.out.println("a value is:"+a);
		System.out.println("n value is:"+n);

	}

}
