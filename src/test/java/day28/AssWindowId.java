package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssWindowId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*https://testautomationpractice.blogspot.com/
﻿﻿﻿		provide some string search for it
﻿﻿﻿		count number of links
﻿﻿﻿		click on each link using for loop
﻿﻿﻿		get window ID's for every browser window
﻿﻿﻿		close specific browser window
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/"); 
		driver.manage().window().maximize()	;	
		
		//1. provide some string search for it
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("flower");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		//2.count number of links
		WebElement header=driver.findElement(By.id("Wikipedia1_wikipedia-search-results-header"));
		System.out.println("title displayed : "+header.isDisplayed());
		//this will give list of webelemnts having tag a-urls as tag "A"
		List<WebElement> b=driver.findElements(By.id("wikipedia-search-result-link")) ;
		List <String> urllist=new ArrayList(b);
		int count=b.size();
		System.out.println("Num of links :"+count);
		
		
		
		
		for (int i=0;i<count;i++)

		{

				WebElement a=b.get(i) ;
				String url= a.getText() ;
				System.out.println (url);
				
		}
		
		//﻿click on each link using for loop
		

		for (int i=0;i<count;i++)

		{

				WebElement a=b.get(i) ;
				a.click();
				//urllist.get(i);
			    //urllist.click();
				
				String windowid=driver.getWindowHandle();
				String title=driver.getTitle();
				System.out.println ("window handle:"+windowid+"window title:"+title);
				//driver.getWindowHandle();
				//String url= a.getTitle() ;
				//System.out.println (url);
				
		}
		
		//click on each link using for loop
		/*Set<String> windowIDs=driver.getWindowHandles();
		
		
		
		List <String> windowList=new ArrayList(windowIDs);
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println("child browserID"+driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println("Parent browserID"+driver.getTitle());
		*/

		//driver.quit();
	}

}
