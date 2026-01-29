package javaproject;
interface cash{
	int operation(int a,int b);
}

public class samplelambda {
	public int raju(int a,int b,cash du) {
		return du.operation(a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplelambda ob = new samplelambda();
		cash addition=(a,b)->a+b;
		cash sub=(a,b)->a-b;
		System.out.println("40 +2 ="+ "is" + ob.raju(40,2,addition) );
		System.out.println("20+5 ="+ "is" + ob.raju(20, 5, sub));
		
		

	}

}
