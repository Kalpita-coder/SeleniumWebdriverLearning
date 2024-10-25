package day38;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get ("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	
		//1) full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		//c:\Automation\myworkspaces\seleniumwebdriver\seleniumwebdriver
		
		//File targetfile=new File("seleniumwebdriver\\screenshots\\fullpage.png");
		File targetfile=new File(System.getProperty("user.home")+"screenshots\\fullpage.png");
		//   /seleniumwebdriver/screenshots
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		
		
		
		//2) capture the screenshot of specific section
		WebElement featuredProducts=driver.findElement(By.xpath("//*[@id=\'HTML8\']"));
		File sourcefile1=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile1=new File(System.getProperty("user.home")+"screenshots\\table.png");
		System.out.print("directory is: "+"user.dir");
		sourcefile1.renameTo(targetfile1); // copy sourcefile to target file
		
		//3) capture the screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div/h3/a"));
		File sourcefile2=logo.getScreenshotAs(OutputType.FILE);
		File targetfile2=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile2.renameTo(targetfile2); // copy sourcefile to target file
		
		driver.quit();

	}

}
