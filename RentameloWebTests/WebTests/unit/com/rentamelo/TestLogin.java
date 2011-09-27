package com.rentamelo;

import static org.junit.Assert.*;
import com.rentamelo.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

import org.junit.Test;

public class TestLogin {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void TestProperLogin(){
		LoginPage loginpage = new LoginPage(new FirefoxDriver());
		
	}
	
}
