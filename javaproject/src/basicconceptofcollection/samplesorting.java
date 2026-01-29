package basicconceptofcollection;

//import java.awt.List;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class samplesorting {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		List dillu = new ArrayList();
		dillu.add("sai");
		dillu.add("fish");
		dillu.add("ban");
		
		System.out.println(dillu);
		//System.out.println(dillu.get(1));
		//System.out.println(dillu.get(2));
		Collections.sort(dillu);
			System.out.println("sorted order is" + dillu);
			
			Collections.sort(dillu,Collections.reverseOrder());
			System.out.println(dillu);
		
		

	

}
}
