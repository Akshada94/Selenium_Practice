package Automation_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D://Java_Selenium//chromedriver.exe"); 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://demoqa.com/links");
		 WebElement element = driver.findElement (By.linkText("Home"));
		 element.click();
		 
		 if(element != null) {
		 System.out.println("Element found by LinkText");
		 }
		 
		 element= driver.findElement (By.partialLinkText("HomehY"));
		 
		 if(element!= null) {
		 System.out.println("Element found by PartialLinkText");
		 }
		 }
		
	}


