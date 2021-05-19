package Automation_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class RadioButtons {
	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "D://Java_Selenium//chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.demoqa.com/radio-button");
		 driver.manage().window().maximize();
		 
		 		 
		 /**
		 * Find radio button using ID, Validate isSelected and then click to select
		 */
		 WebElement radioEle = driver.findElement(By.className("custom-control-label"));
		 boolean select = radioEle.isSelected();
		 System.out.print(select);
		 // performing click operation if element is not already selected
		 if (select == false) {
		 radioEle.click();
		 }
	
		 /**
		 * Find radio button using Xpath, Validate isDisplayed and click to select
		 */
		 WebElement radioElem = driver.findElement(By.className("custom-control-label"));
		 boolean sel = radioEle.isDisplayed();
		 
		 // performing click operation if element is displayed
		 if (sel == true) {
		 radioElem.click();
		 }
		 
		 /**
		 * Find radio button using CSS Selector, Validate isEnabled and click to select
		 */
		 WebElement radioNo = driver.findElement(By.className("custom-control-label"));
		 boolean selectNo = radioEle.isDisplayed();
		 
		 // performing click operation if element is enabled
		 if (selectNo == true) {
		 radioNo.click();
		 }
		 
		 }
		 
		}

