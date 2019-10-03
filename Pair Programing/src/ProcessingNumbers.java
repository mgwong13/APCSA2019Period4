import java.util.*;
public class ProcessingNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This program proccesses numbers for you!");
		System.out.print("How many numbers: ");
		int totalNumbers = scan.nextInt();
		System.out.print("What is the minimum (can put any number): ");
		int max = scan.nextInt();
		System.out.print("What is the maximum(can put any number): ");
		int min = scan. nextInt();
		int sum = 0;
		for(int i=1; i<=totalNumbers; i++) {
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
			}
		}
		System.out.println("max: "+max+" min: "+ min);
		System.out.println("Sum of even #s: "+sum);
			
	
	}

}
