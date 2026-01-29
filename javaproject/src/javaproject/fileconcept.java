package javaproject;
import java.io.*;

public class fileconcept {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileWriter obj = new FileWriter("new.txt"); //writer is the class instance for obj.
		obj.write("hi i am navyasree sister tejasree");//write the data
		//obj.write("hi i am tejasree");
		obj.close();  // to close the data
		
		FileReader obj1 = new FileReader("new.txt");  //reader is the instance class of obj1
		int ch;
		while((ch=obj1.read())!=-1) {
			System.out.print((char)ch);
		}
		obj1.close();
		
		

	}

}
