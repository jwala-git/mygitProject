/**
 * 
 */
package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Admin
 *
 */
public class SeleniumTest {

	/**
	 * @param args
	 */
	public static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Automation_seleniumJars\\Drivers\\chromedriver.exe" );
		driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    	driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("jwala@xyz.com");
        driver.findElement(By.id("passwd")).sendKeys("admin2021*");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		 

	}

}
