package org.cucus;


import org.helper.BaseClass;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinitionFile extends BaseClass {
	  
			
	@Given("User is in facebook login page")
	public void user_is_in_facebook_login_page() {
		
		launchbrower();	
		loadUrl("https://www.facebook.com/");
		maxWindow(); 

	}

	@When("User enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
		LoginPojo l = new LoginPojo();
		toText(l.getTxtEmail(),"david" );
		toText(l.getTxtPass(), "hjkadhfa");
		
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

	@Then("User should be in a invalid credintial page")
	public void user_should_be_in_a_invalid_credintial_page() {
		
		String Url = driver.getCurrentUrl();

	}

}
