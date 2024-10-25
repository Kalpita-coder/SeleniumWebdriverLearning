package day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().window().maximize()	;	
		
		//1) select specific checkbox
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//2) select all the checkboxes //input[@class='form-check-input' and @type='checkbox']
		List <WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++) {
		checkboxes.get(i).click();
		
		}
		
		//approach 2
		for(WebElement checkbox: checkboxes){
		  checkbox.click();
	
		}*/
	
		
		//3) select last 3 checkboxes//	7-3=4
		//7-3=4
		for(int i=4;i<=checkboxes.size();i++) {
			checkboxes.get(i).click();
		}
		driver.close();

	}

}
