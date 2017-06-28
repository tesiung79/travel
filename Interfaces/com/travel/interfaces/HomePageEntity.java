package com.travel.interfaces;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.travel.constant.Constant;

public class HomePageEntity {
	
	//Navigation Bar - Header - HOME - Currency - Language Selector - My Account	
	By lnkMainPage = By.className("navbar-brand");	
	By sltCurrency = By.xpath(".//*[@id='currency']");
	By ddLanguage = By.xpath(".//div[@class='navbar-collapse collapse']/ul/li[1]/a");

//	String language;
	public static By getLanguageElement(String language){
		switch (language){
		case "portuguese":
			By portuguese = By.xpath(".//*[@id='" + Constant.PORTUGUESE +"']");
			return portuguese;
		case "english":
			By english = By.xpath(".//*[@id='" + Constant.ENGLISH +"']");
			return english;
		case "ukrainian":
			By ukrainian = By.xpath(".//*[@id='" + Constant.UKRAINIAN +"']");
			return ukrainian;
		case "russian":
			By russian = By.xpath(".//*[@id='" + Constant.RUSSIAN +"']");
			return russian;
		case "turkish":
			By turkish = By.xpath(".//*[@id='" + Constant.TURKISH +"']");
			return turkish;
		case "filipino":
			By filipino = By.xpath(".//*[@id='" + Constant.FILIPINO +"']");
			return filipino;
		case "spanish":
			By spanish = By.xpath(".//*[@id='" + Constant.SPANISH +"']");
			return spanish;
		case "french":
			By french = By.xpath(".//*[@id='" + Constant.FRENCH +"']");
			return french;
		case "italian":
			By italian = By.xpath(".//*[@id='" + Constant.ITALIAN +"']");
			return italian;
		case "arabic":
			By arabic = By.xpath(".//*[@id='" + Constant.ARABIC +"']");
			return arabic;
		case "hebrew":
			By hebrew = By.xpath(".//*[@id='" + Constant.HEBREW +"']");
			return hebrew;
		}
		return null;
	}
	
	public By ddMyAccount = By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/a");
	public By ddLogin = By.xpath("html//body//div[2]//div//div//div[2]//ul//li[2]//ul//li[1]//a");
	
//	By ddSignUp = By.xpath("html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a");
	public By ddSignUp = By.linkText("Sign Up");
	
/**************************************************************************************	
**** Headers - Home - Hotels - Flights - Tours - Cars - Offers - Blog - Contact Us ****	
***************************************************************************************/

	public By lnkHome = By.linkText("Home");
	public By lnkHotels = By.linkText("Hotels");
	public By lnkFlights = By.linkText("Flights");	
	public By lnkTours = By.linkText("Tours");
	public By lnkCars = By.linkText("Cars");
	public By lnkOffers = By.linkText("Offers");
	public By lnkBlog = By.linkText("Blog");
	public By lnkContactUs = By.linkText("Contact Us");
	
	
/**************************************************************************************	
************************ TAP - Hotels - Flights - Tours - Cars ************************	
***************************************************************************************/

	//html/body/div[4]/div[2]/div/ul/li[2]/a
	public By tabHotels = By.xpath(".//ul[@class='nav nav-tabs RTL tab_styling']//li[1]//a");
	public By tabFlights = By.xpath(".//ul[@class='nav nav-tabs RTL tab_styling']//li[2]//a");
	public By tabTours = By.xpath(".//ul[@class='nav nav-tabs RTL tab_styling']//li[3]//a");
	public By tabCars = By.xpath(".//ul[@class='nav nav-tabs RTL tab_styling']//li[4]//a");
	

/**************************************************************************************	
*************************** Featured Hotels & Featured Tours ***************************	
***************************************************************************************/	

//	public By lnkFeaturedHotels = By.xpath(".//div[@class='col-md-3 row5']");
	public By lnkFeaturedHotelsTours = By.xpath(".//div[@class='bgwhite']//div//div[2]//div[@class='col-md-3 row5']");
	
/**************************************************************************************	
****************************** Newsletter & Social Media ******************************	
***************************************************************************************/
	
	public By txtNewsletter = By.id("exampleInputEmail1");	

	public By lnkFacebook = By.xpath(".//a[@href='https://www.facebook.com/travelbusiness']");
	public By lnkTwitter = By.xpath(".//a[@href='https://twitter.com/phptravels']");
	public By lnkYoutube = By.xpath(".//a[@href='http:///www.youtube.com/phptravels']");
	public By lnkGoogle = By.xpath(".//a[@href='https://plus.google.com/+Phptravels/']");
	public By lnkDummy = By.xpath(".//a[@href='http://phptravels.net/sitemap.xml']");

	
/**************************************************************************************	
***************************** Corporate - Legal - Support *****************************	
***************************************************************************************/
	
	public By lnkOurPartners = By.linkText("Our Partners");
	public By lnkPriceGuarantee = By.linkText("Price Guarantee");
	public By lnkBecomeSupplier = By.linkText("Become Supplier");

	public By lnkTermsConditions = By.linkText("Terms & Conditions");
	public By lnkPrivacyPolicy = By.linkText("Privacy Policy");
	public By lnkFaqHelp1 = By.xpath(".//*[@class='container form-group']//div[3]//ul//li[3]");
	
	//Support
	public By lnkContactUs2 = By.xpath(".//*[@class='container form-group']//div[4]//ul//li[1]");
	public By lnkAboutUs = By.linkText("About Us");
	public By lnkFaqHelp2 = By.xpath(".//*[@class='container form-group']//div[4]//ul//li[3]");
	public By lnkBookingTips = By.linkText("Booking Tips");
	
/**************************************************************************************	
************************************** Supplier **************************************	
***************************************************************************************/	
	public By lnkSupplierRegistration = By.linkText("Supplier Registration");
	public By lnkSupplierLogin = By.linkText("Supplier Login");
	
	
	
	public String getURL(){
		System.out.println("The Current URL is: " + Constant.driver.getCurrentUrl());
		
		return Constant.driver.getCurrentUrl();		
	}
	
	public void goHome(){
		Constant.driver.findElement(lnkHome).click();		
	}
	
	public void goMainPage(){
		Constant.driver.findElement(lnkMainPage).click();
	}
	
	public void selectCurrency(String currency){
		Select select = new Select(Constant.driver.findElement(sltCurrency));
		select.selectByVisibleText(currency);
	}
	
	public void selectCurrency(int index){
		Select select = new Select(Constant.driver.findElement(sltCurrency));
		select.selectByIndex(index);
	}
	
	public void setLanguage(String language){
		Constant.driver.findElement(ddLanguage).click();
		Constant.driver.findElement(getLanguageElement(language.toLowerCase())).click();
		
		Constant.wait.until(ExpectedConditions.invisibilityOfElementLocated(ddLanguage));
		
		System.out.println("This ISSS" + Constant.driver.findElement(ddLanguage).getText());
	}
	
	public boolean isLanguageSelected(String language){		
		if (Constant.driver.findElement(ddLanguage).getText().toString() == language){
			System.out.println("This ISSS NOWWW" + Constant.driver.findElement(ddLanguage).getText());
			return true;}
		else 
			return false;
	}
	
	
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
	
	
}
