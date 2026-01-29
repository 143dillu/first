package javaproject;

public class samplethis {
	int age=20;
	String name="Dillu";
	
	samplethis(){
		
	}             //here we are using the this keyword concept
	
	samplethis(int age,String name) {
		this.age=age;
		this.name=name;
	}
	void print() {
		System.out.println(age + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplethis obj1 =new samplethis();
		obj1.print();
		
		samplethis obj=new samplethis(9,"sai");
		obj.print();
		

	}

}
