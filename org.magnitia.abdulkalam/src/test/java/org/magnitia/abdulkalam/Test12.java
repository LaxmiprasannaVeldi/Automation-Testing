package org.magnitia.abdulkalam;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test12 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.sentia.in");

		String x = driver.getCurrentUrl();

		if (x.startsWith("https")) {
			System.out.println("Secured site");
		} else {
			System.out.println("not Secured site");
		}
		driver.close();
	}

}
