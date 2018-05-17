package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class checkoutmethod extends Lib {

	public static void email(WebDriver driver) throws IOException, InterruptedException {
		
		WebElement email=findelement(driver,readproperties("loginemail"));
		email.sendKeys("noemail@hotmail.com");
		Thread.sleep(2000);
	}
	public static void newcustomer(WebDriver driver) throws IOException, InterruptedException {
		
	WebElement clicknew=findelement(driver,readproperties("newcustomer"));
	clicknew.click();
	Thread.sleep(2000);
	}
	public static void clickcontinue(WebDriver driver) throws IOException, InterruptedException {
	WebElement click=findelement(driver,readproperties("clickcontinue"));
			click.click();
	Thread.sleep(2000);
		
	}
}
