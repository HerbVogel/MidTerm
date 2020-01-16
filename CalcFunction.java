/**
 * this Enum is to store the valid functions and their english description is used in the Result Display
 * 
 */
public enum CalcFunction {
	
	      ADD("Plus")
	    , MULTI("Times")
	    , SUB("Minus")
	    , DIV("Divided by")
	    , MOD("Divided by")
	    , POW("Raised to the Power of")
	    , ROOT("Nth Root of");
	    
	    
	
	    private String action;
	 
	    /** Action is the text description of the function
	     * @return action String
	     */
	    public String getAction(){
	        return this.action;
	    }
	    
	    /** Action is the text description of the function
	     * @param action String
	     */
	    private CalcFunction(String action){
	        this.action = action;
	    }
	}

	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

