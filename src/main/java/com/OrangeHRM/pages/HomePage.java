package com.OrangeHRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.base.BaseClass;
import com.OrangeHRM.base.SystemUsersPage;

public class HomePage extends BaseClass {
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement adminTab;

	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public SystemUsersPage clickAdminMenu(){
		
		adminTab.click();
		return new SystemUsersPage();
	}

}
