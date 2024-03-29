//Marina Wong
//This code takes different arrays and alters them in different ways
import java.util.*;
public class ArraysLab3 {
	
	//1) Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	//in which every element is the sum of the elements at that index for the arrays arr1 and
	//arr2. You can assume arrays arr1 and arr2 have at least one element each and are the same length.

	public static int[] sum(int[] arr1, int[] arr2) {
		int[] arrFinal = new int [arr1.length];
		for(int i = 0; i<arr1.length; i++) {
			arrFinal[i] = arr1[i]+arr2[i];
		}
		return arrFinal;
	}
		//returns an array of integers of length n+1 that consists of the elements of arr with num appended to 
		//the end.  You can assume array arr has at least one element.
	public static int[] append(int[] arr, int num) {
		int[] arr1 = new int [arr.length+1];
		for(int i = 0; i<arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[arr1.length-1] = num;
		return arr1;			
	}
		//3) Write a method remove that accepts an array of integers arr and an integer idx and returns 
		//an array of integers consisting of all of the elements of arr except for the element at index idx 
		//(thus, the returned array has a length of arr.length � 1).  You can assume arr has at least two elements.
	public static int[] remove(int[] arr, int idx) {
		int[] arrFinal = new int [arr.length -1];
		for(int i = 0; i<arrFinal.length + 1; i++) {
			if(i < idx) {
				arrFinal[i]=arr[i];
			}
			if(i>idx) {
				arrFinal[i-1]=arr[i];
			}
		}
		return arrFinal;
	}
		//4) Write a method sumEven that accepts an array of integers arr and returns an integer containing the 
		//sum of the elements at the even indices of arr.  (That means elements at indices 0,2,4,6,8.)  You can 
		//assume arr has at least one element.
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i+=2) {
			sum+= arr[i];
		}
		return sum;
	}
				
				
		//5) Write a method rotateRight that accepts an array of integers arr and does not return a value.  
		//The rotateRight method moves each element of arr one index to the right (element 0 goes to element 
		//1, element 1 goes to element 2, �, element n-1 goes to element 0).  You can assume arr has at least 
		//one element.
	public static int[] rotateRight(int[] arr) {
		for(int i = arr.length -1; i>=1; i--) {
		arr[i] = arr[i-1];
		}
		arr [0] = arr[arr.length-1];
		return arr;
	}
			
	    //6) Write a method main that will 
		/* Contain
			1. integer arrays a1, a2, sumArr, appendArr, removeArr
			2. int variables appendNum, removeIdx, sumOfEvens
		Carry out the following actions
			1. Declare array a1 containing the values (5, 10, 15, 20, 25, 30, 35, 40) and array a2 
			containing the values (7, 14, 21, 28, 35, 42, 49, 56)
			2. Form sumArr by calling the sum method with a1 and a2 as inputs
			3. Declare int appendNum and set it to 200.
			4. Form appendArr by calling the append method with a1 and appendNum as inputs
			5. Declare int removeIdx and set it to 5.
			6. Form removeArr by calling remove with a2 and removeIdx
			7. Form sumOfEvens by calling sumEven with appendArr as the input
			8. Call rotateRight with a1 as the input
		On their own lines print out (use Arrays.toString to transform arrays into a printable strings) :
			1. sumArr
			2. appendArr
			3. removeArr
			4. sumOfEvens (an int you don�t need Arrays.toString)
			5. a1
		*/
		
	public static void main(String[]args) {
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum(a1, a2);
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		int sumOfEvens = sumEven(removeArr);	
		a1 = rotateRight(a1);
		System.out.println(Arrays.toString(sumArr));
		System.out.println(Arrays.toString(appendArr));
		System.out.println(Arrays.toString(removeArr));
		System.out.println(sumOfEvens);
		System.out.println(Arrays.toString(a1));
	}
}
