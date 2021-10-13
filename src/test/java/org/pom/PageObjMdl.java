package org.pom;

import java.io.IOException;

import org.utilities.BaseClass;

public class PageObjMdl extends BaseClass{
	
    public static void main(String[] args) throws InterruptedException ,IOException{
    	launchChrome();
    	loadUrl("https://en-gb.facebook.com/");
    	winMax();
    	printTitle();
    	printCurrentUrl();
    	
    	LoginPojo l = new LoginPojo();
    	
		fill(l.getTxtUser(), getData(1,0));
		
		fill(l.getTxtPass(),getData(1,2));
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		LoginPojo li = new LoginPojo();
		
		fill(li.getTxtUser(),getData(3,0));
		
		fill(li.getTxtPass(),getData(5,1));
		
  	
    	
	}

	

	}


	
	

