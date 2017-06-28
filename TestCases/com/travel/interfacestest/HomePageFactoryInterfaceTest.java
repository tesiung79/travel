package com.travel.interfacestest;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.travel.constant.Constant;
import com.travel.pagefactory.HomePageFactory;

public class HomePageFactoryInterfaceTest extends TestBase {

	HomePageFactory homepage = new HomePageFactory();

/*	
	@Test(priority=0)
	public void selectCurrency(){
		homepage.selectCurrency("GBP");
	}
	
	@Test(priority=1)
	public void selectLanguage(){
		homepage.setLanguage("portuguese");
		Assert.assertTrue(homepage.isLanguageSelected("Portuguese"));
		
		
//		Assert.assertEquals(homepage.getURL(), Constant.URL + "pt");	
	}
*/
	
	@Test
	public void clickMyAccount(){
//		homepage.ddClickMyAccount();
//		homepage.ddMyAccount.click();
		Assert.assertTrue(homepage.ddMyAccount.isDisplayed());
			
			
		if (homepage.ddMyAccount.isDisplayed())
		{
			homepage.clickWebElement(homepage.ddMyAccount);
			//hello test test test 
		}
		
	}

/*
	@Test
	public void clickLogin(){
		homepage.ddClickLogin();
	//	homepage.goHome();
	}
*/
	
/*	
	@Test
	public void headerExist(){
		Assert.assertTrue(homepage.isElementExist(homepage.lnkHome));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkHotels));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkFlights));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkTours));		
		Assert.assertTrue(homepage.isElementExist(homepage.lnkCars));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkOffers));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkBlog));
		Assert.assertTrue(homepage.isElementExist(homepage.lnkContactUs));
		}
	
	@Test
	public void tabHeaderExist(){
		Assert.assertTrue(homepage.isElementExist(homepage.tabHotels));
		Assert.assertTrue(homepage.isElementExist(homepage.tabFlights));
		Assert.assertTrue(homepage.isElementExist(homepage.tabTours));
		Assert.assertTrue(homepage.isElementExist(homepage.tabCars));			
		}
		
	
	@Test
	public void featuredHotelsExist(){
	
		List<WebElement> liElements = homepage.getElements(homepage.lnkFeaturedHotelsTours);

		System.out.println("The number of Elements exists are: " + liElements.size());
		
		for (int i=1; i <= liElements.size(); i++){
			WebElement linkElement = Constant.driver.findElement(By.xpath(".//div[@class='bgwhite']//div//div[2]//div[@class='col-md-3 row5']["+i+"]"));
			System.out.print("Featured Hotel #" + i +" is "+ linkElement.getText());
		}
	}
	
*/	
	
	
	
	
}
