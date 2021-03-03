package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By UserName=By.xpath("//form//div[@class='IiD88i _351hSN' and position()='1']//input");
	
	By Passwordfield=By.xpath("//form//div[@class='IiD88i _351hSN' and position()='2']//input");
	
	By LoginButton=By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL'][1]");
	
	By searchField=By.xpath("//*[@class='_3OO5Xc']//input");
	
	By searchButton=By.xpath("//button[@class='L0Z3Pu']//child::*[position()='2']");
	
	By BooksTab=By.xpath("//*[@class='_1kidPb']//span[7]");
	
	By BookSection=By.xpath("//a[@title='Books']");
	
	By firsttBook=By.xpath("//*//div[@class='_13oc-S'][1]//div[1]");
	
	By BuyNowButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']");
	
	By DeliverHereButton=By.xpath("//button[text()='Deliver Here']");
	
	public void getURL(String URL)
	{
		driver.get(URL);
		waitforPresenceOFElement(UserName);
	}
	
	
	public void SetEmailAndPassword(String Phone,String Password)
	{
		SeTText(UserName, Phone);
		SeTText(Passwordfield, Password);
		
	}
	
	public void ClickOnLoginButton()
	{
		clickandwait(LoginButton);
	}
	
	
	
	public void SearchForAnItem(String text) throws InterruptedException
	{
		SeTText(searchField, text);
		Thread.sleep(5000);
		driver.findElement(searchField).sendKeys(Keys.ENTER);
	}
	
	
	
	
	
	public void ClickOnFirstBook()
	{
		clickandwait(firsttBook);
		
	}
	
	
	
	public void switchdriver()
	{
		switchTab(1);
		
	}
	
	
	
	
	public void ClickOnBuyNow()
	{
		//clickandwait(BuyNowButton);
	
		waitforPresenceOFElementUntilCLickable(BuyNowButton);
		clickandwait(BuyNowButton);
	
	}
	
	
	
	
	
	
	
	

}
