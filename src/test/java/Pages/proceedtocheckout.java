package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class proceedtocheckout extends Lib{
	
	
	public static void checkout(WebDriver driver) throws IOException, InterruptedException {
	WebElement chkot=findelement(driver,readproperties("checkout"))	;
	chkot.click();
	Thread.sleep(2000);
		
	}

}
