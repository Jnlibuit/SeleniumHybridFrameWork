package com.abc.applications.sample.objectrepository;

import org.openqa.selenium.By;

public class SigninPage {
	public static By txtEmaild = By.xpath("//input[@id='ap_email']");
	public static By btnContinue = By.xpath("//input[@id='continue']");
	public static By msgproblem = By.xpath("//h4[contains(text(),'There was a problem')]");
	

}
