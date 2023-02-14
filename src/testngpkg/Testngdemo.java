package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	WebDriver driver;
	
	
@BeforeTest
public void setup()
{
driver=new FirefoxDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com");
}
@Test(priority=1,invocationCount=3,groups= {"sanity,smoke"})
public void test1()
{
	 String title=driver.getTitle();
	 System.out.println(title);
	
}
@Test(priority=2,groups= {"sanity"})
public void test2()
{
	driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
}
@Test(priority=3,dependsOnMethods= {"test2"},groups= {"regression"})
public void test3()
{
	 driver.findElement(By.id("pass")).sendKeys("1234");
}
@Test(priority=4,groups= {"smoke"})
public void test4()
{
	 driver.findElement(By.name("login")).click();
}

@AfterTest
public void close() {
	
}

}


