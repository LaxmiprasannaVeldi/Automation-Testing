package org.magnitia.AccessModifiers;

 class protectedField {
	
	protected int i=101;
	void methodOfI()
	{
	System.out.println("value of i:"+i);
	}
	

	public static void main(String[] args) {
		
		protectedField PF=new protectedField();
		PF.methodOfI();
		System.out.println("value of i "+PF.i);

	}
	

}
