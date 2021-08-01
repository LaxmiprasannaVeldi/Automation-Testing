package org.magnitia.abdulkalam;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomAutomation {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		
		
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("laxmiprasannaveldi@gmail.com");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']//button[@type='button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Lucky#1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']//button[@type='button']")).click();
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//input[@aria-label='Search mail']")).sendKeys("255");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Search mail']")).sendKeys(Keys.ENTER);
		List<WebElement> email = driver.findElements(By.cssSelector("div.xT>div.y6>span>b"));

		for(WebElement emailsub : email){
		    //if(emailsub.getText().equals("255") == true){
			if(emailsub.getText().contains("255") == true){
		           emailsub.click();
		           break;
		        }
		    }*/
		
	
		/********UNREAD MAIL OPEN*****************/
		
		/*List<WebElement> unreademail = driver.findElements(By.className("zE"));



		System.out.println("Total No. of Unread Mails: " + unreademail.size());

		// real logic starts here

		for(int i=0;i<unreademail.size();i++){

		System.out.println(unreademail.get(i).getText());

		}

		unreademail.get(0).click();

		Thread.sleep(3000);

		driver.close();*/
		
		

		/********END UNREAD MAIL OPEN*****************/
		
		
		/***********Opening Search Mail********************/
		
		/*List<WebElement> email = driver.findElements(By.cssSelector("div.xT>div.y6>span>b"));

		for(WebElement emailsub : email){
		    if(emailsub.getText().contains("Batch 255 - Selenium with Java Confirmation") == true){

		           emailsub.click();
		           break;
		        }
		    }
		Thread.sleep(3000);

		driver.close();*/
		
		
		List<WebElement> a = driver.findElements(By.xpath("//*[@class='yW']/span"));
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++) {
            //System.out.println(a.get(i).getText());
            if (a.get(i).getText().equals("Google Community Te")) //to click on a specific mail.
                {                                           
                a.get(i).click();
            }
        }
        a.get(2).click();
        Thread.sleep(3000);

		driver.close();
		
		/***********END Opening Search Mail********************/
		
	}
}