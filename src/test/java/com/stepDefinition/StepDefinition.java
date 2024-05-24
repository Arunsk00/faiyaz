package com.stepDefinition;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.pageObjectManager.PageObjectmanager;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	PageObjectmanager pom = new PageObjectmanager();
//	@Given("User is on the Amazon webpage")
//	public void user_is_on_the_amazon_webpage() throws IOException {
////		getAllDriver("CHROME");
////		enterUrl();
////		Maximum();
//	}
	@When("User should perform login {string} , {string}")
	public void user_should_perform_login(String phoneNumber, String password) throws InterruptedException {
		
		pom.getLoginPage().login(phoneNumber, password);
		
	}
}
