package Selenium_Shetty;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		//div[@id="glsctl00_mainContent_ddl_originStation1_CTNR"] //a[@value='BLR']//from
		//div[@id="glsctl00_mainContent_ddl_destinationStation1_CTNR"]  //a[@value='MAA']//To
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//by indexing
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]  //a[@value='MAA']")).click();//by parent child

	}

}
