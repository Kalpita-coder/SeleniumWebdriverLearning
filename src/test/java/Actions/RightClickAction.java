package Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
			Actions act=new Actions(driver);
			//Right click action
			act.contextClick(button).perform();  //this perfoems the right click on button

	}

}
