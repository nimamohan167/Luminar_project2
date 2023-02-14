package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rightclickprgrm {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
	}
	@Test
	public void test1()
	{
		WebElement rightclick=driver.findElement(By.xpath("/html/body/span"));
		WebElement tclick=driver.findElement(By.xpath("/html/body/button"));
	
		
		Actions act=new Actions(driver);
		act.moveToElement(rightclick);
		act.contextClick();//rightclick
		act.doubleClick();//doubleclick
		
		act.perform();
		
	}
	
	@AfterTest
	public void close() {
		
	}

}
