package org.magnitia.abdulkalam;


import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.firefoxdriver().setup();
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");

	}

}
