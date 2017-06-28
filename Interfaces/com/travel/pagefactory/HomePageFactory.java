package com.travel.pagefactory;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.travel.constant.Constant;

public class HomePageFactory {
	
	//Navigation Bar - Header - HOME - Currency - Language Selector - My Account	
	@FindBy(className="navbar-brand") 
	public WebElement lnkMainPage;

	@FindBy(xpath=".//*[@id='currency']") 
	public WebElement sltCurrency;
	
	@FindBy(xpath=".//div[@class='navbar-collapse collapse']/ul/li[1]/a") 
	public WebElement ddLanguage;
	
	@FindBy(xpath=".//*[@id='" + Constant.PORTUGUESE +"']") WebElement portuguese; 
	@FindBy(xpath=".//*[@id='" + Constant.ENGLISH +"']") WebElement english; 
	@FindBy(xpath=".//*[@id='" + Constant.UKRAINIAN +"']") WebElement ukrainian; 
	@FindBy(xpath=".//*[@id='" + Constant.RUSSIAN +"']") WebElement russian; 
	@FindBy(xpath=".//*[@id='" + Constant.TURKISH +"']") WebElement turkish; 
	@FindBy(xpath=".//*[@id='" + Constant.FILIPINO +"']") WebElement filipino; 
	@FindBy(xpath=".//*[@id='" + Constant.SPANISH +"']") WebElement spanish; 
	@FindBy(xpath=".//*[@id='" + Constant.FRENCH +"']") WebElement french; 
	@FindBy(xpath=".//*[@id='" + Constant.ITALIAN +"']") WebElement italian; 
	@FindBy(xpath=".//*[@id='" + Constant.ARABIC +"']") WebElement arabic; 
	@FindBy(xpath=".//*[@id='" + Constant.HEBREW +"']") WebElement hebrew;
	
	@FindBy(xpath="html/body/div[2]/div/div/div[2]/ul/li[2]/a") 
	public WebElement ddMyAccount;
	
	@FindBy(xpath="html//body//div[2]//div//div//div[2]//ul//li[2]//ul//li[1]//a") 
	public WebElement ddLogin;
	
	@FindBy(linkText="Sign Up") 
	public WebElement ddSignUp;

/**************************************************************************************	
**** Headers - Home - Hotels - Flights - Tours - Cars - Offers - Blog - Contact Us ****	
***************************************************************************************/

	@FindBy(linkText="Home") 
	public WebElement lnkHome;	
	
	@FindBy(linkText="Hotels") 
	public WebElement lnkHotels;
	
	@FindBy(linkText="Flights") 
	public WebElement lnkFlights;
	
	@FindBy(linkText="Tours") 
	public WebElement lnkTours;
	
	@FindBy(linkText="Cars") 
	public WebElement lnkCars;
	
	@FindBy(linkText="Offers") 
	public WebElement lnkOffers;
	
	@FindBy(linkText="Blog") 
	public WebElement lnkBlog;
	
	@FindBy(linkText="Contact Us") 
	public WebElement lnkContactUs;
	
/**************************************************************************************	
************************ TAP - Hotels - Flights - Tours - Cars ************************	
***************************************************************************************/

	@FindBy(xpath=".//ul[@class='nav nav-tabs RTL tab_styling']//li[1]//a") 
	public WebElement tabHotels;

	@FindBy(xpath=".//ul[@class='nav nav-tabs RTL tab_styling']//li[2]//a") 
	public WebElement tabFlights;
	
	@FindBy(xpath=".//ul[@class='nav nav-tabs RTL tab_styling']//li[3]//a") 
	public WebElement tabTours;
	
	@FindBy(xpath=".//ul[@class='nav nav-tabs RTL tab_styling']//li[4]//a") 
	public WebElement tabCars;
	
/**************************************************************************************	
*************************** Featured Hotels & Featured Tours ***************************	
***************************************************************************************/	
	
	@FindBy(xpath=".//div[@class='bgwhite']//div//div[2]//div[@class='col-md-3 row5']") 
	public WebElement lnkFeaturedHotelsTours;
	
/**************************************************************************************	
****************************** Newsletter & Social Media ******************************	
***************************************************************************************/
	
	@FindBy(id="exampleInputEmail1") 
	public WebElement txtNewsletter;

	@FindBy(xpath=".//a[@href='https://www.facebook.com/travelbusiness']") 
	public WebElement lnkFacebook;	
	
