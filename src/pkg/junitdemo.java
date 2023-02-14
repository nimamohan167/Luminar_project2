package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class junitdemo {
	FirefoxDriver driver;
	
 @Before
 public void setup()
 {
 driver=new FirefoxDriver();
 driver.get("https://www.google.com");
 }
 
 @Test
 public void test1()
 {
	 String title=driver.getTitle();
	 System.out.println(title);
 }
 @After
 public void browserclose()
 {
	 driver.quit();
 }
}
