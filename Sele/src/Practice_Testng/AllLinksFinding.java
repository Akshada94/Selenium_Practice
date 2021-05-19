package Practice_Testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AllLinksFinding
{
	WebDriver driver;
	@Test
	public void initiazation()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
}
	@Test
	public void linksFind() throws InterruptedException
	{
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int alink=links.size();
		System.out.println(alink);
		for(int i=1;i<alink;i++) 
		{
			
			WebElement a=links.get(i);
			String b=a.getText();
			System.out.println(b);
			//Thread.sleep(2000);
			//driver.close();
	    }
}
}