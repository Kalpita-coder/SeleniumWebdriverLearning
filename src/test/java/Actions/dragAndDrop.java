package Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop (rome,italy).perform();
		
		WebElement wash=driver.findElement(By.xpath("//*[@id='box3']"));
		WebElement denmark=driver.findElement(By.xpath("//*[@id='box104']"));
		act.dragAndDrop (wash,denmark).perform();
				

	}

}
