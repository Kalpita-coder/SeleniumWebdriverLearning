package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConditionalAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		//WebDriver driver=new ChromeDriver();
		/*//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//isDisplayed
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement title = driver.findElement(By.xpath("//h1[@class='title']"));
		boolean val=title.isDisplayed();
		System.out.println("title displayed"+val);
		
	    //isSelected()
		
		WebElement male=driver.findElement(By.xpath("//input[@id='male']"));
		male.click();
		boolean val1 =male .isSelected();
		System.out.println("male is selected"+val1);
		
		WebElement female= driver.findElement(By.xpath("//input[@id='female']"));
		boolean val2 =female.isSelected();
		System.out.println("Female is selected"+val2);
		*/
		
		//Explicit wait
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds (10)); //declaration
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window() .maximize();
		WebElement txtusername=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		txtusername .sendKeys("Admin");
		WebElement txtpassword=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		txtpassword.sendKeys("admin123");
				
		driver.quit();
	}
}
