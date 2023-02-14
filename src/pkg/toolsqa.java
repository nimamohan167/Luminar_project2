package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class toolsqa {
	FirefoxDriver driver;
	
	 @Before
	 public void setup()
	 {
	 driver=new FirefoxDriver();
	 driver.get("https://demoqa.com/droppable/");
	 }
	 
	 @Test
	 public void test1()
	 {
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop);
		
		act.perform();
		String text=drop.getText();
		if(text.contentEquals("Dropped"))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	 }
	 @After
	 public void browserclose()
	 {
		 //driver.quit();
	 }

}
