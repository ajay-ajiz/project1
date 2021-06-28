package com.flipkart.qa.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.LoginPage;
import com.flipkart.qa.pages.Payment;
import com.flipkart.qa.pages.SearchItems;

public class PaymentTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	SearchItems searchitems;
	Payment payment;
	public PaymentTest() {
		super();
	}
	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginpage=new LoginPage();
		homepage=new HomePage();
		searchitems=new SearchItems();
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		searchitems=homepage.search(prop.getProperty("item"));
		payment=searchitems.orderIt();
		
	}
	@Test
	public void proceedpayment() {
		payment.proceedPayment();
	}
	@AfterMethod
	public void terminate() {
		//driver.quit();
	}
}
