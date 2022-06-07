package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FacebookLoginAccessPOM {
							//What is WebDriver driver//
	WebDriver driver;//This driver is a global driver,through this WebDriver driver  
					// we are accessing into the internet or web,
				   //These are the gateway allow us to go to the Internet
				  //and here driver is global variable
	public FacebookLoginAccessPOM(WebDriver driver) {//Here declaring local driver with WebDriver
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")//Here I am trying the catch the WebElement Using Locator which is "id"//
	WebElement edit_email;
	public WebElement email() {
		return edit_email;
	}
	@FindBy(name="password")
	WebElement edit_pass;
	public WebElement pass() {
		return edit_pass;
	}
	@FindBy(xpath="//*[@id=\"loginform\"]/div[5]/div/button")		//After Executing the code we can see the error,tai runtime error
	WebElement login_button;	//I have faced Runtime Error,I returned wrong Statement//
	public WebElement button() {// We will check,we are returning the correct web element or not//
		return login_button; // Here I will have return the correct WebElement//
	}						//Here If I don't return the right WebElement
						   //It Will be runtime Error(Example Of:RUNTIME ERROR)
}		           //If we return wrong statement we have to change the return statement


//=============IN GHERKIN LANGUAGE============//
//Here the attribute is password which should be under angle brackets
//and with double Quote because it is string
//This name should match with the attribute it's case sensetive
