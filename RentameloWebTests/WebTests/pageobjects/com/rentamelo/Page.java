package com.rentamelo;

import org.openqa.selenium.WebDriver;

public class Page {

	private final WebDriver driver;
	
	public Page(WebDriver driver){
		this.driver = driver;
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
