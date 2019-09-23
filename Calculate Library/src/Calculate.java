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
	public static double toDegrees(double number) {
		double answer = 0;
		answer = (180/3.14159) * number;
		return answer;
	}
//to Radians
	public static double toRadians(double number) {
		double answer = 0;
		answer = number / (180/3.14159);
		return answer;
	}
//discriminant
	public static double discriminant(double a, double b, double c) {
		double answer = 0;
		answer = (b*b) - (4*a*c);
		return answer;
	}
//Improper Fractions
	public static String toImproperFrac(int a, int b, int c) {
		int num = 0;
		int denom = 0;
		num = (a*c) + b;
		denom = c;
		return(num + "/" + denom) ;
	}
//Mixed Number
	public static String toMixedNum(int a, int b) {
		int wholenum = 0;
		int num = 0;
		int denom = 0;
		wholenum = a/b;
		num = a%b;
		denom = b;
		return(wholenum + " " + num +"/" +denom);
	}
//foil
	public static String foil(int a, int b, int c, int d, String var) {
		String polynomial="";
	
		polynomial += a*c +var+"^2 + ";
		polynomial += (a*d)+(b*c) +var+ "+ ";
		polynomial += b*d;
		return polynomial;
	}

//PART 2
//is Divisible By
	public static boolean isDivisibleBy(int a, int b) {
		if(a%b == 0) {
			return true;
		}else{
			return false;
		}
	}
//Absolute Value
	public static double absValue(int a) {
		if(a >= 0) {
			return a;
		}else{
			return(-1*a);
		}	
	}
//max
	public static double max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
//max with 3 numbers
	public static double max(double a, double b, double c) {
		double max = c;
		if(a<b) {
			if(c<b) {
				max = b;
			}
		}else if(a>c) {
			max = a;
		}
		return max;
	}
//min
	public static int min(int a, int b) {
		if(a<b) {
			return a;
		}else {
			return b;
		}
		
	}
//round2
	public static double round2(double a) {
		a = a*100;
		a= a+0.5;
		a= (int)a;
		a= a/100;
		return a;				
	}


//PART 3
//exponent
	public static double exponent(double base, int exp) {
		double answer = 1;
		for(int i = 1; i <= exp; i++) {
			answer=answer* base;
			if(exp<0) {
				answer = 1/(answer*base);
			}
		}
		 return answer;				
	}
//factorial
	public static int factorial(int a) {
		int answer = 1;
		for(int i=1; i<=a ; i++) {
			answer = (i)*answer;
		}
		return answer;	
	}
//isPrime
	public static boolean isPrime(int a) {
		for(int i = 2; i< a; i++) {
			if(isDivisibleBy(a, i)) {
				return false;
			}
		}
		return true;
	}
//greatest common factor
	public static int gcf(int a, int b) {
		int answer = 1;
		for(int i = 1; i<=(max(a, b)); i++) {
			if(isDivisibleBy((int)max(a, b), i)) {
				if(isDivisibleBy((int)min(a, b), i)) {
					answer = i;
				}
			}
		}
		return answer;
	}
//square root
	public static double sqrt(double num) {
		if(num<0)throw new IllegalArgumentException("can't square root a negative number");
		double answer = num / 2;
		while((answer*answer) - num >= .005) {
			answer = (.5*((num/answer)+answer));
		}	
	return (round2(answer));
	}	
}
