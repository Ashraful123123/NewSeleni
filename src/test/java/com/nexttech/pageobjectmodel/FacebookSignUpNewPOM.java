package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookSignUpNewPOM {
	WebDriver driver;
	
	public FacebookSignUpNewPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]")
	WebElement click_createNewAccount;
	public WebElement newAccount() {
		return click_createNewAccount;
	}
	@FindBy(name="firstname")
	WebElement edit_firstname;
	public WebElement firstname() {
		return edit_firstname;
	}
	@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement lastname() {
		return edit_lastname;
	}
	@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement email() {
		return edit_email;
	}
	@FindBy(name="reg_email_confirmation__")
	WebElement edit_emailFinal;
	public WebElement emailFinal() {
		return edit_emailFinal;
	}
	@FindBy(name="reg_passwd__")
	WebElement edit_password;
	public WebElement password() {
		return edit_password;
	}
	
	@FindBy(id="day")
	public WebElement click_month;
	
	@FindBy(id="month")
	public WebElement click_day;
	
	@FindBy(id="year")
	public WebElement click_year;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")
	WebElement click_male;
	public WebElement male() {
		return click_male;
	}
	
	@FindBy(name = "websubmit")
	WebElement click_submit;
	public WebElement submit() {
		return click_submit;
	}

}
