package com.zhihu.testcase;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.zhihu.common.IconLocate;
import com.zhihu.common.IconOperate;
import com.zhihu.common.StartAppium;

import org.testng.annotations.Parameters;

public class Login extends StartAppium{
	@Parameters({"username","password"})
    @Test
  public void login(String username,String password) throws InterruptedException {
	  WebElement loginIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/login_btn", false, 0);
	  IconOperate.clickIcon(loginIcon);
	  WebElement inputUserIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/username", false, 0);
	  IconOperate.sendKeys(inputUserIcon, username);    
	  WebElement inputPassword=IconLocate.findIcon("ID", "com.zhihu.android:id/password", false, 0);
	  IconOperate.sendKeys(inputPassword, password);
      WebElement NxtBtn=IconLocate.findIcon("ID", "com.zhihu.android:id/btn_progress", false, 0);   		
      Assert.assertEquals(NxtBtn.isEnabled(), true); 
      IconOperate.clickIcon(NxtBtn);
      Thread.sleep(5000);
  }
}
