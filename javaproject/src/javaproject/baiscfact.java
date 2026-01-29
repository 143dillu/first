package javaproject;

public class baiscfact{
	public int factor(int n1) {
	//final int n1=5;
		if(n1<=1)
		{
		  return 1;
		}
		return n1*factor(n1-1);  //recursion >>>>The method calls itself
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1=5;
	baiscfact num = new baiscfact ();
		
		System.out.println("The factorial is " + num.factor(n1));

	}

}
