package com.icicibank.loans.personalloans;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class DummyClass implements WebDriver  {
	
	static WebDriver obj;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 obj = new DummyClass();
	obj.close();
	 DummyClass dm = new DummyClass();//by using child class object here it will show child class methods and implented methods from parent
	 dm.close();
	WebDriver driver = new DummyClass();// by using parent class object her it will show all parent class methods
	driver.close();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("this close method is implemented from parent interface");
		
	}

	@Override
	public WebElement findElement(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebElement> findElements(By arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCurrentUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPageSource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void quit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}	