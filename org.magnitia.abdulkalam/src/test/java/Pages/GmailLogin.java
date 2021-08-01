package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailLogin {

	private RemoteWebDriver driver;
	private By b1;
	private By b2;
public GmailLogin(RemoteWebDriver driver)
{
	this.driver=driver;
	b1=By.xpath("//input[@name='password']");
	b2=By.xpath("//span[text()='Next']/parent::button");
}
public void fillPwd(String value)
{
	driver.findElement(b1).sendKeys(value);
}
public void clickNext()
{
	driver.findElement(b2).click();
}

	
}
