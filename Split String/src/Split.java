
//Marina Wong
//period 4 
//uses split method to find the filling of sandwiches


import java.util.*;
public class Split {

	public static void main(String[] args) {
		// Your task Part 0

		//String.split();

		//It's a method that acts on a string, <StringName>.split(<sp>);

		//Where sp is the string where the string splits

		//And it returns an array

		// Example: "I like apples!".split(" ");

		// it will split at spaces and return an array of ["I","like","apples!"]

		// Example 2: "I really like really red apples!".split("really")

		// it will split at the word "really" and return an array of ["I "," like ","red apples!"]

		//play around with String.split!

		//What happens if you "I reallyreally likeapples".split("really") ?
		String[] outputArray1 = "I like apples!".split(" ");
		System.out.println(Arrays.toString(outputArray1));
		String[] outputArray2 = "I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray2));
		String[] outputArray3 = "I really like really red apples!".split(" really ");
		System.out.println(Arrays.toString(outputArray3));
		String[] outputArray4 = "really I really like really red apples!".split("really");
		System.out.println(Arrays.toString(outputArray4));
		System.out.println(part1("bread"));
		System.out.println(part1("breadham"));
		System.out.println(part1("mayobread"));
		System.out.println(part1("breadmayobread"));
		System.out.println(part1("breadbread"));
		System.out.println(part1("breadmayobreadham"));
		System.out.println(part1("applespinapplesbreadlettucetomatobaconmayohambreadcheese"));
	}
		//Your task Part 1:
	public static String part1(String sandwich){
		String[] pieces = sandwich.split("bread");
		if(sandwich.indexOf("bread")>=0) {
			int bread1 = sandwich.indexOf("bread");
			String bread12 = sandwich.substring(bread1+1);
			if(bread12.indexOf("bread")>=0){
				if(pieces.length<=1) {
					return "not a sandwich";
				}else{
					return pieces[1];
				}
			}else {
				return"not a sandwich";
			}
		}else {
			return"not a sandwich";
		}
	

	}
		/*Write a method that take in a string like

		* "applespineapplesbreadlettucetomatobaconmayohambreadcheese"

		* describing a sandwich.

		* Use String.split to split up the sandwich by the word "bread" and return what's in the middle of

		* the sandwich and ignores what's on the outside

		* What if it's a fancy sandwich with multiple pieces of bread?

		*/

		//Your task pt 2:

		/*Write a method that take in a string like

		* "apples pineapples bread lettuce tomato bacon mayo ham bread cheese"

		* describing a sandwich

		* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of

		* the sandwich and ignores what's on the outside.

		* Again, what if it's a fancy sandwich with multiple pieces of bread?

		*/
	
}
		


