package fracCalc;
import java.util.*;
public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner scan = new Scanner(System.in);
    	while (!scan.equals("quit")) {
     	System.out.println("What's your expression? (type \"quit\" to end)");
    	String expression = scan.nextLine();
    	System.out.println(produceAnswer(expression));
    	}
    }   
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
    	if(answer[1]>answer[2]) {
    	}
    	int greatestcf = gcf(answer[1], answer[2]);
    	if(answer[0]==0) {
    		return answer[1] + "/" + answer[2];
    	}else {
    	   	
    		return answer[0]+"_"+ answer[1] + "/" + answer[2];
    	}
    }
    // TODO: Fill in the space below with any helper methods that you think you will need  
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
  //is Divisible By
  	public static boolean isDivisibleBy(int num1, int num2) {
  		if(num2==0)throw new IllegalArgumentException("can't divide a number by 0");
  		if(num1%num2 == 0) {
  			return true;
  		}else{
  			return false;
  		}
  	}
  //max
  	public static double max(double num1, double num2) {
  		if(num1>num2) {
  			return num1;
  		}else {
  			return num2;
  		}
  	}
  //min
  	public static int min(int num1, int num2) {
  		if(num1<num2) {
  			return num1;
  		}else {
  			return num2;
  		}
  		
  	}
    public static int gcf(int num1, int num2) {
		int answer = 1;
		for(int i = 1; i<=(max(num1, num2)); i++) {
			if(isDivisibleBy((int)max(num1, num2), i)) {
				if(isDivisibleBy((int)min(num1, num2), i)) {
					answer = i;
				}
			}
		}
		return answer;
	}
    public static int toMixedNum(int num, int denom) {
		int wholenum = 0;
		int num1 = 0;
		wholenum = num/denom;
		num1 = num%denom;
		return(wholenum + num1 + +denom);
	}
}


