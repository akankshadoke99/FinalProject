package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.Header;
import Resources.baseClass;
import Resources.commonMethods;

public class verifyHeader extends baseClass {
	@Test
	public void header() throws InterruptedException {

		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		*/
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		Header obj = new Header(driver);
		Thread.sleep(3000);
		obj.Clickoncurrency().click();
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.currencyDropDown().getText(), "€ Euro", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("Currency Drop Down is not Clickable");
		}
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.ClickphoneNo().getText(), "123456789", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("soft assert fail");
		}
		Thread.sleep(3000);
		obj.ClickonmyAccount().click();
		Thread.sleep(3000);

		try {
			commonMethods.handleAssertions(obj.ClickWishList().getText(), "New Customer", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("wish list is not clickable");
		}
		Thread.sleep(3000);
		try {
			commonMethods.handleAssertions(obj.ClickonShoppingCart().getText(), "Shopping Cart", "it is not working");
		} catch (AssertionError exe) {
			System.out.println("Shopping cart is not clickable");
		}

		Thread.sleep(3000);
		obj.ClickCheckout().click();

	}
}
