package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pages.PageCollection;

public class BaseTest {

	
	public WebDriver driver;
	public PageCollection pages;
	 
	
	@BeforeTest
	public void SetUp()
	{
		 
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "/" + "resources" + "/" + "geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
				options.addArguments("start-maximized");
		driver=new FirefoxDriver(options);
		
		
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void initialie()
	{pages=new PageCollection(driver);}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
