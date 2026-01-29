package javaproject;
import java.util.Scanner;

public class secondinherit {
	int i,j;
	void mem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number");
		i=sc.nextInt();
		System.out.println("give another number");
		j=sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		secondinherit dev=new secondinherit();
		dev.mem();
		
		// TODO Auto-generated method stub

	}

}
