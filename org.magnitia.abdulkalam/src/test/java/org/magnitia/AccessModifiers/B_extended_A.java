package org.magnitia.AccessModifiers;

public class B_extended_A extends A_Inherited_B 
{

	public static void main(String[] args) 
	{
			
		A_Inherited_B A_B=new A_Inherited_B();
		
		//Private inner Class B can not be instantiated outside the Class A
		//B b=new B();
		
		//Protected members of a class are inherited to any sub class
		System.out.println("Value is :"+A_B.i);
		
	}
	
}
