package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String t = driver.getTitle();
		System.out.println(t);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("r@gmail.com"); 
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
