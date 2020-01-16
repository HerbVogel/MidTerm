/**
 * this class is currently not used,  it was split into LongHelp and ShortHelp implementing abstract HelpDisplay class
 * 
 * 
 * 
 */


public  class Help {
	
	
	public static String helpMessage (String helpType)
	{
		String helpMessage = new String();
		
		if (helpType.equalsIgnoreCase("SHORT") ) {
			helpMessage = String.format("\nPlease enter a Number , a Function , and another Number");
		}
		else if (helpType.equalsIgnoreCase("LONG"))
		{
//---------------------------LONG MODE		
		helpMessage = String.format("Please enter a Number , the function , and the Number"
				+ "\n\nFUNCTIONS:"
				+"\nADD   : Add Number 1 and Number 2."
				+"\nSUB   : Subtract Number 2 from Number 1."
				+"\nMULTI : Multiply Number 1 and Number 2."
				+"\nDIV   : Divide Number 1 by Number 2 , return Whole Number Value"
				+"\nMOD   : Divide Number 1 by Number 2 , return Whole Number Value and Remainder"
				+"\nPOW   : Raise Number 1 by the power of Number 2"
				+"\nROOT  : Take Number 1 to the Number 2(root), Number 2 is the Nth Root"
				
				+"\n\n---------------------------------------------------------"
				+"\nENTER :  PI for the value of pi"
				+"\nENTER :  E for the value of e"
				
				);
		}
//---------------------------SHORT MODE		
		else {
			helpMessage = String.format("Please enter a Valid Help Type (SHORT/LONG), you entered : %s", helpType );
		}
		return helpMessage;
	}
	
	
	
	
}
