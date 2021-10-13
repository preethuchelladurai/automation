package org.junt;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.pom.LoginPojo;
import org.utilities.BaseClass;

public class Junit extends BaseClass{
	@BeforeClass
	public static void browserLaunch() {
	  launchChrome();
	  loadUrl("https://en-gb.facebook.com/");
	  printTitle();
	  printCurrentUrl();
	}
	
	@AfterClass
	public static void closeBrowser() {
	  winClose();
	}
	
	@Before
	public void strtTime() { 
		prntStTime();
	}
	
	@After
	public void endTime() { 
		prntEndTime();
	}
	@Test
	public void tc1() throws IOException{
		LoginPojo l = new LoginPojo();
		fill(l.getTxtUser(),getData(3,0));
		fill(l.getTxtUser(),getData(5,1));
	
	}
	
}
