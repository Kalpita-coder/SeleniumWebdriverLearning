package day31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdrpdwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click(); // opens dropdown opt
		
		//1) Select single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		
		//2) capture all the options and find out size
		WebElement drp=driver.findElement(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		List<WebElement> options= (List<WebElement>) drp;
		System.out.println("Number of option:"+ options.size());
		
		
		/*//3)printing options from dropdown
		for(WebElement op:options)
		{
		System.out.println(op.getText());
		}*/
		
		//4) select multiple options 
		for(WebElement op:options) {
		String option=op.getText();
		if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
		op.click();
		driver.quit();
	}

}
}