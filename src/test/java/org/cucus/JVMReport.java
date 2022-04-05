package org.cucus;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateReports(String jsonPath) {
		
	
	File f= new File(System.getProperty("user.dir")+"\\Reports\\JVM Report");
	
	
	Configuration c = new Configuration(f, "Facebook Application");
	
	c.addClassifications("JDK", "1.8");
	c.addClassifications("Platform", "Windows");
	
	
	List<String> li = new ArrayList<String>();
	li.add(jsonPath);
	
	ReportBuilder r = new ReportBuilder(li, c);
	r.generateReports();
	
		
	
	}

}
