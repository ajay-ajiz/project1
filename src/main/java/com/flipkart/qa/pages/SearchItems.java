package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class SearchItems extends TestBase{

	@FindBy(className="_30jeq3 _16Jk6d")
	WebElement actualprice;
	@FindBy (xpath="//button[@class=\"_2KpZ6l _2U9uOA ihZ75k _3AWRsL\"]")
	WebElement orderit;
	
	public SearchItems() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePrice() {
		String s= actualprice.getText();
		return s.substring(1);
	}
	
	public Payment orderIt() {
		orderit.click();
		return new Payment();
	}
	
	

}
