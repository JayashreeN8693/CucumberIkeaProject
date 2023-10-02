package org.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass10 extends POJOClass9{
	
	public POJOClass10() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement flat;
	
	@FindBy(xpath="//span[text()='Save answers']")
	private WebElement save;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
    private WebElement radio;
	
	@FindBy(xpath="//textarea[@name='FREETEXT']")
	private WebElement textarea;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement finish;

	public WebElement getFlat() {
		return flat;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getTextarea() {
		return textarea;
	}

	public WebElement getFinish() {
		return finish;
	}
	
	
}
	