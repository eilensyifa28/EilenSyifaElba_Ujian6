package com.ujian.extentreport.glue;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.ujian.extentreport.config.AutomationFrameworkConfiguration;
import com.ujian.extentreport.driver.DriverSingleton;
import com.ujian.extentreport.page.AddCartPage;
import com.ujian.extentreport.page.CartPage;
import com.ujian.extentreport.page.LoginPage;
import com.ujian.extentreport.page.ProceedCheckout;
import com.ujian.extentreport.page.RegisterPage;
import com.ujian.extentreport.utils2.ConfigurationProperties;
import com.ujian.extentreport.utils2.Constants;
import com.ujian.extentreport.utils2.TestCases;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import io.opentelemetry.api.internal.Utils;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private WebDriver driver;
	private RegisterPage regisPage;
	private LoginPage loginPage;
	private AddCartPage addcartPage;
	private CartPage cartpage;
	private ProceedCheckout proceedcheckout;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports();
	
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		regisPage = new RegisterPage();
		loginPage = new LoginPage();
		addcartPage = new AddCartPage();
		cartpage = new CartPage();
		proceedcheckout = new ProceedCheckout();
	}
	
	@Given("^User go to the Website")
	public void user_go_to_the_Website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
	}
	
	//Halaman Register
	@When("^User click Dismiss button")
	public void user_click_Dismiss_page() {
		regisPage.dismiss();
	}
	
	@When("^User click Myaccount page button")
	public void user_click_Myaccount_page_button() {
		regisPage.goToMyAccount();
	}
	
	@When("^User input username email password and click Register")
	public void user_register_username_email_password_and_click_Register() {
		regisPage.goToRegist(configurationProperties.getUserName(), configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	
	@Then("^User can Register to the Website")
	public void user_can_Register_to_the_Website() {
		assertEquals(configurationProperties.getUserName(), regisPage.getUserName());
	}
	
	//Halaman WP Login
	@When("^User input email password and click Login")
	public void user_input_email_password_and_click_Login() {
		loginPage.goToLogin( configurationProperties.getEmail(), configurationProperties.getPassword());
	}
	
	@Then("^User can open myaccount")
	public void user_can_open_myaccount() {
		assertEquals(configurationProperties.getEmail(), loginPage.getEmail());
	}
	
	//Halaman Add Cart
	@When("^User click addcart")
	public void User_click_addcart() {
		addcartPage.goToAddCart();
	}
	
	@When("^User open menu addcart")
	public void User_open_menu_addcart() {
		driver.get(Constants.URL);
	}
	
	@When("^User click returnshopp")
	public void User_click_returnshop() {
		addcartPage.goToAddCart2();
	}
	
}
