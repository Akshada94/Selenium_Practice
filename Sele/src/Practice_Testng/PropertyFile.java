package Practice_Testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PropertyFile 
{
	public static WebDriver driver;
   @Test
   public void propertyTest() throws IOException 
   {
	   FileInputStream fis=new FileInputStream("D:\\Java_Selenium\\Sele\\src\\Practice_Testng\\Project.properties");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("URL");
	System.out.println("url is "+url);

	System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get(p.getProperty("URL"));
	 driver.findElement(By.id("email")).sendKeys(p.getProperty("user"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("pass"));
		driver.findElement(By.name("login")).click();
}
   }