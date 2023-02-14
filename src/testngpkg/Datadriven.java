package testngpkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
WebDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
	driver=new FirefoxDriver();
	
	}
	
	@Test
	public void test1() throws IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\nimam\\Desktop\\TEST CASES\\Book2.xlsx");//get the file
		XSSFWorkbook wb=new XSSFWorkbook(f);//get work book
		XSSFSheet sh=wb.getSheet("sheet1");//get sheet
		int rowcount=sh.getLastRowNum();//get row
		for(int i=1;i<=rowcount;i++) {
			
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("User name ="+username);
			String password=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("User password ="+password);
			driver.get("https://www.facebook.com");
			 driver.findElement(By.name("email")).sendKeys(username);
			 driver.findElement(By.id("pass")).sendKeys(password);
			 driver.findElement(By.name("login")).click();
			
		}
		
	}
}
