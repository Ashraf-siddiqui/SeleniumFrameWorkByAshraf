package Pages;



import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.PageCollection;

public class BasePage {
	
	WebDriver driver;
	PageCollection pages;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public PageCollection initializePages() {
		return pages = new PageCollection(driver);
		// uiActions = new UIActions(driver);
	}
	
	public WebElement waitforPresenceOFElement(By locator)
	{
		System.out.println();
		WebElement firstResult = new WebDriverWait(driver,60)
		        .until(ExpectedConditions.presenceOfElementLocated(locator));
		return firstResult;
		
	}
	
	
	public WebElement waitforPresenceOFElementUntilCLickable(By locator)
	{
		System.out.println();
		WebElement firstResult = new WebDriverWait(driver,60)
		        .until(ExpectedConditions.elementToBeClickable(locator));
		return firstResult;
		
	}
	
	
	
	public void clickandwait(By locator)
	{
		WebElement el=waitforPresenceOFElement(locator);
		el.click();
		
	}
	
	
	public void SeTText(By locator, String keysToSend)
	{
		WebElement el=waitforPresenceOFElement(locator);
		el.sendKeys(keysToSend);
	}
	
	
	public  void switchTab(int i) {
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			
		driver.switchTo().window(tabs.get(i));
	}
	
	
public void ReachtoURL()
{

	


}
	
	
	
	
	
	
	
	
	

}
