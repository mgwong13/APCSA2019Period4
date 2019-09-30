import java.util.*;
public class QuadraticClient {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);	
		//set up welcome
		
		while (!userInput.equals("quit")) {
		}
		System.out.println("a: ");
		double a =userInput.nextDouble();
		System.out.println("b: ");
		double b =userInput.nextDouble();
		System.out.println("c: ");
		double c =userInput.nextDouble();
		
		System.out.println(Quadratic.quadrDescriber(a,b,c));
		
		System.out.println("Do you want to keep going? (type \"quit\" to end ");
		userInput.nextLine();
		
	}

}
