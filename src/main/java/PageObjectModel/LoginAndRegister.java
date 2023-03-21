package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.baseClass;

public class LoginAndRegister extends baseClass {
	public WebDriver driver;
	private By ClickonmyAccount = By.xpath("//span[normalize-space()='My Account']");
	private By clickonRegister = By.xpath("//a[text()='Register']");
	private By FirstName = By.xpath("//input[@id='input-firstname']");
	private By LastName = By.xpath("//input[@id='input-lastname']");
	private By Email = By.xpath("//input[@id='input-email']");
	private By Telephone = By.xpath("//input[@id='input-telephone']");
	private By Password = By.xpath("//input[@id='input-password']");
	private By PasswordConfirm = By.xpath("//input[@id='input-confirm']");

	private By ClickOnLogin =By.xpath("//a[text()='Login']");
	private By clickonEmailId=By.xpath("//input[@id='input-email']");
	private By clickonPassword=By.xpath("//input[@id='input-password']");
	private By clickonLoginBtn=By.xpath("//input[@class='btn btn-primary']");
	
public LoginAndRegister(WebDriver driver2) {
	
	this.driver=driver2;
}
   public WebElement ClickonmyAccount() {
	   return driver.findElement(ClickonmyAccount);
   }

  public WebElement clickonRegister() {
	  return driver.findElement(clickonRegister);
  }
public WebElement FirstName() {
	return driver.findElement(FirstName);
}
public WebElement LastName() {
	return driver.findElement(LastName);
}
public WebElement Email() {
	return driver.findElement(Email);
}
public WebElement Telephone() {
	return driver.findElement(Telephone);
}
public WebElement Password() {
	return driver.findElement(Password);
}
public WebElement PasswordConfirm() {
	return driver.findElement(PasswordConfirm);
}

public WebElement ClickOnlogin() {
	return driver.findElement(ClickOnLogin);
}
public WebElement clickonEailID() {
	return driver.findElement(clickonEmailId);
}
public WebElement clickonPassword() {
	return driver.findElement(clickonPassword);
}
public WebElement clickonLoginBtn() {
	return driver.findElement(clickonLoginBtn);
}















}
