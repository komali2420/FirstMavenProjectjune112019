package com.qa.autopractice.util;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.qa.autopractice.base.TestBase;

public class TestUtil extends TestBase{
	public TestUtil() throws IOException {
		super();
		
	}
public static  final long IMPLICIT_WAIT=30;
public static final long EXPLICIT_WAIT=30;

public static void scrollDownPage() throws InterruptedException {
	//scroll down until that element visible
	//create a variable for JavascriptExecutor and assign webdriver variable.
	JavascriptExecutor jsx=(JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,2000)"," ");
	Thread.sleep(3000);
	WebElement img=driver.findElement(By.xpath("//*[contains(@class,'replace-2x img-responsive')]"));
	jsx.executeScript("arguments[0].scrollIntoView(true);",img);
	Thread.sleep(3000);
	}
public static void scrolluppage() throws InterruptedException {
	String pwinid=driver.getWindowHandle();
	driver.switchTo().window(pwinid);
	JavascriptExecutor jsx=(JavascriptExecutor)driver;
	jsx.executeScript("window.scrollBy(0,-2000)"," ");
	Thread.sleep(3000);
	driver.close();	
}

}
