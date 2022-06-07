package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Here By Using Constructor we are making a relation between GLobal and Local Driver//

	//This is the pageobjectmodel for Customer Service option//
								     //All the Object of a webpage will be in this Package//
public class CustomerServicePOM {   //I am going to keep every single object of a page inside//
							       //PageObjectModel Package by creating a Class of that feature//
 
	
	                  //Here WebDriver is an Interface , and driver is a variable//
	WebDriver driver;//This driver help us to go inside the Internet//
					//This driver variable is GLOBAL VARIABLE//
				   //And this driver is outside of any Method or Constructor so,it's GLOBAL Driver//
	
                         //constructor is not a method but special type of method
                        //1.Constructor name and class name should be exactly same//
                       //2.It has no RetunType
	
	//IN CustomerService.java class I will create a object of this constructor//
    public CustomerServicePOM( WebDriver driver)//If I see ClassName and Method is Same,has no ReturnType// 
    {											//The it's Constructor//
    	this.driver=driver;   //here,by this we mean, this class and Globaldriver=Localdriver//
    						 //LocalDriver sharing his element with global driver//
    	PageFactory.initElements(driver, this);//These driver is our local driver, 
    }	             //Whatever elements we have in this class will pass through the local driver
    						//because it is inside the Constructor
    						//pageFactory is a PageObjectModel where we will keep our all web elements//
    						//it will help us to keep our web element//
    
    //whatever web element we have we  will pass it from local driver to global driver
    //and it will go beyond of this class means globally
    //All the web Elements will go Globally by Global driver to the STEPDEFS
    //Because we have All the steps in Stepdefs Class
    //in stepdefs we need the access of web elements from the pageObjectModel class
    
    
    //For Keeping the web elements we have four line
    
    										//in first line we will keep our xpath
    @FindBy(xpath="//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice\"]")
    WebElement click_CustomerService;   //First we declare the name of the webElement  
    									 //here i will mention the name of the web element//
    									//so,here my WebElement name is CustomerService Option//
    								   //And the option clickable so,click_CustomerService//
    							      //If Typable then typable_FeatureName//
    
    
    //WebElement CustomerService ke Run korar jonno ai method ta create kora hoeche//
    
    //This is my WebElement now I have to access this from CustomerService.java Class//
    
    public WebElement customerService() {    //To run the Web element =click_CustomerServicewe created a method
		return click_CustomerService;       //here i will have to create a method 
    									   //this method have a returntype so i will not add void,
    									  //It will return a value so,I will add a returntype.
		
	//What I want to return?, I want to return the WebElement click_CustomerService//
	//Tai ami return click_CustomerService diechi//
	//akhane return hishebe click_CustomerService dibe//
		
												//Here webElement is the returnType/returnValue for this Method//
    }		                          			 //When the has no returntype then it will be void//
}


//Here,At first we want to capture the object,or we want to use the the web element so at first
//we captured the web element (customer service) by using a locator name XPATH//
//And then I am going to create a method of WebElement//
//That method will return a webElement that I want to capture//
//==========
//If I want to capture any object i have to create a method of that object
//and that method should return that webElement
//===
//First I will declare the    
          //WebElement and name of the webelElement
		 //Than will create a method for the WebElement 
        //And I have to return the WebElement inside this method//

//It knows where to type or click by giving the return click_CustomerService//
//PageFactory.initElements(driver, this);==

