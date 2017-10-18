package com.zhihu.testcase;

import  org.testng.annotations.Test;

import  com.zhihu.common.*;
import  org.openqa.selenium.WebElement;  
//import  java.util.List;
public class HomePage extends BaseDriver {
	    @Test	    
	    public void HomePageTest()throws InterruptedException{
	        //������⣬���뻰����ϸҳ
	    	WebElement titleIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/title",true, 0);
	    	IconOperate.clickIcon(titleIcon);	       	    	
	        WebElement ShareIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_share",false,0);	        
	        IconOperate.ifEquals(ShareIcon);
	      
	        
	        //�ӻ�������ҳ������ҳ
	        WebElement backIcon_1=IconLocate.findIcon("XPATH","//android.view.ViewGroup[@resource-id='com.zhihu.android:id/system_bar']/android.view.ViewGroup/android.widget.ImageButton",false,0);
	        IconOperate.clickIcon(backIcon_1);
	        
	        //����ҳ���뵼��ҳ
	        WebElement naviIcon=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(naviIcon);	        
	        WebElement SetupBtn=IconLocate.findIcon("ANDROIDUIAUTOAMTOR", "text(\"����\")",false, 0);	        
	        IconOperate.ifEquals(SetupBtn);
	        
	       
	        //�Ӹ�����ҳ������ҳ
	        Swipe.swipeToLeft(driver,800,1);
	       
	        //���������ť����������ҳ��
	        WebElement searchIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_search", false, 0);
	        IconOperate.clickIcon(searchIcon);
	       
	        Thread.sleep(4000);
	        WebElement SearchInputIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/input", false, 0);
	        IconOperate.ifEquals(SearchInputIcon);
	        
	       
	        //������ҳ�淵����ҳ
	        WebElement backIcon_2=IconLocate.findIcon("ID", "com.zhihu.android:id/up", false, 0);
	        IconOperate.clickIcon(backIcon_2);
	       
	        //����ҳ����֪ͨ����
	        WebElement informIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/action_notification", false, 0);
	       IconOperate.clickIcon(informIcon);
	      // WebElement assertIcon_1=IconLocate.findIcon("ANDROIDUIAUTOAMTOR", "text(\"֪ͨ����\")", false, 0);   		
	       //IconOperate.ifEquals(assertIcon_1);
	     
	       
	        //��֪ͨ���ķ�����ҳ
	        WebElement backIcon_3=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_3);
	       
	        //����ҳ����������ҳ��
	        WebElement questionIcon=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/fam']/android.widget.ImageView", false, 0);
	        IconOperate.clickIcon(questionIcon);
	        WebElement inputIcon=IconLocate.findIcon("ID", "com.zhihu.android:id/fab_ask", false, 0);
	        IconOperate.clickIcon(inputIcon);	        
	       // WebElement questionInput=IconLocate.findIcon("ID", "com.zhihu.android:id/title", false, 0);        		
	        //IconOperate.ifEquals(questionInput);
	        
	      
	        //������ҳ������ҳ
	        WebElement backIcon_4=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_4);
	       
	        //����ҳ���������ҳ
	        WebElement ownPageIcon=IconLocate.findIcon("XPATH", "//android.widget.FrameLayout[@resource-id='com.zhihu.android:id/layout_card_view']/android.widget.RelativeLayout/android.widget.ImageView[@resource-id='com.zhihu.android:id/avatar']", false, 0);
	        IconOperate.clickIcon(ownPageIcon);	      
	       // WebElement nickname=IconLocate.findIcon("ID", "com.zhihu.android:id/extended_name", false, 0);	        		
	        //IconOperate.ifEquals(nickname);
	        
	       
	        //�ɸ�����ҳ������ҳ
	        WebElement backIcon_5=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_5);
	      
	        //����ҳ����ش�����ҳ
	        WebElement detailPageIcon=IconLocate.findIcon("XPATH", "//android.widget.FrameLayout[@resource-id='com.zhihu.android:id/layout_card_view']/android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.zhihu.android:id/body']", false, 0);
	        IconOperate.clickIcon(detailPageIcon);	        
	       // WebElement noHelp=IconLocate.findIcon("ID", "com.zhihu.android:id/no_help_btn", false, 0);	       
	       // IconOperate.ifEquals(noHelp);
	        
	       
	        //����������ҳ������ҳ
	        WebElement backIcon_6=IconLocate.findIcon("XPATH", "//android.view.ViewGroup[@resource-id='com.zhihu.android:id/awesome_toolbar']/android.widget.ImageButton", false, 0);
	        IconOperate.clickIcon(backIcon_6);	        
	        Thread.sleep(2000);  //��ǰ�߳�����2000����
	    } 
	    	    	  
	   
}
