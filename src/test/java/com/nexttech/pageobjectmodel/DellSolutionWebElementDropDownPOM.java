package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellSolutionWebElementDropDownPOM {
	
	WebDriver driver;
	
	public DellSolutionWebElementDropDownPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
	WebElement act_solution;
	public WebElement solution() {
		return act_solution; 
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/a")
	WebElement act_industrySolution;
	public WebElement industry() {
		return act_industrySolution;
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/ul/li[10]/a")
	WebElement click_retail;
	public WebElement retail() {
		return click_retail;
	}
	

}

//We can use select method in dropdown menu too
//
