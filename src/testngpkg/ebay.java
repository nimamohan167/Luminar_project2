package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ebay {
	
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void test1()
	{
		WebElement element=driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(element);
		
		act.perform();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[7]/a")).click();
		act.perform();
		
	}

}


