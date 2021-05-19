package Practice_Testng;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CrossBrowser
{
	public static WebDriver driver;
@Test
public void browerTest() 
{
	
	for (int browser = 1; browser  < 3; browser ++)
	{
		if(browser==1)
		{
			System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			 System.out.println("Chrome Test");			
		}
		else if(browser==2)
		{
			 System.setProperty("webdriver.gecko.driver", "D://Java_Selenium//Drivers//geckodriver.exe");
			  driver = new FirefoxDriver();
			  System.out.println("Firefox Test");	 
		}
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Assert.assertEquals("Google",title);
		driver.close();
		
	}
	
}
}