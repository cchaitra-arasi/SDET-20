package com.vitiger.comcast.genericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

////public class LisImpClass implements ITestListener {
//	public void onTestFailure(ITestResult result) {
//		String testName= result.getMethod().getMethodName();
//		
//		System.out.println(testName +"=======Execute & i am listening=========");
//       //EventFiringWebDriver eDriver = new EventFiringWebDriver(BaseClass.sDriver);	
//       
//     //  File srcFile = eDriver.getScreenshotAs(OutputType.FILE);
//       File destFile = new File("./screenshot/"+ testName+".png");
//       try {
//		FileUtils.copyDirectory(srcFile, destFile);
//	} catch (IOException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	}
//
//}
