package org.magnitia.abdulkalam;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		   ChromeDriver driver=new ChromeDriver();
				
				driver.get("https://www.google.co.in");
				Thread.sleep(5000);
			WebElement e=driver.findElement(By.xpath("//input[@name='q']"));
			e.sendKeys("Abdul kalam",Keys.ENTER);
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			e=driver.findElement(By.xpath("//input[@name='q']"));
			e.sendKeys("Dr.Abdul kalam",Keys.ENTER);
	}

}
