package org.magnitia.abdulkalam;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test11 {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver=new ChromeDriver();
	     driver.get("http://www.amazon.in");
	     String x=driver.getTitle();
	     System.out.println(x);
	     driver.close();

	}

}
