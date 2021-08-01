package org.magnitia.examples;

import org.magnitia.AccessModifiers.Pack1;

//import org.magnitia.AccessModifiers.Pack1;

//import org.magnitia.AccessModifiers.Pack1;

//class Pack2 extends Pack1 
//Class with Default modifier cannot have subclass outside the package
//{

//}
class Pack2 extends Pack1
{
	//Pack1 pck1=new Pack1(); //Compile time Error
	//Pack1 class having default access modifier,so we cannot access the outside the 
	//package even though its having public constructor
	
	
	//Pack1 pck1=new Pack1(); //we can't instatiate a class outside the package
	//which has only protected condtructors.
	
	public Pack2()
	{
	super(10);
	
	}
}
