package simplepackage2;

//import java.io.InterruptedIOException;

import org.testng.annotations.Test;

public class sampledependency {
  @Test
  public void f() {
	  System.out.println("Dillu");
  }
  @Test(timeOut=200)
  public void f1() throws InterruptedException{
	  Thread.sleep(199);
	  System.out.println("hi Dillu");
  }
  @Test(dependsOnMethods="f")
  public void f5() {
	  System.out.println("I am Dillu");
  }
  
}
