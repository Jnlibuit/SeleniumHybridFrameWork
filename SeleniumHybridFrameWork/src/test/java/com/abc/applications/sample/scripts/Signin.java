package com.abc.applications.sample.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.applications.sample.reuse.CommonFunctions;
import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;

public class Signin extends StartBrowser {
  @Test
  public void testSigin () throws Exception 
  {
	  CommonFunctions cfs = new CommonFunctions();
	  
	  cfs.NavigateToHomePage("https://www.amazon.com/");
	  
	  cfs.Signin();
	  
	  String textProblem=ActionDriver.getText(com.abc.applications.sample.objectrepository.SigninPage.msgproblem);
	  Assert.assertEquals(textProblem, "There was a problem");
	  
	  StartBrowser.childTest.pass("Verification done successfully on an invalid email id");
	  
	  
  }
  
  
 
}
