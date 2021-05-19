package Practice_Sele;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		/*WebElement txt=driver.findElement(By.id("u_0_n"));
		txt.sendKeys("Akshada");
		txt.clear();
		txt.sendKeys("Akshada Pawar");
		String output=txt.getAttribute("aria-label");
		System.out.println(output);*/
		WebElement btn=driver.findElement(By.id("u_0_14"));
		System.out.println("Text of button is>>>"+btn.getText());
		//btn.submit();
		System.out.println("coclor nof btn is>>"+btn.getCssValue("color"));
		

 	}

}
