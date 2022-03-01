package day23java;

public class EqualsProgram6 {
	
	    public static void main(String[] args) {
	    	EqualsProgram5 eqlDemoSmpl1 = new EqualsProgram5("Car");
	    	EqualsProgram5 eqlDemoSmpl2 = new EqualsProgram5("Bicycle");
	    	EqualsProgram5 eqlDemoSmpl3 = new EqualsProgram5("Car");
	         
	        System.out.println("eqlDemoSmpl1 and eqlDemoSmpl2 are equal : "
	        +(eqlDemoSmpl1.equals(eqlDemoSmpl2)));  
	        System.out.println("eqlDemoSmpl2 and eqlDemoSmpl3 are equal : "
	        +(eqlDemoSmpl2.equals(eqlDemoSmpl3)));  
	        System.out.println("eqlDemoSmpl1 and eqlDemoSmpl3 are equal : "
	        +(eqlDemoSmpl1.equals(eqlDemoSmpl3)));  
	    }
	}
