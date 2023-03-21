package TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.MenuBarClass;
import Resources.baseClass;
import Resources.commonUtilities;

public class verifyMenuBar extends baseClass {
	@Test

	public void verifyMainMenu() throws InterruptedException{
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\Chromedriver.exe");
	     ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		*/
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/");

	
        MenuBarClass obj=new MenuBarClass(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
//Mouseover to Desktop

	commonUtilities.mouseOverHandle(obj.desktopMenuClick(),driver);  
	
		 obj.desktopShowAllClick().click();    //click on desktop :show all

		obj.desktopAddtoWishlistClick().click(); //added product to wishList




//Mouseover to Laptop

		obj.laptopMenuClick().click();

		obj.laptopShowAllClick().click();

		obj.laptopListViewClick().click();

		commonUtilities.handleDropDown(obj.laptopSortByClick(),3);

		commonUtilities.handleDropDown(obj.laptopShowByClick(),1);

		obj.laptopCompareAddClick().click();

		obj.laptopCompareProductClick().click();




//Mouseover to Component

		commonUtilities.mouseOverHandle(obj.componentMenuClick(),driver); 

		obj.componentOptionClick().click();

		obj.componentGridClick().click();




//Mouseover to Mp3Player

		commonUtilities.mouseOverHandle(obj.mp3playerMenuClick(),driver);

		obj.mp3OptionClick().click();










	}

}

