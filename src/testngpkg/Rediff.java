package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff {
	WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		//check availabity checking
				String buttontext=driver.findElement(By.xpath("//*[@id=/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
//				if(buttontext.equals("check available"))
//		{
//	System.out.println("text is same");
//				}
//				else
//				{
//					System.out.println("text is not same");
//				}
				
				
				//COMPARISON USING ASSERT CLASS IN SELENIUM
				Assert.assertEquals(buttontext, "Register");
				
				WebElement firstname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
				WebElement rediff=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
				firstname.sendKeys("nima");
				Actions act=new Actions(driver);
				act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
				act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
				act.keyDown(rediff,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
				act.perform();
		
	}
}
