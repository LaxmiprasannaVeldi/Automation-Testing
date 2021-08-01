package org.magnitia.abdulkalam;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.name("identifier")).sendKeys("laxmi.mandhadapu@gmail.com");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
	}

}
