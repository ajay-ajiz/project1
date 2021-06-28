package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.flipkart.qa.base.TestBase;

public class Payment extends TestBase {
	WebDriverWait wait2;
	Actions a;
	@FindBy(xpath="//button[@class=\"_2KpZ6l RLM7ES _3AWRsL\"]")
	WebElement deliverhere;
	@FindBy(xpath="//button[@class=\"_2KpZ6l _1seccl _3AWRsL\"]")
	WebElement continuebutton;
	@FindBy(xpath="//input[@class=\"_3DAmyP\" and @id=\"CREDIT\"]")
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
	@FindBy(xpath="")
	WebElement receiver;
	
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	public void proceedPayment() throws Exception {
		deliverhere.click();
		continuebutton.click();
		Thread.sleep(300);
		
		a = new Actions(driver);
		//scroll down a page
		a.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		wait2= new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class=\"_3DAmyP\" and @id=\"CREDIT\"] and @type=\"radio\"")));
		
		a.moveToElement(creditcardoption);
		a.build().perform();

		creditcardoption.click();
		
		month.click();
		year.click();
		enterCardNum.sendKeys("");
		cvvInput.sendKeys("");
		payButton.click();
	}

}
