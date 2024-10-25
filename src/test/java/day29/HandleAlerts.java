package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.get ("https://the-internet.herokuapp.com/javascript_alerts");
			driver.manage().window().maximize();
			
			//1 Noraml alert with OK button //button[@onclick='jsAlert()']
			driver.findElement (By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			Thread. sleep (5000);
			driver.switchTo().alert().accept();
			
			//1 Noraml alert with OK button-get text
			driver.findElement (By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			Thread. sleep (5000);
			Alert myalert=driver.switchTo().alert();
			System.out.println("Alert text is: "+myalert.getText());
			myalert.accept();
			
			//confirmation alert Ok and Cancel
			
			driver.findElement (By.xpath("//button[@onclick='jsConfirm()']")).click();
			Thread. sleep (5000);
			Alert myalert1=driver.switchTo().alert();
			myalert1.accept();
			
			//cancel
			driver.findElement (By.xpath("//button[@onclick='jsConfirm()']")).click();
			Alert myalert2=driver.switchTo().alert();
			myalert2.dismiss();
			
			//3) Prompt alert- Input box
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
			Alert myaler=driver.switchTo().alert();
			myaler.sendKeys("Welcome");
			myaler.accept();
			
			driver.quit();
			

	}

}
