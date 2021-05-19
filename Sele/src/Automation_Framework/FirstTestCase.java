package Automation_Framework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTestCase {
 public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 		//WebDriver driver1=new ChromeDriver();
	
		driver.get("https://www.demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName"));
		driver.findElement(By.name("Gender"));
		driver.findElement(By.className("practice-form-wrapper"));
		driver.findElement(By.linkText("Home"));
		driver.findElement(By.partialLinkText("Ho"));	
        
 }
} 