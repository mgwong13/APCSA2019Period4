//Marina Wong
//Aug 29, 2019
//period 4
//Call math methods from calculate library
//Client code or runner code
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-11));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(12,2,5));
		System.out.println(Calculate.toDegrees(2*3.1415));
		System.out.println(Calculate.toRadians(360));
		System.out.println(Calculate.discriminant(4, 3, 2));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		
		//Part 2
		System.out.println(Calculate.isDivisibleBy(20, 10));
		System.out.println(Calculate.absValue(-12));
		System.out.println(Calculate.max(5, 4, 2));
		System.out.println(Calculate.min(5,2));
		System.out.println(Calculate.round2(5.672));
		
		//Part 3
		System.out.println(Calculate.exponent(2, 3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(9));
		System.out.println(Calculate.gcf(15, 20));
		System.out.println(Calculate.sqrt(-2));
	}

}


