package org.PojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass9 extends POJOClass8{
	
	public POJOClass9() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@inputmode='numeric']")
	private WebElement pincode;
	
	@FindBy(xpath="//span[text()='View delivery options']")
	private WebElement viewDelivery;
	
	@FindBy(xpath="//input[@id='CLICK_COLLECT_STORE_STANDARD_TRUCK']")
	private WebElement collectradio;
	
	@FindBy(xpath="//span[text()='Select a store']")
	private WebElement Selectastore;
	
	@FindBy(xpath="//span[text()='Continue with this option']")
	private WebElement contwithoption;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement delivradio;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement radiocont;
	
	@FindBy(xpath="//input[@aria-label='First name *']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@aria-label='Last name *']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@aria-label=\"Address *\"]")
	private WebElement address;
	
	@FindBy(xpath="//input[@aria-label='Email address *']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@aria-label='Mobile number *']")
	private WebElement mobile;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private WebElement policy;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement addresscontinue;
	
	@FindBy(xpath="//span[text()='This is my address']")
	private WebElement thisismyadd;
	
	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getViewDelivery() {
		return viewDelivery;
	}
	
	public WebElement getSelectastore() {
		return Selectastore;
	}

	public WebElement getContwithoption() {
		return contwithoption;
	}

	public WebElement getCollectradio() {
		return collectradio;
	}

	public WebElement getDelivradio() {
		return delivradio;
	}

	public WebElement getRadiocont() {
		return radiocont;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPolicy() {
		return policy;
	}

	public WebElement getAddresscontinue() {
		return addresscontinue;
	}

	public WebElement getThisismyadd() {
		return thisismyadd;
	}
	
	
	

}
