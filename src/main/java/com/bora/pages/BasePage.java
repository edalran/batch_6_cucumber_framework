package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
	
	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By lnk_logout = By.xpath("//*[text()='Logout']/parent::a");
	public By lnk_register = By.xpath("//nav//a[text()='Register']");
	
	
	public void logout() {
		driver.findElement(lnk_logout).click();
	}
	
	public void clickRegisterLink() {
		driver.findElement(lnk_register).click();
	}
	
}
