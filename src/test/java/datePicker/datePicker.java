package datePicker;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;



public class datePicker {
	
	//select future  month & year and DATE---this clicks on Next year button
static void selectfuturedate(WebDriver driver,String month,String year, String date)
{
	   while(true)
	{
	String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//active month
    String currentYear=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();//active year
  //*[@id="ui-datepicker-div"]/div/div/span[2]
    if(currentMonth.equals(month) && currentYear.equals(year))
	   {
		   break;
	   }
    	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
       //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
    
	 }

 List <WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
	for (WebElement dt:allDates)
	{
		if(dt.getText().equals(date)) 
		{
			dt.click();
			break;
		}
		
	}
}
	//select past date, prev arrow is enabled
	static void selectpastdate(WebDriver driver,String month,String year, String date)
	{
		   while(true)
		{
		String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();//active month
	    String currentYear=driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/div/span[2]")).getText();//active year
	  //*[@id="ui-datepicker-div"]/div/div/span[2]
	    if(currentMonth.equals(month) && currentYear.equals(year))
		   {
			   break;
		   }
	    	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
	       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//Previous
	    
		 }

	 List <WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for (WebElement dt:allDates)
		{
			if(dt.getText().equals(date)) 
			{
				dt.click();
				break;
			}
			
		}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get ("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo(). frame(0);
		
		//Method1 : using sendkeys()
		//driver.findElement(By.xpath("//*[@id=\'datepicker\']")).sendKeys("09/11/2024");
		
	
		//Method2 : using date picker
		String year="2028";
		String month="May";
		String date="2";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //opens date picker
		
		//selectfuturedate(driver, month,year,date);
	 	selectpastdate(driver, "April","2019","1");
		
	
		//driver.quit();

	}

}
