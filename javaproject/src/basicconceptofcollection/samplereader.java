package basicconceptofcollection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class samplereader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader reader = new BufferedReader(new FileReader("dil.txt"));
			//writer.read();
			//writer.read();
			//writer.read("my name is dillu");
			//writer.close();
			String Line;
			while((Line=reader.readLine())!=null) {
			System.out.println(Line);
			}
			
			reader.close();
			

		}catch(IOException e) {
			System.out.println("exception is caught");
		}

}
}
