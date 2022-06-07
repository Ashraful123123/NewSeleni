package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.CustomerServicePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerService {
    WebDriver driver; 

   // CustomerServicePOM cusService = new CustomerServicePOM(driver); // From this Global driver it  
    								//come to upper level global driver,
	@Given("^User Visits Amazon Homepage$")
	public void user_Visits_Amazon_Homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");//This is my Chrome Driver Path//
        driver= new ChromeDriver();
        driver.get("http://www.amazon.com");
	}
	//here we need the access the access of the web elements Object from PageObjectModel class//
	//Here i need the access of this web elements so,we use the.globalDriver=localDriver//
	@When("^User Click on Customer Service Option$")
	public void user_Click_on_Customer_Service_Option() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
							//Inside the Parenthesis we declared a argument is GLobal driver	
							//This is the global driver who will give the access to customerService//
		CustomerServicePOM cusService = new CustomerServicePOM(driver);//here I created an object of constuctor of CustomerServicePOM Class/
		cusService.customerService().click(); //Here I want to get the access of customerService               
											 //And I want to Click it
						           //This is the webElement cusomerService which i need to click
		
		//By the help of Global driver it go to class of POM, and get the access of that WebElement from 
		//that class and match that the WebElement is from CustomerServicePOM this class//
	}

	@Then("^User Should be able to redirect to Customer Service Page$")
	public void user_Should_be_able_to_redirect_to_Customer_Service_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
