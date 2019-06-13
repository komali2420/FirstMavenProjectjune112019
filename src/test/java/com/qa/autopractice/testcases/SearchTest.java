package com.qa.autopractice.testcases;

import org.testng.annotations.Test;

import com.qa.autopractice.base.TestBase;
import com.qa.autopractice.pages.autopracticehomepage;
import com.qa.autopractice.util.TestUtil;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class SearchTest extends TestBase {
	autopracticehomepage aphp=null;
	
	
  public SearchTest() throws IOException {
	  super();
		
	}
@Test
  public void p() {
  }
  @BeforeClass
  public void beforeClass() throws IOException, InterruptedException {
	  initWebdriver();
	  aphp=new autopracticehomepage();
	  TestUtil.scrollDownPage();
	  aphp.pageactions();
	  autopracticehomepage.mouseoverpwintochwin();	  
	  aphp.chwinactions();
	  
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  TestUtil.scrolluppage();
  }

}
