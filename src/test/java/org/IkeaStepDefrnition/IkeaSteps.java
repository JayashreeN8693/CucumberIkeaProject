package org.IkeaStepDefrnition;

import static org.junit.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.PojoClass.POJOClass1;
import org.PojoClass.POJOClass10;
import org.PojoClass.POJOClass2;
import org.PojoClass.POJOClass3;
import org.PojoClass.POJOClass4;
import org.PojoClass.POJOClass5;
import org.PojoClass.POJOClass6;
import org.PojoClass.POJOClass7;
import org.PojoClass.POJOClass8;
import org.PojoClass.POJOClass9;
import org.PojoClass.SearchPOJO;
import org.SourceClass.UtilityClass;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import common.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IkeaSteps extends UtilityClass{
	
	    JavascriptExecutor js;
	    Robot rob;
	
	@Given("User should Launch Browser and Load the Url")
	public void user_should_Launch_Browser_and_Load_the_Url() {
		  OpenChrome();
		  launchUrl("https://www.ikea.com/in/en/");
		  Maximize();
		  ImplicitlyWait(20);
	}
    @When("User should should Click Products option from the page")
	public void user_should_should_Click_Products_option_from_the_page() throws InterruptedException{
		POJOClass1 po1 = new POJOClass1();
		WebElement ok = po1.getOk();
		ok.click();
		Hold(2000);
		WebElement prod = po1.getClkProd();
	    prod.click(); 
	    Hold(1000);
	}
    @When("User should click Storage and organization from dropdown")
	public void user_should_click_Storage_and_organization_from_dropdown() throws InterruptedException {
		POJOClass1 po1 = new POJOClass1();
		WebElement stor = po1.getClkStor();
	    stor.click();
	    Hold(1000);
	}
    @When("User should click Cabinets and Cupboards from options")
	public void user_should_click_Cabinets_and_Cupboards_from_options() throws InterruptedException {
		POJOClass1 po1 = new POJOClass1();
		WebElement cab = po1.getClkcab();
		cab.click();
		Hold(1000);
	}
    @When("user should click Storage units and Cabinets")
	public void user_should_click_Storage_units_and_Cabinets() throws InterruptedException {
		POJOClass2 po2 = new POJOClass2();
		WebElement sto  = po2.getSltsto();
	    sto.click();
	    Hold(1000);
	}
    @When("user should click storage units and cabinets for home")
	public void user_should_click_storage_units_and_cabinets_for_home() throws InterruptedException {
		POJOClass3 po3 = new POJOClass3();
		WebElement home = po3.getClkforhome();
		home.click();
		Hold(3000);
	}
    @When("User should scrolldown and click the product")
	public void user_should_scrolldown_and_click_the_product() throws InterruptedException {
	    js = (JavascriptExecutor) driver;
		WebElement down = driver.findElement(By.xpath("//span[text()='All filters']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);
		Hold(2000);
		POJOClass4 po4 = new POJOClass4();
		WebElement closet = po4.getCloset();
		js.executeScript("arguments[0].click()", closet);
	}
    @Then("Use should click Add to Bag option")
	public void use_should_click_Add_to_Bag_option() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		WebElement bus = driver.findElement(By.xpath("//span[text()='IDÅSEN ']"));
		js.executeScript("arguments[0].scrollIntoView(true)", bus);
		Hold(2000);
		POJOClass5 po5 = new POJOClass5();
		WebElement btnadd = po5.getBtnAdd();
		js.executeScript("arguments[0].click()", btnadd);
	}
    @Then("User should click continue to bag and click continue to checkout")
    public void user_should_click_continue_to_bag_and_click_continue_to_checkout() {
    	POJOClass7 po7 = new POJOClass7();
    	WebElement shopbag = po7.getShopbag();
    	js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", shopbag);
    	WebElement checkout = po7.getChaeckout();
    	js.executeScript("arguments[0].click()", checkout);
    }
    @Then("User should click login button")
    public void user_should_click_login_button() {
    	POJOClass7 po7 = new POJOClass7();
    	WebElement btnlogin = po7.getLogin();
    	js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].click()", btnlogin);
    }
    @Then("User should click guest login")
    public void user_should_click_guest_login() throws InterruptedException{
    	POJOClass8 po8 = new POJOClass8();
    	WebElement guest = po8.getGuestlogin();
    	guest.click();
    	Hold(3000);
    }
    @Then("User should enter valid details in all fields")
    public void user_should_enter_valid_details_in_all_fields() throws InterruptedException {
    	Hold(2000);
    	POJOClass9 po9 = new POJOClass9();
    	WebElement pin = po9.getPincode();
    	FilltextBox(pin, "560076");
    	WebElement viewdelivery = po9.getViewDelivery();
    	js.executeScript("arguments[0].click()", viewdelivery);
    	Hold(2000);
    }
    @When("user should enter the Searchtext in Search Textbox")
    public void user_should_enter_the_Searchtext_in_Search_Textbox() throws AWTException, InterruptedException {
    	SearchPOJO spo = new SearchPOJO();
    	WebElement ok = spo.getOk();
    	ok.click();
    	Hold(1000);
    	WebElement search = spo.getText();
    	FilltextBox(search, "Cushions");
    	rob = new Robot();
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
    }
    @When("User should select the item from the page")
    public void user_should_select_the_item_from_the_page() throws InterruptedException {
    	SearchPOJO spo = new SearchPOJO();
    	WebElement cushion = spo.getCushion();
    	cushion.click();
    	Hold(1000);
    	rob.keyPress(KeyEvent.VK_DOWN);
    	rob.keyRelease(KeyEvent.VK_DOWN);
    	WebElement color = spo.getColor();
    	color.click();
    	junit.framework.Assert.assertEquals(false, true);
    	System.out.println("The color is red");
    }
    @Given("User Launch the Browser and Load the Url")
    public void user_Launch_the_Browser_and_Load_the_Url() {
    	OpenChrome();
    	launchUrl("https://in.accounts.ikea.com/login?state=hKFo");
    	Maximize();
    	ImplicitlyWait(20);
    	
    }
    @When("User enter the inValid username {string}and invalid password{string}")
    public void user_enter_the_inValid_username_and_invalid_password(String s1, String s2) throws InterruptedException {
    	POJOClass6 po6 = new POJOClass6();
    	WebElement ok = po6.getBtnok();
    	ok.click();
    	WebElement user = po6.getTxtUser();
    	FilltextBox(user, s1);
    	WebElement pass = po6.getTxtPass();
        FilltextBox(pass, s2);
        Hold(3000);
    }
    @When("user should click continue button")
    public void user_should_click_continue_button() {
    	POJOClass6 po6 = new POJOClass6();
    	WebElement btncon = po6.getBtnCont();
    	ImplicitlyWait(10);
    	btncon.click();
    	ImplicitlyWait(10);
    	
    }
	
    




}
