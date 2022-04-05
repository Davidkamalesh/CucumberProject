package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass{
	

	public LoginPojo() {
		PageFactory.initElements(driver, this);
		
	}	
		@CacheLookup
		@FindBys({
			@FindBy(xpath="//input[@id='email']"),
			@FindBy(xpath="//input[@name='email']")
			
		})
		private WebElement txtEmail;
		
		@CacheLookup
		@FindAll({
			@FindBy(xpath="//input[@id='passs']"),
			@FindBy(xpath="//input[@name='pass']")
			
		})
		private WebElement txtPass;
		
		@CacheLookup
		@FindBy(name="login")
		private WebElement btnLogin;

		public WebElement getTxtEmail() {
			return txtEmail;
		}
		
		public WebElement getTxtPass() {
			return txtPass;
		}

		public WebElement getTxtLogin() {
			return btnLogin;
		}
		
	}

