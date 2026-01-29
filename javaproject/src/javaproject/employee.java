package javaproject;

public class employee extends person{
	
	
	void records() {
		employee obj = new employee();
	
		System.out.println("hii my" + obj.name);
		System.out.println("hii my" + obj.salary);
		System.out.println("hii my" + obj.date );
		System.out.println("hii my" + obj.experience);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee obj = new employee();
        obj.records();
        
        		
        
	}

}
