package javaproject;

public class allvariables {
	
	int age ;  //instance variable
	static String name = "Dillu"; // static variable
	
	void local() {
		int number = 9701; //Local variable
		System.out.println(number);
	}
	void instant(){
		System.out.println(age);
	}
	void state() {
		System.out.println(name);
	}

	
	
	public static void main(String args[] ){
		allvariables dev = new allvariables();
		dev.local();
		dev.instant();
		dev.state();
		
		
		
	}

}
