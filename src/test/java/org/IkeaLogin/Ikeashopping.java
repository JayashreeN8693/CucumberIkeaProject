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
		
		//
		//https://in.accounts.ikea.com/login?state=hKFo
		//WebElement ikea = driver.findElement(By.xpath("//span[@class='btn__inner']"));
		  //ikea.click();
		
//When User should enter valid Username and password
//And User should click continue button

//@When("User should enter valid Username and password")
//public void user_should_enter_valid_Username_and_password() throws InterruptedException {
	//POJOClass6 po6 = new POJOClass6();
	//WebElement user = po6.getTxtUser();
	//FilltextBox(user, "jayashreen8693@gmail.com");
	//WebElement pass = po6.getTxtPass();
    //FilltextBox(pass, "Jaiikea@8693");
//}
//@When("User should click continue button")
//public void user_should_click_continue_button() throws InterruptedException{
	//
//@Then("User should land in homepage")
//public void user_should_land_in_homepage() {
	//WebElement id = driver.findElement(By.xpath("//div[text()='6275980361039742723']"));
	//String orderid = id.getText();
	//System.out.println(orderid);
    
//}
//}