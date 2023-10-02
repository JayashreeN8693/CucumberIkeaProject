package org.IkeaTestRunner;

import org.SourceClass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",
                  glue="org.IkeaStepDefrnition",
                  dryRun=false,
                  tags="@All",
                  monochrome=true,
                  plugin= {"html:target\\reports",
                		  "junit:target\\reports\\ikea.xml",
                		  "json:target\\reports\\ikea.json",
                		  "rerun:src\\test\\resources\\ReRunFolder\\Failed.txt"
                          })
public class TestRunner extends JVMReport{
	
	@AfterClass
	public static void generatereport() {
		generateJVMReport(System.getProperty("user.dir")+"\\target\\reports\\ikea.json");
		
	}

}
