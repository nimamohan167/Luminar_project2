package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadAutoit {
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void test1() throws IOException 
	{
		String title=driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a/span")).click();
		 Runtime.getRuntime().exec("C:\\Users\\nimam\\Documents\\FILEUPLOAD_LUMINAR\\S1.exe");
	}
}
	
