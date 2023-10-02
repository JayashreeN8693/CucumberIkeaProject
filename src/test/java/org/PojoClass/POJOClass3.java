package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass3 extends POJOClass2{
	
	public POJOClass3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Storage units & cabinets for home']")
	private WebElement clkforhome;

	public WebElement getClkforhome() {
		return clkforhome;
	}
	
	

}
