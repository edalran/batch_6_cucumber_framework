package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage  extends BasePage{
	
	private WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By header_RegisterPage = By.xpath("//h1[text()='Sign Up']");
	private By input_name = By.name("name");
	private By input_email = By.name("email");
	private By input_password = By.name("password");
	private By input_password2 = By.name("password2");
	private By btn_register = By.xpath("//input[@type='submit' and @value='Register']");
	
	public void isAtRegisterPage() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(header_RegisterPage));
	
	}
	
	public void registerUser(String name, String email, String password) {
		driver.findElement(input_name).sendKeys(name);
		driver.findElement(input_email).sendKeys(email);
		driver.findElement(input_password).sendKeys(password);
		driver.findElement(input_password2).sendKeys(password);
		driver.findElement(btn_register).click();
	}
	

}
