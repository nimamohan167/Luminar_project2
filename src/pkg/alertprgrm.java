package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alertprgrm {
	FirefoxDriver driver;
	
	 @Before
	 public void setup()
	 {
	 driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/nimam/Documents/html-luminar/sample.html");
	 }
	 
	 @Test
	 public void test1()
	 {
		 driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a= driver.switchTo().alert();
		String alertext=a.getText();
		if(alertext.equals("Hello! I am an alert box!!"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		a.accept();//yes case
	 //a.dismiss();//no case
		
		 driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("nima");
		 driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("mohan");
		 driver.findElement(By.xpath("/html/body/input[4]")).click();
		 
	 }
	 @After
	 public void browserclose()
	 {
		 //driver.quit();
	 }
	}


