package org.magnitia.abdulkalam;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.co.in");

		String x = driver.getWindowHandle();

		System.out.println(x);

	}

}
