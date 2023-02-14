package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	FirefoxDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("https://www.amazon.in");
	}
	@Test
	public void test1() {
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 //enter mobile
		
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		 
		 //click today's deals
		 driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		 
		 //click cart
		 driver.findElement(By.xpath("//*[@id='nav-tools']/a[4]")).click();
		 
		 //hello sign in
		 driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		 
		 
		 //enter invalid mail
		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nmathvfdsss@gmail.com");
		 
		 //continue
		 driver.findElement(By.xpath("//input[@id='continue']")).click();
		 
		 //navigate
		 driver.navigate().back();
		 driver.navigate().back();
		 
		 //hamburger
		 driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
		
		 
	}
	@After
	public void close() {
		
	}
	}



