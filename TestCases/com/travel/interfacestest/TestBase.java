package com.travel.interfacestest;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.travel.constant.Constant;

public class TestBase {

	
	@BeforeClass
	public void setup(){
		System.out.println("BEFORE CLASS - SETUP");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\Resources\\geckodriver.exe");
		Constant.driver = new FirefoxDriver();
		Constant.driver.get(Constant.URL);
		Constant.driver.manage().window().maximize();
		
		Constant.wait = new WebDriverWait(Constant.driver, 30);
	
	}
	
	
	@AfterClass
	public void teardown(){
		System.out.println("AFTER CLASS - TEARDOWN");
		Constant.driver.close();		
	}
	
	
	
}
