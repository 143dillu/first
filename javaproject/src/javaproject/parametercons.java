package javaproject;

public class parametercons {
	int age;
	String name;
double salary;
	
	parametercons(int i){
		age=i;
		System.out.println(age);
		
	}
	parametercons(String j,double s){
		name=j;
		salary=s;
		System.out.println(name + salary);
		
		
	}
	void construct() {
		System.out.println(age + name + salary);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parametercons tor=new parametercons(10);
		System.out.println("f");
		parametercons tor1=new parametercons("Dillu",100.0);
		System.out.println("d");
		tor.construct();
		tor1.construct();
		//System.out.println(tor.construct());
		//System.out.println(tor1.construct());
	
		

	}

}
