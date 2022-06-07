package com.nexttech.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomePage {

    WebDriver driver;

    @Given("^User Visits Facebook Homepage$") // We will import > import cucumber.api.java.en.Given;
    public void user_Visits_Facebook_Homepage() throws Throwable 
    {
         //Write code here that turns the phrase above into concrete actions
        //throw new PendingException(); //We Are Going Handle Exception In Our Way,tai Ata comment out kora hoeche//

        //This is for how to open browser//Here first one is key, and second one is value//In Selenium it convert it into double Slash
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");//This is my Chrome Driver Path//
        driver= new ChromeDriver();  //it will check the path of chrome driver,
        							//If the path is is correct then it will open the browser//
        						   //To remove that error we will add WebDriver driver;//
                                  //Then we have to Import WebDriver//And ChromeDriver Also//
        
         //To open the url we will use the Key Word System.setProperty
        //And there will be a parenthesis, in that we will give our KEY and VALUE,
       //In KEY we give = "webdriver.chrome.driver", And in value we give path of the driver,
      // where my driver is located
       
        
        //This is for open URL
        driver.get("https://google.com");	//we have to mention the url in double qoutation,because it's a string value//
        								   //to open the url using get keyword//
        								  //in the brackets we will give the url//
        
        
    //After validating Given --It will check what is written in the second step--which is--Then----User Should see facebook
   //It will match this line with the feature file---Then Line--User Should see Facebook
  //If both line match then the step will be executed
        
    }
    @Then("^User Should see Facebook Newsfeed$") //We Will Import > import cucumber.api.java.en.Then;
    			//user_Should_see, This is my method Name//
    public void user_Should_see_Facebook_Newsfeed() throws Throwable {
         //Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }
}
//At first we will have to crate an object of action
//we will declare action declare with variable
//======================
//For closing the window
//driver.quit();
//driver.close();
