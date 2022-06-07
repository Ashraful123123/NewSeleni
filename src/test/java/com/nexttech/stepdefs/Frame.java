package com.nexttech.stepdefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	   
	
		public void frame() throws Exception {
			
			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
			Thread.sleep(3000);

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		    
		    driver.get("https://www.dell.com/en-us");
		    
		    driver.manage().window().maximize();
		}
		
	

}
