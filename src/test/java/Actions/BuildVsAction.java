package Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BuildVsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.get ("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver .manage().window().maximize();

		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

		//Action Vs Actions
		
		Actions act=new Actions(driver);

		Action myaction=act.contextClick(button).build(); // creatign an action and storing into a varaible--
		//building or creating action n storing into variable.
		
		myaction.perform();  //we are performing or completing action


	}

}
