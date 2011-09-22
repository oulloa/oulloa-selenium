package com.rentameloPageObjects;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public HomePage(WebDriver driver){
		
	}
	
	public SignUpPage clickOnSignUp(){
		return new SignUpPage(); 
	}
	
	public LoginPage clickOnLogin(){
		return new LoginPage();
	}
	
	public SearchPage searchFor(String SearchString){
		return new SearchPage();
	}
	
}
