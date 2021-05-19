package Selenium_Shetty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\\\Java_Selenium\\\\Drivers\\\\chromedriver.exe");
		
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com/");;
	 System.out.println("title is "+driver.getTitle());
	 System.out.println("current url  is "+driver.getCurrentUrl());
	 System.out.println("pagesource is"+driver.getPageSource());
	 driver.close();
	}

}
