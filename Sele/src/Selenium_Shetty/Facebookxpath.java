package Selenium_Shetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']\")")).sendKeys("My own xpath");
		driver.findElement(By.xpath("//input[@type='password']\")")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        
			}

}
