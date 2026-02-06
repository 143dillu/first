package samplehardsoft;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert{
  @Test
  public void f() {
	  String ActualOutput = "ABC";
	 String ExpectedOutput ="XYZ";
	  
	  Assert.assertEquals(ActualOutput,ExpectedOutput);
	  Assert.assertTrue(5<3,"failed message");
	  Assert.fail("I am failing again");
	  
	  System.out.println("I am there");
	  Assert.fail("I am failing");
	  System.out.println("I am not running");
  }
}
