package org.PojoClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass6 extends POJOClass5{
	
	public POJOClass6() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='To IKEA']")
	private WebElement btnok;
	
	@FindBy(xpath="//input[@autocomplete='username']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement txtPass;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement btnCont;
	
	@FindBy(xpath="//div[text()='6275980361039742723']")
	private WebElement id;

	public WebElement getBtnok() {
		return btnok;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getBtnCont() {
		return btnCont;
	}
	
	public WebElement getId() {
		return id;
	}
	
	//WebDriver down = driver.findElement(By.xpath("//h2[text()='Recommended for you']"));
	

}
