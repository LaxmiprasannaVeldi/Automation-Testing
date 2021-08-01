package org.magnitia.abdulkalam;

import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 WebDriverManager.edgedriver().setup();
			
		 EdgeDriver driver=new EdgeDriver();
			driver.get("http://www.google.co.in");
			

	}
}