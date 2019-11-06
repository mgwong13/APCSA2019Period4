//Marina Wong
//Aug 29, 2019
//period 4
//group of methods that perform math calculations (a library)

public class Calculate {
//square	
	public static int square(int number) {
		int answer = 0;
		answer = number* number;
		return answer;
	}
	
//cube	
	public static int cube(int number) {
		int answer = 0;
		answer = number* number * number;
		return answer;
	}
//average for 2 numbers
	public static double average(double number1, double number2) {
		double answer = 0;
		answer = (number1+number2)/2;
		return answer;
	}
//average for 3 numbers
	public static double average(double number1, double number2, double number3) {
		double answer = 0;
		answer = (number1 + number2 +number3)/3;
		return answer;
	}
//to Degrees
	public static double toDegrees(double radian) {
		double answer = 0;
		answer = (180/3.14159) * radian;
		return answer;
	}
//to Radians
	public static double toRadians(double degree) {
		double answer = 0;
		answer = degree / (180/3.14159);
		return answer;
	}
//discriminant
	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = (b*b) - (4*a*c);
		return answer;
	}
//Improper Fractions
	public static String toImproperFrac(int whole, int num, int denom) {
		int num1 = 0;
		num1 = (whole*denom) + num;
		return(num1 + "/" + denom) ;
	}
//Mixed Number
	public static String toMixedNum(int num, int denom) {
		int wholenum = 0;
		int num1 = 0;
		wholenum = num/denom;
		num1 = num%denom;
		return(wholenum + " " + num1 +"/" +denom);
	}
//foil
	public static String foil(int a, int b, int c, int d, String var) {
		String polynomial="";
	
		polynomial += a*c +var+"^2 + ";
		polynomial += (a*d)+(b*c) +var+ " + ";
		polynomial += b*d;
		return polynomial;
	}

//PART 2
//is Divisible By
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num2==0)throw new IllegalArgumentException("can't divide a number by 0");
		if(num1%num2 == 0) {
			return true;
		}else{
			return false;
		}
	}
//Absolute Value
	public static double absValue(double num) {
		if(num >= 0) {
			return num;
		}else{
			return(-1*num);
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
//max with 3 numbers
	public static double max(double num1, double num2, double num3) {
		double max = num3;
		if(num1<num2) {
			if(num3<num2) {
				max = num2;
			}
		}else if(num1>num2) {
			max = num1;
		}
		return max;
	}
//min
	public static int min(int num1, int num2) {
		if(num1<num2) {
			return num1;
		}else {
			return num2;
		}
		
	}
//round2
	public static double round2(double num) {
		num = num*100;
		if(num>0) {
			num= num+0.5;
		}else {
			num= num-0.5;
		}
		num= (int)num;
		num= num/100;
		return num;
	}


//PART 3
//exponent
	public static double exponent(double base, int exp) {
		if(base == 0 & exp == 0)throw new IllegalArgumentException("doesn't exist");
		double answer = 1;
		for(int i = 1; i <= absValue(exp); i++) {
			answer=answer* base;
		}
		if(exp<0) {
			return(1/answer);
		}else {
		return answer; 
		}
	}
//factorial
	public static int factorial(int num) {
		if(num<0)throw new IllegalArgumentException("can't find a factorial of a negative number");
		int answer = 1;
		for(int i=1; i<=num ; i++) {
			answer = (i)*answer;
		}
		return answer;	
	}
//isPrime
	public static boolean isPrime(int num) {
		for(int i = 2; i< num; i++) {
			if(isDivisibleBy(num, i)) {
				return false;
			}
		}
		return true;
	}
//greatest common factor
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
//square root
	public static double sqrt(double num) {
		if(num<0)throw new IllegalArgumentException("can't square root a negative number");
		double answer = num;
		while((answer*answer) - num >= .005) {
			answer = (.5*((num/answer)+answer));
		}	
	return (round2(answer));
	}	

//PART 4	
//Quadratic Formula
	public static String quadForm(int a, int b, int c) {
		String root = "no real roots";
		
		if(discriminant(a, b, c)>0) {
			root = ((-1*b)-(sqrt(discriminant(a,b,c))))/(2*a)+ " and ";
			root += ((-1*b)+(sqrt(discriminant(a,b,c))))/(2*a);	
			
		}else if(discriminant(a,b,c)==0) {
			root = ""+(-1*b)/(2*a);
			
		}
		return root;
	}
}
