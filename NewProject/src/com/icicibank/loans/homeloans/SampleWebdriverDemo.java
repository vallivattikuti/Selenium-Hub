package com.icicibank.loans.homeloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleWebdriverDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
