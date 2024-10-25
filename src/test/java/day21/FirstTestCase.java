package day21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
		
		//driver.get("https://duplo-dewalt100-tst-us.uat.sbd-nonprod.com/en");
		//driver.get("https://demo.opencart.com/");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		Thread.sleep(5000);
		//get window id of all tabs
		//getWindowHandles() - retuns ID's of the multiple browser windows
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); // this will opens new browser window
		//driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); 
		//driver.findElement(By.ByClassName
		Set<String> windowids=driver.getWindowHandles();
		System.out.println("window Ids: "+windowids);
	
		driver.manage().window().maximize();
		
		
		//Login Module
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.Name(username);
		
		
		//getPageSource()- returns source code of the page 
		System.out.println(driver.getPageSource());
		
		//getWindowHandle() - returns ID of the single Browser window
		String windowid=driver.getWindowHandle();
		System.out.println("Window ID:"+ windowid); //2C12CA3BA63C9819A03E4C8C98D55F7C
		                                           
	
						
				
		/*String act_title =driver.getTitle();
		if(act_title.equals("Your Store"))
		{
		  System.out.println("Test Passed");
		}
		else
		{
		  System.out.println("Test Failed");
		}*/
		
		//4) close browser 
		//driver.close();
		driver.quit();
		//driver.manage.window(maximize();
		//Xpath with single attribute
		
	//driver.findElement(By.Xpath("//input[@placeholder='Search']")).sendKeys("TShirts");

	}

}
