package basicconceptofcollection;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class samplebuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("dil.txt"));
			writer.write("hi");
			writer.newLine();
			writer.write("my name is dillu");
			writer.close();
			System.out.println("completed");
			
			
			
		}catch(IOException e) {
			System.out.println("occured");
		}

	}

}
