package org.IkeaTestRunner;

import org.SourceClass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\ReRunFolder\\Failed.txt",
                  glue="org.IkeaStepDefrnition",
                  dryRun=false,
                  monochrome=true,
                  tags="@All",
                  plugin= {"html:target\\reports",
                		   "json:target\\reports\\ikea.json",
                		   "junit:target\\reports\\ikea.xml",
                		   "rerun:src\\test\\resources\\ReRunFolder\\Failed.txt"
                		   })

public class TestReRunnerClass extends JVMReport{
	
	@AfterClass
	public static void generatereport() {
		
		generateJVMReport(System.getProperty(("user.dir")+"target\\reports\\ikea.json"));
		
		
	}

}
