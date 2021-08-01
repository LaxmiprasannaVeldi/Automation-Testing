package org.magnitia.abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test18 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//[@name='q']"));
		//we getting InvalidSelectorException Exception
	}

}
