package sampleattributes;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptest {
	boolean flag =true;
  @Test
  public void f() {
	  if(flag) {
		  throw new SkipException("This mehod is not  running");
		  //System.out.println("hello");
	  }
	  System.out.println("hello");
  }
}
