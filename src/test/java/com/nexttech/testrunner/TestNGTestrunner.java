package com.nexttech.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {
	//This class introducing  the Feature Folder With the Package stepdefs//
	//Because of that we can match the steps and we can execute//
	//we keep @CucumberOption under the TestNGTestrunner Class or in TestRunner Class//	
	//Why what and Where you keep cucumber Annotation option//
	
    @CucumberOptions(				//Here we have feature and glue KeyWord//
    		
            features = {"Features"},  //In Features KeyWord > We Declared Features Folder	
            						 //And We Glue Our Feature Folder With The stepdefs Package//
            						//Here We made A relation Between Features Folders And stepedefs Package 
            					   //By Using A keyWord glue// 
            					  //Feature Folder should glue up with the stepdefs Package//
            
            glue = {"com.nexttech.stepdefs"}
          // tags= {"@select3","@action"}    //In TestNGTestRunner class we use tags keyword
            								//Then we mention the cucumber annotation
            					           //If I want to execute 5 test cases I will mention all the 
            						      //Cucumber Annotation here,then it will only execute
                                         //those 5 test cases
    		
    		)
    
    
    public  class  TestRunner extends AbstractTestNGCucumberTests {
    }
}

//we use tags keyword inside tesngtestrunner class
//And inside @cucumberoptions we use the keyword tags
//And for every test cases we have cucumberAnnotation in our feature file
//so, if I want to execute 10 cases out of 100,then
//then we just mention the CucumberAnnotation inside the tags
//So, only those feature will be executed which CucumberAnnotation I mentioned in tags keyword.

//==================================SQL QUERY==================================
//Table name,Table,Attribute=Column,Row,values,data

//=======================================================
//Query means we want to search something.
//Sometimes We will only have the access to query
//In QA Environment we can only update and query for the Specific data
//For 99 percent we use select
//For few cases we update
//We search for the specific data
//==============
//First Table have All the attribute and data
//the column name is the Attribute
//And all the values under the attribute is my data
//There are two things column and row
//==============
//Column is always fixed 
//but row is not fixed
//Everytime we add data row is increased automatically
//so we can not say exactly how many row is there, row can increased anytime
//When we add any data it going to save in the bottom
//means one row will be addded when we add any value

//===============To Choose Column Name============
//===========================
//SELECT Keyword===Always a query start with SELECT keyword
//By using the SELECT keyword we select only those column where the data I want to know those are stored
//If I don't know how any column are in the table,or in which column my data are in
//Or if I all the of all the column the SELECT*
//COLUMN NAME are Case Sensetive so have to write exactly same
//======================

//=========To choose Table Name=============
//FROM Keyword====After using From We give the TABLE_NAME
//FROM Keyword====In which table my data are stored
//





