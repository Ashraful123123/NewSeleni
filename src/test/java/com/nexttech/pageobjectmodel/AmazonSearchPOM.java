package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSearchPOM {
	
	WebDriver driver;
	
	public AmazonSearchPOM(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);			
	}
	//@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	
	@FindBy(name="field-keywords")//Here I am not using xpath KeyWord,I am using NAME keyword here//
	WebElement edit_searchBox;
	public WebElement editSearchBox() {
		return edit_searchBox;
	}
	@FindBy(id="nav-search-submit-button")//here I am using id keyword//If I have any ID,or NAME in
	WebElement click_searchButton;		//the line I will take that//
	public WebElement searchButton() {	//If don't find any unique xpath than i will take the xpath default//
		return click_searchButton;
	}
		
}

