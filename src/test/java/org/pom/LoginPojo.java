package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() { 
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement txtUser;

	@FindBy(id="pass")
	private WebElement txtPass;

	@FindBy(xpath="//button[@name='login'")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	



	
	
	
	
	
	
	
	
	

}
