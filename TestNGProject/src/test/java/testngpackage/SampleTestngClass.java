package testngpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestngClass {
  @Test
  
  public void f() {
	
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Check webhooks");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeSuite
 
  public void beforeSuite() {
	 
  }

  @AfterSuite
  public void afterSuite() {
  }

}
