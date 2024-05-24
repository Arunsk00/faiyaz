package com.testrunner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.stepDefinition.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources" ,glue= {"com.stepDefinition"}, dryRun = false, monochrome= true,
plugin = {"pretty","json:src\\test\\resources\\Report\\hello.json"})
public class TestRunner extends BaseClass {
	@AfterClass
	public static void afterclas() throws IOException {
		Reporting.Reportings(System.getProperty("user.dir") + getPropertyValue("jvmreportpath"));
	}
}
