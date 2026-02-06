package samplelistener;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//import com.beust.jcommander.Parameter;

public class sampleparameter {
  @Test
  @Parameters("Name")
  public void f(String Name) 
  {
	  System.out.println("hii"+Name);
  }
}
