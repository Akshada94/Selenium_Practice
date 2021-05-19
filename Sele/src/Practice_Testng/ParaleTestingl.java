package Practice_Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ParaleTestingl
{
	public WebDriver driver;
@Test
public void ChromeTest()
{
	System.out.println("Execution started-- Opening Chrome browser.");
	System.out.println("thread for chrome"+Thread.currentThread().getId());
	System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
@Test
public void FirefoxTest()
{

System.out.println("Execution started-- Opening Firefox browser.");
System.out.println("thread for firefox"+Thread.currentThread().getId());
System.setProperty("webdriver.gecko.driver","D://Java_Selenium//Drivers//geckodriver.exe");
driver = new FirefoxDriver();
//DesiredCapabilities cap = DesiredCapabilities.firefox();
//cap.setCapability("marionette", true);
driver.get("https://www.facebook.com/");
}
}
