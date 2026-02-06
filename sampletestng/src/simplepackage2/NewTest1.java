package simplepackage2;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest1{
  @Test
  public void f() {
	  System.out.println("testing 1");
  }
  @Test
  public void f1() {
	  System.out.println("testing 2");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");
  }

  @AfterSuite
  public void aftersuite() {
	  System.out.println("aftersuite");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("aftertest");
  }

}
