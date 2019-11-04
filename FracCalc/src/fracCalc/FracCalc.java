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
    	String sign = outputArray[1];
    	String val2 = outputArray[2];
    	
    	if(val2.indexOf("_")>-1) {
    		String[] val2Whole = val1.split("_");
    		String whole = val2Whole[0];
    		String[] val2frac = val2Whole[1].split("/");
    		String num =  val2frac[0];
    		String denom =  val2frac[0];
    	}
    	//return "whole:" + whole + " " +"numerator:" + val2frac[0]+ " " + "denominator:" +  val2frac[1];
    	return "";
    }
    
  //Improper Fractions
  	public static String toImproperFrac(int a, int b, int c) {
  		int num = 0;
  		int denom = 0;
  		num = (a*c) + b;
  		denom = c;
  		return(num + "/" + denom) ;
  	}

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
