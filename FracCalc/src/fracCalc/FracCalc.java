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
    	String operator = outputArray[1];
    	int[] val1Ints= initializing(outputArray[0]);
    	int[] val2Ints = initializing(outputArray[2]);
    	int[] answer = {0,0,1};
    
    	if(operator.equals("+")) {
    		answer[1] = ((val1Ints[1]*val2Ints[2])+(val2Ints[1]*val1Ints[2]));
    		answer[2] = (val1Ints[2]*val2Ints[2]);
     	}
    	if(operator.equals("-")){
    		answer[1] = ((val1Ints[1]*val2Ints[2])-(val2Ints[1]*val1Ints[2]));
    		answer[2] = (val1Ints[2]*val2Ints[2]);
    	}
    	if(operator.equals("*")){
    		answer[1] = val1Ints[1]*val2Ints[1];
    		answer[2] = val1Ints[2]*val2Ints[2];
    	}
    	if(operator.equals("/")) {
    		answer[1] = (val1Ints[1]*val2Ints[2]);
    		answer[2] = (val1Ints[2]*val2Ints[1]);
    	}
    	return answer[1] + "/" + answer[2];
    }
    
    public static int[] initializing(String input) {
    	int[] value= {0,0,1};
    			
    	if(input.contains("_")) {
    		String[] val1Whole = input.split("_");
    		int val1whole = Integer.parseInt(val1Whole[0]);
    		String[] val1frac = val1Whole[1].split("/");
    		if(val1whole>0) {
    			value[1] = (val1whole*Integer.parseInt(val1frac[1])) + Integer.parseInt(val1frac[0]);
    			value[2] =  Integer.parseInt(val1frac[1]);
    		}else {
    			value[1] = -1*(Math.abs(val1whole)*Integer.parseInt(val1frac[1]) + Integer.parseInt(val1frac[0]));
        		value[2] =  Integer.parseInt(val1frac[1]);
    		}
    	
    	}else if (!(input.contains("_") || (input.contains("/")))) {
    		value[1] = Integer.parseInt(input);
        		
    	}else {
    		String[] val1frac = input.split("/");
    		value[1] =  Integer.parseInt(val1frac[0]);
    		value[2] =  Integer.parseInt(val1frac[1]);
     	}
    	return value;
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
}


