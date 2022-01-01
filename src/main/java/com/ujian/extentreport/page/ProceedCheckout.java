package com.ujian.extentreport.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ujian.extentreport.driver.DriverSingleton;

public class ProceedCheckout {

private WebDriver driver;
	
	public ProceedCheckout( ) {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#billing_first_name")
	private WebElement txtFirstName;
	
	@FindBy(css = "#billing_last_name")
	private WebElement txtLastname;
	
	@FindBy(css = "#billing_company")
	private WebElement txtCompany;
	
	@FindBy(css = "#billing_address_1")
	private WebElement txtAddress1;
	
	@FindBy(css = "#billing_address_2")
	private WebElement txtAddress2;
	
	@FindBy(css = "#billing_city")
	private WebElement txtCity;
	
	@FindBy(css = "#billing_postcode")
	private WebElement txtKodePos;
	
	@FindBy(css = "#billing_phone")
	private WebElement txtPhone;
	
	@FindBy(css = "#order_comments")
	private WebElement txtAdditional;
	
	@FindBy(css = "#terms")
	private WebElement checkBtnTerms;
	
	@FindBy(css = "#place_order")
	private WebElement btnCheckoutFinish;
	
	public void goToCheckout(String firstname, String lastname, String company, String alamat1, String alamat2, String kota, String kodepos, String tlp, String additional) {
		
		txtFirstName.sendKeys(firstname);
		txtLastname.sendKeys(lastname);
		txtCompany.sendKeys(company);		
		txtAddress1.sendKeys(alamat1);
		txtAddress2.sendKeys(alamat2);
		txtCity.sendKeys(kota);
		txtKodePos.sendKeys(kodepos);
		txtPhone.sendKeys(tlp);
		txtAdditional.sendKeys(additional);
	}
	
	public void goToFinish() {
		checkBtnTerms.click();
		btnCheckoutFinish.click();
	}
}
