package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class brokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get ("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		//capture all links from website
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+ links.size());
		int numofBrokenLinks=0;

		for(WebElement linkElement:links)
		{
		String hrefattValue =linkElement.getAttribute("href");

			if(hrefattValue==null || hrefattValue.isEmpty())
		    {
		     System.out.println("href attribute value is null or empty. So Not possible to check ");
		     continue;
		     }
		
		
		//hit url to the server try
		try {
		URL linkURL=new URL(hrefattValue); // converted href value from string to URL format 
		HttpURLConnection conn=(HttpURLConnection) linkURL.openConnection(); // open connection to the server 
		conn.connect(); //connect to server and sent request the server
		
			if(conn.getResponseCode ()>=400)
				{
			System.out.println(hrefattValue+"=======>Broken link");
			numofBrokenLinks++;
				}
			else
				{
			 System.out.println(hrefattValue+"Not a broken link");
				}
	       }
		
	        	catch(Exception e)
		       {
	           }
		}
		System.out.println("Num of BrokenLinks :"+ numofBrokenLinks);

	}

}
