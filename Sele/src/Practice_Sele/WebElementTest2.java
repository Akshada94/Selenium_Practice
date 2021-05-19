package Practice_Sele;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTest2 {

	public static void main(String[] args) {
		System.out.println("Main Started");
		System.setProperty("webdriver.chrome.driver","D:\\Java_Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		
		
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement rb=driver.findElement(By.className("_58mt"));
		System.out.println("radio btn test>> "+rb.isSelected());
		WebElement btn=driver.findElement(By.id("u_0_14"));
		Dimension d=btn.getSize();
		System.out.println("height and weight is"+d.getHeight()+" "+d.getWidth());
		
		//System.out.println("size of btn>>"+btn.getSize());
		
		Point p=btn.getLocation();
		System.out.println("X and Y axis Location>>"+p.getX()+" "+p.getY());
		System.out.println("Display>>"+btn.isDisplayed());
		System.out.println("Enable Btn>>"+btn.isEnabled());

	

	}

}
