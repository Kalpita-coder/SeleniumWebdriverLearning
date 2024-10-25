package KeyboardActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabandWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get ("https://www.opencart.com/");
		
		//selenium 4.x version onwards support this
		driver.switchTo().newWindow(WindowType.TAB);   //Opens new tab
		driver.switchTo().newWindow(WindowType.WINDOW); //Opens new window
		
		driver.get ("https://orangehrm.com/");

	}

}
