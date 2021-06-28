package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class Payment extends TestBase {
	@FindBy(xpath="//button[@class=\"_2KpZ6l RLM7ES _3AWRsL\"]")
	WebElement deliverhere;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _1seccl _3AWRsL\"]")
	WebElement continuebutton;
	@FindBy(xpath="//*[contains(text(),\"Credit / Debit / ATM Card\")]")
	WebElement creditcardoption;
	@FindBy(xpath="//input[@class=\"_1w3ZZo _2mFmU7\" and @name=\"cardNumber\"]")
	WebElement enterCardNum;
	@FindBy(xpath="//select[@class=\"_2t2oBT _1wEi1H _9IYuSq\"]/option[@value=\"10\"]")
	WebElement month;
	@FindBy(xpath="//select[@class=\"_2t2oBT _1wEi1H\"]/option[@value=\"25\"]")
	WebElement year;
	@FindBy(xpath="//input[@class=\"_1w3ZZo _2mFmU7\" and @name=\"cvv\" ]")
	WebElement cvvInput;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _2nejCf _3AWRsL\"]")
	WebElement payButton;
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	public void proceedPayment() {
		deliverhere.click();
		continuebutton.click();
		creditcardoption.click();
		enterCardNum.sendKeys("");
		month.click();
		year.click();
		cvvInput.sendKeys("");
		payButton.click();
	}

}
