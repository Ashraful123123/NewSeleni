package com.nexttech.stepdefs;

//import java.util.concurrent.TimeUnit;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.FacebookLoginAccessPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLoginAccess {
	
	WebDriver driver;
	
	@Given("^user visit facebook homepage$")
	public void user_visit_facebook_homepage() throws Throwable {
		try {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//If anything happen it will wait up to 20 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//we keep it 20 sec//
        //This implicitlyWait give the signal to the next step
        //If my execution done in 2 seconds
        //then it=(implicitlyWait) will provide the signal to the next steps that his execution is done/now execute yours one//
        //because it's a soft wait//
		//We have to use the implicit wait in between browser  and the URL//
		

		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		//Web browser will open the testing page in FullScreen,It will maximize the window//
		//Sometime it can not capture the webElement,if we don't maximize the window//
		//To get all the webElements visible,we have to maximize our window//
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();//How to maximize the window////Here after URL,window size will be maximized 
		//to see all the webElements
		//Thread.sleep(8000);	//No matter what we will wait for that amount of time//	
		
		
		}
		catch(Exception e) {
			
			System.out.println("Browser is not opening");
		}
	}

	@When("^user give email\"([^\"]*)\"$")
	public void user_give_email(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		FacebookLoginAccessPOM objEmail=new FacebookLoginAccessPOM(driver);
		objEmail.email().sendKeys(arg1);
		//For WebElement Synchronization issue we use Explicit Wait.
		//And we use ExplicitWait between the webElements//
		//This is also called WebDriver Wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//We will use this at last line or stage
        //There are different types of wait we use in my code
        //Mostly we use soft wait,In soft wait we have implicitWait and ExplicitWait
        //=================================
        //There is another wait which is hard wait
        //Normally for executing test cases we don't use hard wait,we use soft wait
		//For one step to another step it will upto 20 seconds
		
	}

	@When("^user give password\"([^\"]*)\"$")
	public void user_give_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		FacebookLoginAccessPOM objPass=new FacebookLoginAccessPOM(driver);
		objPass.pass().sendKeys(arg1);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

	}
	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		FacebookLoginAccessPOM objButton=new FacebookLoginAccessPOM(driver);
		objButton.button().click();
		Thread.sleep(5000);//Hard Wait
		//it will wait until the time we give
        //hard wait we use to check our code slowly
        //when we write a script we try to check all steps slowly how it's working
		//No matter what the next step will be execute after 5seconds
		//We can keep the HArd Wait anywhere
		//Hard wait always declared by MiliSeconds
		//Maximum we use Five seconds
		//We will use Hard Wait between the WebElements
		//Normally Automation is super fast,But if we want to see how every steps is working
		//Then we Can use hard wait
	    //food ordering system.
	}

//	@Then("^user should be able to login to facebook$")
//	public void user_should_be_able_to_login_to_facebook() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//	    //throw new PendingException();
//	}
}

//Sometimes it happens beacause of my internet issue, My browser takes time to open
//but machine don't know that,it thinks that is his first steps
//it will try to open amazon.com but it will not find any platform to type amazon.com.
//Beacause My browser Chrome didn't open yet because of some issue,it's still loading
//then it will give failed status/or error status//
//==============================
//Sometimes we will have to give time to my other steps to execute properly//
//Like to my first steps 2 we will negotiate-Execute your step properly,
//take some time,then let me know when you finished 
//finished your execution,then I will start my 3rd execution
//==============================
//So,it's like a Synchronization between the steps//
//we will use some code
//Without Synchronization my execution will work properly//
//but sometime for the internet slowness/slowness of server/
//server issue//many executing their code from the same server
//developer working on server for fixing something
//Because of that,we have to give some time to our steps for execution/
//=======================
//import java.time.Duration;
//
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
//=================================
//Hard wait= Thread.sleep(5000);it will wait until the time we give
//Soft wait= If the execution is done then it will go in next execution





