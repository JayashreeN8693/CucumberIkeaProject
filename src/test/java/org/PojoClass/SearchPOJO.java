package org.PojoClass;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPOJO extends UtilityClass{
	
	public SearchPOJO() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Ok']")
	private WebElement ok;
	
	@FindBy(xpath="//input[@class='search-field__input']")
	private WebElement text;
	
	@FindBy(xpath="(//h3[@class='plp-price-module__name'])[2]")
	private WebElement cushion;
	
	@FindBy(xpath="(//img[@Class='pip-image'])[5]")
	private WebElement color;
	
	public WebElement getOk() {
		return ok;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getCushion() {
		return cushion;
	}

	public WebElement getColor() {
		return color;
	}
	
	

}
