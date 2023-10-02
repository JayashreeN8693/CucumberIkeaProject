package org.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass7 extends POJOClass6{
	
	public POJOClass7() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Continue to bag']")
	private WebElement shopbag;
	
	@FindBy(xpath="//span[text()='Continue to checkout']")
	private WebElement chaeckout;
	
	@FindBy(xpath="//span[text()='Login ']")
	private WebElement login;

	public WebElement getShopbag() {
		return shopbag;
	}

	public WebElement getChaeckout() {
		return chaeckout;
	}

	public WebElement getLogin() {
		return login;
	}
	
	

}
