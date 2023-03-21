package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModel.AddToCart;
import Resources.baseClass;
import Resources.commonUtilities;
import Resources.constants;

public class verifyAddingProductToCart extends baseClass{
	@Test
	public void VerifyAddToCartProduct() throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		*/
		 WebDriver driver = new FirefoxDriver();
		 driver.get("https://naveenautomationlabs.com/opencart/");
		AddToCart obj = new AddToCart(driver);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		obj.searchEnter().sendKeys(constants.search); //search text enter(iphone)
		obj.searchBtnClick().click();  //search button click
		obj.addtocartClick().click();  //add to cart click

		//For 1st product price
		String price1 =obj.priceCheck().getText();
		double d1=commonUtilities.productPriceHandle(price1);

		obj.searchEnter().clear();  //to clear previous entered text
        obj.searchEnter().sendKeys(constants.search1); //search text enter(samsung)
		obj.searchBtnClick().click();  //search button click
		obj.addtocartClick().click();  //add to cart click
		//For 2nd product price
				String price2 =obj.priceCheck().getText();
				double d2=commonUtilities.productPriceHandle(price2);

				//total price of products
				double add=d1+d2;
				String actualPriceconvert=Double.toString(add); //convert double to string for adding $
				String actualPrice=("$"+actualPriceconvert);
				System.out.println("Actual Addition of price:"+actualPrice);
				Thread.sleep(2000);

				obj.totalItemBtnClick().click(); //Total item click
				String expectedPriceCart=obj.expectedTotalPriceCheck().getText();
				double d3=commonUtilities.productPriceHandle(expectedPriceCart);//Expected Price from cart
				String expectedPriceConvert=Double.toString(d3); //convert expected price into double
				String expectedPrice=("$"+expectedPriceConvert);

				System.out.println("Expected addition :"+expectedPrice);
				if(actualPrice.equals(expectedPrice))
				{
					System.out.println("Pass");
				}
				else{
					System.out.println("Fail");
				}
				}
}
