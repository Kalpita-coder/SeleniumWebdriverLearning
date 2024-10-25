package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditinalMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");	
		
		//isDisplayed() check logo is displayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("logo displayed"+logo.isDisplayed());  //true
		
		
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("logo displayed"+status);
		
		//isEnabled        check field is enabled
		boolean status1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("First name Enable status:"+status1); //true
		
		//isSelected()
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before selection...............");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("After selecting male...");
		male_rd.click(); // select male radio button
		System.out.println(male_rd.isSelected()); // true
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("After selecting female..."); 
		female_rd.click(); // select female radio button
		System.out.println(male_rd.isSelected()); // false
		System.out.println(female_rd.isSelected()); //true
		
		WebElement newsltr=driver.findElement(By.xpath("//input[@id='Newsletter']"));
		
		System.out.println("Before ...............");
		System.out.println(newsltr.isSelected()); //true
		newsltr.click();
		System.out.println("After click ...............");
		System.out.println(newsltr.isSelected()); //false
		
		//driver.close();
		driver.quit();

	}

}
