package Practice_Sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
	WebElement forgetlink=driver.findElement(By.linkText("Forgotten password?"));
		forgetlink.click();
		
		
		
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		for (WebElement l : list) {
			System.out.println(l.getAttribute("href"));
			driver.close();
		}
		}
		
	}


