package com.ujian.extentreport.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ujian.extentreport.driver.strategies.DriverStrategy;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
		System.setProperty("webdriver.gecko.driver", "G:geckodriver");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
