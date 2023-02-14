package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test1()
	{
		//implicitily wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop);
		act.perform();
		String text=drop.getText();
		if(text.contentEquals("Dropped"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("not pass");
		}
		
		
	}
}
