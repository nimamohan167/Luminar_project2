package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RediffmailRadioBtn {
	FirefoxDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1() {
		
		
		//check availabity checking
		//String buttontext=driver.findElement(By.xpath("//*[@id=/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		//if(buttontext.equals("check available")
//		{
//			System.out.println("text is same");
//		}
//		else
//		{
//			System.out.println("text is not same");
//		}
		
		boolean select=driver.findElement(By.name("//input[@name='gender502f34b7']")).isSelected();
		if(select)
		{
			System.out.println("radio btn  is selected");
		}
		else {
			System.out.println("radio btn is not selected");
		}
		 
	}
	@After
	public void close() {
		
	}

}
