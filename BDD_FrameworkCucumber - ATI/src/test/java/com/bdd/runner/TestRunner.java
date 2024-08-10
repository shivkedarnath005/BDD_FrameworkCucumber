package com.bdd.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/Features", glue="com.bdd.steps",
       plugin={"pretty", "html:./Reports/HTMLReports/cucumber.html", 
    		  "json:./Reports/JSONReports/cucumber.json", 
    		  "junit:./Reports/JUNITReports/cucumber.xml"}, 
    		  monochrome=true, dryRun=false )

public class TestRunner
{
	
	

}
