
/** this is the main class for this project , it will prompt the user for 2 values and a function, 
 *  and then perform that function , it will keep doing this until the user selects STOP
 * it will also loop on Value1,2 and Function untill the user has entered a satisfactory value.
 * the user can also select HELP, there is a short version(SHORT ) as well as a long version(LONG)
 *  
 */


import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.Set;


public class Calculator {

	static String function ;
	static String mode ;
	static double number1;
	static double number2;


	static boolean cont = true;	
	static String helpMode;
	static boolean validFunction;
	static boolean noErrorProcess;
	
	static final double PI_VALUE = 3.1415926535;
	static final double E_VALUE = 2.7182818284590452353;
	
	static final String PI_CONSTANT = "PI";
	static final String E_CONSTANT  = "E";	
//-----------------------------------	
	
	
/**
 * this is the entry point into the project(Calculator) this methos is responsible for getting the inputs and calling the appropriate classes.	
 */
	public static void main(String[] args) {
	
		
		Scanner sc 	= new Scanner(System.in);
		while (cont == true)
		{
				
			getInput(sc);
		
			switch (mode) {
				case "HELP" :
					if (helpMode == "SHORT") {
						ShortHelp sh = new ShortHelp();
						sh.displayMessage();
					}
					else {
						LongHelp lh = new LongHelp();
						lh.displayMessage();
					}
					//Help help = new Help();
					//System.out.println(help.helpMessage(helpMode));
					break;
				case "CALC" :
					Calculate c = new Calculate(number1,function,number2);
					c.CalculateAnswer();
					c.display();
					System.out.printf("%s" , c.getOutput());
					break;
				case "STOP" :
					cont = false;
					break;
			}
		}
		sc.close();		
		
	}
			

	
	
//-------- get input ----------------------------------------------------------			

/**
 *  Determines type of inputs requested and sets appropriate values for Calculator Function	, it will loop and keep asking for valid input until it has been successfully entered
 */
	public static void getInput(Scanner sc) {

		String inputMode = "";

		System.out.print("\nEnter your Mode Calculator (CALC) or Help (HELP) , or to quit(STOP) : ");
		noErrorProcess = false;
		
		inputMode = sc.nextLine();
		mode = inputMode.toUpperCase();

		if (inputMode.equalsIgnoreCase("STOP")) {
			cont = false;
		} else if (inputMode.equalsIgnoreCase("HELP")) {
			System.out.print("Enter LONG or SHORT for Help Mode ");
			helpMode = sc.nextLine();
			helpMode = helpMode.toUpperCase();
		} else if (inputMode.equalsIgnoreCase("CALC")) {

//----------------------------NUMBER 1  --------------------------------------------------------------------			
			System.out.print("\nEnter your First Number: ");
			
			while(noErrorProcess == false)
			{
			number1 = getNumber(sc);
			}
//----------------------------FUNCTION--------------------------------------------------------------------				
			System.out.print("Enter your Function: ");
			validFunction = false;
			while(validFunction == false)
			{
				function = getFunction(sc);
				convertFunction();
				validFunction = validateFunction(function);
				if(validFunction == false) {
					System.out.print("\nPlease Re-Enter a Valid Function , See HELP(LONG) if Neccessary: ");
				}
				
			}
//----------------------------NUMBER 2  --------------------------------------------------------------------
			System.out.print("Enter your Second Number: ");
			noErrorProcess = false;
			while(noErrorProcess == false)
			{
			number2 = getNumber(sc);
			}
			
		}

	}

/**
 * Get input for Calculator Function,  will retry till proper Function is entered	
 */
	public static String getFunction(Scanner sc) {
		String inputFunction;
		noErrorProcess = true;
		inputFunction =  sc.nextLine().toUpperCase(); 
		//function = inputFunction.trim();
		return inputFunction.trim();
	}

	
	/**
	 * Validate Calculator Function against allowed ENUM list
	 */
	
