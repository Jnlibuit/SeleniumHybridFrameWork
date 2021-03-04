package com.abc.applications.sample.reuse;

import org.openqa.selenium.WebDriver;

import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver; 


public class CommonFunctions {

	public WebDriver driver;
	public ActionDriver aDriver;
	
	public CommonFunctions()
	{
		driver = StartBrowser.driver;
		aDriver = new ActionDriver();
	}
	
	public void Signin() throws Exception
	{
		StartBrowser.childTest = StartBrowser.parentTest.createNode( "Signin to Amazon");
		aDriver.navigateToApplication("https://www.amazon.com/");
		aDriver.click(com.abc.applications.sample.objectrepository.HomePage.lnkAccount, "Account Link");
		//aDriver.click(com.abc.applications.sample.objectrepository.AccountPage.btnSignin, "Sigin in button");	
		aDriver.type(com.abc.applications.sample.objectrepository.SigninPage.txtEmaild, "bdsxyz@comcast.net", "Email Id");
		aDriver.click(com.abc.applications.sample.objectrepository.SigninPage.btnContinue, "Continue button");
		
		
		Thread.sleep(1000);
	}
}