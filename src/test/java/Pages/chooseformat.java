package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class chooseformat extends Lib{

public static void format (WebDriver driver) throws IOException, InterruptedException	{
	WebElement DVD =findelement(driver,readproperties("dvd"));
	DVD.click();
	Thread.sleep(2000);
}
	public static void addtocart(WebDriver driver) throws IOException, InterruptedException {
	WebElement addcart=findelement(driver,readproperties("addtocart"))	;
	addcart.click();
	Thread.sleep(2000);
		
	}
	
	
	
}
