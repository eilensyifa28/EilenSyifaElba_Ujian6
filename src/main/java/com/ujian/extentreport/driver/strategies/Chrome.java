package com.ujian.extentreport.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.ujian.extentreport.driver.strategies.DriverStrategy;

public class Chrome implements DriverStrategy {
	
	public WebDriver setStrategy() {
		System.setProperty("webdriver.chrome.driver", "G:ChromeDriver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--no-sandbox");
		
		return new ChromeDriver(options);
	}
}
