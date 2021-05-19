package Selenium_Shetty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException 
	{System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);//declare globally
    
    String [] itemsNeeded= {"Cucumber","Brocolli","Beetroot"};
    
    driver.get("	https://rahulshettyacademy.com/seleniumPractise/");
    //Thread.sleep(3000);
     driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click();
    System.out.println("testing doned!");
    
	

	}

}
