package com.qa.autopractice.pages;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.qa.autopractice.base.TestBase;

public class autopracticehomepage extends TestBase {
	
	public autopracticehomepage () throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
      @FindBy(xpath="//*[contains(@class,'replace-2x img-responsive')]")
      WebElement popular_img;
      @FindBy(xpath="//a[@title='Add to cart']")
      WebElement addtocartele;
      @FindBy(xpath="//*[contains(@class,'layer_cart_product col-xs-12 col-md-6')]")
      WebElement chwinsuc_msg;
      @FindBy(xpath="//*[@title='Continue shopping']")
      WebElement continueshoppingbut;

public void pageactions() {
	//create an object for Actions class
	Actions act=new Actions(driver);
	//mouse over on that element
	act.moveToElement(popular_img).perform();
	addtocartele.click();	
	
}

public static void mouseoverpwintochwin() throws InterruptedException {
	//4.transfer control to popup that appears
	//fetching parent windowID
	String pwinid=driver.getWindowHandle();
	//fetch all the window ids or child window ids
	Set<String>chwinid=driver.getWindowHandles();
	for(String allwinids:chwinid) {
		if(!allwinids.equals(pwinid)) {
			//switch to the child window id
			driver.switchTo().window(allwinids);
			Thread.sleep(3000);
				
									
		}
	}
}
public void chwinactions() {
	wait.until(ExpectedConditions.visibilityOf(chwinsuc_msg));
	continueshoppingbut.click();
	}
}