package testngpkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileuploadRobot {

WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
	}
	
	@Test
	public void test1() throws IOException, AWTException  {
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[4]/a/span")).click();
		fileUpload("C:\\Users\\nimam\\Downloads\\anoob-2.docx");
	}
	private void fileUpload(String p) throws AWTException {
		StringSelection strSelection =new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
