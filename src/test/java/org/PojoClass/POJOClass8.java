package org.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass8 extends POJOClass7{
	
	public POJOClass8() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement btnLogin;
	
	@FindBy(xpath="//span[text()='Guest checkout']")
	private WebElement guestlogin;
	
	public WebElement getGuestlogin() {
		return guestlogin;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	

}
