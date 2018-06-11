package com.acttime.usertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.acttime.genericlib.BaseClass;
import com.acttime.objectrepositorylib.Home;

public class UserTest extends BaseClass{
	
	@Test
	public void createUserTest() {
		
		System.out.println("create Customet");
	}
	
	@Test
	public void modifyUserTest() {
		System.out.println("modify Customet");
	}
	
	@Test
	public void searchUserTest() {
		System.out.println("search Customet");
	}

}
