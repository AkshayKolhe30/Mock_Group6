package com.PageObejct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_emailId;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement btn_login;
	
	public loginPom(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public WebElement gettxt_emailId() {
		return txt_emailId;
	}
	public WebElement gettxt_password() {
		return txt_password;
	}
	public WebElement getbtn_login() {
		return btn_login;
	}
}
