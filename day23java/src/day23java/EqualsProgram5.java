package day23java;

public class EqualsProgram5 {
	
	    private String objName = null;
	     
	    public EqualsProgram5(String name){
	        this.objName= name;
	    }
	     
	    public void setName(String name) {
	        this.objName = name;
	    }
	     
	    public String getName() {
	        return this.objName;
	    }
	     
	    @Override
	    public boolean equals(Object obj) {
	        if(obj instanceof EqualsProgram5) {
	        	EqualsProgram5 equalsSample = (EqualsProgram5) obj;
	            if(equalsSample.getName().equals(this.getName())){
	                return true;
	            }
	        }
	        return false;       
	    }
	}