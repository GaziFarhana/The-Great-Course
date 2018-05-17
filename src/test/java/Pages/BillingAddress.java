package Pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.Lib;

public class BillingAddress extends Lib{
	
public static void firstname(WebDriver driver) throws IOException, InterruptedException	{
	WebElement fname=findelement(driver,readproperties("fname"));
	fname.sendKeys(readexcel(driver,0,0));
	Thread.sleep(2000);
}
	
public static void lastname(WebDriver driver) throws IOException, InterruptedException	{
	WebElement lname=findelement(driver,readproperties("lname"));
	lname.sendKeys(readexcel(driver,1,0));
	Thread.sleep(2000);
}
public static void address1(WebDriver driver) throws IOException, InterruptedException	{
	WebElement address=findelement(driver,readproperties("street1"));
	address.sendKeys(readexcel(driver,2,0));
	Thread.sleep(2000);
}	
public static void address2(WebDriver driver) throws IOException, InterruptedException	{
	WebElement address=findelement(driver,readproperties("street2"));
	address.sendKeys(readexcel(driver,3,0));
	Thread.sleep(2000);
}

public static void city(WebDriver driver) throws IOException, InterruptedException	{
	WebElement city=findelement(driver,readproperties("city"));
	city.sendKeys(readexcel(driver,4,0));
	Thread.sleep(2000);
}
public static void state(WebDriver driver) throws IOException, InterruptedException	{
	WebElement state=findelement(driver,readproperties("state"));
	state.sendKeys("New York");
	Thread.sleep(2000);
}
public static void zipcode(WebDriver driver) throws IOException, InterruptedException	{
	WebElement zipcode=findelement(driver,readproperties("zip"));
	zipcode.sendKeys(readexcel(driver,5,0));
	Thread.sleep(2000);
}

public static void password(WebDriver driver) throws IOException, InterruptedException	{
	WebElement password=findelement(driver,readproperties("pass"));
	password.sendKeys(readexcel(driver,6,0));
	Thread.sleep(2000);
}

public static void confirmpassword(WebDriver driver) throws IOException, InterruptedException	{
	WebElement pass=findelement(driver,readproperties("confirmpass"));
	pass.sendKeys(readexcel(driver,7,0));
	Thread.sleep(2000);
}

public static void shippingaddress(WebDriver driver) throws IOException {
	WebElement ship=findelement(driver,readproperties("ship"));
	if(ship.isSelected()) {
		System.out.println("ship to this address is selected");
	}else {
		ship.click();
	}
}
	public static void click (WebDriver driver) throws IOException, InterruptedException {
		WebElement click=findelement(driver,readproperties("continue"));
				click.click();
		Thread.sleep(2000);
			
		
	
}






}
