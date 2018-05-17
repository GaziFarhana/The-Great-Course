package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Lib {
	public static String title (WebDriver driver)	{
		String value=driver.getTitle();
		return value;	

		}
		public static WebElement findelement (WebDriver driver,String xpath)	{
		WebElement elem=driver.findElement(By.xpath(xpath))	;
		return elem;
			
		}
		public static String readproperties(String key) throws IOException {

			File f1=new File("/Users/gazifarhana/eclipse-workspace1/TheGreatCourse2/Locator.Properties");
			FileInputStream fis=new FileInputStream (f1);
			Properties prop=new Properties();
			prop.load(fis);
			String locatr=prop.getProperty(key);
			return locatr;

			}	
		public static String readexcel(WebDriver driver, int rownum, int colnum) throws IOException {

			File fl = new File("/Users/gazifarhana/eclipse-workspace1/TheGreatCourse2/GC.xlsx");
			FileInputStream fis = new FileInputStream(fl);
			XSSFWorkbook wk = new XSSFWorkbook(fis);
			XSSFSheet sh = wk.getSheetAt(0);
			XSSFRow rw = sh.getRow(rownum);
			XSSFCell cell = rw.getCell(colnum);
			String value = cell.getStringCellValue();
			
			wk.close();
			
			return value;
			
		}	
			
		public static void takescreenshot (WebDriver driver, String name) throws IOException {

			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("/Users/gazifarhana/eclipse-workspace1/TheGreatCourse/ss"+name+".png"));

			}
}
