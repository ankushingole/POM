package com.OrangeHRM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRM.pages.LoginPage;

public class BaseClass {

	public static WebDriver driver = null;
	public LoginPage loginPage;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		loginPage = new LoginPage();
	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

}
