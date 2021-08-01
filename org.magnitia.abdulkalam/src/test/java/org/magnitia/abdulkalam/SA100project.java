package org.magnitia.abdulkalam;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SA100project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver obj=new ChromeDriver();
		obj.get("http://www.google.com");

	}

}
