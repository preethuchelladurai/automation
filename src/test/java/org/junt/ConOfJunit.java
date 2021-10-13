package org.junt;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ConOfJunit {

	@BeforeClass
	public static void browserLaunch() {
	  System.out.println("Chrome Browser");
	}
	
	@AfterClass
	public static void closeBrowser() {
	  System.out.println("Browser Close");	
	}
	
	@Before
	public void startTime() {
	  System.out.println("Start Time");	
	}
	
	@After
	public void endTime() {
	  System.out.println("End Time");	
	}                    

	@Test
	@Ignore
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
	public void tc4() {
		System.out.println("Test4");
	}
}
