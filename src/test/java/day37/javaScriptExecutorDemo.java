package day37;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class javaScriptExecutorDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get ("https://testautomationpractice.blogspot.com/"); 
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//JavascriptExecutor js=driver;
		//passing value in javascript statement in argument[0]
		js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);
		
		// clicking on element - alternate of click()
		//male
		WebElement radiobtn=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",radiobtn);
		
		//female
		WebElement radiobtn1=driver.findElement(By.xpath("//*[@id=\'female\']"));
		js.executeScript("arguments[0].click()",radiobtn1);
		

	}

}
