package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); // passed frame as a webelement //switch to frame1 
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		driver.switchTo().defaultContent();// go back to page
		
		/*driver.findElement(By.xpath("//input [@name='mytext2']")).sendKeys("selenium");
		driver.switchTo().frame(frame1); */
		
		//Frame 2
		WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium2");
		driver.switchTo().defaultContent();// go back to page
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		//WebElement text3=driver.findElement(By.xpath("input[@name='mytext3']"));
		WebElement text3=driver.findElement(By.name("mytext3"));
	
		Thread.sleep(5000);
		text3.sendKeys("java");
		
		
		//inner iframe -part of frame3
		driver.switchTo().frame(0);
		WebElement rdbutton=driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")); //radio I am human
		
		//inner iframe url" https://docs.google.com/forms/d/e/1FAIpQLScP-K8zi-9ar0MCq93D3VIFhegSNPveBfdLqiMfTYR9Q1iSKQ/viewform?embedded=true
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();",rdbutton);
		Thread.sleep(5000);
	
		
		driver.switchTo().defaultContent();// go back to page
		
		driver.quit();
		
		

	}

}
