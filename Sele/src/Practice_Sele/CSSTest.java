package Practice_Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTest {
	

	public static WebDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 driver.findElement(By.cssSelector("input#u_0_n")).sendKeys("akshada ");
	}

}
