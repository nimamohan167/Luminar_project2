package pkg;


import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkvalidation {
	private static final String HttpURLConnection = null;
	FirefoxDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get(baseurl);
	}
	@Test
	public void test1() {
		 List<WebElement> li=driver.findElements(By.tagName("a"));
		 System.out.println("total nbr of links"+li.size());
		 //to display all the links with text(way-1)
		 for(WebElement link:li)
		 {
			 String linkdetails=link.getAttribute("href");
			verify(linkdetails);
		 }
		
		 
	}
	private void verify(String linkdetails) {
		//try
//		{
//		URL u=new URL(linkdetails)
//		
//		//(HttpURLConnection)u.openConnection();
//		}
		
	}
	
	
	@After
	public void close() {
		
	}

}
