package TestCases;

import java.time.Duration;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.FooterClass;
import PageObjectModel.Header;
import Resources.baseClass;

public class verifyFooter extends baseClass {
	@Test
	public void Footer() {
		/*
		 * System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 *  ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*");
		 */
		WebDriver driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		FooterClass obj = new FooterClass(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Information
		obj.aboutUsClick().click();
		obj.deliveryInfoClick().click();
		obj.privacyPolicyClick().click();
		obj.termsAndConditionsClick().click();

//Customer Service
		obj.contactUsClick().click();
		obj.returnsClick().click();
		obj.siteMapClick().click();

//Extras
		obj.brandClick().click();
		obj.giftCertificatesClick().click();
		obj.affiliateClick().click();
		obj.specialsClick().click();

	}

}
