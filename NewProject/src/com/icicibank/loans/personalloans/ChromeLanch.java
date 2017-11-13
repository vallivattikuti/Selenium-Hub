package com.icicibank.loans.personalloans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeLanch {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		//Chrome Browser accessing
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E://SELENEIUM//workspacenew//NewProject//Drivers//chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.close();
		
		//IE Browser Accessing
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		//driver.manage().window().maximize();
		//driver.close();
		driver.quit();
		
		//Firefox Browses Accessing
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
