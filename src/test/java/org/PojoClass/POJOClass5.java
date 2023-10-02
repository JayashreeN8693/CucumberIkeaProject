package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass5 extends POJOClass4{
	
	public POJOClass5() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='IDÅSEN ']")
	private WebElement busi;
	
	@FindBy(xpath="//span[text()='Add to bag']")
	private WebElement btnAdd;
	
	@FindBy(xpath="//a[text()='Continue to bag']")
	private WebElement conttobag;

	public WebElement getBusi() {
		return busi;
	}

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getConttobag() {
		return conttobag;
	}
	
	

}
