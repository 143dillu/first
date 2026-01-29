package basicconceptofcollection;

//import java.awt.List;
import java.util.ArrayList;
import java.util.List;

public class firstsample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //List l1 =new ArrayList();
       //l1.add(10);
      // l1.add("Dillu");
       
       ArrayList<Integer> l2 =new ArrayList<Integer>();
       l2.add(19);
       l2.add(20);
       System.out.println(l2.get(0));
       
       for(int i=0; i<l2.size();i++) {
    	   System.out.println(l2.get(i));
       }
       
       
	   for (Integer n : l2) {	
    	   System.out.println(n);
       }

}
}
