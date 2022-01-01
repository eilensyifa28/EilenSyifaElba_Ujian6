package com.ujian.extentreport.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ujian.extentreport.driver.DriverSingleton;

public class LoginPage {

private WebDriver driver;
	
	public LoginPage( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(css = "#user_login")
	private WebElement txtEmail;

	@FindBy(css = "#user_pass")
	private WebElement txtPassword;
	
	@FindBy(css = "#wp-submit")
	private WebElement btnLogin;
	
	public void goToLogin(String email, String password) {
		// TODO Auto-generated method stub
		txtEmail.sendKeys(email);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public String getEmail() {
		return txtEmail.getText();
	}


}
