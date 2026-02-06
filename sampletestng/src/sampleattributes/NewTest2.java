package sampleattributes;

import org.testng.annotations.Test;
//import org.testng.annotations.DataProvider;

public class NewTest2 {  //enabled and description and timeOut are the attributes of testNG
  //@Test(enabled=false)
  //public void f() {
	  //System.out.println("I am the boy");
  //}
  @Test(description="I am happy")
 public void f1() {
	  System.out.println("I am not happy");
  }
  
 @Test(timeOut=200)
 public void f3() throws InterruptedException{
	 Thread.sleep(201);
	 System.out.println("Thanks");
 }
 
 @Test
 public void f4()
 {
	 System.out.println("I am back");
 }
  
  
  }

