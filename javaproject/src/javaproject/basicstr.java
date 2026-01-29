package javaproject;

public class basicstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Dillu");
		System.out.println(name.length());
	    System.out.println(name.toUpperCase());
	    System.out.println(name.concat("Chaitanya"));
	    System.out.println(name.indexOf(name));
	    System.out.println(String.valueOf('D'));
	    System.out.println(name.codePointAt(3));
	    System.out.println(name.toCharArray());
	    System.out.println(name.isEmpty());
	    System.out.println(name.replace('D', 'C'));
		

	}

}
