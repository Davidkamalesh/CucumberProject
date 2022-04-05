package org.runner;

import org.cucus.JVMReport;
import org.junit.After;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.cucus",dryRun=true)
public class TestRunner {
	
	@After
	
	public static void report() {
		
    JVMReport.generateReports("src\\test\\resources");
		
		
	}
	

}
