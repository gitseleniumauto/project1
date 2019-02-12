package com.selenim.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	String appURL = "https://www.google.com/";
	
	
	@Test
	public void testGoogle(){
		System.setProperty("webdriver.gecko.driver","E:\\SydneySoftwares\\lib\\drivers\\windows\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get(appURL);
		Assert.assertTrue(true);
		driver.close();
	}
}
