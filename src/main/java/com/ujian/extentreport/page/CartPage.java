package com.ujian.extentreport.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian.extentreport.driver.DriverSingleton;

public class CartPage {

private WebDriver driver;
	
	public CartPage( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".cart-button")
	private WebElement btnCartFinish;
	
	@FindBy(css = "a.checkout-button:nth-child(1)")
	private WebElement btnCheckout;
	
	public void goTocartpage() {
		btnCartFinish.click();
	}
	
	public void goTocheckout() {
		btnCheckout.click();
	}
}
