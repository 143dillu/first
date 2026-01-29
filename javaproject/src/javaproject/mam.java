package javaproject;

public class mam extends parent{
	void sir() {
		super.sir();   //super class is open first
		System.out.println("i m child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mam obj = new mam();
		obj.sir();

	}

}
