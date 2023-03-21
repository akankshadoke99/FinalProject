package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.baseClass;

public class Header extends baseClass {

	public WebDriver driver;
	private By Clickoncurrency = By.xpath("//span[normalize-space()='Currency']");
	private By currencyDropDown = By.xpath("//button[@name='EUR']");
	private By ClickphoneNo = By.xpath("//span[normalize-space()='123456789']");
	private By ClickonmyAccount = By.xpath("//span[normalize-space()='My Account']");
	private By myAccountDropDown = By.xpath("//a[normalize-space()='My Account']");
	private By ClickWishList = By.xpath("//span[normalize-space()='Wish List (0)']");
	private By pageText1 = By.xpath("//h2[normalize-space()='New Customer']");
	private By ClickonShoppingCart = By.xpath("//span[normalize-space()='Shopping Cart']");
	private By pagrText2 = By.xpath("//h1[normalize-space()='Shopping Cart']");
	private By ClickCheckout = By.xpath("//span[normalize-space()='Checkout']");
	
	
	public Header(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public WebElement Clickoncurrency() {
		return driver.findElement(Clickoncurrency);
	}
	
	public WebElement currencyDropDown() {
		return driver.findElement(currencyDropDown);
	}	
	public WebElement ClickphoneNo() {
		return driver.findElement(ClickphoneNo);
	}
	public WebElement ClickonmyAccount() {
		return driver.findElement(ClickonmyAccount);
	}
	public WebElement myAccountDropdown() {
		return driver.findElement(myAccountDropDown);
	}
	public WebElement ClickWishList() {
		return driver.findElement(ClickWishList);
	}
	public WebElement pageText1() {
		return driver.findElement(pageText1);
	}
	public WebElement ClickonShoppingCart() {
		return driver.findElement(ClickonShoppingCart);
	}
	public WebElement pageText2() {
		return driver.findElement(pagrText2);
	}
	public WebElement ClickCheckout() {
		return driver.findElement(ClickCheckout);
	}
	
	
	
	
	
	
	
	
	
}
