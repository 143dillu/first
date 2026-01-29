package javaproject;

import java.util.Scanner;

class secondchild extends secondinherit{
	int age,sec;
	public int show() {
		return age+sec;
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		secondchild fir =new secondchild();
		fir.age=10;
		fir.sec=20;
		fir.show();
		fir.mem();
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number");
		fir.i=sc.nextInt();
		System.out.println("give another number");
		fir.j=sc.nextInt();
		System.out.println(fir.i+fir.j);
		sc.close();
		
		
	}

}
