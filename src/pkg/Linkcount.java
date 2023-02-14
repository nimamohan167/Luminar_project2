package pkg;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Linkcount {

	FirefoxDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com");
	}
	@Test
	public void test1() {
		 List<WebElement> li=driver.findElements(By.tagName("a"));
		 System.out.println("total nbr of links"+li.size());
		 //to display all the links with text(way-1)
		 for(WebElement element:li)
		 {
			 String link=element.getAttribute("href");
			 String text=element.getText();
		      System.out.println(link+"--------"+text);
		 }
		//to display all the links with text (way-2)
//		 for(int i=1;i<=li.size();i=i+1) {
//			 System.out.println("name"+i+li.get(i).getText());
//		 }
		 
	}
	@After
	public void close() {
		
	}
	}


