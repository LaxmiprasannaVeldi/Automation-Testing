package org.magnitia.abdulkalam;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test7 obj=new Test7();
		////Access non static properties
		System.out.println(obj.edge1);
		System.out.println(obj.edge2); 
		System.out.println(obj.edge3);
		System.out.println(obj.Area());
		System.out.println(obj.Perimeter());
		//Access static properties
		System.out.println(StaticClass.name);
		System.out.println(StaticClass.population);
		

	}

}
