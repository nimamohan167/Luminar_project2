package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class multipletabhandling {
	
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
		
		
	}
	@Test
	public void test1()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent window title"+ driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String handle : allWindowHandles)
		{
			System.out.println(handle);
			//system.out.println parent window
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				//String s =driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
				//System.out.println(s);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com",Keys.ENTER);
				//driver.equals(allWindowHandles)
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
		
		
	
		
	}
	
	@AfterTest
	public void close() {
		
	}

}
