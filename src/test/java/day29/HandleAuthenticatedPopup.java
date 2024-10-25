package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.get ("http://the-internet.herokuapp.com/basic_auth");
		
		//Syntax:http://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://stanley:$tanl3y@duplo-dewalt100-dev-us.uat.sbd-nonprod.com/");

	}

}
