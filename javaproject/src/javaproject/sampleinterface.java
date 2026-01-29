package javaproject;

interface face{
	void show();
	default void print() {
		System.out.println("hi rajasekhar");
	}
	static void show1() {
		System.out.println("i am your friend");
	}
}

public class sampleinterface implements face{
	public void show() {
		System.out.println("I am your fan");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sampleinterface obj = new sampleinterface();
        obj.print();
        obj.show();
        face.show1();
	}

}
