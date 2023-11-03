package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.page.login_functionality;

public class Logintest extends Testbase {
	
	login_functionality log ;
	
	public Logintest() {
		super();
	}
	@BeforeMethod
	public void initialize() {
		
		Setup();
		log = new login_functionality(driver);
		
	}
	@Test
	public void verifylogin() throws Throwable {
		
		log.validatelogin();
	}
}
