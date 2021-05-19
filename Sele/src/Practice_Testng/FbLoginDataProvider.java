package Practice_Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FbLoginDataProvider
{
	WebDriver driver;
	@Test(dataProvider ="loginTest")
	public void invalidLoginTest(String user,String pass)
	{
		String actRes=null;
	System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("email")).sendKeys(pass);
	driver.findElement(By.id("u_0_d_en")).click();
	try
	{
	actRes=driver.findElement(By.xpath("//*[@class='_1lvp5']")).getText();	
	}
	catch (Exception e) {
		System.out.println("Element not Available");
	}
	driver.close();
	Assert.assertNotEquals(actRes,"Akshada");
}
	@org.testng.annotations.DataProvider(name="loginTest")
	public static Object [][] getData2()
	{
		return new Object [][]
		{
			{"Pankaj","pass1"},
			{"akshada","ak11"},
			{"harsha","harsh12"}
			
		};
		
	}
}