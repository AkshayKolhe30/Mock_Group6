package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports getreports() {
		
		String path="C:\\Users\\lenovo\\eclipse-workspace\\BankingD\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Reports");
		reporter.config().setReportName("Login page Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("System", "Banking Domain");
		extent.setSystemInfo("QA", "Deepak");
		extent.setSystemInfo("O.S.", "Windows");
		return extent; 
		
		
		
	}
	
	
	
}
