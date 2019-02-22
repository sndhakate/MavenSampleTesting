package com.demotestcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {
	

	@Test
	public void TestFireFox(){

	WebDriver driver = new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	driver.manage().window().maximize();

	driver.get("http://www.facebook.com");

	driver.quit();

	}

	}