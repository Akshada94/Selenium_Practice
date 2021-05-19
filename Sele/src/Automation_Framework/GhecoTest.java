package Automation_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GhecoTest {
	
	 
	 public static void main(String[] args) throws InterruptedException {
	 
	                System.out.println("Execution started-- Opening Firefox browser.");
	 System.setProperty("webdriver.gecko.driver", "D://Java_Selenium//Drivers//geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	   DesiredCapabilities cap = DesiredCapabilities.firefox();
	   cap.setCapability("marionette", true);
	 driver.get("https://demoqa.com/");
	 Thread.sleep(3000);
	 driver.quit();
	 System.out.println("Execution ending-- Webdriver session is closed.");
	 
	 }
	}

