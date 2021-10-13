package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ConOfTestNg {

	@BeforeClass
	public static void browserLaunch() {
	  System.out.println("Chrome Browser");
	}
	
	@AfterClass
	public static void closeBrowser() {
	  System.out.println("Browser Close");	
	}
	
	@BeforeMethod
	public void startTime() {
	  System.out.println("Start Time");	
	}
	
	@AfterMethod
	public void endTime() {
	  System.out.println("End Time");	
	}                    

	@Test
	public void tc2() {
		System.out.println("Test2");
	}
	
	@Test
	public void tc1() {
		System.out.println("Test1");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test3");
	}
	
	@Test
	public void tc5() {
		System.out.println("Test5");
	}
	
	@Test
	public void tc4() {
		System.out.println("Test4");
	}
}
