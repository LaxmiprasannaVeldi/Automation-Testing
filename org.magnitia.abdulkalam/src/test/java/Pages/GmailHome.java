package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GmailHome {
	private RemoteWebDriver driver;
	private By b1;
	private By b2;
public GmailHome(RemoteWebDriver driver)
{
	this.driver=driver;
	b1=By.xpath("//input[@name='identifier']");
	b2=By.xpath("//span[text()='Next']/parent::button");
}
public void fillUid(String value)
{
	driver.findElement(b1).sendKeys(value);
}
public void clickNext()
{
	driver.findElement(b2).click();
}


}
