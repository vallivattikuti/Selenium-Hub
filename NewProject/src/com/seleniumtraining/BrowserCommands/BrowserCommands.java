package com.seleniumtraining.BrowserCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","E://SELENEIUM//workspacenew//NewProject//Drivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("http://www.amazon.com");
		
		driver.navigate().to("http://www.amazon.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);		
				
		//driver.close();//It will close current browser
		driver.quit();//it will close all the browsers (parant window and child window)
		
	}

}
