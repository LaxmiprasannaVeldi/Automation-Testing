package org.magnitia.abdulkalam;

public class ConstructorOverload 
{
public String Namr="Laxmi";
public int Age=25;
public float Percentage=(float) 74.86;

public ConstructorOverload()
{
	Namr="Prasanna";
	Age=21;
	Percentage=(float) 81.1;
}

//Constructor overload with 2 inputs
public ConstructorOverload(String Namr,int Age)
{
	Namr="prasanna";
	Age=28;
	
}
//Constructor overload with 3 inputs
ConstructorOverload(String Namr,int Age,float Percentage)
{
	Namr="nikil";
	Age=23;
	Percentage=(float)85.1;
}


}
