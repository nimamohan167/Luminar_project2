package pkg;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firstscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		String exp = "google";
		if (title.equalsIgnoreCase(exp)) {
		System.out.println("pass");
		} 
		else
		{
		System.out.println("fail");
		}
	}

}
