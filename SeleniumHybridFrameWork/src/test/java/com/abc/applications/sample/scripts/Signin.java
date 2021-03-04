package com.abc.applications.sample.scripts;

import org.testng.annotations.Test;

import com.abc.applications.sample.reuse.CommonFunctions;
import com.abc.config.StartBrowser;
import com.abc.wdcmds.ActionDriver;

public class Signin extends StartBrowser {
  @Test
  public void testSigin () throws Exception 
  {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.Signin();
	  

	  
	  
  }
}
