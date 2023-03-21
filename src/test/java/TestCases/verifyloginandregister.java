package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.LoginAndRegister;

public class verifyloginandregister {
	@Test
public void verifyloginandregisterr() {
	
	WebDriver driver = new FirefoxDriver();
	 driver.get("https://naveenautomationlabs.com/opencart/");

	 LoginAndRegister obj = new LoginAndRegister(driver);
	 
	 
	 obj.ClickonmyAccount().click();
	 obj.clickonRegister().click();
	 obj.FirstName().sendKeys("Akanksha");
	 obj.LastName().sendKeys("Doke");
	 obj.Email().sendKeys("akankshadoke@gmail.com");
	 obj.Telephone().sendKeys("12345");
	 obj.Password().sendKeys("akku1999");
	 obj.PasswordConfirm().sendKeys("akku1999");
	 
	 obj.ClickonmyAccount().click();
	 obj.ClickOnlogin().click();
	 obj.clickonEailID().sendKeys("akankshadoke@gmail.com");
	 obj.clickonPassword().sendKeys("akku1612");
	 obj.clickonLoginBtn().click();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