	@FindBy(xpath=".//a[@href='https://twitter.com/phptravels']") 
	public WebElement lnkTwitter;
	
	@FindBy(xpath=".//a[@href='http:///www.youtube.com/phptravels']") 
	public WebElement lnkYoutube;
	
	@FindBy(xpath=".//a[@href='https://plus.google.com/+Phptravels/']") 
	public WebElement lnkGoogle;
	
	@FindBy(xpath=".//a[@href='http://phptravels.net/sitemap.xml']") 
	public WebElement lnkDummy;
	
/**************************************************************************************	
***************************** Corporate - Legal - Support *****************************	
***************************************************************************************/
	
	@FindBy(linkText="Our Partners") 
	public WebElement lnkOurPartners;

	@FindBy(linkText="Price Guarantee") 
	public WebElement lnkPriceGuarantee;
	
	@FindBy(linkText="Become Supplier") 
	public WebElement lnkBecomeSupplier;
	
	
	@FindBy(linkText="Terms & Conditions") 
	public WebElement lnkTermsConditions;
	
	@FindBy(linkText="Privacy Policy") 
	public WebElement lnkPrivacyPolicy;	
	
	@FindBy(xpath=".//*[@class='container form-group']//div[3]//ul//li[3]") 
	public WebElement lnkFaqHelp1;

	
	//Support
	@FindBy(xpath=".//*[@class='container form-group']//div[4]//ul//li[1]") 
	public WebElement lnkContactUs2;
	
	@FindBy(linkText="About Us") 
	public WebElement lnkAboutUs;		
	
	@FindBy(xpath=".//*[@class='container form-group']//div[4]//ul//li[3]") 
	public WebElement lnkFaqHelp2;
	
	@FindBy(linkText="Booking Tips") 
	public WebElement lnkBookingTips;	
	
/**************************************************************************************	
************************************** Supplier **************************************	
***************************************************************************************/	

	@FindBy(linkText="Supplier Registration") 
	public WebElement lnkSupplierRegistration;
	
	@FindBy(linkText="Supplier Login")
	public WebElement lnkSupplierLogin;
	

	
	
	
	public String getURL(){
		System.out.println("The Current URL is: " + Constant.driver.getCurrentUrl());
		
		return Constant.driver.getCurrentUrl();		
	}
	
	public void goHome(){
//		Constant.driver.findElement(lnkHome).click();	
		lnkHome.click();
	}
	
	public void goMainPage(){
//		Constant.driver.findElement(lnkMainPage).click();		
		lnkMainPage.click();
	}
	
	public void selectCurrency(String currency){
//		Select select = new Select(Constant.driver.findElement(sltCurrency));
		Select select = new Select(sltCurrency);
		select.selectByVisibleText(currency);
	}
	
	public void selectCurrency(int index){
//		Select select = new Select(Constant.driver.findElement(sltCurrency));
		Select select = new Select(sltCurrency);
		select.selectByIndex(index);
	}
	
/*
	public void setLanguage(String language){
//		Constant.driver.findElement(ddLanguage).click();
		Constant.driver.findElement(getElement(language.toLowerCase())).click();
		
		
		
		//		Constant.wait.until(ExpectedConditions.invisibilityOfElementLocated(ddLanguage));
//		System.out.println("This ISSS" + Constant.driver.findElement(ddLanguage).getText());
		
		ddLanguage.click();
		ddLanguage.findElement(getLanguageElement(language.toLowerCase())).click();
		language.toLowerCase().click();
		
		
	}
	

	public boolean isLanguageSelected(String language){		
		if (Constant.driver.findElement(ddLanguage).getText().toString() == language){
			System.out.println("This ISSS NOWWW" + Constant.driver.findElement(ddLanguage).getText());
			return true;}
		else 
			return false;
	}
*/	
	
	public Boolean isElementExist(By element){
		return Constant.driver.findElement(element).isDisplayed();
	}
	
	public List<WebElement> getElements(By elements){
		return Constant.driver.findElements(elements);
	}
	
	public WebElement getElement(By element){
		return Constant.driver.findElement(element);		
	}
	
	public void clickElement(By element){
		Constant.driver.findElement(element).click();		
	}
	
	public void clickWebElement(WebElement webElement){
		
//		Constant.wait.until(ExpectedConditions.elementToBeClickable(webElement));
		Constant.wait.until(ExpectedConditions.invisibilityOf(webElement));
		webElement.click();
	}
	
	
}
