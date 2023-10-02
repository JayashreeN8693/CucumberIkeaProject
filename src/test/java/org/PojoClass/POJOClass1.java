package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass1 extends UtilityClass{

	public POJOClass1() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement ok;
	
	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement clkProd;
	
	@FindBy(xpath="//a[text()='Storage & organisation']")
	private WebElement clkStor;
	
	@FindBy(xpath="(//a[text()='Cabinets & cupboards'])[1]")
	private WebElement clkcab;
	
	public WebElement getOk() {
		return ok;
	}

	public WebElement getClkProd() {
		return clkProd;
	}

	public WebElement getClkStor() {
		return clkStor;
	}

	public WebElement getClkcab() {
		return clkcab;
	}
	
	
	
	
	
	
	
}
