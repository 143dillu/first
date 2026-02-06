package samplelistener;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sampledataprovider {
	@DataProvider(name="Method")
	public Object[][] Method(){
		return new Object[][] { {"1.sandeep"},{"2.swapna"},{"3.sanhi"}};	
	}
  @Test(dataProvider = "Method")
  public void testMethod(String o) {
	  System.out.println(o);
  }
}
 