package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
      public WebElement getMouseoversigin() {
		return mouseoversigin;
	}
	public WebElement getEnterMobileNo() {
		return enterMobileNo;
	}
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	public WebElement getEnterPassword() {
		return enterPassword;
	}
	public WebElement getClickSignin() {
		return clickSignin;
	}
	@FindBy(id="nav-link-accountList")
      private WebElement mouseoversigin;
      @FindBy(id="ap_email")
      private WebElement enterMobileNo;
      @FindBy(id="continue")
      private WebElement clickcontinue;
      @FindBy(id="ap_password")
      private WebElement enterPassword;
      @FindBy(id="signInSubmit")
      private WebElement clickSignin;
      
    public void login(String phoneNumber, String password) throws InterruptedException {
    	
   click(getMouseoversigin());
   SendKeys(getEnterMobileNo(), phoneNumber);
   click(getClickcontinue());
   SendKeys(getEnterPassword(), password);
   click(getClickSignin());
   
	}
      
}
