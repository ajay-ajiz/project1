package com.flipkart.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.Payment;
import com.flipkart.qa.pages.SearchItems;

public class SearchItemsTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	SearchItems search;
	Payment payment;
	public SearchItemsTest() {
		super();
	}
	
	@BeforeMethod
	public void  setUp() throws Exception {
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		search=homepage.search(prop.getProperty("item"));
		
	}
	@Test(priority=1)
	public void order() {
		payment=search.orderIt();
	}
	@Test(priority=0)
		public void validatePrice() {
			String s=search.validatePrice();
			Assert.assertEquals("20000", s);
		
	}
	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
