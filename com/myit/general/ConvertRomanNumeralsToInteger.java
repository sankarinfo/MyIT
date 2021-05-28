package com.myit.general;

public class ConvertRomanNumeralsToInteger {

	public static void main(String[] args) {
		System.out.println("Roman to Integer : "+ConvertRomanNumeralsToInteger.romanToDecimal("MCMIV"));	        
	}
		
    static int romanToDecimal(String romanChars)
    {
        int result = 0;
  
        for (int i = 0; i < romanChars.length(); i++) 
        {
            int c1 = charToInt(romanChars.charAt(i));
  
            if (i + 1 < romanChars.length()) 
            {
                int c2 = charToInt(romanChars.charAt(i + 1));
  
                if (c1 >= c2) 
                {
                    result = result + c1;
                }
                else 
                {
                	result = result + c2 - c1;
                    i++;
                }
            }
            else {
            	result = result + c1;
            }
        }
  
        return result;
    }
    
	public static int charToInt(char c) {
		switch (c) {
			case 'I': 
				return 1; 
			case 'V': 
				return 5; 
			case 'X': 
				return 10; 
			case 'L': 
				return 50; 
			case 'C':
				return 100; 
			case 'D': 
				return 500; 
			case 'M':
				return 1000;
			
			default : return 0;
		}
	}

}
