package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass4 extends POJOClass3{
	
	public POJOClass4() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='All filters']")
	private WebElement up;
	
	@FindBy(xpath="(//img[@loading='lazy'])[1]")
	private WebElement closet;

	public WebElement getUp() {
		return up;
	}

	public WebElement getCloset() {
		return closet;
	}
	
	

}
