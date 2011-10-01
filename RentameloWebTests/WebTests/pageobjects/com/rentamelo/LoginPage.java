package com.rentamelo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private final WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void loginAs(String username, String password, boolean rememberMe)
	{
		//driver.navigate().to("http://rentamelo-app.cloudfoundry.com/login/auth");
		driver.findElement(By.name("j_username")).sendKeys(username);
        driver.findElement(By.name("j_password")).sendKeys(password);
        driver.findElement(By.name("_spring_security_remember_me")).click();
		//return new HomePage(driver);
	}
	
	public void open(String url){
		driver.get(url);
	}
	public void close(){
		driver.quit();
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
}
