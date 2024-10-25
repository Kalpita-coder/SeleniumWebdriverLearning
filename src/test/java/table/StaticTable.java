package table;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		
		//1) find total number of rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple table, 
		//logic count tr as num of rows
		
		//int rows=driver.findElements(By.tagName("tr")).size(); // single table on webpage
		System.out.println("Number of rows: "+rows);//7
		
		
		//2) find total number of columns in a table
		//count th(table heading inside tr) as num of columns
		int columns =driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); 
		System.out.println("Number of columns: "+columns);  //4
		
		//3) Read data from specific row and column (ex: 5th row and 1st column)
		String bookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(bookName); //Master In Selenium
		
		
		//4) read data from all the rows and colums
		/*
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t  " +"Price");
		for (int r=2; r<=rows;r++)
		{
			for(int c=1;c<=columns; c++)
		  {
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+ "\t");
	      }
		System.out.println();
	}  
	
	*/
		
		//5) Print book names whose author is Mukesh
		 System.out.println("books written by Mukesh are:");
		for (int r=2;r<=rows;r++) {
		String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		//read Authorname from each row 2nd column
		
		if(authorName.equals("Mukesh"))
		{
		 String bookname= driver.findElement(By.xpath("//table[@name= 'BookTable']//tr["+r+"]//td[1]")).getText();
		 System.out.println(bookname);
		  //print bookname if author is Mukesh
		}
		}
		
		//6) Find total price of all the books
		 int tprice= 0; 
		for(int r=2;r<=rows;r++)
		{
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		System.out.println(price);
		tprice = tprice +Integer.parseInt(price);
		}
		System.out.println("Total price is: "+tprice);
		driver.quit();
}
}
