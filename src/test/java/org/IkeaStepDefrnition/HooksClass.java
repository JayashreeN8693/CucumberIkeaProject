package org.IkeaStepDefrnition;

import java.io.File;
import java.io.IOException;

import org.SourceClass.UtilityClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends UtilityClass{
	
	@Before
	public void beforeScenario() {
		OpenChrome();
		launchUrl("https://www.ikea.com/in/en/");
		Maximize();
		ImplicitlyWait(20);
	}
    
    @After
    public void afterScenario(Scenario s) throws IOException {
       DateandTime();
       if(s.isFailed()) {
       TakesScreenshot tk = (TakesScreenshot) driver;
       byte[] screenshot = tk.getScreenshotAs(OutputType.BYTES);
       s.embed(screenshot, "ikea.image/png");
       }
    	
    }


}
