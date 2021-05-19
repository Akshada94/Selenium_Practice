package Practice_Testng;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windowhandle
{
	
	
	WebDriver driver;
	@Test
	 public void initiazation()
	{
	    System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.findElement(By.cssSelector(".blinkingText")).click();
	    Set<String> windows=driver.getWindowHandles();//[parentid,childid]
	    Iterator<String>it=windows.iterator();
	    String parentId=it.next();
	    String childId=it.next();
	    driver.switchTo().window( childId);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    driver.findElement(By.cssSelector(".im-para.red")).getText();
	
}
}
