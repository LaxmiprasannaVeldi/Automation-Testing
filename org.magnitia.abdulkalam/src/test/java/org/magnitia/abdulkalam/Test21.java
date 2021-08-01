package org.magnitia.abdulkalam;

import java.util.Scanner;

import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.Page1;

public class Test21 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter a browser name");

String browser=sc.nextLine();
System.out.println("Enter a word to search");

String word=sc.nextLine();

WebSiteUtilities uobj=new WebSiteUtilities();
RemoteWebDriver driver=uobj.openBrowser(browser);
uobj.launchSite(driver, "https://www.google.co.in", 5000);
Page1 pobj=new Page1(driver);
pobj.fillSearchBox(word);
Thread.sleep(5000);
pobj.clickSearch();
sc.close();
Thread.sleep(5000);
if (pobj.titleValidation(word)) 
{
	System.out.println("Title test is passed");
} 
else {
	System.out.println("Title test is failed");
}

	}

}
