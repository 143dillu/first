package sampletestngpackage;

import org.testng.annotations.Test;

public class basictestng {

	
	@Test
	public void pkg1() {
		
		System.out.println("hello");
	}
	@Test
	public void pkg2() {
		System.out.println("baby");
	}
}
class come extends basictestng{
	@Test
	public void pkg3() {
		System.out.println("i");
		
	}
}
