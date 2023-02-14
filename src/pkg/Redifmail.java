package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redifmail {

	
	
	

	FirefoxDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1() {
		
		Boolean logo=driver.findElement(By.name("//*[@id='wrapper'/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else {
			System.out.println("logo is not displayed");
		}
		 
	}
	@After
	public void close() {
		
	}
}
