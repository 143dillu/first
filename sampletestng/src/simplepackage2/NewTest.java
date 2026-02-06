package simplepackage2;

import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1)
  public void f() {
	  System.out.println("hii");
  }
  @Test(priority=3)
  public void f1() {
	  System.out.println("hii dillu");

  }
  @Test()
  public void f5() {
	  System.out.println("hii dillu I am back");
}
}
