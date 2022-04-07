package com.Domain_EMITest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObejct.loginPom;
import com.Utility.Baseclass;
import com.Utility.Library;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_VerifyLoginPage extends Baseclass {
	
	@Test
	public void verifyFBLoginTest_Invaliddata() {
		
		
		loginPom login = PageFactory.initElements(driver, loginPom.class);
		Library.custom_sendkeys(login.gettxt_emailId(), excel.getStringData("sheet1", 0, 0), "Email");
		Library.custom_sendkeys(login.gettxt_password() ,excel.getStringData("sheet1", 0, 1), "Password");
		Library.custom_click(login.getbtn_login(), "Login Button");
		
		
	}
}
