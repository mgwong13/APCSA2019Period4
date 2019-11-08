package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner scan = new Scanner(System.in);
    	while (!scan.equals("quit")) {
    	System.out.println("What is your expression?");
    	String expression = scan.nextLine();
    	System.out.println(produceAnswer(expression));
    	
    	System.out.println("Do you want to keep going? (type \"quit\" to end)");
		scan.nextLine();
    	}
    	
  
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
    	String[] outputArray = input.split(" ");
    	String val1 = outputArray[0];
    	String operator = outputArray[1];
    	String val2 = outputArray[2];
    	int[] val1Ints= {0,1};
    	int[] val2Ints = {0,1};
    	int numerator = 0;
    	int denominator = 1;
    			
    	if(val1.contains("_")) {
    		String[] val1Whole = val1.split("_");
    		int val1whole = Integer.parseInt(val1Whole[0]);
    		String[] val1frac = val1Whole[1].split("/");
    		val1Ints[0] = (val1whole*Integer.parseInt(val1frac[1])) + Integer.parseInt(val1frac[0]);
    		val1Ints[1] =  Integer.parseInt(val1frac[1]);
    	
    	}else if (!(val1.contains("_") || (val1.contains("/")))) {
    		val1Ints[0]= Integer.parseInt(val1);
        		
    	}else {
    		String[] val1frac = val1.split("/");
    		val1Ints[0] =  Integer.parseInt(val1frac[0]);
    		val1Ints[1] =  Integer.parseInt(val1frac[1]);
     	}
    	if(val2.indexOf("_")>-1) {
    		String[] val2Whole = val2.split("_");
    		int val2whole = Integer.parseInt(val2Whole[0]);
    		String[] val2frac = val2Whole[1].split("/");
    		val2Ints[0] = (val2whole*Integer.parseInt(val2frac[1])) + Integer.parseInt(val2frac[0]);
    		val2Ints[1] =  Integer.parseInt(val2frac[1]);
    	}else if(!(val2.contains("_") || (val2.contains("/")))) {
    		val2Ints[0]= Integer.parseInt(val2);
    		
    	}else {
    		String[] val2frac = val2.split("/");
    		val2Ints[0]=  Integer.parseInt(val2frac[0]);
    		val2Ints[1]=  Integer.parseInt(val2frac[1]);
    	}
    	if(operator.equals("+")) {
    		numerator = ((val1Ints[0]*val2Ints[1]) + (val2Ints[0]*val1Ints[1]));
    		denominator = (val1Ints[1]*val2Ints[1]);
     	}
    	if(operator.equals("-")){
    		numerator = ((val1Ints[0]*val2Ints[1]) - (val2Ints[0]*val1Ints[1]));
    		denominator = (val1Ints[1]*val2Ints[1]);
    	}
    	if(operator.equals("*")){
    		numerator = val1Ints[0]*val2Ints[0];
    		denominator = val2Ints[1]*val2Ints[2];
    	}
    	if(operator.equals("/")) {
    		numerator = (val1Ints[0]*val2Ints[1]);
    		denominator = (val1Ints[1]*val2Ints[0]);
    	}
    	return numerator + "/" + denominator;
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}


