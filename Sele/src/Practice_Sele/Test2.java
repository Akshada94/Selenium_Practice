package Practice_Sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement forgetlink=driver.findElement(By.linkText("Forgotten password?"));
		forgetlink.click();
		driver.close();//close only 1 window which is pointing in webdriver//current window close
		//Thread.sleep(2000);
		driver.quit();//close all windows //cannot use quite before close bcoz quite use close everything

	}

}
