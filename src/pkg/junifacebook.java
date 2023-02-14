package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class junifacebook {
	FirefoxDriver driver;
@Before
public void setup() {
	
	driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com");
}
@Test
public void test1() {
	 String title=driver.getTitle();
	 System.out.println(title);
	 driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
	 driver.findElement(By.id("pass")).sendKeys("1234");
	 driver.findElement(By.name("login")).click();
}
@After
public void close() {
	
}
}
