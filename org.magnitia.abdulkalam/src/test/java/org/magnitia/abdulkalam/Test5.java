package org.magnitia.abdulkalam;

//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		WebDriverManager.iedriver().setup();
		
		 InternetExplorerDriver driver=new InternetExplorerDriver();
		 
			driver.get("http://www.google.co.in");
			

	}

}
