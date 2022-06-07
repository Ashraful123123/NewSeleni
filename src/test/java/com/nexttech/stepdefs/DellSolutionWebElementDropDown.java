package com.nexttech.stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.DellSolutionWebElementDropDownPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellSolutionWebElementDropDown {

	WebDriver driver;
	
	@Given("^user visit dell homepage$")
	public void user_visit_dell_homepage() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	    
	    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    
	    driver.manage().window().maximize();
	}

	@When("^user go to Solution dropdown menu and able to see view all solution$")
	public void user_go_to_Solution_dropdown_menu_and_able_to_see_view_all_solution() throws Throwable {
//		Here we use Action class  for mouse hovering.we used Action class for mouse hover purpose
//		We created an object of Action class
//		we are moving from one window to another window by using Action
//		For RIght click,Double CLick,Mouse hover,dropdown menu for this three we use ACTION Class
//				I am trying to pass actions class,who is my driver,there is my driver
		//you are trying to access mouse hover now who is your driver
		Actions act = new Actions(driver);//At first we will have to crate an object of Action class
									//Because we want to hover or we want to go into the sub menus
		DellSolutionWebElementDropDownPOM obj = new DellSolutionWebElementDropDownPOM(driver);
		
		act.moveToElement(obj.solution()).build().perform();//this moveToElement of solution will move our pointer
		act.moveToElement(obj.industry()).build().perform(); // from menu to sub menu
		       //moveToElement of solution means Hover on solution object and open all the sub menus
		      //Here the pointer will move again in Industry option and then it will click on retail option
		     //And then click on ALL Solution object
		
		
	}

	@When("^use click on retail$")
	public void use_click_on_retail() throws Throwable{
		DellSolutionWebElementDropDownPOM secondObj = new DellSolutionWebElementDropDownPOM(driver);
			
		secondObj.retail().click();
		
	}
	@Then("^user should redirect to Solution portfolio$")
	public void user_should_redirect_to_Solution_portfolio() throws Throwable {
	    //driver.quit();
		Thread.sleep(3000);
	}
	
}

//==========================ACTIONS CLASS===========================================

//If there is no clicking option,and if we can hover on the WebElement we will use ACTION
//Every dropdown is a separate window
//But In Automation How We are going to move from one window to another window
//By using ACTION Class we can move our pointer from one window to another window
//=======================
//To move the curser or pointer in menu under sub menu or to mouse hover we have to use Action Class
//After using the action it will move to the Object of Menu
//After coming into the sub menu using ACTION it can access all the object of sub menu
//========================
//We have to create an object of that Action Class

//===========================Select Keyword======================================
//For select option,or dropdown option i don't have to give the testdata
//I don't need to give the testdata for select/DropDown Option//

//If Any dropdown start with select we can not use action
//we can inspect the webElement to see what is used
//If we see select then we have to use Select
//And we can capture webElement using
//selectByIndex,selectByValue,selectByVisibleText,we can capture the values by this

//============================CAPTCHA VALIDATION=================================
//In QA environment there is no CAPTCHA to validate,We never Automate this CAPTCHA
//We see CAPTCHA only in Production Environment
//Developer hide the code of Captcha in QA Environment
//Because We can not Automate Captcha,Because they just move and changed frequently,it's changeable,changing
//This WebElement are changeable and changing frequently and not stable
//There are some restriction in automation in selenium part,captcha is one example

//===The Answer is In Production environment we validate that manually,it's a security issue===//





