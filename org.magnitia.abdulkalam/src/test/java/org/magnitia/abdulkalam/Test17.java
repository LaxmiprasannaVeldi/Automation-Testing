package org.magnitia.abdulkalam;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test17 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name:");
		String bn=sc.nextLine();
		System.out.println("Enter UserId:");
		String uId=sc.nextLine();
		System.out.println("Enter Password:");
		String pwd=sc.nextLine();
		System.out.println("Enter to address:");
		String addn=sc.nextLine();
		System.out.println("Enter Subject:");
		String sub=sc.nextLine();
		System.out.println("Enter body:");
		String bdy=sc.nextLine();
		System.out.println("Enter file path to attach:");
		String fp=sc.nextLine();
		sc.close();
		WebSiteUtilities obj=new WebSiteUtilities();
		
		RemoteWebDriver driver=obj.openBrowser(bn);
		
		obj.launchSite(driver, "https://www.gmail.com", 5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uId);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Compose']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys(addn);
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys(sub);
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys(bdy);
		driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys(fp);//
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//a[starts-with(@aria-label,'Google Account:')]/img")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
