package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class Homepage extends Lib{
	
	
	public static void printtitle(WebDriver driver) {
		System.out.println(driver.getTitle());
	}

	public static void searchscience(WebDriver driver) throws IOException, InterruptedException {
	WebElement 	science= findelement(driver,readproperties("search"));
	science.sendKeys("science");
	Thread.sleep(2000);
		
		
	}
	
	public static void clicksearch(WebDriver driver) throws IOException, InterruptedException {
		WebElement search=findelement(driver,readproperties("searchbutton"));
		search.click();
		Thread.sleep(2000);
	}
	
}
