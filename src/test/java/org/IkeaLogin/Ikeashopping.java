package org.IkeaLogin;

import org.PojoClass.POJOClass6;
import org.SourceClass.UtilityClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ikeashopping extends UtilityClass{
	
	@Test
	public void login() {
		
		EdgeBrowser();
		launchUrl("https://greenstech.in/selenium-course-content.html");
		Maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement down = driver.findElement(By.xpath("//h3[@aria-controls='collapse885']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
	}
}
		
		