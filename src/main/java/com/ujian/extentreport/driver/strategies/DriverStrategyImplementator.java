package com.ujian.extentreport.driver.strategies;

import com.ujian.extentreport.driver.strategies.Chrome;
import com.ujian.extentreport.driver.strategies.DriverStrategy;
import com.ujian.extentreport.driver.strategies.Firefox;
import com.ujian.extentreport.utils2.Constants;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
			
		case Constants.FIREFOX:
			return new Firefox();

		default:
			return null;
		}
	}
}
