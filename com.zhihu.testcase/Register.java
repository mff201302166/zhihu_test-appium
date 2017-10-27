package com.zhihu.testcase;

import org.openqa.selenium.WebElement;
import  org.testng.annotations.Test;

import com.zhihu.common.*;

public class Register extends StartAppium  {
	@Test
	public void userRegist(String phoneNum,String password,String username) throws Exception
	{
		try{
			
			WebElement regIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/register_btn", false, 0);
			IconOperate.clickIcon(regIcon);
			WebElement phoneIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/username", false, 0);
			IconOperate.sendKeys(phoneIcon, phoneNum);
			WebElement passwordIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/password", false, 0);
			IconOperate.sendKeys(passwordIcon, password);
			WebElement usernameIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/fullname", false, 0);
			IconOperate.sendKeys(usernameIcon, username);
			WebElement nextStepIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/btn_progress", false, 0);
			IconOperate.clickIcon(nextStepIcon);
			//无法获取短信验证码
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver,"用户注册异常");		
		}
		
	
	}
	

}
