package pkg;

import org.openqa.selenium.firefox.FirefoxDriver;

public class pagesrc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String src = driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is  not present");
		}
	
	}

}
