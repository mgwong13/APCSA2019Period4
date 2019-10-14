import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program proccesses numbers for you!");
		System.out.print("How many numbers: ");
		int totalNumbers = scan.nextInt();
		System.out.println("What is your first value: ");
		int value = scan.nextInt();
		int sum = 0;
		int max = value;
		int evenmax = value;
		int min = value ;
		boolean evenfound = false;
		
		if (value % 2 == 0) {
			evenfound = true;
		}
			
		for(int i=2; i<=totalNumbers; i++) {
			System.out.print("#"+i+":");
			int scannedNum = scan.nextInt();
			if(scannedNum > max) {
				max = scannedNum;			
			}
			if(scannedNum < min) {
				min = scannedNum;
			}		
			if(scannedNum %2 ==0) {
				sum+=scannedNum;
				if(evenfound == false) {
					evenmax = scannedNum;
				}
				evenfound = true;
				if(scannedNum > evenmax) {
					evenmax = scannedNum;
				}
			}	
		}
		if(evenfound == true) {
			System.out.println("max: "+max+" min: "+ min);
			System.out.println("max of evens: " + evenmax);
			System.out.println("Sum of even #s: "+sum);
		}else {
			System.out.println("max: "+max+" min: "+ min);
			System.out.println("max of evens: does not exist ");
			System.out.println("Sum of even #s: does not exist");
		}
	}
}
			
	


