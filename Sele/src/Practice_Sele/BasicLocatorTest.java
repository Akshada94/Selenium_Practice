package Practice_Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocatorTest
{
public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("file:///D:/Java_Selenium/Sele/HTML/demo.html");
		// WebElement link=driver.findElement(By.tagName("a"));
		//WebElement link=driver.findElement(By.id("fb"));
		 //WebElement link=driver.findElement(By.name("facebook"));
		 //WebElement link=driver.findElement(By.className("fblogin"));
		// WebElement link=driver.findElement(By.linkText("click here to facebook login"));
		 WebElement link=driver.findElement(By.partialLinkText("click here"));
		 
		 link.click();
		 
	}

}
