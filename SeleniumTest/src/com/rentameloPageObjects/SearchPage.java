package com.rentameloPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	private final WebDriver driver;
	private String SearchQuery;
	
	public SearchPage(WebDriver driver){
		this.driver = driver;
	}
	
	public SearchPage searchFor(String SearchQuery){
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys(SearchQuery);
		searchBar.submit();
		return new SearchPage(driver);
	}

}
