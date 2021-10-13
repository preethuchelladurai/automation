package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class TestPro extends BaseClass {
	
	public static void main(String[] args) {
		launchChrome();
		loadUrl("https://en-gb.facebook.com/");
		winMax();
		printTitle();
		printCurrentUrl();
		WebElement user = driver.findElement(By.id("email"));
		fill(user,"preethu");
		WebElement pass = driver.findElement(By.id("pass"));
		fill(pass,"preethu@123");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btnClick(btn);
		winRefresh();
		WebElement move = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    a.moveToElement(move).perform();
    	a.doubleClick(move).perform();
    	a.contextClick(move).perform();
    	
	}
}
