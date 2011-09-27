package com.rentamelo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private final WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		
		if(!driver.getTitle().contains("Bienvenido"))
			  throw new IllegalStateException("Wrong Page");
			
	}
	
	public SignUpPage clickOnSignUp(){
		driver.findElement(By.linkText("Inscribirse")).click();
		return new SignUpPage(driver);
	}
	
	public LoginPage clickOnLogin(){
		driver.findElement(By.linkText("Ingresar")).click();
		return new LoginPage(driver);
	}
	
	public CreateArticlePage clickOnNewArticle(){
		driver.findElement(By.linkText("Crear Articulo")).click();
		return new CreateArticlePage(driver);
	}
	
	public SearchPage searchFor(String SearchQuery){
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys(SearchQuery);
		searchBar.submit();
		return new SearchPage(driver);
	}
	
}
