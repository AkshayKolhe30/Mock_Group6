package com.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener implements ITestListener {
	
	ExtentReports extent=new ExtentReportGenrator().getreports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	public void onTestStart(ITestResult result) {
	Library.test =extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
	extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		Library.test.log(Status.PASS, "Test case pass");
	}

	public void onTestFailure(ITestResult result) {
		Library.test.log(Status.FAIL, "Test Case Fail");
	}

	public void onTestSkipped(ITestResult result) {
		Library.test.log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}
	
	
	

}
