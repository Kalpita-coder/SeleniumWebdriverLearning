package day37;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get ("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		/*
		//1 single file upload -p1111.pdf
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("/Users/kalpitaraul/Downloads/p1111.pdf");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Test1.txt"))
		{
		System.out.println("File is sucessfully uploaded");
		}
		else
		{
		System.out.println("Upload failed.");
		}
		*/
		
		
		//2. Multiple files uploaded
		//specify file path
		String file1="/Users/kalpitaraul/Downloads/p1111.pdf";
		String file2="/Users/kalpitaraul/Downloads/k.pdf";
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int no0fFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size(); //find 
		//multiple elements
		
		if(no0fFilesUploaded==2)
		System.out.println("All Files are uploaded");
		else
		System.out.println("Files are not uploaded or incorrect files uploaded");
		
		//3. validate file names
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("p1111.pdf")
		&& driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("k.pdf"))
		{
		 System.out.println("File names matching..");
		}
		else
		{
		 System.out.println("Files are not not matching.");
		}
		
	}

}
