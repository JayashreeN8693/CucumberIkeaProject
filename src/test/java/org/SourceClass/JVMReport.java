package org.SourceClass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJVMReport(String jsonpath) {
		//mention the location where the report should be saved
		File f = new File(System.getProperty("user.dir")+"\\target\\CucumberReport");
		
		//mention the details of the report  (file refname,projectname)
				Configuration con = new Configuration(f,"IKEA project");
				con.addClassifications("BrowserName", "Chrome");
				con.addClassifications("BrowserVersion", "116");
				con.addClassifications("OS", "windows");
				con.addClassifications("ProjectName", "IKEA");
				con.addClassifications("Scenario", "03");
				con.addClassifications("Time Zone", "IST");
				
				//Add json file path into list<string>
				List<String> li = new ArrayList<String>();
				li.add(jsonpath);
				
				//create object for reportbuilder class
				                                  //(list<string> refname, configuration rename)
				ReportBuilder rb = new ReportBuilder(li, con);
				rb.generateReports();
		
		
	}

}
