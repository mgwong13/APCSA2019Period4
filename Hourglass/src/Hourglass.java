import java.util.*;
public class Hourglass {
	public static void figure() {
		Scanner scan = new Scanner(System.in);
		while (!scan.equals("quit")) {
			System.out.print("What size do you want your hourglass?");
			int size = scan.nextInt();
			System.out.print("|");
			for(int quote = 1; quote<=size; quote++) {
			System.out.print("\"");
			}
			System.out.println("|");
			for(int line = 1; line<=(size/2-1); line++) {
				for(int space = 0; space<line; space++) {
					System.out.print(" ");
				}
				System.out.print("\\");
				for(int colon = 1; colon<= -2*line+size; colon++) {
					System.out.print(":");
				}
				System.out.println("/");	
			}
			for(int space = 0; space<(size/2); space++) {
				System.out.print(" ");
			}
			System.out.println("||");
			for(int line = 1; line<=(size/2-1); line++) {
				for(int space = 1; space<(size/2+1)-line; space++) {
					System.out.print(" ");
				}
				System.out.print("/");
				for(int colon = 1; colon<= 2*line; colon++) {
					System.out.print(":");
				}
				System.out.println("\\");
			}
			System.out.print("|");
			for(int quote = 1; quote<=size; quote++) {
				System.out.print("\"");
			}
			System.out.println("|");
			System.out.println("Do you want to keep going? (type \"quit\" to end)");
			scan.nextLine();
		}
}
	public static void main(String[]args) {
		figure();
	}
}

