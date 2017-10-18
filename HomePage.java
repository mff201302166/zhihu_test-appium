package com.zhihu.testcase;

import  org.testng.annotations.Test;

import  com.zhihu.common.*;
import  org.openqa.selenium.WebElement;  
//import  java.util.List;
public class HomePage extends BaseDriver {
	    @Test	    
	    public void HomePageTest()throws InterruptedException{
	        //点击话题，进入话题详细页
	    	WebElement titleIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/title",true, 0);
	    	IconOperate.clickIcon(titleIcon);	       	    	
	        WebElement ShareIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_share",false,0);	        
	        IconOperate.ifEquals(ShareIcon);
	      
	        
	        //从话题详情页返回首页
	        WebElement backIcon_1=IconLocate.findIcon("XPATH","//android.view.ViewGroup[@resource-id='com.zhihu.android:id/system_bar']/android.view.ViewGroup/android.widget.ImageButton",false,0);
	        IconOperate.clickIcon(backIcon_1);
	        
	        //从首页进入导航页
	        WebElement naviIcon=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(naviIcon);	        
	        WebElement SetupBtn=IconLocate.findIcon("ANDROIDUIAUTOAMTOR", "text(\"设置\")",false, 0);	        
	        IconOperate.ifEquals(SetupBtn);
	        
	       
	        //从个人主页返回首页
	        Swipe.swipeToLeft(driver,800,1);
	       
	        //点击搜索按钮，进入搜索页面
	        WebElement searchIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_search", false, 0);
	        IconOperate.clickIcon(searchIcon);
	       
	        Thread.sleep(4000);
	        WebElement SearchInputIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/input", false, 0);
	        IconOperate.ifEquals(SearchInputIcon);
	        
	       
	        //从搜索页面返回首页
	        WebElement backIcon_2=IconLocate.findIcon("ID", "com.zhihu.android:id/up", false, 0);
	        IconOperate.clickIcon(backIcon_2);
	       
	        //由首页进入通知中心
	        WebElement informIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_notification", false, 0);
	       IconOperate.clickIcon(informIcon);
	      // WebElement assertIcon_1=IconLocate.findIcon("ANDROIDUIAUTOAMTOR", "text(\"通知中心\")", false, 0);   		
	       //IconOperate.ifEquals(assertIcon_1);
	     
	       
	        //由通知中心返回首页
	        WebElement backIcon_3=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_3);
	       
	        //由首页进入提问题页面
	        WebElement questionIcon=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/fam']/android.widget.ImageView", false, 0);
	        IconOperate.clickIcon(questionIcon);
	        WebElement inputIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/fab_ask", false, 0);
	        IconOperate.clickIcon(inputIcon);	        
	       // WebElement questionInput=IconLocate.findIcon("ID", "com.zhihu.android:id/title", false, 0);        		
	        //IconOperate.ifEquals(questionInput);
	        
	      
	        //由问题页返回首页
	        WebElement backIcon_4=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_4);
	       
	        //由首页进入个人主页
	        WebElement ownPageIcon=IconLocate.findIcon("XPATH", "//android.widget.FrameLayout[@resource-id='com.zhihu.android:id/layout_card_view']/android.widget.RelativeLayout/android.widget.ImageView[@resource-id='com.zhihu.android:id/avatar']", false, 0);
	        IconOperate.clickIcon(ownPageIcon);	      
	       // WebElement nickname=IconLocate.findIcon("ID", "com.zhihu.android:id/extended_name", false, 0);	        		
	        //IconOperate.ifEquals(nickname);
	        
	       
	        //由个人主页返回首页
	        WebElement backIcon_5=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_5);
	      
	        //由首页进入回答详情页
	        WebElement detailPageIcon=IconLocate.findIcon("XPATH", "//android.widget.FrameLayout[@resource-id='com.zhihu.android:id/layout_card_view']/android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.zhihu.android:id/body']", false, 0);
	        IconOperate.clickIcon(detailPageIcon);	        
	       // WebElement noHelp=IconLocate.findIcon("ID", "com.zhihu.android:id/no_help_btn", false, 0);	       
	       // IconOperate.ifEquals(noHelp);
	        
	       
	        //由问题详情页返回首页
	        WebElement backIcon_6=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_6);	        
	        Thread.sleep(2000);  //当前线程休眠2000毫秒
	    } 
	    	    	  
	   
}
