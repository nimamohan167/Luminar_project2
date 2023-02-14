package pkg;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotprgrm {

	
	
	WebDriver driver;
	@Before
	public void setup() {
		
		driver=new FirefoxDriver();
		 driver.get("file:///C:/Users/nimam/Documents/html-luminar/sample.html");
	}
	@Test
	public void test1() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\nimam\\Documents\\html-luminar//error.png"));
		
	}
	@After
	public void close() {
		
	}
	}

