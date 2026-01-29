package javaproject;

public class sampleload {
	
	void area(int a, int b) {
		System.out.println(a+b);
	}
	
	void area(int a,String name) {
		System.out.println(a  + name);
	}
	
	void area(String raj,String dil) {
		System.out.println(raj + dil);
	}

	public static void main(String[] args) {
		sampleload load = new sampleload();
		load.area(23, 56);
		load.area(45, "dillu");
		load.area("call", "main");
				
				
		// TODO Auto-generated method stub

	}

}
