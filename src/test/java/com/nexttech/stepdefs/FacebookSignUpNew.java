package com.nexttech.stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.FacebookSignUpNewPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignUpNew {

	WebDriver driver;
	@Given("^user visits facebook home$")
	public void user_visits_facebook_home() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver =new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	@When("^user click on Create New Account$")
	public void user_click_on_Create_New_Account() throws Throwable {
		FacebookSignUpNewPOM click = new FacebookSignUpNewPOM(driver);
		click.newAccount().click();
		Thread.sleep(3000);

	  
	}

	@When("^user gives first name\"([^\"]*)\"and last name\"([^\"]*)\"and valid email address\"([^\"]*)\" and reType email address\"([^\"]*)\" and new password\"([^\"]*)\"$")
	public void user_gives_first_name_and_last_name_and_valid_email_address_and_reType_email_address_and_new_password(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		FacebookSignUpNewPOM editAble = new FacebookSignUpNewPOM(driver);
		
		editAble.firstname().sendKeys(arg1);
		Thread.sleep(1000);

		editAble.lastname().sendKeys(arg2);
		Thread.sleep(1000);

		editAble.email().sendKeys(arg3);
		Thread.sleep(1000);

		editAble.emailFinal().sendKeys(arg4);
		Thread.sleep(1000);

		editAble.password().sendKeys(arg5);
		Thread.sleep(3000);

	}

	@Then("^user should selects dropdown moth month and dropdown day and dropdown year$")
	public void user_should_selects_dropdown_moth_month_and_dropdown_day_and_dropdown_year() throws Throwable {
	    //this is the regular object i created of FacebookSignUpNewPOM this class
		FacebookSignUpNewPOM drop = new FacebookSignUpNewPOM(driver);
													  //I have to get the method click_day from my POM//
		Select dropDown = new Select(drop.click_day);//here I have to mention what I have to select//
													//here I will select from dropdown day//
		dropDown.selectByIndex(5);
		Thread.sleep(1000);			//What is the the element that you want to select drop.click_day

		
		Select dropDownOne=new Select(drop.click_month);//Select Class is coming from Selenium
		dropDownOne.selectByValue("6");			//So,java is telling who is it,so,now I will
		Thread.sleep(1000);					//tell him it is coming from Selenium library
										//Then I have to import it
		
		Select dropDownTwo = new Select(drop.click_year);
		dropDownTwo.selectByVisibleText("2002");
		Thread.sleep(1000);

		
		
	}
	@Then("^user click on male$")
	public void user_click_on_male() throws Throwable {
		FacebookSignUpNewPOM male = new FacebookSignUpNewPOM(driver);
		male.male().click();
		Thread.sleep(1000);

	}

	@Then("^user click on signup button$")
	public void user_click_on_signup_button() throws Throwable {
		FacebookSignUpNewPOM buttons = new FacebookSignUpNewPOM(driver);
		buttons.submit().click();
		Thread.sleep(1000);

		
	}
	
	
}


//======================
//We use Cucumber Annotation for tagging purpose so that we execute specific test cases,test scenario
//By giving tag to test cases we can execute multiple test cases together.
//Every Scenario will have annotation,BUT ANNOTION NAME MUST BE UNIQUE FOR EVERY TEST CASES
//======================
//In TestNGTestRunner class we use tags keyword
//Then we mention the cucumber annotation
//======================

//=====================
//In Gherkin format each step is one method.
//When we execute every step convert into into a method.
//In BDD product owner can go to the feature file and can understand 
//what are the features we are working on,because all the features are written in Plain text
//Anyone can understand but in TDD we don't have any feature file,Product owner
//or anyone can not understand what we are working on.
//In BDD SteDefs is the parent for keeping all the code
//StepDefs code should be safe
//If I can read the steps only then I can tell which feature they are working on
//Because of all that BDD is better than TDD
//Here we have dependencies for BDD Cucumber
//We have plugin for BDD Cucumber
//In TestNG we have BDD Cucumber intregation
//Currently we are working with cucumber Annotation

//===================
//In TDD framework we don't have feature file,but in BDD we can see all the feature we are working on.
//TDD it have no POM,no Feature file,it have only StepDefs.

//in TDD we write everything inside the same class,ex:path of the WebElement
//TDD is not user friendly only the technical person can understand that

//How we are going to priorotize All of our method in TDD????????????????????????????
//By giving priority,
//public void signin(Priority==1){}

//public void signUp(Priority==2){}

//public void logIn(Priority==3){}
//In every method it have TestNG Annotation

//How to write code in TDD framework??????????????
//Ans:I am going create a method first
//Then inside the method of Stepdefs package
//I will write all the steps inside the curly Braces
//We don't any feature file like BDD cucumber

//They will ask about TestNG Annotation?????????????????????
//


