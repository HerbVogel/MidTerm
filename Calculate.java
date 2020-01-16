
/**
 * this class performs the actual Math function selected by the user, using the 2 values and function entered
 * 
 * 
 */

public class Calculate extends Object{
	double value1;
	String function;
	double value2;
	double result1;
	double result2;
	String output;
	
	private CalcFunction CalcFunction;
	
	public Calculate(double value1, String function, double value2)
	{
	setValue1(value1);
	setValue2(value2);
	setFunction(function);
	}
	
	/**
	 * This will do the basic arithmetic that corresponds to the function entered
	 */
	public void CalculateAnswer()
	{
		switch(function.toUpperCase())
		{
		   case "MULTI" :
			   setResult1( value1 * value2);
			   setResult2(0);
		      break; 
		   case "ADD" :
			   //setResult1( value1 + value2);
	      	   //setResult2(0);
			   calcADD();
               break;
		   case "SUB" :
			   setResult1( value1 - value2);
			   setResult2(0);
			   break; 		      
		   case "DIV" :
			   setResult1( value1 / value2);
			   setResult2(0);
			   break; 		      
		   case "MOD" :
			   setResult1( Math.floor(value1 / value2));
			   setResult2(value1 % value2);
			   break; 		      
		   case "POW" :
			   setResult1( Math.pow(value1 , value2));
			   setResult2(0);
			   break; 		 
		   case "ROOT" :
			   setResult1(nthRoot(value2,value1, 0.00000000001));
			   setResult2(0);
			   break;
		   default  :
			  setResult1(0);
		      setResult2(0);
		}
	}
		
	/**
 * Add math Function
 */
		public void calcADD() throws ArithmeticException
		{
			try {
				setResult1( value1 + value2);
			}
			catch 
			(ArithmeticException arithmeticException){
				System.out.printf("%nException :%s" ,  arithmeticException);
				//sc.nextLine();
				System.out.printf("\nZero as a denominator is not allowed");
				}
			
			catch (Exception e){
				System.out.printf("\nException :%s" ,  e);
				//sc.nextLine();
				System.out.printf("\nUnknown error:");
				
				}
					
		}
		/**
 * Division Math Function
 */
		public void calcDIV() throws ArithmeticException
		{
			try {
				setResult1( value1 / value2);
			}
			catch 
			(ArithmeticException arithmeticException){
				System.out.printf("%nException :%s" ,  arithmeticException);
				//sc.nextLine();
				System.out.printf("\nZero as a denominator is not allowed");
				}
			
			catch (Exception e){
				System.out.printf("\nException :%s" ,  e);
				//sc.nextLine();
				System.out.printf("\nUnknown error:");
				
				}
					
		}		
	
		
		/**
		 * Display method
		 */
		public void display()
		{
			String output;
			CalcFunction fun = CalcFunction.valueOf(function.toUpperCase());
			if (function.equalsIgnoreCase("MOD")) { 
		    	output = String.format("%nAnswer for  %f %s %f = %f with remainder %f : " ,
					    this.value1 , fun.getAction(), this.value2 , this.result1 , this.result2);
		    }
		    else
		    {
		    	output = String.format("%nAnswer for  %f %s %f = %f : " , 
		    			this.value1 , fun.getAction() , this.value2 , this.result1 , this.result2);
		    }
			setOutput(output);
		}		
		
		
		
		/**
		 * nth Root Math Function, returns the Nth root(value2) to the base(value1)
		 */
		public double nthRoot(double NthRoot, double baseValue, double precision) 
	    {
			if(baseValue == 0) {
	            return 0;
			}
			
			if(baseValue < 0) 
	        {
	            System.err.println("Negative Base Value not allowed!");
	            return 0;
	        }
	        
	        double OriginalBaseValue 	= baseValue;
	        double RemainderBaseValue 	= baseValue / NthRoot;  
	        
	        while (Math.abs(OriginalBaseValue - RemainderBaseValue) > precision) 
	        {
	            OriginalBaseValue = RemainderBaseValue;
	            RemainderBaseValue = ((NthRoot - 1.0) * RemainderBaseValue + baseValue / Math.pow(RemainderBaseValue, NthRoot - 1.0)) / NthRoot;
	        }
	        return RemainderBaseValue;
	    }
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	/** first number entered
	 * @return value1 double
	 */
	public double getValue1() {
		return value1;
	}


	/** first number entered
	 * @param value1 double
	 */
	public void setValue1(double value1) {
		this.value1 = value1;
	}

///////////////////////////////////////////////////////////////////////
	/** Math Function entered
	 * @return function String
	 */
	public String getFunction() {
		return function;
	}


	/** Math Function entered
	 * @param function the function to set
	 */
	public void setFunction(String function) {
		this.function = function;
	}

/////////////////////////////////////////////////////////////////////
	
	/** Second number entered
	 * @return value2 double
	 */
	public double getValue2() {
		return value2;
	}


	/** Second number entered
	 * @param value2 double
	 */
	public void setValue2(double value2) {
		this.value2 = value2;
	}

///////////////////////////////////////////////////////////////////	

	/** Resultant of the Math function
	 * @return result1 double
	 */
	public double getResult1() {
		return result1;
	}


	/** Resultant of the Math function
	 * @param result1 double
	 */
	public void setResult1(double result1) {
		this.result1 = result1;
	}

///////////////////////////////////////////////////////////////////	

	/** Second part of Result of the Math function used for the modulus
	 * @return result2 double
	 */
	public double getResult2() {
		return result2;
	}


	/** Second part of Result of the Math function used for the modulus
	 * @param result2 double
	 */
	public void setResult2(double result2) {
		this.result2 = result2;
	}

///////////////////////////////////////////////////////////////////	


	/** returns result in english 
	 * @return output String
	 */
	public String getOutput() {
		return output;
	}



	/** returns result in english 
	 * @param output String
	 */
	public void setOutput(String output) {
		this.output = output;
	}
	
	
	
	
}
