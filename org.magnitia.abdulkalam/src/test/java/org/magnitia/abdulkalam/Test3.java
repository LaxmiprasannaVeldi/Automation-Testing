package org.magnitia.abdulkalam;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
        WebDriverManager.operadriver().setup();
		
		OperaDriver driver=new OperaDriver();
		driver.get("http://www.google.co.in");
		driver.manage().window().maximize();

	}

}
