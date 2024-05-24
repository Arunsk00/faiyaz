package com.stepDefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass{
	  @Before
      public void beforeScenario() throws IOException {
	    	getAllDriver(getPropertyValue("browser"));
			getDriver();
			Maximum();

       
		}
	  
	    @After
      public void afterScenario(Scenario scenario) {
       TakesScreenshot screenshot= (TakesScreenshot)driver;
       byte[] bs = screenshot.getScreenshotAs(OutputType.BYTES);
       scenario.attach(bs, "png", "Every Scenario");
		} 
}
