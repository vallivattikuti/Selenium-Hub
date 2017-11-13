package com.seleniumtraining.WDElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.eenadupellipandiri.net/");
	}

}
