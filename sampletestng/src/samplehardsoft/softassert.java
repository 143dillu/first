package samplehardsoft;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
  @Test
  public void f() {
	  SoftAssert obj = new SoftAssert();
	  obj.assertEquals("Dillu", "Sai");
	  obj.assertTrue(100<3,"I am failing");
	  obj.fail("I am loading");
	  
	  obj.assertAll();
	  
  }
}
