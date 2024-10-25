package KeyboardActions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class openLinkNewTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get ("https://demo.nopcommerce.com/"); driver.manage( ).window().maximize();
		WebElement regLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyDown(Keys.CONTROL).perform();
		
		
		//switching to registration page
		List<String > ids=new ArrayList(driver.getWindowHandles());
		driver.switchTo().window(ids.get (1)); //driver  switch to registration window.
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John KENEDY");
		
		//Home page
		driver.switchTo().window(ids.get(0)); // switch to home page
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("TShirts");

	}

}
