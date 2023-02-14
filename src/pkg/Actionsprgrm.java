package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsprgrm {
	
	FirefoxDriver driver;
	
	 @Before
	 public void setup()
	 {
	 driver=new FirefoxDriver();
	 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	 }
	 
	 @Test
	 public void test1()
	 {
		WebElement firstname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
		WebElement rediff=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
		firstname.sendKeys("nima");
		Actions act=new Actions(driver);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(rediff,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
		act.perform();
		
	 }
	 @After
	 public void browserclose()
	 {
		 //driver.quit();
	 }
	}



