package basicconceptofcollection;

import java.util.*;
import java.util.Map.Entry;

public class samplethird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		obj.put(1, "Dillu");
		obj.put(2, "gen");
		obj.put(3, "Kavya");
		
		System.out.println(obj.get(1));
		
	 Set dil = obj.entrySet();
	 Iterator it = dil.iterator();
	 while(it.hasNext()) 
		 System.out.println(it.next());
	
	 for(Entry<Integer, String> obj1 : obj.entrySet()) 
		 
		System.out.println(obj1.getKey() + obj1.getValue());
		
		 
	
		
		

	}

}
