package com.rentamelo;

import static org.junit.Assert.*;
import com.rentamelo.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class TestLogin {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	private LoginPage page;
	
	@Before
	public void openBrowser(){
		page = new LoginPage(new FirefoxDriver());
		
	}
	
	@Test
	public void TestProperLogin(){	
		page.loginAs("admin", "admin", true);
	}
	
	@After
	public void closeBrowser(){
		
	}
}
