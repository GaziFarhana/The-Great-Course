package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class Searchresultforscience extends Lib{

public static void philosophyofscience(WebDriver driver) throws IOException, InterruptedException	{
	WebElement pos=findelement(driver,readproperties("POS"));
	pos.click();
	Thread.sleep(2000);
}
	
	
	
	
	
	
}
