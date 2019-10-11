import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program proccesses numbers for you!");
		System.out.print("How many numbers: ");
		int totalNumbers = scan.nextInt();
		
		int sum = 0;
		int max = -1000000000;
		int evenmax = -100000000;
		int min = 100000000;
		boolean evenfound = false;
		for(int i=1; i<=totalNumbers; i++) {
			
			System.out.print("#"+i+":");
			int scannedNum = scan.nextInt();
			if(scannedNum > max) {
				max = scannedNum;			
			}
			if(scannedNum < min) {
				min = scannedNum;
			}		
			if(scannedNum % 2 == 0) {
				evenfound = true;
			}
			if(evenfound = true) {
				if(scannedNum %2 == 0) {
					if(scannedNum > max) {
						evenmax = scannedNum;
					}
				}
				if(scannedNum %2 ==0) {
					sum+=scannedNum;
				}
			if(evenfound = false) {
				sum = 0;
			}
			if(evenfound = false) {
				evenmax = 0;
			}
		}
		System.out.println("max: "+max+" min: "+ min);
		System.out.println("max of evens: " + evenmax);
		System.out.println("Sum of even #s: "+sum);
		}
	}
}
			
	


