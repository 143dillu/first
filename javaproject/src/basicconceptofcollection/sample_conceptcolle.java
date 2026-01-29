package basicconceptofcollection;

import java.util.*;

public class sample_conceptcolle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> org = new HashSet<String>();
		org.add("Ant");
		org.add("bat");
		org.add("cat");
		org.add("dog");
		System.out.println(org);
		System.out.println(org.remove("dog"));
		System.out.println(org.isEmpty());
		System.out.println(org.size());
		
		for(String has : org){
	     System.out.println(has);
	     
		}
		
		Iterator<String> obj = org.iterator();
		while(obj.hasNext()) {
		System.out.println(obj.next());
		}
		
		org.forEach(i->System.out.println(i));
		
				
		

	}

}
