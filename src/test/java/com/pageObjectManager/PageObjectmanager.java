package com.pageObjectManager;

import com.pages.LoginPage;

public class PageObjectmanager {
	private LoginPage loginPage;
	public LoginPage getLoginPage() {
		return (loginPage ==null)? loginPage= new LoginPage():loginPage;
	}
}
