package Test;

import org.testng.annotations.Test;


public class LoginTest extends BaseTest{

	@Test
	public void CreateOrder() throws Exception
	{
		
		pages.getLoginPage().getURL("https://www.flipkart.com");
		
		pages.getLoginPage().SetEmailAndPassword("8447883807", "a12345678");
	
	
	
		pages.getLoginPage().ClickOnLoginButton();
	
	
		Thread.sleep(5000);
		pages.getLoginPage().SearchForAnItem("selenium books");
	
	
	
		
		pages.getLoginPage().ClickOnFirstBook();
		
		pages.getLoginPage().switchdriver();
		
		pages.getLoginPage().ClickOnBuyNow();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
