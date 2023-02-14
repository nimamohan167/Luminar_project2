package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google {

	
	
	FirefoxDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("https://www.google.com");
	}
	@Test
	public void test1() {
		
		driver.findElement(By.name("q")).sendKeys("books",Keys.ENTER);
		//driver.findElement(By.name("btnk")).click();
		 
		 
	}
	@After
	public void close() {
		
	}
}
