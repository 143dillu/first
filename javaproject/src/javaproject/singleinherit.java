package javaproject;

class principal{
	String schoolname;
	void sir() {
		System.out.println(schoolname);
	}
}
class student extends principal{
	int id;
	void study() {
		System.out.println(id  + schoolname);
	}
}

public class singleinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s=new student();
		s.schoolname="ABC";
		s.id=10;
		s.sir();
		s.study();

	}

}
