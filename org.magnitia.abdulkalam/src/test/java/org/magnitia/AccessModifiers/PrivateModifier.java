package org.magnitia.AccessModifiers;

public class PrivateModifier {
	int a,b;
	
	private PrivateModifier()
	{
		a=10;
		System.out.println("a value is"+a);
	}
	private PrivateModifier(int i)
	{
		this.b=i;
		System.out.println("b value is"+b);
	}
	

}
