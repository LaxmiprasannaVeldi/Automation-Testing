package org.magnitia.abdulkalam;

public class Student 
{
	//Static and non static properties
	public static String collegename="Magnitia";
	//Assign default value directly
	public String studentname;
	public int age;
	public float percentage;
	//constructor method
	public Student()
	{
		studentname="laxmi";
		age=21;
		percentage=(float) 74.86;
		
	}
	//Static and non static operational methods
	public static void displayCollegeName()//access static properties only
	{
		System.out.println(collegename);
	}
	public void displayStudentDetails()//access Static and non static properties
	{
		System.out.println(collegename);
		System.out.println(studentname);
		System.out.println(age);
		System.out.println(percentage);
	}
	
	

}
