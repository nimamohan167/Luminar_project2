package testngpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.demo.guru99.com/test/upload");
	}
	
	@Test
	public void test1() 
	{
		//text file upload
		driver.findElement(By.xpath("//*[@id=\\\"uploadfile_0\\\"]")).sendKeys("C:\\Users\\nimam\\Desktop\\CV\\Beena.pdf");
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		
	}
}
