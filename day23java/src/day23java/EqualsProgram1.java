package day23java;

public class EqualsProgram1 {
	
	     
	    public static void main(String[] args) {
	        String s1 = new String("HELLO");
	        String s2 = new String("HELLO");        
	         
	        System.out.println("s1 and s2 are equal : "+(s1==s2));   //comparing addresses of objects.   
	        System.out.println("s1 and s2 are equal : "+(s1.equals(s2)));  //equals () method compares the content of objects s1 and s2
	 
	        s1 = s2;
	        System.out.println("s1 and s2 are equal : "+(s1==s2));       //  referring to the same object address.
	    }
	}
