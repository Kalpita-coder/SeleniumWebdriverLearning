package day31;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlehiddendropdown {

	public static void main(String[] args)throws 
	InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get ("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click(); //PIM
		
		//clicked on dropdown
		driver.findElement(By.xpath("//div[@id='app']//div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div/div[6]/div//i")).click();
		Thread.sleep(5000);
		
		//select single option
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[10]")).click();
		
		
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span")) ;
		System.out.println ("Number of options:"+ options.size());
		
		//printing options 
		for (WebElement op:options)
		{
		  System.out.println(op.getText());
		}
		

	}

}
