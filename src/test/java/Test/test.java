package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BillingAddress;
import Pages.Homepage;
import Pages.Searchresultforscience;
import Pages.checkoutmethod;
import Pages.chooseformat;
import Pages.proceedtocheckout;

public class test {
public WebDriver driver;
	
	@Before
	public void initialize() {

		System.out.println("this is before class annotation!!!!!");
		System.getProperty("webdriver,chrome,driver", 
				"/Users/gazifarhana/eclipse-workspace1/TheGreatCourse2/chromedriver");

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.thegreatcourses.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@org.junit.Test

	public void testtt() throws InterruptedException, IOException {

		System.out.println("test!!!!!!!!");	
	
	Homepage.printtitle(driver);
	Homepage.searchscience(driver);
	Homepage.clicksearch(driver);
	Searchresultforscience.philosophyofscience(driver);
	chooseformat.format(driver);
	chooseformat.addtocart(driver);
	proceedtocheckout.checkout(driver);
	checkoutmethod.email(driver);
	checkoutmethod.newcustomer(driver);
	checkoutmethod.clickcontinue(driver);
	BillingAddress.firstname(driver);
	BillingAddress.lastname(driver);
	BillingAddress.address1(driver);
	BillingAddress.address2(driver);
	BillingAddress.city(driver);
	BillingAddress.state(driver);
	BillingAddress.zipcode(driver);
	BillingAddress.password(driver);
	BillingAddress.confirmpassword(driver);
	BillingAddress.shippingaddress(driver);
	BillingAddress.click(driver);
	
	
	
	
	
	
	}
	

	@After
	public void teardown() {
		System.out.println("this is after class annotation!!!");
		System.out.println("test finished!!!!!");
		driver.manage().deleteAllCookies();
		driver.close();

	}	
	
}
