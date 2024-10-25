package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Fluent wait declaration
		WebDriver driver=new ChromeDriver();
		/*Wait<WebDriver> mywait= new FluentWait(driver)
		.withTimeout(Duration.OfSeconds(30))
		.pollingEvery(Duration.OfSeconds(5))
		.ignoring(NoSuchElementException.class);
		*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.close();

	}

}
