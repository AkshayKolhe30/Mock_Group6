package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	public static ExcelDataProvider excel;
	@BeforeSuite
	public void BS() throws Exception {
		 config=new ConfigDataProvider();
		  excel=new ExcelDataProvider();
	}
	
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BrowserOpen(String BrowserName) {
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}else if(BrowserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get(config.getStageUrl());
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void BrowserClose() {
		driver.close();
	}
}
