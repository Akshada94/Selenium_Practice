package Practice_XpathCss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowingParent {
	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.rediff.com/");

	}

}
