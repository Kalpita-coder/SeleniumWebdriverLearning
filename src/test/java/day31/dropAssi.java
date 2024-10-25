package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropAssi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		WebElement drpCountryEle =driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		Select drpCountry=new Select(drpCountryEle);
		List<WebElement>options=drpCountry.getOptions();
		
		//1) count total number of options
		System.out.println(" total number of options:" + options.size());
		
		//2) print all the options
		for(WebElement op:options) {
			System.out.println( op.getText());
		}
		
		//3) ﻿select one option
		//drpCountry.selectByVisibleText("France");
		drpCountry.selectByValue("1");
		//drpCountry.selectByIndex(2);

	}

}
