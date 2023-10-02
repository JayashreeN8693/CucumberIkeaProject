package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass2 extends POJOClass1{
	
	public POJOClass2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Storage units & cabinets']")
	private WebElement sltsto;

	public WebElement getSltsto() {
		return sltsto;
	}
	
	

}