	public static boolean validateFunction (String function) {
		boolean valid  = false;
		for (CalcFunction myVar : CalcFunction.values()) {
			  if(myVar.toString().equalsIgnoreCase(function)) {
				  valid = true; 
		      }
		}
		return valid;
	}	
	
/**
 * Get number inputs and convert to double, will retry till proper data type is entered	
 */
	public static Double getNumber(Scanner sc) {
		double inputNumber = 0;
		String input;
		noErrorProcess = true;
		try {
			input =  sc.nextLine(); 
				if (input.equalsIgnoreCase(PI_CONSTANT)) {
					inputNumber = PI_VALUE;
					}
				else if (input.equalsIgnoreCase(E_CONSTANT)) {
					inputNumber = E_VALUE;
				} 
				else {
					inputNumber = Double.parseDouble(input);
					}
				}
			catch (InputMismatchException inputMismatchException){
				System.out.printf("%nException :%s" ,  inputMismatchException);
				System.out.printf("\nPlease Re-enter an Number");
				noErrorProcess = false;
			}
			catch (NumberFormatException NumberFormatException){
				System.out.printf("%nException :%s" ,  NumberFormatException);
				System.out.printf("\nPlease Re-enter an Number");
				noErrorProcess = false;
			}
		return inputNumber;
	}

	
	/**
 * Convert Symbolic Function to Calculator Function 	
 */
	public static void convertFunction() {
		switch(function.toUpperCase())
		{
		   case "+" :
			  setFunction("ADD");
		      break; 
		   case "-" :
			   setFunction("SUB");
			   break;
		   case "/" :
			   setFunction("DIV");
			   break;
		   case "*" :
			   setFunction("MULTI");
			   break;
		   case "^" :
			   setFunction("POW");
			   break;
		   case "/%" :
			   setFunction("MOD");
			   break;
		   case "R" :
			   setFunction("ROOT");
			   break;			   
		   default  :
			   setFunction(function.toUpperCase());
			}
	}	
		
	



///////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return function String
	 */
	public static String getFunction() {
		return function;
	}


	/**
	 * @param function String
	 */
	public static void setFunction(String function) {
		Calculator.function = function;
	}


/////////////////////////////////////////////////////////////////////////////////////

	/**
	 * @return mode String
	 */
	public static String getMode() {
		return mode;
	}


	/**
	 * @param mode String
	 */
	public static void setMode(String mode) {
		Calculator.mode = mode;
	}


////////////////////////////////////////////////////////////////////////////////

	/**
	 * @return number1 double
	 */
	public static double getNumber1() {
		return number1;
	}


	/**
	 * @param number1 double
	 */
	public static void setNumber1(double number1) {
		Calculator.number1 = number1;
	}

//////////////////////////////////////////////////////////////////////////////


	/**
	 * @return number2 double
	 */
	public static double getNumber2() {
		return number2;
	}

	/**
	 * @param number2 double
	 */
	public static void setNumber2(double number2) {
		Calculator.number2 = number2;
	}

//////////////////////////////////////////////////////////////////////////////

	/**
	 * @return cont boolean
	 */
	public static boolean isCont() {
		return cont;
	}


	/**
	 * @param cont boolean
	 */
	public static void setCont(boolean cont) {
		Calculator.cont = cont;
	}

//////////////////////////////////////////////////////////////////////////////

	/**
	 * @return helpMode String
	 */
	public static String getHelpMode() {
		return helpMode;
	}

	/**
	 * @param helpMode String
	 */
	public static void setHelpMode(String helpMode) {
		Calculator.helpMode = helpMode;
	}

//////////////////////////////////////////////////////////////////////////////

	/**
	 * @return validFunction boolean
	 */
	public static boolean isValidFunction() {
		return validFunction;
	}


	/**
	 * @param validFunction boolean
	 */
	public static void setValidFunction(boolean validFunction) {
		Calculator.validFunction = validFunction;
	}

//////////////////////////////////////////////////////////////////////////////

	/**
	 * @return piValue double
	 */
	public static double getPiValue() {
		return PI_VALUE;
	}


	/**
	 * @return eValue double
	 */
	public static double geteValue() {
		return E_VALUE;
	}

//////////////////////////////////////////////////////////////////////////////
	
	/**
	 * @return piConstant String
	 */
	public static String getPiConstant() {
		return PI_CONSTANT;
	}


	/**
	 * @return eConstant String
	 */
	public static String geteConstant() {
		return E_CONSTANT;
	}
	
	 
		
	}


