package com.nexttech.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class Drop_down {
	//Here driver is an object of WebDriver;
	WebDriver driver= new ChromeDriver();
	
//Datatype  Variablename= value;
	//WebElement is an interface which is returning the webelement
	WebElement dropDown = driver.findElement(By.id("gh-cat"));
	//Here WebElement is the datatype a,dropdown is variable name
	
	//We can not use the dropdown if we don't use the select class
	//Select is nothing but a class given by selenium,for selcting a dropdown
	//we can not use dropdown if we don't use SELECT
	       //====================//
	Select obj = new Select(dropDown); //Select class is looking for,hey you are trying to select a dropDown
								   //What is your location name,who is holding your location===dropDown
	//obj.selectByValue();							   //Name of the variable where I have stored the WebElement location

			//ACTIONS CLASS///
	Actions act = new Actions(driver);
//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span"))).build().perform();
	
	
	
//	driver.switchTo().frame("classFrame");/
//	driver.findElement(By.linkText("Deprecated")).click();
//	driver.findElement(By.name("proceed")).click();
//	Thread.sleep(3000);
//
	
	///it will click on login and
	//it will accept the pop-up then in username it will write wahatewver i write in sendkeys
//	driver.switchTo().alert().accept();
//	Thread.sleep(3000);
//	driver.findElement(By.name("login")).clear();//clear if there is anything written in login field
//	driver.findElement(By.name("login")).sendKeys("aaaaaaaaaa");
//	Thread.sleep(3000);
}
