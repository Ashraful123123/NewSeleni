package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nexttech.pageobjectmodel.AmazonSearchPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AmazonSearch {

	WebDriver driver;  
	
	@Given("^user visit amazon homepage$")
	public void user_visit_amazon_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.amazon.com");
		
	}

	@Given("^user search by\"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {//Here in Feature File data is 
	                                 // in Double qoutation tai String abong akta test data ache "tv" tai arg1,
		                                 //jodi aro data thakto tahole arg2,arg3,
	    //throw new PendingException();
		AmazonSearchPOM edit=new AmazonSearchPOM(driver);
		edit.editSearchBox().sendKeys(arg1);//For any typing anything we will use = KEYWORD SENDKEYS(arg1)//
										//when we are testing with Testdata then sendKeys(arg1)
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		AmazonSearchPOM search = new AmazonSearchPOM(driver);
		search.searchButton().click();
	}
}
