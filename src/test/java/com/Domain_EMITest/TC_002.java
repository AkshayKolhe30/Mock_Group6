package com.Domain_EMITest;

import org.testng.annotations.Test;

import com.Utility.Baseclass;

public class TC_002 extends Baseclass {

	@Test
	public void Verification() {
		System.out.println("this is test");
		System.out.println(config.getStageUrl());
		System.out.println(excel.getStringData("sheet1", 0, 0));
	}
}
