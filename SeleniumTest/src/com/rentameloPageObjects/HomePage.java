package com.rentameloPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private final WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		
		if(!driver.getTitle().contains("Bienvenido"))
			driver.navigate().to("/");
			
	}
	
	public SignUpPage clickOnSignUp(){
		driver.findElement(By.linkText("Inscribirse")).click();
		return new SignUpPage(driver);
	}
	
	public LoginPage clickOnLogin(){
		driver.findElement(By.linkText("Ingresar")).click();
		return new LoginPage(driver);
	}
	
	public SearchPage searchFor(String SearchString){
		driver.findElement(By.linkText("Crear articulo")).click();
		return new SearchPage(driver);
	}
	
}
