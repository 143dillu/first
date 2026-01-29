package javaproject;

abstract class master{
	abstract void show();
}
class child1 extends master{
	void show() {
		System.out.println("I am the child");
	}
}
	class child2 extends master{
		void show() {
			System.out.println("I am highest");
		}
	}
	


public class sampleabstarct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 obj = new child1();
		obj.show();
		child2 obj1 = new child2();
		obj1.show();

	}

}
