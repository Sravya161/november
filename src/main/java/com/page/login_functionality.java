package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;

public class login_functionality extends Testbase {
	
	// login page
	@FindBy(xpath="//input[@type='text']")
	WebElement usr;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement Pswd;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	

	public login_functionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void validatelogin() throws Throwable {
		
		usr.sendKeys(prop.getProperty("username"));
		Pswd.sendKeys(prop.getProperty("password"));
		
		login.click();
		
	}
}

