package org.magnitia.abdulkalam;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test14 
{

	public static void main(String[] args) throws Exception 
	{
		
      WebDriverManager.chromedriver().setup();
      
      ChromeDriver driver=new ChromeDriver();
      
      driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
      
      Thread.sleep(5000);
      driver.switchTo().frame("iframeResult");
      driver.findElement(By.linkText("Visit W3Schools.com!")).click();
      Thread.sleep(5000);
      Set<String> s=driver.getWindowHandles();
      System.out.println(s);
      for(String x:s)
      {
    	  System.out.println(x);
      }
      List<String> l=new ArrayList<String>(s);
      System.out.println(l.get(1));
      System.out.println(l.get(0));
      
      driver.close();
      driver.quit();
      
      }

	

}
