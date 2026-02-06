package simplepackage2;

import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;


public class sampleprogr {
	@Test(groups= "Dillu")
	  public void f() {
		  System.out.println("I am first");
	  }
	  @Test(groups= {"Dillu"})
	  public void f1() {
		  System.out.println("I am second");
	    
	  }
	  @Test(groups= {"sai"})
	  public void f5() {
		  System.out.println("the second method");
	  }
	  
	  @BeforeGroups(groups= {"Dillu","sai"})
	  public void f2() {
		  System.out.println("I am printing first");
	  }
	  @AfterGroups(groups= {"Dillu","sai"})
	  public void f3() {
		  System.out.println("I am printig second");
	  
	  }
	}
