package Practice_XpathCss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffE2E {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");
		 driver.findElement(By.cssSelector("a.signin")).click();//tagname.class  sign in is class
		 driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		 driver.findElement(By.cssSelector("input#password")).sendKeys("byebye");
		 driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();;
		 
		 
		 
	}

}
